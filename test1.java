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
                int j = 2;
                for(;j < i; j++){
                    if(i % j == 0){
                        break;
                    }
                }
                if(i == j){
                    System.out.println(i);
                }
            }
        }
    }
}
//   for(int i = 3; i < n; i ++){
//       boolean checkPrime = true;
//       for(int j = 2; j < i; j++){
//           if(i % j  == 0){
//               checkPrime = false;
//               break;
//        }
//        }
//       if(checkPrime){
//           System.out.println(i)
//        }
//        }