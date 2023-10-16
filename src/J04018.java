//J04018 SỐ PHỨC

import java.util.Scanner;

public class J04018 {
    private static class SoPhuc{
        int thuc, ao;

        public SoPhuc(int thuc, int ao) {
            this.thuc = thuc;
            this.ao = ao;
        }

        public SoPhuc mul(SoPhuc other){
            return new SoPhuc(
                    thuc*other.thuc-ao*other.ao,
                    thuc*other.ao+ao*other.thuc
            );
        }

        public SoPhuc add(SoPhuc other){
            return new SoPhuc(thuc+other.thuc, ao+other.ao);
        }

        @Override
        public String toString() {
            if (ao < 0) return thuc+" - "+Math.abs(ao)+"i";
            else if (ao == 0) return thuc+"";
            else return thuc+" + "+ao+"i";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            SoPhuc a = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc b = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc c = a.add(b).mul(a);
            SoPhuc d = a.add(b).mul(a.add(b));
            System.out.println(c+", "+d);
        }
    }
}
