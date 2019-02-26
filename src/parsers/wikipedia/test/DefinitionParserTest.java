package parsers.wikipedia.test;

import org.junit.Test;

public class DefinitionParserTest extends ParserTest {

    @Test
    public void Article() {
        testOneParse("el", "Article", new String[] { "the" });
    }

    @Test
    public void Adjective() {
        testOneParse("hermoso", "Adjective", new String[] { "beautiful" });
    }

    @Test
    public void Adverb() {
        testOneParse("despacio", "Adverb", new String[] { "slowly", "(Latin America) quietly" });
    }

    @Test
    public void Pronoun() {
        testOneParse("ella", "Pronoun", new String[] { "she her", "it" });
    }

    @Test
    public void Interjection() {
        testOneParse("no", "Interjection", new String[] { "eh (used as a tag question, to emphasise what goes before or to request that the listener express an opinion about what has been said)" });
    }

    @Test
    public void Conjunction() {
        testOneParse("que", "Conjunction", new String[] { "that", "than", "because" });
    }

    @Test
    public void Preposition() {
        testOneParse("que", "Preposition", new String[] { "than", "like as" });
    }

}
