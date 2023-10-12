package org.tnsif.Assignment;

import java.util.HashMap;
import java.util.Map;

public class Country {
	Map<String,String>countryMap=new HashMap<String,String>();

	public Map<String, String> getCountryMap() {
		return countryMap;
	}

	public void setCountryMap(Map<String, String> countryMap) {
		this.countryMap = countryMap;
	}
	public void add(String cname, String capname)
	{
		countryMap.put(cname, capname);
		
	}
	public String search(String cname)
	{
		if(countryMap.isEmpty())
		{
			return "The Map is Empty";
		}
		else if(countryMap.containsKey(cname))
		{
			return countryMap.get(cname);
		}
		return"data not found";
	}
	
}
