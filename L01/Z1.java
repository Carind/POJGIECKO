import java.util.Locale;
import java.util.Scanner;


public class Z1 {
    static int dodawanie() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        //scanner.useLocale(Locale.GERMANY); //wprowadzanie danych z przecinkiem

        int n = scanner.nextInt();
        int liczba;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            liczba = scanner.nextInt();
            sum += liczba;
        }
        return sum;
    }

    static int mnozenie() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        //scanner.useLocale(Locale.GERMANY); //wprowadzanie danych z przecinkiem

        int n = scanner.nextInt();
        int liczba;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            liczba = scanner.nextInt();
            sum *= liczba;
        }
        return sum;
    }

    static int dodbezw() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        //scanner.useLocale(Locale.GERMANY); //wprowadzanie danych z przecinkiem

        int n = scanner.nextInt();
        int liczba;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            liczba = scanner.nextInt();
            if (liczba < 0)
                liczba *= -1;
            sum += liczba;
        }
        return sum;
    }

    static double dodawaniepierw() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        //scanner.useLocale(Locale.GERMANY); //wprowadzanie danych z przecinkiem

        double n = scanner.nextDouble();
        double liczba;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            liczba = scanner.nextDouble();
            if (liczba < 0)
                liczba *= -1;
            sum += Math.sqrt(liczba);
        }
        return sum;
    }
    static int monzbezw() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        //scanner.useLocale(Locale.GERMANY); //wprowadzanie danych z przecinkiem

        int n = scanner.nextInt();
        int liczba;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            liczba = scanner.nextInt();
            if (liczba < 0)
                liczba *= -1;
            sum *= liczba;
        }
        return sum;
    }

    static double dodawanie2() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        //scanner.useLocale(Locale.GERMANY); //wprowadzanie danych z przecinkiem

        double n = scanner.nextDouble();
        double liczba;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            liczba = scanner.nextDouble();
            sum += liczba * liczba;
        }
        return sum;
    }

    static void dodawanieab() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        //scanner.useLocale(Locale.GERMANY); //wprowadzanie danych z przecinkiem

        double n = scanner.nextDouble();
        double liczba;
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < n; i++) {
            liczba = scanner.nextDouble();
            sum1 += liczba;
            sum2 *= liczba;
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }

    static double dodawanieprze() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        //scanner.useLocale(Locale.GERMANY); //wprowadzanie danych z przecinkiem

        double n = scanner.nextDouble();
        double liczba;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            liczba = scanner.nextDouble();
            if (i % 2 == 0)
                sum += liczba;
            else
                sum -= liczba;
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

    static double dodawanieprze2() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        //scanner.useLocale(Locale.GERMANY); //wprowadzanie danych z przecinkiem

        double n = scanner.nextDouble();
        double liczba;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            liczba = scanner.nextDouble();
            if (i % 2 == 0)
                sum -= liczba / factorial(i);
            else
                sum += liczba / factorial(i);
        }
        return sum;
    }

    static void wypisz() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //wprowadzanie liczb z kropką jako separatorem
        //scanner.useLocale(Locale.GERMANY); //wprowadzanie danych z przecinkiem

        int n = scanner.nextInt();
        int liczba;
        int a=0;
        for (int i = 0; i < n; i++) {
            liczba = scanner.nextInt();
            if (i == 0)
                a = liczba;
            else
                System.out.println(liczba);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        //a
        //System.out.println(dodawanie());

        //b
        //System.out.println(mnozenie());

        //c
        //System.out.println(dodbezw());

        //d
        //System.out.println(dodawaniepierw());

        //e
        //System.out.println(mnozbezw());

        //f
        //System.out.println(dodawanie2());

        //g
        //dodawanieab();

        //h
        //System.out.println(dodawanieprze());

        //i
        //System.out.println(dodawanieprze2());

        //2
        //wypisz();
    }
}