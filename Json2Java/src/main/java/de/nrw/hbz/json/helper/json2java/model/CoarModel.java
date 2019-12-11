/**
 * 
 */
package de.nrw.hbz.json.helper.json2java.model;

import java.util.Hashtable;

/**
 * @author aquast
 *
 * Class for representing COAR Values as constants
 */
public abstract class CoarModel {
	
	public static final String OPEN_ACCESS = new String("open access");
	public static final String OPEN_ACCESS_URI = new String("http://purl.org/coar/access_right/c_abf2");
	public static final String EMBARGOED_ACCESS = new String("embargoed access");
	public static final String EMBARGOED_ACCESS_URI = new String("http://purl.org/coar/access_right/c_f1cf");
	public static final String RESTRICTED_ACCESS = new String("restricted access");
	public static final String RESTRICTED_ACCESS_URI = new String("http://purl.org/coar/access_right/c_16ec");
	public static final String METADATA_ONLY_ACCESS = new String("metadata only access");
	public static final String METADATA_ONLY_ACCESS_URI = new String("http://purl.org/coar/access_right/c_14cb");

	public static Hashtable<String, String> elementContent = new Hashtable<>();
	public static Hashtable<String, String> uriAttributeContent = new Hashtable<>();
	
	private static void setElementHashtable() {
		elementContent.put("public", CoarModel.OPEN_ACCESS);
		elementContent.put("embargo", CoarModel.EMBARGOED_ACCESS);
		elementContent.put("restricted", CoarModel.RESTRICTED_ACCESS);
		elementContent.put("metadata", CoarModel.METADATA_ONLY_ACCESS);
	}

	private static void setUriHashtable() {
		uriAttributeContent.put("public", CoarModel.OPEN_ACCESS_URI);
		uriAttributeContent.put("embargo", CoarModel.EMBARGOED_ACCESS_URI);
		uriAttributeContent.put("restricted", CoarModel.RESTRICTED_ACCESS_URI);
		uriAttributeContent.put("metadata", CoarModel.METADATA_ONLY_ACCESS_URI);
	}
	
	/**
	 * mapping for lobid to coar
	 * @param value
	 * @return the element value according coar schema
	 */
	public static String getElementValue(String value) {
		setElementHashtable();
		return elementContent.get(value);
	}

	/**
	 * mapping for lobid to coar
	 * @param value
	 * @return the uri attribute value according coar schema
	 */
	public static String getUriAttributeValue(String value) {
		setUriHashtable();
		return uriAttributeContent.get(value);
	}

}

