import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class FindFactorial {
    public static int Fact (int N){
        if(N==0){
            return 1;
        }
        return Fact(N-1)*(N);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N");
        int N=sc.nextInt();
        System.out.println(FindFactorial.Fact(N));
    }
}