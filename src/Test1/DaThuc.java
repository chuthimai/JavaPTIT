package Test1;

import java.util.Arrays;

public class DaThuc {
    private int n;
    private int[] arr;
    public DaThuc(){

    }
    public void nhapBac(int n){
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void nhapDaThuc(int[] array){
        arr = array.clone();
    }
    public DaThuc tong2DaThuc(DaThuc daThuc){
        int[] res = new int[1000];
        int m = Math.max(n, daThuc.n);
        for (int i=0; i<=m; i++) res[i] = arr[i] + daThuc.arr[i];
        DaThuc r = new DaThuc();
        r.nhapBac(m);
        r.nhapDaThuc(res);
        return r;
    }
    @Override
    public String toString(){
        return Arrays.toString(arr);
    }
}
