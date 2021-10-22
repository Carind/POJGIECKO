import java.util.Random;
import java.util.Scanner;

public class zad3 {
    public static void generuj (int[] tab,int n, int minWart,int maxWart) {
        Random r = new Random();
        for (int j = 0; j < n; ++j) {
            tab[j] = r.nextInt(maxWart-minWart)+minWart;
        }
    }
    public static void wypisz(int[] tab,int n) {
        for (int i=0;i<n;i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println("");
    }
    public static int ilorzkol (int[][] A,int[][] B,int x,int y,int len) {
        int sum=0;
        for (int i = 0; i < len; i++) {
            sum+=A[x][i]*B[i][y];
        }
        return sum;
    }
    public static void main (String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("m: ");
        int m = myObj.nextInt();
        System.out.println("n: ");
        int n = myObj.nextInt();
        System.out.println("k: ");
        int k = myObj.nextInt();
        int[][] A = new int[10][10],B=new int[10][10],C=new int[10][10];
        for(int i=0;i<n;i++){
            generuj(A[i],m,-10,10);
        }
        for(int i=0;i<n;i++){
            wypisz(A[i],m);
        }
        System.out.println("-----------------");
        for(int i=0;i<k;i++){
            generuj(B[i],k,-10,10);
        }
        for(int i=0;i<k;i++){
            wypisz(B[i],n);
        }
        System.out.println("-----------------");
        int x,y,sum=0;
        if(m<n)
            x=m;
        else
            x=n;
        if(n<k)
            y=n;
        else
            y=k;
        for(int i=0;i<y;i++){
            for(int j=0;j<x;j++){
                sum=0;
                for (int k2 = 0; k2 < x; k2++) {
                    sum+=A[j][k2]*B[k2][i];
                }
                C[j][i]=sum;
            }
        }
        for(int i=0;i<k;i++){
            wypisz(C[i],x);
        }
    }
}
