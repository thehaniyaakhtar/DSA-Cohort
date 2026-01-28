import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int N = sc.nextInt();
        
        for(int i=1; i<=N; i++){
            System.out.println("Hello Codeforces " + i);
        }
    }
}
