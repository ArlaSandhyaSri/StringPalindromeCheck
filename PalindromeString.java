import java.util.Scanner;
public class PalindromeString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String original = sc.next();
        String reverse="";
        for(int i=original.length()-1;i>=0;i--){
            reverse=reverse+original.charAt(i);
        }
        if(original.equals(reverse) ){
            System.out.println(original+" is a palindrome");
        }else{
            System.out.println(original+" is not a apalindrome");
        }
    }
    
}
