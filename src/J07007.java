//J07007 LIỆT KÊ TỪ KHÁC NHAU

import java.io.*;
import java.util.*;

public class J07007 {
    private static class WordSet{
        private String nameFile;
        private Set<String> words;
        private Scanner sc;

        public WordSet(String nameFile) {
            this.nameFile = nameFile;
            File f = new File(nameFile);
            try {
                sc = new Scanner(f);
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
            words = new TreeSet<>();
            while (sc.hasNextLine()){
                String[] arr = sc.nextLine().toLowerCase().split("\\s+");
                for (String i:arr) words.add(i);
            }
        }

        @Override
        public String toString() {
            String res = new String("");
            for (String s:words) res += s+"\n";
            return res;
        }
    }

    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
