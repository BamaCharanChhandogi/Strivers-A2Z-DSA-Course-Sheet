package Strings.Medium_String_Problems;

import java.util.HashMap;

public class RomantoInteger {
    public static int romanToInt(String Roman){
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result=map.get(Roman.charAt(Roman.length()-1));
        for(int i=Roman.length()-2;i>=0;i--){
            if(map.get(Roman.charAt(i))<map.get(Roman.charAt(i+1))){
                result-=map.get(Roman.charAt(i));
            }
            else{
                result+=map.get(Roman.charAt(i));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String r="LVIII";
        System.out.println(romanToInt(r));
    }
}
