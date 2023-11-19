//J03022 XỬ LÝ VĂN BẢN

import java.util.Scanner;

public class J03022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (sc.hasNextLine()){
            str += sc.nextLine();
        }

        str = str.trim().toLowerCase();
        str = str.replaceAll(" ,", ",");
        str = str.replaceAll(" [.?!]", ".");
        str = str.replaceAll("\\s+", " ");
        String[] sentences = str.split("[.!?]");
        for (String sentence : sentences) {
            sentence = sentence.trim();
            System.out.println(sentence.substring(0, 1).toUpperCase()
                    + sentence.substring(1));
        }
    }
}
