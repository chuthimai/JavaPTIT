/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chumai
 */

//J06005 - QUẢN LÝ BÁN HÀNG – 1

public class J06005 {
    private static class KhachHang{
        private static int sMa = 1;
        private String maKH, tenKH, gioiTinh, ngaySinh, diaChi;

        public KhachHang(Scanner sc) {
            maKH = String.format("KH%03d", sMa++);
            tenKH = sc.nextLine();
            gioiTinh = sc.nextLine();
            ngaySinh = sc.nextLine();
            diaChi = sc.nextLine();
        }

        public String getTenKH() {
            return tenKH;
        }

        public String getDiaChi() {
            return diaChi;
        }

        public String getMaKH() {
            return maKH;
        }
        
        
    }
    
    private static class MatHang{
        private static int sMa = 1;
        private String maMH, tenMH, donVi;
        private int giaMua, giaBan;

        public MatHang(Scanner sc) {
            maMH = String.format("MH%03d", sMa++);
            tenMH = sc.nextLine();
            donVi = sc.nextLine();
            giaMua = Integer.parseInt(sc.nextLine());
            giaBan = Integer.parseInt(sc.nextLine());
        }

        public String getMaMH() {
            return maMH;
        }
        
        

        public String getTenMH() {
            return tenMH;
        }

        public String getDonVi() {
            return donVi;
        }

        public int getGiaMua() {
            return giaMua;
        }

        public int getGiaBan() {
            return giaBan;
        }
        
    }
    
    private static class HoaDon{
        private static int sMa = 1;
        private String maHD, maKH, maMH; 
        private int soLuong;
        private KhachHang khachHang;
        private MatHang matHang;

        public HoaDon(Scanner sc, ArrayList<KhachHang> allKH, ArrayList<MatHang> allMH) {
            maHD = String.format("HD%03d", sMa++);
            maKH = sc.next();
            maMH = sc.next();
            soLuong = sc.nextInt();
            khachHang = findKhachHang(allKH);
            matHang = findMatHang(allMH);
        }

        @Override
        public String toString() {
            return maHD+" "+khachHang.getTenKH()+" "+khachHang.getDiaChi()+" "
                    +matHang.getTenMH()+" "+matHang.getDonVi()+" "+matHang.getGiaMua()+" "+matHang.getGiaBan()+" "
                    +soLuong+" "+matHang.giaBan*soLuong;
        }
        
        public KhachHang findKhachHang(ArrayList<KhachHang> allKH){
            for (KhachHang kh: allKH){
                if (kh.getMaKH().equals(maKH)) {
                    return kh;
                }
            }
            return null;
        }
        
        public MatHang findMatHang(ArrayList<MatHang> allMatHangs){
            for (MatHang mh:allMatHangs){
                if (mh.getMaMH().equals(maMH)) {
                    return mh;
                }
            }
            return null;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<KhachHang> allKH = new ArrayList<>();
        ArrayList<MatHang> allMH = new ArrayList<>();
        ArrayList<HoaDon> allHD = new ArrayList<>();
        int soKH = Integer.parseInt(sc.nextLine());
        for (int i=0; i<soKH; i++) allKH.add(new KhachHang(sc));
        int soMH = Integer.parseInt(sc.nextLine());
        for (int i=0; i<soMH; i++) allMH.add(new MatHang(sc));
        int soHD = Integer.parseInt(sc.nextLine());
        for (int i=0; i<soHD; i++) allHD.add(new HoaDon(sc, allKH, allMH));
        for (HoaDon hd: allHD) System.out.println(hd);
    }
}
