package orderoccurance;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class String2 {
	public static void main(String[] args) {
		String[] s={"Hi","Bye","Hello","Bye"};
		LinkedHashMap<String,Integer> l=new LinkedHashMap<String,Integer>();
		for(int i=0;i<s.length;i++)
		{
			if(!l.containsKey(s[i]))
			{
				l.put(s[i],1);
			}
			else
			{
				int count=l.get(s[i]);
				count++;
				l.put(s[i], count);
			}
		}
			//System.out.println(l);
			for(Entry<String, Integer> b:l.entrySet())
			{
				String y=b.getKey();
				int z=b.getValue();
				if(z==1)
				System.out.println(b.getKey()+" "+b.getValue());
			}	
	}
}
