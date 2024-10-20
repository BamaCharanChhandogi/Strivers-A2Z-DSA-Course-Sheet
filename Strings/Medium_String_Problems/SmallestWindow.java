public class SmallestWindow {

    public static String smallestWindow(String s, String p) {
        int[] mp = new int[26];
        int n = s.length();
        int m = p.length();

        if (n < m) return "-1";

        int l = 0;
        int r = 0;
        int cnt = 0;
        int mini = Integer.MAX_VALUE;
        int stI = -1;

        for (int i = 0; i < m; i++) {
            mp[p.charAt(i) - 'a']++;
        }

        while (r < n) {
            if (mp[s.charAt(r) - 'a'] > 0) {
                cnt++;
            }
            mp[s.charAt(r) - 'a']--;

            while (cnt == m) {
                if (r - l + 1 < mini) {
                    mini = r - l + 1;
                    stI = l;
                }
                mp[s.charAt(l) - 'a']++;
                if (mp[s.charAt(l) - 'a'] > 0) {
                    cnt--;
                }
                l++;
            }
            r++;
        }

        if (stI == -1) return "-1";

        return s.substring(stI, stI + mini);
    }

    public static void main(String[] args) {
        String s = "timetopractice";
        String p = "toc";
        String res = smallestWindow(s, p);
        System.out.println(res);
    }
}
