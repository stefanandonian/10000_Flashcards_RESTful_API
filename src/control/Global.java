package control;

import java.io.File;

public class Global {

    public static final int TIMEOUT = 20000;

    public static final String WIKI_BASE = "https://en.wiktionary.org/w/index.php?title=";

    public static final String DUMMY_URL = "/dummy_url/198172981723987129387123";

    public static final File TEST_FILE = new File("/Users/stefanandonian/documents/softwaredevelopment/10000_Flashcards/src/main/java/test/scraping/test_parsing_htmls/Verb.txt");

    public static final String LANGUAGES = "Spanish";

    public static final String NOTHING_PARSED = "Nothing";

    public static final String INVALID = " ";

    public static final String WIKI_CHAR_SET = "UTF-8";

    public static final String STATUS_404 = "";

    public static final int SPANISH = 0;
    public static final int ENGLISH = 1;

    public static final int MALE = 0;
    public static final int FEMALE = 1;

    public static final int NOUN = 0;
    public static final int VERB = 1;
    public static final int PRONOUN = 2;
    public static final int ADJECTIVE = 3;
    public static final int ADVERB = 4;
    public static final int INTERJECTION = 5;
    public static final int CONJUNCTION = 6;
    public static final int PREPOSITION = 7;

    public static final String PARTS_OF_SPEECH = "Noun,Verb,Pronoun,Adjective,Adverb,Interjection,Conjunction,Preposition,Particle,Article";

    public static final String WORD_CONNECTIONS = "Related,Derived,Synonyms,Antonyms";

    public static int toPartOfSpeech(String pstrAPartOfSpeech) {
        switch (pstrAPartOfSpeech) {
            case "Noun":
                return Global.NOUN;
            case "Verb":
                return VERB;
            case "Pronoun":
                return PRONOUN;
            case "Adjective":
                return ADJECTIVE;
            case "Adverb":
                return ADVERB;
            case "Interjection":
                return INTERJECTION;
            case "Conjunction":
                return CONJUNCTION;
            case "Preposition":
                return PREPOSITION;
            default:
                return -1;
        }
    }

    public static final String DUMMY_STRING = "123IamADummy";
}
