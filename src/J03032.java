//J03032 ĐẢO TỪ

import java.util.Scanner;

public class J03032 {
    static void printReverse(String word){
        for (int i=word.length()-1; i>=0; i--){
            System.out.print(word.charAt(i));
        }
        System.out.print(" ");
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        scanner.nextLine();
        for (int i=0; i<times; i++){
            String[] words = scanner.nextLine().split("\\s+");
            for (String word: words) printReverse(word);
            System.out.println();
        }
    }
}
