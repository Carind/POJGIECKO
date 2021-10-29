import java.io.File;
import java.util.Scanner;
public class zad3 {
    public static void main(String[] args) throws Exception {
        //File file = new File("C:\\Users\\local\\isi1\\lab02\\L02\\NazwePliku.txt");
        File file = new File(args[0]);
        Scanner sc = new Scanner(file);
        //char znak='a';
        String word = args[1];
        int counter = 0;
        while (sc.hasNextLine()){
            String line=sc.nextLine();
            for(int i=0;i<line.length();i++){
                if(line.charAt(i)==word.charAt(0)) {
                    int test=0;
                    for (int j = i; j < line.length()-1 || line.charAt(j) != word.charAt(test); j++) {
                        test++;
                        if (test == word.length()+1) {
                            counter++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(counter);
    }
}