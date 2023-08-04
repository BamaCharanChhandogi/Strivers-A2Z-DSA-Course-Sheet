package Strings.Basic_and_Easy_String_Problems;

import java.util.HashMap;

public class p {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);

        for(int j=0;j<t.length();j++){
            char ch =t.charAt(j);
            if(!map.containsKey(ch)){
                return false;
            }
            else if(map.get(ch)==1){
                map.remove(ch);
            }
            else{
                map.put(ch, map.get(ch)-1);
            }
        }
        return map.size()==0;
    }
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
