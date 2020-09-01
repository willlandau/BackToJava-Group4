import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int x = key.nextInt();
        int th = x/1000;
        int h = ((x-(th*1000))/100);
        int t = ((x-(th*1000)-(h*100))/10);
        int o = (x-(th*1000)-(h*100)-(t*10));
        int an = th + h + t + o;
        System.out.println(an);
    }
}
