import java.util.*;

public class Q1 {
    static void average(int sum, int subjects) {
        int ans = (sum * 100) / (subjects * 100);

        if (ans > 35) {
            System.out.println("You are passed you got " + ans + "% marks.");
        } else {
            System.out.println("You are failed you got " + ans + "% marks. You need to score more than 35% to pass.");

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subjects = 6;
        int sum = 0;
        String[] arr = { "Maths", "Science", "English", "Hindi", "SST", "Computer" };
        for (int i = 0; i < subjects; i++) {
            System.out.println("Enter " + arr[i] + " marks: ");
            int sub = sc.nextInt();
            sum = sub + sum;
        }
        average(sum, subjects);
        sc.close();

    }
}