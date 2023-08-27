package orderoccurance;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class String1 {
	public static void main(String[] args) {
		String[] s={"Hi","Bye","Hello","Hi","Bye"};
		LinkedHashMap<String,Integer> l=new LinkedHashMap<>();
		for(String a:s)
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
			for(Entry<String, Integer> b:l.entrySet())
			{
				String y=b.getKey();
				int z=b.getValue();
				if(z>1)
				System.out.println(b.getKey()+" "+b.getValue());
			}
		}
}
