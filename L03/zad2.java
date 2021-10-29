import java.io.File;
import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) throws Exception {
        //File file = new File("C:\\Users\\local\\isi1\\lab02\\L02\\NazwePliku.txt");
        File file = new File(args[0]);
        Scanner sc = new Scanner(file);
        //char znak='a';
        char znak = args[1].charAt(0);
        int counter = 0;
        while (sc.hasNextLine()){
            String line=sc.nextLine();
            for(int i=0;i<line.length();i++){
                if(line.charAt(i)==znak)
                    counter++;
            }
        }
        System.out.println(counter);
    }

}