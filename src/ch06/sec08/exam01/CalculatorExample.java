package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator(); // Calculator(); 기본 생성자 <Calculator만 와야한다.>
        int result = cal.plus(1, 2);
        System.out.println("result: " + result);
        System.out.println("result2: " + cal.plus(10, 20));
        System.out.println("result2: " + 30);

        for(int i=0; i<2000; i++) {
            cal.powerOn(); // void 결과는 외롭게? 써야 한다.
        }
        cal.powerOff(); // void 결과는 외롭게? 써야 한다.

        System.out.println("끝");
    }
}
