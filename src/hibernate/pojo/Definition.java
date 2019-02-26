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
@Table(name = "tblDefinition")
public class Definition implements HibernateObject {

    @Id
    @Column(name = "fstrWord")
    private String strWord;

    @Column(name = "fstrPartOfSpeech")
    private String strPartOfSpeech;

    @Column(name = "fstrDefinition")
    private String strDefinition;

    public Definition(String pstrWord,
                      String pstrPartOfSpeech,
                      String pstrDefinition) {
        this.strWord = pstrWord;
        this.strPartOfSpeech = pstrPartOfSpeech;
        this.strDefinition = pstrDefinition;
    }

    @Override
    public void print() {
        System.out.println("Part of Speech: " + strPartOfSpeech + ", Definition: " + strDefinition);
    }

    @Override
    public String parsedData() {
        return strDefinition;
    }
}
