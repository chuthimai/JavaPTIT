package Test1;


import java.util.Arrays;

public class FloatArr {
    private float[] arr;
    private int n;
    private int point = 0;
    public FloatArr(){

    }
    public FloatArr(int n){
        this.n = n;
        arr = new float[n];
    }

    public int getN() {
        return n;
    }

    public void add(float number){
        arr[point] = number;
        point++;
    }
    public float minArr(){
        float res = 1000000000;
        for (float x: arr) res = Math.min(x, res);
        return res;
    }
    public void sortArr(){
        Arrays.sort(arr);
        for (int i=arr.length-1; i>=0; i--) System.out.print(arr[i]+" ");
    }
}
