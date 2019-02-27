package parsers.wikipedia;

import hibernate.pojo.SpanishVerbConjugation;
import hibernate.pojo.HibernateObject;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class SpanishVerbParser extends DefinitionParser {

    private final int CONJUGATION_END_INDEX = 69;

    public SpanishVerbParser() {}

    public SpanishVerbParser(Elements peleSpanish) {
        super("", "", peleSpanish);
    }

    public List<HibernateObject> parse() {
        return wrapHibernateObjectInList(
                getConjugations(meleSpanish));
    }

    public SpanishVerbConjugation getConjugations(Elements peleSpanish) {
        Elements eleUnique = removeDoubleConjugations(peleSpanish.select("td > span.Latn[lang=es] > a"));
        return new SpanishVerbConjugation((eleUnique.size() > 0 &&
                                           eleUnique.get(0).text().endsWith("r")) ?
                                               eleUnique.eachText() :
                                               new ArrayList<>());
    }

    public Elements removeDoubleConjugations(Elements peleVerbConjugations) {
        Elements retEleSingles = new Elements();
        if (peleVerbConjugations.size() > 0) {
            Element elePast = peleVerbConjugations.last();

            int intCount = 0;
            for (Element eleCurr : peleVerbConjugations) {
                if (intCount <= CONJUGATION_END_INDEX && !eleCurr
                        .parent()
                        .parent()
                        .toString().equals(elePast
                                .parent()
                                .parent()
                                .toString())) {
                    retEleSingles.add(eleCurr);
                    intCount++;
                }
                elePast = eleCurr;
            }
        }
        return retEleSingles;
    }

}