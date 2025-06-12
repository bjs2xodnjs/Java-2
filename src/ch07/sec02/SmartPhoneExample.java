package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone(" 갤럭시", "은색");

        System.out.println("색상: " + myPhone.getColor());
        System.out.println("모델: " + myPhone.getModel());

        myPhone.bell();
        myPhone.internet();
        myPhone.hangUp();


    }
}
