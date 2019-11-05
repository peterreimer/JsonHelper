/**
 * 
 */
package de.nrw.hbz.json.helper.json2java;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * @author aquast
 *
 */
public class JsonElementModel {

	private String path = null;
	private Hashtable<String, String> elementList = null;
	private ArrayList<String> valueList = new ArrayList<>();

	public JsonElementModel(String path) {
		this.path = path;
	}
	
	public String getPath() {
		return this.path;
	}
	
	/**
	 * @param elementList
	 */
	public void setComplexElement(Hashtable<String, String> elementList) {
		this.elementList = new Hashtable<>();
		this.elementList = elementList;
	}

	/**
	 * @return
	 */
	public Hashtable<String, String> getComplexElementList() {
		return elementList;
	}

	/**
	 * @param path
	 * @param valueList
	 */
	public void setArrayElement(ArrayList<String> valueList) {
		this.valueList = new ArrayList<>();
		this.valueList = valueList;
	}

	/**
	 * @param path
	 * @param valueList
	 */
	public void addArrayElement(String value) {
		if(this.valueList==null) {
			this.valueList = new ArrayList<>();
		}
		this.valueList.add(value);
	}

	/**
	 * @return
	 */
	public ArrayList<String> getArrayList() {
		return valueList;
	}

	/**
	 * @param jEM
	 * @return
	 */
	public boolean isArray() {
		if (valueList != null) {
			return true;
		}
		return false;
	}

	/**
	 * @param jEM
	 * @return
	 */
	public boolean isObject() {
		if (elementList != null) {
			return true;
		}
		return false;
	}

}
