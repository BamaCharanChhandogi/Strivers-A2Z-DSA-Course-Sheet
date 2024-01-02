package Strings.Medium_String_Problems;
import java.util.HashMap;

// beauty sum is the difference of highly frequent character and least frequent character
public class SumOfBeautyOfAllSubstrings {

public static void main(String[] args) {
	String str = "cbbccddcddccb";
	System.out.println("the beautysum of the given string is" + longestreoccur(str));
		
	}

	//determining the beauty sum
public static int longestreoccur(String str) {
HashMap < Character, Integer> safe= new HashMap<>();
int count=0;int max=0;int min=0;

for (int j=0;j<str.length();++j) 
{	
	char temp = str.charAt(j);
	
	if(!safe.containsKey(temp)) {
		safe.put(temp,0);
		if (min<=count && count !=max && min< max) {
			min=count;
		}
		
		count=0;
			
for(int i=0;i<str.length();++i ){
	
char A= str.charAt(j);	
	if(  A == str.charAt(i)) {
		count++;
		System.out.println(str.charAt(j) + " is " + count );

	    if (count>max){
			max=count;
			}	    
	    } 	}	
}
}System.out.println("the frequecy of highest repeating character is "+ max);
System.out.println("the frequecy of highest repeating character is" + min );
int beautysum= max-min;
return beautysum;
	
	}}
