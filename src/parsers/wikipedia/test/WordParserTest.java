package main.java.test.scraping.parsers;

import main.java.control.Global;
import main.java.scraping.wikipedia.Parsers.WikiLanguageElementsBuilder;
import main.java.scraping.wikipedia.Parsers.WordParser;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WordParserTest extends ParserTest {

    @Test
    public void parse_Word() {
        WordParser wp = new WordParser();
        wp.setMstrWord("no");
        wp.setMeleSpanish(WikiLanguageElementsBuilder.build("no"));
        wp.setRank(3);

        String strExpected = "no,"+ Global.SPANISH+",3,1,0,0,0,1,0,0,1,0,0";
        String strActual = wp.parse().get(0).parsedData();

        assertEquals(strExpected, strActual);
    }
}
