package ch07.sec02;

public class SmartPhone extends Phone {
    public boolean wifi;


    public SmartPhone(String model, String color) {
        super(model, color); //기본생성자가 자동으로 생성,
        // 수퍼가 무조건 최상위에 있어야 한다. 아래로 이동시 빨간줄
        System.out.println("SmartPhone 생성자 호출!");


        // this는 나 자신, super 직속 부모
        // super 도 가능한데 이거 추천!!



    }
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }
    public void bell() {
        System.out.println("스마트폰이 울린다!"); // 오버라이딩: 매소드 재정의
    }
}
