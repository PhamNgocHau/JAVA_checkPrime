import java.util.Scanner;

public class DisplayPrime {

    public static boolean isPrimeNumber(int number) {
        boolean check = false;
        int i = 2;
        while (i <= Math.sqrt(number)){
            if(number % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number =  sc.nextInt();
        System.out.println("All Prime less than: \n");


        for (int i = 2 ; i < number ; i++){
            if(isPrimeNumber(i)){
                System.out.println(" " + i);
            }
        }
    }
}
