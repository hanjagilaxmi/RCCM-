package orderoccurance;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class char1 {
	public static void main(String[] args) {
		String s="KarnataKa";
		char[] b1=s.toCharArray();
		LinkedHashMap<Character,Integer> l=new LinkedHashMap<>();
		for(char a:b1)
		{
			if(!l.containsKey(a))
			{
				l.put(a,1);
			}
			else
			{
				int count=l.get(a);
				count++;
				l.put(a, count);
			}
		}
			//System.out.println(l);
			for(Entry<Character, Integer> b:l.entrySet())
			{
				char y=b.getKey();
				int z=b.getValue();
				if(z>1)
				System.out.println(b.getKey()+" "+b.getValue());
			}
		}
}
