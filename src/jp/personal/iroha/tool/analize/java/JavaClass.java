package jp.personal.iroha.tool.analize.java;

import java.util.HashMap;
import java.util.Map;

/**
 * fieldlist key=name of class field, value=name of type
 * @author iroha
 *
 */
public class JavaClass {
	protected Map<String,String> fieldlist;

	public JavaClass() {
		this.fieldlist = new HashMap<String, String>();
	}

	public static void main(String[] args) {

	}
}
