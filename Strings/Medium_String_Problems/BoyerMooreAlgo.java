public class BoyerMooreAlgo {

    static final int NO_OF_CHARS = 256;

    static void badCharHeuristic(String str, int size, int[] badchar) {
        for (int i = 0; i < NO_OF_CHARS; i++) {
            badchar[i] = -1;
        }

        for (int i = 0; i < size; i++) {
            badchar[str.charAt(i)] = i;
        }
    }

    static void search(String txt, String pat) {
        int m = pat.length();
        int n = txt.length();

        int[] badchar = new int[NO_OF_CHARS];
        badCharHeuristic(pat, m, badchar);

        int s = 0;
        while (s <= (n - m)) {
            int j = m - 1;

            while (j >= 0 && pat.charAt(j) == txt.charAt(s + j)) {
                j--;
            }

            if (j < 0) {
                System.out.println("Pattern occurs at shift = " + s);

                s += (s + m < n) ? m - badchar[txt.charAt(s + m)] : 1;
            } else {
                s += Math.max(1, j - badchar[txt.charAt(s + j)]);
            }
        }
    }

    public static void main(String[] args) {
        String txt = "ABAAABCD";
        String pat = "ABC";
        search(txt, pat);
    }
}
