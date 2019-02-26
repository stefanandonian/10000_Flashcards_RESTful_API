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
@Table(name = "tblConnection")
public class Connection implements HibernateObject {

    @Id
    @Column(name = "fstrFrom")
    private String strFrom;

    @Column(name = "fstrTo")
    private String strTo;

    @Column(name = "fstrType")
    private String strType;

    public Connection(String pstrConnectionType,
                      String pstrFrom,
                      String pstrTo) {
        this.strType = pstrConnectionType;
        this.strFrom = pstrFrom;
        this.strTo   = pstrTo;
    }

    @Override
    public void print() {
        System.out.println("Connection Type: " + strType + ", From: " + strFrom + ", To: " + strTo);
    }

    @Override
    public String parsedData() {
        return strType + ": " + strTo;
    }
}
