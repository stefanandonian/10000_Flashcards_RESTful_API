package main.java.scraping.wikipedia.Parsers;

import main.java.hibernate.objects.Definition;
import main.java.hibernate.objects.HibernateObject;
import parsers.wikipedia.control.WikiLanguageElementsBuilder;

import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class DefinitionParser extends Parser {

    public static void main(String[] args) {
        String search = "agua";
        Elements e = WikiLanguageElementsBuilder.build(search);
        DefinitionParser dp = new DefinitionParser("Noun", search, e);

        dp.parse().forEach(n -> n.print());
    }

    public DefinitionParser(String pstrId,
                            String pstrWord,
                            Elements peleSpanish) {
        this.mstrId = pstrId;
        this.mstrWord = pstrWord;
        this.meleSpanish = peleSpanish;
    }

    public DefinitionParser() {}

    public List<HibernateObject> parse() {
        return parseDefinitions(mstrWord,
                                meleSpanish,
                                mstrId);
    }

    public List<HibernateObject> parseDefinitions(String pstrWord,
                                                  Elements peleSpanish,
                                                  String pstrId) {
        List<HibernateObject> DefinitionList = new ArrayList<>();

        List<String> strDefinitionList = new ArrayList<>();
        strDefinitionList.addAll(
                formatDefinitions(
                        peleSpanish.select("[id^=" + pstrId + "]")
                        .first()
                        .parent()
                        .nextElementSibling()
                        .nextElementSibling()
                        .select("li > a"),
                        "dl, ul"));

        strDefinitionList.forEach(strDefinition -> DefinitionList.add(
                new Definition(pstrWord,
                               pstrId,
                               strDefinition)));
        return DefinitionList;
    }

    private List<String> formatDefinitions(Elements peleParents,
                                           String pstrExcludeList) {
        List<String> retStrFormattedDefs = new ArrayList<>();
        peleParents.forEach(
                eleChild -> retStrFormattedDefs.add(
                        String.join(" ",
                                    eleChild.parent()
                                            .children().not(pstrExcludeList)
                                            .eachText())
                        .replaceAll("\\( ", "(")
                        .replaceAll(" \\)", ")")
                )
        );
        return removeDuplicates(retStrFormattedDefs);
    }

}
