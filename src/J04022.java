//J04022 WORDSET

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J04022 {
    private static class WordSet {
        private String[] words;
        public WordSet(String str) {
            words = str.toLowerCase().split("\\s+");
        }

        public String union(WordSet wordSet){
            Set<String> set = new TreeSet<>();
            for (String i:words) set.add(i);
            for (String i:wordSet.words) set.add(i);
            String res = "";
            for (String i:set) res += i+" ";
            return res;
        }

        public String intersection(WordSet wordSet){
            Set<String> set1 = new TreeSet<>();
            Set<String> set2 = new TreeSet<>();
            for (String i:words) set1.add(i);
            for (String i:wordSet.words) {
                if (set1.contains(i)) {
                    set2.add(i);
                    set1.remove(i);
                }
            }
            String res = "";
            for (String i:set2) res += i+" ";
            return res;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
