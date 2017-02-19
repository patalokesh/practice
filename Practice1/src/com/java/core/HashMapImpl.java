package com.java.core;
import java.lang.Exception;

public class HashMapImpl {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	    HashMap1 hm=new HashMap1();
	    hm.put(1, "Lokesh");
	    hm.put(2, "Shiva");
	    hm.put(3, "Gopi");
	    
	    System.out.println(hm.get(2));	    

	}

}

class EntryImpl
{
	private Object key;
	private Object value;
	private EntryImpl next;
	public void setKeyValue(Object key,Object value)
	{
		this.key=key;
		this.value=value;
	}
	public Object getValue()
	{
		return value;
	}
	public Object getKey()
	{
		return key;
	}
	public EntryImpl getNext()
	{
		return next;
	}
}
class HashMap1
{
	public static EntryImpl table[]=new EntryImpl[135];
	public void put(Object key,Object value)
	{
		int hash=key.hashCode();
		if(table[hash]==null)
		{
			table[hash]=new EntryImpl();
			table[hash].setKeyValue(key, value);
			//table.l
		}
			
		else
		{
			EntryImpl next=table[hash].getNext();
			while(next!=null)
				next=next.getNext();
			next.setKeyValue(key, value);
		}
	}
	public Object get(Object key) throws Exception
	{
		int hash=key.hashCode();
		EntryImpl entry=table[hash];
		while(entry!=null)
		{
			if(entry.getKey().equals(key))
				return entry.getValue();
			else
				entry=entry.getNext();
		}
		int len=table.length;
		String str="";
		str.length();
		return null;
	}
	
}
