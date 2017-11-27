import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String s="";
        int n=in.nextInt();
        for(int i=0;i<str.length();i++)
            s+=(char)((int)str.charAt(i)+n);
        System.out.println(s);
    }
}