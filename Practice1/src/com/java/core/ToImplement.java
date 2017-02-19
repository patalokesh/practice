package com.java.core;
import java.util.HashMap;

public class ToImplement {
	
	static private long uniqueId = Long.MIN_VALUE;
	private HashMap<Long,String> hmUrlMapping = new HashMap<Long,String>();
	
	public static long getUniqueId()
	{
		return uniqueId;
	}
	
	public static long incrementUniqueId()
	{		
		return uniqueId++;
	}
	
	public String get(String shortURI) {
		Long shortUrl = Long.parseLong(shortURI);
	    return hmUrlMapping.get(shortUrl);
	  }

	  public String set(String longURL) {
		  Long shortUrl = getUniqueId();
		  hmUrlMapping.put(shortUrl, longURL);
		  incrementUniqueId();
	    return shortUrl.toString();
	  }

}
