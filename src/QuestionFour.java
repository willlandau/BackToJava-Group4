import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] =20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4]= 50;
        int answer = findindex(numbers);
        System.out.println(answer);

    }

    public static int findindex(int[] numbers){
        System.out.println("Enter Number");
        Scanner key = new Scanner(System.in);
        int num = key.nextInt();
        int index = 10;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==num){
                index = i;
                break;
            }
        }
        return index;
    }
}
