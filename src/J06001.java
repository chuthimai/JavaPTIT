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
//J06001 - TÍNH TOÁN HÓA ĐƠN BÁN QUẦN ÁO

public class J06001 {
    private static ArrayList<SanPham> allSP = new ArrayList<>();
    private static class SanPham{
        private String maSP, tenSP;
        private double gia1, gia2;

        public String getMaSP() {
            return maSP;
        }

        public String getTenSP() {
            return tenSP;
        }

        public double getGia1() {
            return gia1;
        }

        public double getGia2() {
            return gia2;
        }

        public SanPham(Scanner sc) {
            maSP = sc.next();
            sc.nextLine();
            tenSP = sc.nextLine();
            gia1 = sc.nextInt();
            gia2 = sc.nextInt();
        } 
    }
    
    private static class HoaDon{
        private static int sMa = 1;
        private String ma, tenSP;
        private int soLuong, loaiSP;
        private double  donGia, gia, tienGiam, tienTra;
        public HoaDon(Scanner sc) {
            ma = sc.next()+String.format("-%03d", sMa++);
            soLuong = sc.nextInt();
            donGia = getDonGia();
            gia = donGia*soLuong;
            tienGiam = getTienGiam();
            tienTra = getTienTra();
        }

        public double getDonGia() {
            for (SanPham sp: allSP){
                if (ma.substring(0, 2).equals(sp.getMaSP())) {
                    tenSP = sp.getTenSP();
                    if (ma.substring(2, 3).equals("1")) {
                        loaiSP = 1;
                        return sp.getGia1();
                    } else if (ma.substring(2, 3).equals("2")) {
                        loaiSP = 2;
                        return sp.getGia2();
                    }
                }
            }
            return 0;
        }

        public double getTienGiam() {
            if (soLuong >= 150) {
                return gia * 50 / 100;
            } else if (soLuong >= 100) {
                return gia * 30 / 100;
            } else if (soLuong >= 50){
                return gia * 15 / 100;
            }
            return 0;
        }

        public double getTienTra() {
            return gia - tienGiam;
        }

        @Override
        public String toString() {
            return ma+" "+tenSP+" "+Math.round(tienGiam)+" "+Math.round(tienTra);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soSP = sc.nextInt();
        for (int i=0; i<soSP; i++) allSP.add(new SanPham(sc));
        int soHD = sc.nextInt();
        for (int i=0; i<soHD; i++) System.out.println(new HoaDon(sc));
    }
}
