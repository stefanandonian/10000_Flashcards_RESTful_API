package parsers.wikipedia.test;

import control.Global;
import parsers.wikipedia.SpanishVerbParser;
import parsers.wikipedia.control.WikiLanguageElementsBuilder;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SpanishVerbParserTest extends ParserTest {

    @Test
    public void parse_verb() {
        String strExpected = "aguar,aguando,aguado,aguada,aguados,aguadas," +
                "aguo,aguas,agua,aguamos,aguáis,aguan," +
                "aguaba,aguabas,aguaba,aguábamos,aguabais,aguaban," +
                "agüé,aguaste,aguó,aguamos,aguasteis,aguaron," +
                "aguaré,aguarás,aguará,aguaremos,aguaréis,aguarán," +
                "aguaría,aguarías,aguaría,aguaríamos,aguaríais,aguarían," +
                "agüe,agües,agüe,agüemos,agüéis,agüen," +
                "aguara,aguaras,aguara,aguáramos,aguarais,aguaran," +
                "aguase,aguases,aguase,aguásemos,aguaseis,aguasen," +
                "aguare,aguares,aguare,aguáremos,aguareis,aguaren," +
                "agua,agüe,agüemos,aguad,agüen," +
                "agües,agüe,agüemos,agüéis,agüen";

        SpanishVerbParser svp = new SpanishVerbParser(WikiLanguageElementsBuilder.build("aguar"));
        assertEquals(strExpected, svp.parse().get(0).parsedData());

        strExpected = "ir,yendo,ido,ida,idos,idas," +
                "voy,vas,va,vamos,vais,van," +
                "iba,ibas,iba,íbamos,ibais,iban," +
                "fui,fuiste,fue,fuimos,fuisteis,fueron," +
                "iré,irás,irá,iremos,iréis,irán," +
                "iría,irías,iría,iríamos,iríais,irían," +
                "vaya,vayas,vaya,vayamos,vayáis,vayan," +
                "fuera,fueras,fuera,fuéramos,fuerais,fueran," +
                "fuese,fueses,fuese,fuésemos,fueseis,fuesen," +
                "fuere,fueres,fuere,fuéremos,fuereis,fueren," +
                "ve,vaya,vamos,id,vayan," +
                "vayas,vaya,vayamos,vayáis,vayan";
        svp = new SpanishVerbParser(WikiLanguageElementsBuilder.build("ir"));
        assertEquals(strExpected, svp.parse().get(0).parsedData());
    }

    @Test
    public void parse_notVerb() {
        String strExpected = Global.NOTHING_PARSED;

        SpanishVerbParser svp = new SpanishVerbParser(WikiLanguageElementsBuilder.build("agua"));
        assertEquals(strExpected, svp.parse().get(0).parsedData());

        svp = new SpanishVerbParser(WikiLanguageElementsBuilder.build("para"));
        assertEquals(strExpected, svp.parse().get(0).parsedData());
    }

}
