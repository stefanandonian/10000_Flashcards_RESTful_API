package hibernate.pojo.keys;

import java.io.Serializable;

import lombok.Data;

@Data
public class ConnectionCompositeKey implements Serializable {
	private String strWord;
	private String strTo;
    private String strType;
}
