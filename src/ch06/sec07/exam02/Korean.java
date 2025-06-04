package ch06.sec07.exam02;

// 필드 선언
public class Korean {
    String nation;
    String name;
    String ssn;

    // 생성자 선언 (this는 자아, 상수)
    public Korean() {
        this.nation = "대한민국";
        this.name = "신사임당";
        this.ssn = "901022-2754312";

    }
    public Korean(String name, String ssn) {
        this.nation = "대한민국";
        this.name = name;
        this.ssn = ssn;
    }
}
