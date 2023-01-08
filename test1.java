import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input n prime");
        int n = input.nextInt();
        if(n == 2){
            System.out.println(n + "is a prime");
        } else  {
            System.out.println(2);
            for(int i = 3; i < n; i++){
                for(int j = 2;j < i; j++){
                    if(i % j == 0){
                        break;
                    } else {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
}
