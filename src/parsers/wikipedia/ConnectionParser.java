package main.java.scraping.wikipedia.Parsers;

import main.java.hibernate.objects.Connection;
import main.java.hibernate.objects.HibernateObject;

import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class ConnectionParser extends Parser {

    public ConnectionParser() {}

    public ConnectionParser(String pstrId,
                            String pstrWord,
                            Elements peleSpanish) {
        this.mstrId = pstrId;
        this.mstrWord = pstrWord;
        this.meleSpanish = peleSpanish;
    }

    public List<HibernateObject> parse() {
        return parseConnection(mstrWord,
                               meleSpanish,
                               mstrId);
    }

    public List<HibernateObject> parseConnection(String pstrWord,
                                                 Elements peleSpanish,
                                                 String pstrId) {

        List<String> alstrWords = peleSpanish.select("[id^=" + pstrId + "]")
                .first()
                .parent()
                .nextElementSibling()
                .select("ul > li > span.Latn[lang=es], ul > li > a")
                .eachText();

        List<HibernateObject> alTRet = new ArrayList<>();
        alstrWords.forEach(
                strTo -> {
                    if (!strTo.contains(" ")) {
                        alTRet.add(new Connection(pstrId, pstrWord, strTo));
                    }
        });

        return alTRet;
    }

 }
