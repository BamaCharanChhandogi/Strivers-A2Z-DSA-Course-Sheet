import java.util.ArrayList;
import java.util.List;

public class TextJustification {

    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < words.length) {
            int width = 0;
            int j = i;
            while (j < words.length && width + words[j].length() + (j - i) <= maxWidth) {
                width += words[j].length();
                j++;
            }
            int spaces = 1, extraSpaces = 0;
            if (j - i != 1 && j != words.length) {
                spaces = (maxWidth - width) / (j - i - 1);
                extraSpaces = (maxWidth - width) % (j - i - 1);
            }
            StringBuilder line = new StringBuilder(words[i]);
            for (int k = i + 1; k < j; k++) {
                for (int s = 0; s < spaces; s++) {
                    line.append(' ');
                }
                if (extraSpaces > 0) {
                    line.append(' ');
                    extraSpaces--;
                }
                line.append(words[k]);
            }
            while (line.length() < maxWidth) {
                line.append(' ');
            }
            result.add(line.toString());
            i = j;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> result = fullJustify(words, maxWidth);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
