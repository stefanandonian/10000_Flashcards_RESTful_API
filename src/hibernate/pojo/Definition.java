 package hibernate.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import hibernate.pojo.keys.DefinitionCompositeKey;

@XmlRootElement
@Data @AllArgsConstructor @NoArgsConstructor
@Entity @IdClass(DefinitionCompositeKey.class) @Table(name = "tblDefinition")
public class Definition implements Serializable, HibernateObject {

    @Id @Column(name = "fstrWord") private String strWord;
    @Id @Column(name = "fstrPartOfSpeech") private String strPartOfSpeech;
    @Id @Column(name = "fstrDefinition") private String strDefinition;

    public void print() {
        System.out.println("Part of Speech: " + strPartOfSpeech + ", Definition: " + strDefinition);
    }

    public String parsedData() {
        return strDefinition;
    }
    
}
