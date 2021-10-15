import java.util.Locale;
import java.util.Scanner;

public class Z2 {
    static int a() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        //scanner.useLocale(Locale.GERMANY); //wprowadzanie danych z przecinkiem

        double n = scanner.nextDouble();
        double liczba;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            liczba = scanner.nextDouble();
            if(liczba%2==1)
                sum++;
        }
        return sum;
    }
    static int b() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        //scanner.useLocale(Locale.GERMANY); //wprowadzanie danych z przecinkiem

        double n = scanner.nextDouble();
        double liczba;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            liczba = scanner.nextDouble();
            if((liczba%3==0)&&(liczba%5!=0))
                sum++;
        }
        return sum;
    }
    static int c() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        //scanner.useLocale(Locale.GERMANY); //wprowadzanie danych z przecinkiem

        double n = scanner.nextDouble();
        double liczba;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            liczba = scanner.nextDouble();
            if(Math.sqrt(liczba)%1==0)
                sum++;
        }
        return sum;
    }
    static double factorial(int n) {
        double fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    static double twopow(int n) {
        double out = 2;
        for (int i = 2; i <= n; i++) {
            out *= 2;
        }
        return out;
    }
    static int d() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        //scanner.useLocale(Locale.GERMANY); //wprowadzanie danych z przecinkiem

        double n = scanner.nextDouble();
        double[] liczby=new double[100];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            liczby[i] = scanner.nextDouble();
        }
        for (int i = 1; i < n; i++) {
            if(liczby[i]<(liczby[i-1]+liczby[i+1])/2)
                sum++;
        }
        return sum;
    }
    static int e() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        //scanner.useLocale(Locale.GERMANY); //wprowadzanie danych z przecinkiem

        double n = scanner.nextDouble();
        double liczba;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            liczba = scanner.nextDouble();
            if(twopow(i)<liczba&&liczba<factorial(i))
                sum++;
        }
        return sum;
    }
    static int g() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        //scanner.useLocale(Locale.GERMANY); //wprowadzanie danych z przecinkiem

        double n = scanner.nextDouble();
        double liczba;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            liczba = scanner.nextDouble();
            if((i%2==1)&&(liczba%2==1))
                sum++;
        }
        return sum;
    }
    static int h() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        //scanner.useLocale(Locale.GERMANY); //wprowadzanie danych z przecinkiem

        double n = scanner.nextDouble();
        double liczba;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            liczba = scanner.nextDouble();
            if(liczba<i*i)
                sum++;
        }
        return sum;
    }
    static int drugie() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        //scanner.useLocale(Locale.GERMANY); //wprowadzanie danych z przecinkiem

        double n = scanner.nextDouble();
        double liczba;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            liczba = scanner.nextDouble();
            if(liczba>0)
                sum++;
        }
        return sum*2;
    }
    static void trzecie() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        //scanner.useLocale(Locale.GERMANY); //wprowadzanie danych z przecinkiem

        double n = scanner.nextDouble();
        double liczba;
        int dod = 0,uje = 0, ze= 0;
        for (int i = 0; i < n; i++) {
            liczba = scanner.nextDouble();
            if(liczba==0)
                ze++;
            if(liczba>0)
                dod++;
            if(liczba<0)
                uje++;
        }
        System.out.println("Dodatnie: " + dod);
        System.out.println("Ujemne: " + uje);
        System.out.println("Zera: "+ ze);
    }
    static void czwarte() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        //scanner.useLocale(Locale.GERMANY); //wprowadzanie danych z przecinkiem

        double n = scanner.nextDouble();
        double liczba,min=0,max=0;
        if(n>0){
            liczba = scanner.nextDouble();
            min=liczba;
            max=liczba;
        }
        for (int i = 1; i < n; i++) {
            liczba = scanner.nextDouble();
            if(liczba>max)
                max=liczba;
            if(liczba<min)
                min=liczba;
        }
        System.out.println("Min: "+ min);
        System.out.println("Max: "+ max);
    }
    static void piate() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        //scanner.useLocale(Locale.GERMANY); //wprowadzanie danych z przecinkiem

        double n = scanner.nextDouble();
        double[] liczby=new double[100];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            liczby[i] = scanner.nextDouble();
        }
        for (int i = 1; i < n; i++) {
            if((liczby[i-1]>0)&&(liczby[i]>0)) {
                System.out.println(liczby[i-1]+" , "+liczby[i]);
            }
        }
    }
    public static void main(String[] args) {
        piate();
    }
}
