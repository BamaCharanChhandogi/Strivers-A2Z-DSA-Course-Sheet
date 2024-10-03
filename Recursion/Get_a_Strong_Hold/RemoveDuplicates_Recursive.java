public class RemoveDuplicates_Recursive {
    public static void main(String[] args) {
        String str="MyyynammeeisRec";
        
        removeduplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
    public static void removeduplicates(String str,int idx,StringBuilder newstr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return ;
        }
        char curr = str.charAt(idx);
        if(map[curr -'a']==true){
            removeduplicates(str, idx+1, newstr, map);
        }else{
            map[curr-'a']=true; 
            removeduplicates(str, idx+1, newstr.append(curr), map);
        }
    }
}
