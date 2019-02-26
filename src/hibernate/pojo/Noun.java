package hibernate.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tblNoun")
public class Noun implements HibernateObject {

    @Id
    @Column(name = "fstrSingular")
    private String strSingular;

    @Column(name = "fstrPlural")
    private String strPlural;

    @Column(name = "fblnGender")
    private int blnGender;

    public Noun(String pstrSingular,
                String pstrPlural,
                int pblnGender) {
        this.strSingular = pstrSingular;
        this.strPlural = pstrPlural;
        this.blnGender = pblnGender;
    }

    public void print() {
        System.out.println("Noun Singular Form: " + strSingular + ", Noun Plural Form: " + strPlural + ", Gender: " + ((blnGender == 0) ? "Male" : "Female"));
    }

    public String parsedData() {
        return strSingular + "," + strPlural + "," + blnGender;
    }

}
