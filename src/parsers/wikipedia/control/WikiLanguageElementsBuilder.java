package parsers.wikipedia.control;

import main.java.control.Global;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public final class WikiLanguageElementsBuilder {

    private WikiLanguageElementsBuilder() {}

    public static Elements build(String pstrWord) {
        return build(pstrWord,
                Global.DUMMY_URL);
    }

    public static Elements build(String pstrWord,
                                 String pstrLocalDownload) {
        Document docWikiPage = open(pstrWord,
                                    pstrLocalDownload);
        if (!docWikiPage.select("#Spanish").isEmpty()) {
            return filterMW_Parser_OutputLanguages(
                    getMW_Parser_Output(docWikiPage)
            );
        } else {
            return new Elements();
        }
    }

    private static Elements getMW_Parser_Output(Document pdocWikiPage) {
        return pdocWikiPage.body()
                .select("#mw-content-text")
                .first()
                .children()
                .first()
                .children();
    }

    private static Document open(String pstrWord,
                          String pstrLocalDownload) {
        File filLocal =  new File(pstrLocalDownload);
        try {
            if (filLocal.exists()) {
                return Jsoup.parse(filLocal,
                                   Global.WIKI_CHAR_SET);
            } else {
                return Jsoup.parse(new URL(Global.WIKI_BASE + pstrWord),
                        Global.TIMEOUT);
            }
        } catch (HttpStatusException hse) {
                if (hse.getStatusCode() == 404) {
                    return open(pstrWord,
                                "/Users/stefanandonian/Documents/SoftwareDevelopment/10000_Flashcards/src/main/resources/404.html");
                }
        } catch (IOException ioe) {
                ioe.printStackTrace();
        }
        return new Document(null);
    }

    private static Elements filterMW_Parser_OutputLanguages(Elements pjelsMW_Parser_Output) {
        boolean blnValidLang = false;
        Elements eleResults = new Elements();

        for (Element feele : pjelsMW_Parser_Output) {

            blnValidLang = isValidLang(feele, blnValidLang);
            if (blnValidLang) {
                eleResults.add(feele);
            }
        }
        return eleResults;
    }

    private static boolean isValidLang(Element pfeele,
                                boolean isValidCurrently) {
        if (isValidCurrently) {
            return shouldInvalidateLang(pfeele);
        } else if (pfeele.children().isEmpty() == false) {
            return shouldValidateLang(pfeele);
        }
        return isValidCurrently;
    }

    private static boolean shouldValidateLang(Element pfeele) {
        for (String strLang : Global.LANGUAGES.split(",")) {
            if (pfeele.child(0).id().equals(strLang)) {
                return true;
            }
        }
        return false;
    }

    private static boolean shouldInvalidateLang(Element pfeele) {
        return !pfeele.tag().toString().equals("hr");
    }
}
