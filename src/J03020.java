//J03020 TÌM TỪ THUẬN NGHỊCH DÀI NHẤT

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class J03020 {
    private static class Word{
        private String word;
        private int soLanXuatHien;

        public Word(String word) {
            this.word = word;
            this.soLanXuatHien = 1;
        }

        public String getWord() {
            return word;
        }

        public void add(){
            soLanXuatHien += 1;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Word)) return false;
            if (((Word) obj).word.equals(word)) return true;
            else return false;
        }

        @Override
        public String toString() {
            return word+" "+soLanXuatHien;
        }
    }
    private static boolean isThuanNghich(String s){
        boolean res = true;
        int l = s.length();
        for (int i=0; i<l/2; i++){
            if (!s.substring(i, i+1).equals(s.substring(l-i-1, l-i))) res = false;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Word> allWord = new ArrayList<>();
        while (sc.hasNext()){
            Word word = new Word(sc.next());
            if (isThuanNghich(word.getWord())){
                if (allWord.isEmpty()) allWord.add(word);
                else {
                    if (allWord.get(0).getWord().length() == word.getWord().length()){
                        boolean isAdd = false;
                        for (int j=0; j<allWord.size(); j++){
                            if (allWord.get(j).equals(word)){
                                allWord.get(j).add();
                                isAdd = true;
                                break;
                            }
                        }
                        if (!isAdd) allWord.add(word);
                    } else if (allWord.get(0).getWord().length() < word.getWord().length()) {
                        allWord.clear();
                        allWord.add(word);
                    }
                }
            }
        }

        for (Word s: allWord) System.out.println(s);
    }
}
