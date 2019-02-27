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
@Entity @Table(name = "tblDefinition")
@XmlRootElement
public class Definition implements Serializable, HibernateObject {

    @Id @Column(name = "fstrWord") private String strWord;
    @Column(name = "fstrPartOfSpeech") private String strPartOfSpeech;
    @Column(name = "fstrDefinition") private String strDefinition;

    public void print() {
        System.out.println("Part of Speech: " + strPartOfSpeech + ", Definition: " + strDefinition);
    }

    public String parsedData() {
        return strDefinition;
    }
}
