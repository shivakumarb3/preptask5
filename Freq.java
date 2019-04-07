import java.util.*;
class Freq
{
   
   static int[] matchingStrings(String[] strings, String[] queries) {
        int res[]=new int[queries.length];
        HashMap<String,Integer> h=new HashMap<String,Integer>();

        for(String s: strings)
        {
             if(h.get(s)!=null)
             {
                 int c=h.get(s);
                 h.replace(s,c+1);

             }
             else
             h.put(s,1);
        }
        System.out.println(h);
        int i=0;
        for(String q:queries)
        {
            if(h.get(q)!=null)
            res[i]=h.get(q);
            else
            res[i]=0;
            i++;
        }
        return res;


    }
	public static void main(String args[])
	{
	  String strings[]={"aba","aba","shf"};
	  String queries[]={"aba"};
	int res[]=  matchingStrings(strings,queries);
	for(int i=0;i<res.length;i++)
	System.out.println(res[i]+" ");
	}
	}
	  