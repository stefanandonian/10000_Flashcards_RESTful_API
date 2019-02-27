package parsers.wikipedia.control;

import parsers.wikipedia.ConnectionParser;
import parsers.wikipedia.DefinitionParser;
import parsers.wikipedia.NounParser;
import parsers.wikipedia.Parser;
import parsers.wikipedia.SpanishVerbParser;

public class ParserFactory {

    public static Parser get(String pstrId) {
        switch (formatId(pstrId)) {
            case "Noun": return new NounParser();
            case "Verb": return new SpanishVerbParser();
            case "Interjection":
            case "Conjunction":
            case "Preposition":
            case "Pronoun":
            case "Adverb":
            case "Adjective":
            case "Article":
            case "Particle": return new DefinitionParser();
            default: return new ConnectionParser();
        }
    }

    public static String formatId(String pstrId) {
        int int_Index = pstrId.indexOf("_");

        if (int_Index != -1) {
            return pstrId.substring(0, int_Index);
        }
        return pstrId;
    }

}
