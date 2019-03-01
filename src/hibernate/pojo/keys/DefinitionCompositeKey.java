package hibernate.pojo.keys;

import java.io.Serializable;

import lombok.Data;

@Data
public class DefinitionCompositeKey implements Serializable {

	private String strWord;
	private String strPartOfSpeech;
	private String strDefinition;
}
