package ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "950624-1230123";
        char gender = ssn.charAt(7);
        System.out.println("gender: " + gender);

        switch (gender) {
            case '1':
            case '3':
                System.out.println("남자입니다");
                break;

            case '2':
            case '4':
                System.out.println("여자입니다.");
                break;
        }
    }
}
