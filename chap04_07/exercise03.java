package chap04_07;
import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        boolean run = true;
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while(run) {
            System.out.println("-------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------");
            System.out.print("선택> ");

            String s = scanner.nextLine();
            if(Integer.parseInt(s) == 1) {
                System.out.print("예금액>");
                String s1 = scanner.nextLine();
                balance += Integer.parseInt(s1);
            } else if(Integer.parseInt(s) == 2) {
                System.out.print("출금액>");
                String s2 = scanner.nextLine();
                balance -= Integer.parseInt(s2);
            } else if(Integer.parseInt(s) == 3) {
                System.out.println("잔고>" + balance);
            } else if(Integer.parseInt(s) == 4)
                break;
        }
        System.out.println("프로그램 종료");
    }
}
