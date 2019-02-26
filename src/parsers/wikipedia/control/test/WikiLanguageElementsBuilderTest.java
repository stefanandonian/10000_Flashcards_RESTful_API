package parsers.wikipedia.control.test;

import parsers.wikipedia.control.WikiLanguageElementsBuilder;
import org.jsoup.select.Elements;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class WikiLanguageElementsBuilderTest {

    @Test
    public void web_page_not_found() {
        Elements eleWikiPage = WikiLanguageElementsBuilder.build("teresa");
        assertTrue(eleWikiPage.isEmpty());
    }

    @Test
    public void web_page_exists() {
        Elements eleWikiPage = WikiLanguageElementsBuilder.build("banana");
        assertTrue(!eleWikiPage.isEmpty());
    }
}
