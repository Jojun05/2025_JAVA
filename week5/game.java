package week5;
import java.util.Scanner;
import java.util.Random;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int answer = random.nextInt(100) + 1; 
        int guess = 0;

        System.out.println("숫자를 맞혀 보세요! (1~100)");

        while (true) {
            System.out.print(">> ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();

                if (guess < 1 || guess > 100) {
                    System.out.println("1~100 사이의 값을 입력하세요");
                    continue;
                }

                if (guess > answer) {
                    System.out.println("숫자가 너무 큽니다.");
                } else if (guess < answer) {
                    System.out.println("숫자가 너무 작습니다.");
                } else {
                    System.out.println("정답입니다! 랜덤 숫자는 " + answer + "입니다.");
                    break;
                }
            } else {
                System.out.println("숫자를 입력해주세요.");
                scanner.next(); 
            }
        }

        scanner.close();
    }
}
