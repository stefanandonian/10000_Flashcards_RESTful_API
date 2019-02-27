package parsers.wikipedia;

import control.Global;
import hibernate.pojo.HibernateObject;
import hibernate.pojo.Word;
import parsers.wikipedia.control.ParserFactory;

import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class WordParser extends Parser {

    private int mintRank = 0;

    public void setRank(int pintRank) {
        this.mintRank = pintRank;
    }

    public List<HibernateObject> parse() {
        List<String> strParseQueueList = buildParseQueue(meleSpanish,
                                                        (Global.PARTS_OF_SPEECH + "," + Global.WORD_CONNECTIONS));
        List<HibernateObject> hOSaveToDbList = new ArrayList<>();
        hOSaveToDbList.add(buildWord(strParseQueueList));

        strParseQueueList.forEach(
                strParseId -> {
                    Parser aParser = ParserFactory.get(strParseId);
                    aParser.setMstrWord(mstrWord);
                    aParser.setMstrId(strParseId);
                    aParser.setMeleSpanish(meleSpanish);
                    hOSaveToDbList.addAll(aParser.parse());
                });

        return hOSaveToDbList;
    }

    protected List<String> buildParseQueue(Elements peleSpanish,
                                           String pstrIdList) {
        String strPossibleParseIds = "[id^=" + pstrIdList.replace(",", "], [id^=") + "]";
        List<String> strPartOfSpeechList = peleSpanish.select(strPossibleParseIds)
                .eachAttr("id");

        for (int i = 0; i < strPartOfSpeechList.size(); i++) {
            strPartOfSpeechList.set(i, ParserFactory.formatId(strPartOfSpeechList.get(i)));
        }

        return removeDuplicates(strPartOfSpeechList);
    }

    private Word buildWord(List<String> pstrIds) {
        Word wrdParsed = new Word(mstrWord,
                                  Global.SPANISH,
                                  mintRank);
        for (String strId : pstrIds) {
            switch (strId) {
                case "Noun": wrdParsed.setMblnNoun(true); break;
                case "Verb": wrdParsed.setMblnVerb(true); break;
                case "Interjection": wrdParsed.setMblnInterjection(true); break;
                case "Conjunction": wrdParsed.setMblnConjuction(true); break;
                case "Preposition": wrdParsed.setMblnPreposition(true); break;
                case "Pronoun": wrdParsed.setMblnPronoun(true); break;
                case "Adverb": wrdParsed.setMblnAdverb(true); break;
                case "Adjective": wrdParsed.setMblnAdjective(true); break;
                case "Article": wrdParsed.setMblnArticle(true); break;
                case "Particle": wrdParsed.setMblnParticle(true); break;
                default: break;
            }
        }
        return wrdParsed;
    }

}
