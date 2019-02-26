package parsers.wikipedia.test;

import org.junit.Test;

public class ConnectionParserTest extends ParserTest {

    @Test
    public void parse_Relation() {
        testOneParse("volcán", "Related", new String[] { "Related: volcánico", "Related: volcanismo" });

        testOneParse("embeber", "Related_terms_2", new String[] { "Related: beber" });
    }

    @Test
    public void parse_Derivation() {
        testOneParse("corral", "Derived", new String[] { "Derived: acorralar", "Derived: Corralejo", "Derived: corralito", "Derived: tecorral" });

        testOneParse("que", "Derived_terms_6", new String[] { "Derived: quehacer" });

        testOneParse("agua", "Derived_terms", new String[] { "Derived: aguachile", "Derived: aguachirle",
                "Derived: aguaje", "Derived: agualluvias", "Derived: aguamala", "Derived: aguamanil", "Derived: aguamar",
                "Derived: aguamarina", "Derived: aguamiel", "Derived: aguanieve", "Derived: aguar", "Derived: aguardiente",
                "Derived: aguarrás","Derived: aguas", "Derived: Aguascalientes", "Derived: agüita", "Derived: paraguas",
                "Derived: parteaguas", "Derived: piragua" });
    }

    @Test
    public void parse_Only_Single_Words() {
        testOneParse("fruta", "Derived_", new String[] { "Derived: afrutado", "Derived: frutal", "Derived: frutería", "Derived: frutero" });
    }
}