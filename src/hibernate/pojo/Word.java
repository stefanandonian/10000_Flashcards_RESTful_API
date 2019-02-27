package hibernate.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data @AllArgsConstructor
@Entity @Table(name = "tblWord")
@XmlRootElement
public class Word implements Serializable, HibernateObject {

	@Id @Column(name = "fstrWord") private String mstrWord;
	@Column(name = "fintLanguage") private int mintLanguage;
	@Column(name = "fintRank") private int mintRank;
	@Column(name = "fblnNoun") private boolean mblnNoun = false;
	@Column(name = "fblnPronoun") private boolean mblnPronoun = false;
	@Column(name = "fblnAdjective") private boolean mblnAdjective = false;
	@Column(name = "fblnVerb") private boolean mblnVerb = false;
	@Column(name = "fblnAdverb") private boolean mblnAdverb = false;
	@Column(name = "fblnPreposition") private boolean mblnPreposition = false;
	@Column(name = "fblnConjuction") private boolean mblnConjuction = false;
	@Column(name = "fblnInterjection") private boolean mblnInterjection = false;
	@Column(name = "fblnArticle") private boolean mblnArticle = false;
	@Column(name = "fblnParticle") private boolean mblnParticle = false;

    public Word(String pstrWord,
    		    int pintLanguage,
                int pintRank) {
    	this.mstrWord = pstrWord;
        this.mintLanguage = pintLanguage;
        this.mintRank = pintRank;
    }

    public void print() {
        System.out.println("Word: " + mstrWord +
                ", Language: " + ((mintLanguage == 0) ? "Spanish" : "English") +
                ", Rank: " + mintRank + 
                ", Noun?: " + mblnNoun +
                ", Pronoun?: " + mblnPronoun);
        System.out.println("Adjective?: " + mblnAdjective +
                ", Verb?: " + mblnVerb +
                ", Adverb?: " + mblnAdverb +
                ", Preposition?: " + mblnPreposition);
        System.out.println("Conjunction?: " + mblnConjuction +
                ", Interjection?: " + mblnInterjection +
                ", Article?: " + mblnArticle +
                ", Particle?: " + mblnParticle);
    }

    public String parsedData() {
        return mstrWord+","+mintLanguage+","+mintRank+","+
                mblnNoun+","+mblnPronoun+","+mblnAdjective+","+mblnVerb+","+mblnAdverb+","+
                mblnPreposition+","+mblnConjuction+","+mblnInterjection+","+mblnArticle+","+mblnParticle;
    }

}
