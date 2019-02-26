package main.java.scraping.wikipedia.Parsers;

import main.java.control.Global;
import main.java.hibernate.objects.HibernateObject;
import main.java.hibernate.objects.Word;
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
                case "Noun": wrdParsed.setBlnNoun(1); break;
                case "Verb": wrdParsed.setBlnVerb(1); break;
                case "Interjection": wrdParsed.setBlnInterjection(1); break;
                case "Conjunction": wrdParsed.setBlnConjuction(1); break;
                case "Preposition": wrdParsed.setBlnPreposition(1); break;
                case "Pronoun": wrdParsed.setBlnPronoun(1); break;
                case "Adverb": wrdParsed.setBlnAdverb(1); break;
                case "Adjective": wrdParsed.setBlnAdjective(1); break;
                case "Article": wrdParsed.setBlnArticle(1); break;
                case "Particle": wrdParsed.setBlnParticle(1); break;
                default: break;
            }
        }
        return wrdParsed;
    }

}
