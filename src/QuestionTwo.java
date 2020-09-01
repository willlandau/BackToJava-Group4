import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Number 1");
        int o = key.nextInt();
        System.out.println("Number 2:");
        int t = key.nextInt();
        System.out.println("Number 3:");
        int th = key.nextInt();

        if (o == t || t == th || o == th){
            System.out.println("Neither increasing or decreasing order");
        } else if (o>t && t>th){
            System.out.println("Decreasing order");
        }else if (th>t && t>o){
            System.out.println("Increasing order");
        }else{
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
