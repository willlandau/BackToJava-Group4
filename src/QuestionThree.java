import java.lang.reflect.Array;
import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] =20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4]= 50;
        System.out.println("Enter Number");
        Scanner key = new Scanner(System.in);
        int num = key.nextInt();
        int index;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==num){
                index = i;
                System.out.println(index);
                break;
            }
        }


    }
}
