package hibernate.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity @Table(name = "tblConnection")
@XmlRootElement
public class Connection implements Serializable, HibernateObject {

    @Id @Column(name = "fstrFrom") private String strFrom;
    @Column(name = "fstrTo") private String strTo;
    @Column(name = "fstrType") private String strType;

    public void print() {
        System.out.println("Connection Type: " + strType + ", From: " + strFrom + ", To: " + strTo);
    }

    public String parsedData() {
        return strType + ": " + strTo;
    }
}
