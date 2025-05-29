package ch05.sec05;

import java.util.Scanner;

public class Misson01 {
    public static void main(String[] args) {
        /*
        주민번호를 입력하시오. (xxxxxx-xxxxxxx) >

        ( 만약 ) 주민등록번호길이가 다르면 "잘 못 입력하셨습니다."
        (길이가 맞다면) 8번째 자리의 값으로 "여성", "남성" 출력해 주세요.
        (8번째 자리가 1~4가 아니라면) "잘 못 입력하셨습니다."
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("주민번호를 입력하세요. (xxxxxx-xxxxxxx) >");
        String jumin = scanner.nextLine();

        if (jumin.length() != 14 || jumin.charAt(6) != '-' ) {
            System.out.println("잘 못 입력하셨습니다.");
            return;


        }
        char genderCode = jumin.charAt(7);

        switch (genderCode) {
            case '1': case '3':
                System.out.println("남성");
                break;
            case'2': case '4':
                System.out.println("여성");
                break;
            default:
                System.out.println("잘 못 입력하셨습니다.");
        }
    }
}
