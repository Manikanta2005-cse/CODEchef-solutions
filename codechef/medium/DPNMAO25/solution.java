import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc =new Scanner (System.in);
		// your code goes here
        if(!sc.hasNextInt()) return;
        int n=sc.nextInt();
        String s=sc.next();
        Map<Character, Integer> vowelCounts =new HashMap<>();
        char[] vowels={'a', 'e', 'i', 'o' ,'u'};
        for(char v: vowels){
            vowelCounts.put(v,0);
        }
        for(int i=0;i<n;i++){
            char c=Character.toLowerCase(s.charAt(i));
            if(vowelCounts.containsKey(c)){
                vowelCounts.put(c, vowelCounts.get(c)+1);
            }
        }
        char maxVowel='a';
        int maxCount=-1;
        for(char v: vowels){
            int count =vowelCounts.get(v);
            if(count>maxCount){
                maxCount=count;
                maxVowel=v;
            }
        }
        System.out.println(maxVowel);
	}
}
