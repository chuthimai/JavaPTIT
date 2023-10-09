//J03038 ĐÁNH DẤU CHỮ CÁI

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J03038 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        Set<Character> allChar = new HashSet<>();
        for (int i=0; i<s.length(); i++){
            allChar.add(s.charAt(i));
        }
        System.out.println(allChar.size());
    }
}
