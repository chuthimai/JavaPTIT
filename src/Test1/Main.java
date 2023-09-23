package Test1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        FloatArr floatArr = new FloatArr();
        Text text = new Text();
        DaThuc p = new DaThuc();
        DaThuc q = new DaThuc();
        while (isTrue){
            System.out.println("Nhap 1 so tu 1-9:");
            int t = scanner.nextInt();
            switch (t){
                case 1:
                    System.out.println("Nhap day so thuc:");
                    floatArr = new FloatArr(scanner.nextInt());
                    for (int i=0; i< floatArr.getN(); i++) floatArr.add(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Viet phan tu nho nhat:");
                    System.out.println(floatArr.minArr());
                    break;
                case 3:
                    System.out.println("Sap xep dua ra day giam dan:");
                    floatArr.sortArr();
                    break;
                case 4:
                    System.out.println("Nhap 1 doan van:");
                    scanner.next();
                    text = new Text(scanner.nextLine());
                    break;
                case 5:
                    System.out.println("So cau:");
                    System.out.println(text.soCau());
                    break;
                case 6:
                    System.out.println("Doan van duoc chuan hoa:");
                    text.chuanHoa();
                    break;
                case 7:
                    System.out.println("Nhap da thuc:");
                    p.nhapBac(scanner.nextInt());
                    int[] arr = new int[100];
                    for (int i=0; i<=p.getN(); i++) arr[i] = scanner.nextInt();
                    p.nhapDaThuc(arr);
                    break;
                case 8:
                    System.out.println("Nhap da thuc q:");
                    q.nhapBac(scanner.nextInt());
                    int[] arr1 = new int[100];
                    for (int i=0; i<=p.getN(); i++) arr1[i] = scanner.nextInt();
                    q.nhapDaThuc(arr1);
                    System.out.println("Tong 2 da thuc:");
                    System.out.println(p.tong2DaThuc(q));
                    break;
                case 9:
                    break;
            }
        }
    }
}
