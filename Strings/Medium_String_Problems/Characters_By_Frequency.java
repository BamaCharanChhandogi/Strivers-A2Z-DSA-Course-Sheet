package Strings.Medium_String_Problems;

import java.util.*;

public class Characters_By_Frequency {
    public static String frequencySort(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        List<Character>[] bucket=new List[s.length()+1];
        for(Character key:map.keySet()){
            int freq=map.get(key);
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for(char ch:bucket[i]){
                    for(int j=0;j<map.get(ch);j++){
                        sb.append(ch);
                    }
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="errttt";
        System.out.println(frequencySort(s));
    }
}
