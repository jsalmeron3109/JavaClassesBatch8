package class16;

public class Task3 {
//create method that will print whether given string is a palindrome or not
    public void isStringPalindrome(String string){
        int i=0;
        int j=string.length()-1;
        while(i<j){
           if(string.charAt(i)!=string.charAt(j)){
               System.out.println("String is not palindrome");
           }
             i++;
        }
                System.out.println("String is palindrome");
    }


}
