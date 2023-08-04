package Strings.Basic_and_Easy_String_Problems;

public class otate_String {
    public static boolean rotateString(String s, String goal) {
        return (s.length()==goal.length() && (s+s).contains(goal));
    }
    public static void main(String[] args) {
        String s1="abcde";
        String goal="cdeab";
        System.out.println(rotateString(s1,goal));
    }
}
