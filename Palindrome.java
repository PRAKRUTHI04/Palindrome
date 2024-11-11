import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a string: ");
        String str = s.nextLine().replaceAll("\\s","").toLowerCase();
        boolean isPalindrom = true;
        for(int i = 0 ; i <= str.length()/2 ; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                isPalindrom = false;
                break;
            }
        }
        if(isPalindrom){
            System.out.println(str + " is a palindrome");
        }
        else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
