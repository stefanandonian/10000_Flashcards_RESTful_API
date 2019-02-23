package rest;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Objects;

@XmlRootElement
public class Word implements Serializable {

	private static final long serialVersionUID = 1L;
	private String word;
    private String language;
    private int rank;
    private boolean noun = false;
    private boolean pronoun = false;
    private boolean adjective = false;
    private boolean verb = false;
    private boolean adverb = false;
    private boolean preposition = false;
    private boolean conjuction = false;
    private boolean interjection = false;
    private boolean article = false;
    private boolean particle = false;

    public Word(String word,
                    String language,
                    int rank,
                    boolean noun,
                    boolean pronoun ,
                    boolean adjective,
                    boolean verb,
                    boolean adverb,
                    boolean preposition,
                    boolean conjuction,
                    boolean interjection,
                    boolean article,
                    boolean particle) {
        this.word = word;
        this.language = language;
        this.rank = rank;
        this.noun = noun;
        this.pronoun = pronoun;
        this.adjective = adjective;
        this.verb = verb;
        this.adverb = adverb;
        this.preposition = preposition;
        this.conjuction = conjuction;
        this.interjection = interjection;
        this.article = article;
        this.particle = particle;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", language='" + language + '\'' +
                ", rank=" + rank +
                ", noun=" + noun +
                ", pronoun=" + pronoun +
                ", adjective=" + adjective +
                ", verb=" + verb +
                ", adverb=" + adverb +
                ", preposition=" + preposition +
                ", conjuction=" + conjuction +
                ", interjection=" + interjection +
                ", article=" + article +
                ", particle=" + particle +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Word)) return false;
        Word word = (Word) o;
        return getRank() == word.getRank() &&
                isNoun() == word.isNoun() &&
                isPronoun() == word.isPronoun() &&
                isAdjective() == word.isAdjective() &&
                isVerb() == word.isVerb() &&
                isAdverb() == word.isAdverb() &&
                isPreposition() == word.isPreposition() &&
                isConjuction() == word.isConjuction() &&
                isInterjection() == word.isInterjection() &&
                isArticle() == word.isArticle() &&
                isParticle() == word.isParticle() &&
                Objects.equals(getWord(), word.getWord()) &&
                Objects.equals(getLanguage(), word.getLanguage());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getWord(), getLanguage(), getRank(), isNoun(), isPronoun(), isAdjective(), isVerb(), isAdverb(), isPreposition(), isConjuction(), isInterjection(), isArticle(), isParticle());
    }

    public Word() {
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public boolean isNoun() {
        return noun;
    }

    public void setNoun(boolean noun) {
        this.noun = noun;
    }

    public boolean isPronoun() {
        return pronoun;
    }

    public void setPronoun(boolean pronoun) {
        this.pronoun = pronoun;
    }

    public boolean isAdjective() {
        return adjective;
    }

    public void setAdjective(boolean adjective) {
        this.adjective = adjective;
    }

    public boolean isVerb() {
        return verb;
    }

    public void setVerb(boolean verb) {
        this.verb = verb;
    }

    public boolean isAdverb() {
        return adverb;
    }

    public void setAdverb(boolean adverb) {
        this.adverb = adverb;
    }

    public boolean isPreposition() {
        return preposition;
    }

    public void setPreposition(boolean preposition) {
        this.preposition = preposition;
    }

    public boolean isConjuction() {
        return conjuction;
    }

    public void setConjuction(boolean conjuction) {
        this.conjuction = conjuction;
    }

    public boolean isInterjection() {
        return interjection;
    }

    public void setInterjection(boolean interjection) {
        this.interjection = interjection;
    }

    public boolean isArticle() {
        return article;
    }

    public void setArticle(boolean article) {
        this.article = article;
    }

    public boolean isParticle() {
        return particle;
    }

    public void setParticle(boolean particle) {
        this.particle = particle;
    }
}
