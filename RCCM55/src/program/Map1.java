package program;

import java.util.Map.Entry;
import java.util.LinkedHashMap;

public class Map1 {
	public static void main(String[] args) {
		
	String s="Hi Bye Hi Hello";
	char ch[]=s.toCharArray();
	LinkedHashMap<Character,Integer> m=new LinkedHashMap<Character,Integer>();
	for(char a:ch)
	{
		if(!m.containsKey(a))
		{
			m.put(a, 1);
		}
		else
		{
			int count=m.get(a);
			m.put(a, count+1);
		}
	}
	for(Entry<Character,Integer> b:m.entrySet())
	{
		char val=b.getKey();
		int val1=b.getValue();
		if(val1==1)
		{
			System.out.println(b.getKey()+" "+ b.getValue());
		}
		
	}
	}

}
