package hibernate.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Data @AllArgsConstructor
@Entity @Table(name = "tblNoun")
@XmlRootElement
public class Noun implements Serializable, HibernateObject {

    @Id @Column(name = "fstrSingular") private String strSingular;
    @Column(name = "fstrPlural") private String strPlural;
    @Column(name = "fblnGender") private int blnGender;

    public void print() {
        System.out.println("Noun Singular Form: " + strSingular + ", Noun Plural Form: " + strPlural + ", Gender: " + ((blnGender == 0) ? "Male" : "Female"));
    }

    public String parsedData() {
        return strSingular + "," + strPlural + "," + blnGender;
    }

}
