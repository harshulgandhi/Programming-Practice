import java.util.Scanner;

public class CheckRotation{
    
    public static boolean isSubstring(String s1, String s2){
        return s1.contains(s2);
    }
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();
        
        if(s1.length() == s2.length()){
            System.out.println(isSubstring(s1+s1, s2));
        }
    }
}