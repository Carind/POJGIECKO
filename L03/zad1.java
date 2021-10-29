
public class zad1 {

    public static int countChar(String str, char c){
        int out = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c)
                out++;
        }
        return out;
    }
    public static int countSubStr(String str, String subStr){
        int out = 0;
        for(int i=0,j=0;i<str.length();i++){
            if(str.charAt(i)==subStr.charAt(j)){
                j++;
            }
            else{
                j=0;
            }
            if(j==subStr.length()){
                out++;
                j=0;
            }
        }
        return out;
    }
    public static String middle(String str){
        String out = "";
        if(str.length()%2==0){
            int a=str.length()/2-1,b=str.length()/2;
            out = str.substring(a,a+1)+str.substring(b,b+1);
        }
        else{
            out += str.charAt(str.length()/2);
        }
        return out;
    }
    public static String repeat(String str,int n){
        String out="";
        while(n>0){
            out+=str;
            n--;
        }
        return out;
    }
    public static int[] where(String str,String subStr){
        int[] out = new int[10];
        int index = 0;
        for(int i=0,j=0;i<str.length();i++){
            if(str.charAt(i)==subStr.charAt(j)){
                j++;
            }
            else{
                j=0;
            }
            if(j==subStr.length()){
                out[index]=i-j+1;
                index++;
                j=0;
            }
        }
        return out;
    }
    public static String change(String str){
        StringBuffer strBuff=new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i)))
                strBuff.append(Character.toUpperCase(str.charAt(i)));
            else
                strBuff.append(Character.toLowerCase(str.charAt(i)));
        }
        return strBuff.toString();
    }
    public static String nice(String str){
        StringBuffer strBuff=new StringBuffer();
        int counter =0;
        strBuff.append("\" ");
        for(int i=str.length()-1;i>=0;i--){
            if(Character.isDigit(str.charAt(i)))
                counter++;
            if(counter==3) {
                strBuff.append("\"");
                counter =0;
            }
            strBuff.append(str.charAt(i));
        }
        return strBuff.reverse().toString();
    }
    public static String nice(String str,char sep, int dst){
        StringBuffer strBuff=new StringBuffer();
        int counter =0;
        strBuff.append(sep);
        strBuff.append(" ");
        for(int i=str.length()-1;i>=0;i--){
            if(Character.isDigit(str.charAt(i)))
                counter++;
            if(counter==dst) {
                strBuff.append(sep);
                counter =0;
            }
            strBuff.append(str.charAt(i));
        }
        return strBuff.reverse().toString();
    }
    public static void main(String []args){
        System.out.println(countChar("abcda",'a'));
        System.out.println(countSubStr("abcdab","ab"));
        System.out.println(middle("abce"));
        System.out.println(repeat("ab",3));
        int [] whereans = where("abcdab","ab");
        for(int i=0;i<whereans.length;i++){
            System.out.println(whereans[i]);
        }
        System.out.println(change("aBce"));
        System.out.println(nice("10 122 14 163 20 1021 123 12"));
        System.out.println(nice("10 122 14 163 20 1021 123 12",'.',2));
    }
}
