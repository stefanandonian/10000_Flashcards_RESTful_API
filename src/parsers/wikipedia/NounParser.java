package parsers.wikipedia;

import control.Global;
import hibernate.pojo.HibernateObject;
import hibernate.pojo.Noun;
import parsers.wikipedia.control.WikiLanguageElementsBuilder;

import org.jsoup.select.Elements;

import java.util.List;

public class NounParser extends DefinitionParser {

    public static void main(String[] args) {
        String searchWord = "de";
        Elements eleSpanish = WikiLanguageElementsBuilder.build(searchWord);
        NounParser np = new NounParser(searchWord, eleSpanish);
        List<HibernateObject> DefinitionList = np.parse();
        System.out.println("Word: " + searchWord);
        System.out.println("Plural Form: " + np.getPluralForm(eleSpanish));
        System.out.println("Gender: " + ((np.getGender(eleSpanish) == 0) ? "Male" : "Female" ));
        for (HibernateObject ho : DefinitionList) {
            ho.print();
        }
    }

    public NounParser() {}

    public NounParser(String  pstrWord,
                      Elements peleSpanish) {
        super("Noun", pstrWord, peleSpanish);
    }

    public List<HibernateObject> parse() {
        List<HibernateObject> retHoList = super.parse();
        retHoList.add(new Noun(mstrWord, getPluralForm(), getGender()));
        return retHoList;
    }

    public int getGender() {
        return getGender(this.meleSpanish);
    }

    public int getGender(Elements peleSpanish) {
        Elements e = peleSpanish.select("span.gender");
        if (e.isEmpty()) {
            return 0;
        } else {
            return e.first()
                    .child(0)
                    .text()
                    .equals("f") ? Global.FEMALE : Global.MALE;
        }
    }

    public String getPluralForm() {
        return getPluralForm(meleSpanish);
    }

    public String getPluralForm(Elements peleSpanish) {
        Elements e = peleSpanish.select(".Latn.form-of.lang-es.p-form-of");
        if (e.isEmpty()) {
            return Global.INVALID;
        } else {
            return e.first().child(0).text();
        }
    }
}
