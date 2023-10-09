//J05033 SẮP XẾP THỜI GIAN

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J05033 {
    static class Time implements Comparable<Time>{
        private int gio;
        private int phut;
        private int giay;
        public Time(Scanner sc){
            gio = sc.nextInt();
            phut = sc.nextInt();
            giay = sc.nextInt();
        }

        @Override
        public int compareTo(Time compareTime) {
            if (gio - compareTime.gio != 0) return gio - compareTime.gio;
            else if (phut - compareTime.phut != 0) return phut - compareTime.phut;
            return giay - compareTime.giay;
        }

        @Override
        public String toString(){
            return gio+" "+phut+" "+giay;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Time> allTime = new ArrayList<>();
        for (int i=0; i<n; i++){
            allTime.add(new Time(scanner));
        }
        Collections.sort(allTime);
        for (int i=0; i<n; i++) System.out.println(allTime.get(i));
    }
}
