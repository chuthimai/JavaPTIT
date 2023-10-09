//J07045 LOẠI PHÒNG

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07045 {
    private static class LoaiPhong implements Comparable<LoaiPhong>{
        private String loai, ten, donGia, phiPhucVu;
        public  LoaiPhong(String data){
            String[] arr = data.split(" ");
            loai = arr[0];
            ten = arr[1];
            donGia = arr[2];
            phiPhucVu = arr[3];
        }

        @Override
        public int compareTo(LoaiPhong o) {
            return ten.compareTo(o.ten);
        }

        @Override
        public String toString() {
            return loai+" "+ten+" "+donGia+" "+phiPhucVu;
        }
    }
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
