package parsers.wikipedia.test;

import control.Global;
import parsers.wikipedia.NounParser;
import parsers.wikipedia.control.WikiLanguageElementsBuilder;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NounParserTest extends ParserTest {

    @Test
    public void parse() {
        testOneParse("agua", "Noun", new String[] { "water", "body of water", "rain", "(archaic) river stream",
                "(slang, in the plural) urine", "(Guatemala) pop soda (soft drink)", "(Latin America) infusion",
                "agua,aguas,1"});
        testOneParse("terremoto", "Noun", new String[] { "earthquake", "terremoto,terremotos,0" });
    }

    @Test
    public void getGender() {
        NounParser np = new NounParser("terremoto", WikiLanguageElementsBuilder.build("terremoto"));
        assertEquals(np.getGender(), Global.MALE);

        np = new NounParser("cocina", WikiLanguageElementsBuilder.build("cocina"));
        assertEquals(np.getGender(), Global.FEMALE);

        np = new NounParser("linea", WikiLanguageElementsBuilder.build("linea"));
        assertEquals(np.getGender(), 0);
    }

    @Test
    public void getPluralForm() {
        NounParser np = new NounParser("terremoto", WikiLanguageElementsBuilder.build("terremoto"));
        assertEquals(np.getPluralForm(), "terremotos");

        np = new NounParser("cocina", WikiLanguageElementsBuilder.build("cocina"));
        assertEquals(np.getPluralForm(), "cocinas");

        np = new NounParser("no", WikiLanguageElementsBuilder.build("no"));
        assertEquals(np.getPluralForm(), "noes");
    }

    @Test
    public void getInvalidPluralForm() {
        NounParser np = new NounParser("nada", WikiLanguageElementsBuilder.build("nada"));
        assertEquals(Global.INVALID, np.getPluralForm());
    }
}
