package parsers.wikipedia.test;

import control.Global;
import parsers.wikipedia.control.WikiLanguageElementsBuilder;
import parsers.wikipedia.WordParser;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WordParserTest extends ParserTest {

    @Test
    public void parse_Word() {
        WordParser wp = new WordParser();
        wp.setMstrWord("no");
        wp.setMeleSpanish(WikiLanguageElementsBuilder.build("no"));
        wp.setRank(3);

        String strExpected = "Word(mstrWord=no, "
        		+ "mintLanguage=0, "
        		+ "mintRank=3, "
        		+ "mblnNoun=true, "
        		+ "mblnPronoun=false, "
        		+ "mblnAdjective=false, "
        		+ "mblnVerb=false, "
        		+ "mblnAdverb=true, "
        		+ "mblnPreposition=false, "
        		+ "mblnConjuction=false, "
        		+ "mblnInterjection=true, "
        		+ "mblnArticle=false, "
        		+ "mblnParticle=false)";
        String strActual = wp.parse().get(0).toString();

        assertEquals(strExpected, strActual);
    }
}
