import java.util.Arrays;
import java.util.Random;

public class zad2 {
    public static void generuj (long[] tab,int n, int minWart,int maxWart) {
        Random r = new Random();
        for (int j = 0; j < n; ++j) {
            tab[j] = r.nextInt(maxWart-minWart)+minWart;
        }
    }
    public static void wypisz(long[] tab) {
        for (long el : tab) {
            System.out.print(el + " ");
        }
        System.out.println("");
    }
    public static int ileNieparzystych(long[] tab) {
        int sum=0;
        for (int j = 0; j < tab.length; ++j) {
            if(tab[j]%2==1)
                sum++;
        }
        return sum;
    }
    public static int ileParzystych(long[] tab) {
        return tab.length-ileNieparzystych(tab);
    }
    public static int ileDodatnich(long[] tab) {
        int sum=0;
        for (int j = 0; j < tab.length; ++j) {
            if(tab[j]>0)
                sum++;
        }
        return sum;
    }
    public static int ileUjemnych(long[] tab) {
        int sum=0;
        for (int j = 0; j < tab.length; ++j) {
            if(tab[j]<0)
                sum++;
        }
        return sum;
    }
    public static int ileZerowych(long[] tab) {
        int sum=0;
        for (int j = 0; j < tab.length; ++j) {
            if(tab[j]==0)
                sum++;
        }
        return sum;
    }
    public static int ileMaksymalnych(long[] tab) {
        int sum=0;
        long max=tab[0];
        for (int j = 1; j < tab.length; ++j) {
            if(tab[j]>max)
                max=tab[j];
        }
        for (int j = 0; j < tab.length; ++j) {
            if(tab[j]==max)
                sum++;
        }
        return sum;
    }
    public static long sumaDodatnich(long[] tab) {
        long sum=0;
        for (int j = 0; j < tab.length; ++j) {
            if(tab[j]>0)
                sum+=tab[j];
        }
        return sum;
    }
    public static long sumaUjemnych(long[] tab) {
        long sum=0;
        for (int j = 0; j < tab.length; ++j) {
            if(tab[j]<0)
                sum+=tab[j];
        }
        return sum;
    }
    public static int dlugoscMaksymalnegoCiaguDodatnich(long[] tab) {
        int out=0,outmax=0;
        for (int j = 0; j < tab.length; ++j) {
            if(tab[j]>0)
                out++;
            else{
                if(out>outmax)
                    outmax=out;
            }
        }
        return outmax;
    }
    public static void signum(long[] tab) {
        for (long el : tab) {
            if(el>0)
                System.out.print("1"+" ");
            else if(el<0)
                System.out.print("-1" + " ");
        }
        System.out.println("\n");
    }
    public static void odwrocFragment(long[] tab,int lewy,int prawy) {
        int sum=0;
        for (int j = prawy; j >= lewy; j--) {
            System.out.print(tab[j] + " ");
        }
        System.out.println("");
    }
    public static void main (String[] args) {
        Random r = new Random();
        int n = r.nextInt()%99+1;
        if(n<0)
            n*=-1;
        long[] a = new long[n];
        generuj (a,n,-999,999);
        wypisz(a);
        System.out.print(n+"\n");
        System.out.print("Nieparzyste: "+ileNieparzystych(a)+"\n");
        System.out.print("Parzyste: "+ileParzystych(a)+"\n");

    }
}
