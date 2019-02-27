package parsers.wikipedia;

import hibernate.pojo.HibernateObject;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public abstract class Parser {

    protected String mstrId;
    protected String mstrWord;
    protected Elements meleSpanish;

    public void setMstrId(String mstrId) {
        this.mstrId = mstrId;
    }

    public void setMstrWord(String mstrWord) {
        this.mstrWord = mstrWord;
    }

    public void setMeleSpanish(Elements meleSpanish) {
        this.meleSpanish = meleSpanish;
    }

    public abstract List<HibernateObject> parse();

    protected List<HibernateObject> wrapHibernateObjectInList(HibernateObject pHibernateObject) {
        List<HibernateObject> HibernateObjectList = new ArrayList<>();
        HibernateObjectList.add(pHibernateObject);
        return HibernateObjectList;
    }

    protected List<String> removeDuplicates(List<String> pstrList) {
        List<String> strUniqueList = new ArrayList<>();
        pstrList.forEach(
                string -> {
                    if (!strUniqueList.contains(string)) {
                        strUniqueList.add(string);
                    }
                });
        return strUniqueList;
    }

}
