import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverse_words_in_a_string {
    public static void main(String[] args) {
        String st = reverseWords("F R  I   E    N     D      S      ");
        System.out.println(st);
    }

    public static String reverseWords(String s) {
        s = s.trim();
        List<String> str_list = new ArrayList<>();
        Collections.addAll(str_list, s.split(" "));
        System.out.println(str_list);
        for (int i = 0; i < str_list.size(); i++) {
            if (str_list.get(i).equals("")) {
                str_list.remove("");
                i--;
            }
        }
        System.out.println(str_list);
        Collections.reverse(str_list);
        s = String.join(" ", str_list);
        return s;
    }
}
