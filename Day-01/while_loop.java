import java.util.Scanner;

public class while_loop{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int timesInput = 0;

        while(true){
            if(timesInput == 7){
                break;
            }
            System.out.println("Enter an integer: ");
            sum = sum + Integer.valueOf(s.nextLine());
            ++timesInput;
        }
        System.out.println(sum);
    }
}