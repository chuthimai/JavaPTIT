//J07022 LOẠI BỎ SỐ NGUYÊN

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07022 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("DATA.in");
        Scanner sc = new Scanner(f);
        ArrayList<String> words = new ArrayList<>();
        while (sc.hasNext()) {
            if (sc.hasNextInt()) sc.nextInt();
            else words.add(sc.next());
        }
        Collections.sort(words);
        for (String word: words) System.out.print(word+" ");
    }
}
