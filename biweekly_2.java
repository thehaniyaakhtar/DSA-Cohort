import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter letter: ");
        char letter = sc.next().charAt(0);
        
        if (letter == 'a' || letter == 'e' || letter == 'i'
                || letter == 'o' || letter == 'u') {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
