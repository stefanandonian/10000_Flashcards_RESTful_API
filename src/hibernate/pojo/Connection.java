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

import hibernate.pojo.keys.ConnectionCompositeKey;
import hibernate.pojo.keys.DefinitionCompositeKey;

@XmlRootElement
@Data @AllArgsConstructor @NoArgsConstructor
@Entity @IdClass(ConnectionCompositeKey.class) @Table(name = "tblConnection")
public class Connection implements Serializable, HibernateObject {
	
	@Id @Column(name = "fstrWord") private String strWord;
	@Id @Column(name = "fstrTo") private String strTo;
    @Id @Column(name = "fstrType") private String strType;

    public void print() {
        System.out.println("Connection Type: " + strType + ", From: " + strWord + ", To: " + strTo);
    }

    public String parsedData() {
        return strType + ": " + strTo;
    }
}
