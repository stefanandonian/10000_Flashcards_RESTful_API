package parsers.wikipedia.test;

import hibernate.pojo.HibernateObject;
import parsers.wikipedia.Parser;
import parsers.wikipedia.control.ParserFactory;
import parsers.wikipedia.control.WikiLanguageElementsBuilder;

import org.jsoup.select.Elements;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class ParserTest {

    protected void testOneParse(String pstrWord,
                                String pstrId,
                                String[] pastrExpected) {

        Elements eleSpanish = WikiLanguageElementsBuilder.build(pstrWord);

        Parser parser = ParserFactory.get(pstrId);

        parser.setMstrId(ParserFactory.formatId(pstrId));
        parser.setMstrWord(pstrWord);
        parser.setMeleSpanish(eleSpanish);

        List<HibernateObject> hibernateObjectList = parser.parse();
        for (int i = 0; i < hibernateObjectList.size(); i++) {
            assertEquals(hibernateObjectList.get(i).parsedData(), pastrExpected[i]);
        }
    }
}
