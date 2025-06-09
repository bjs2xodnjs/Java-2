package ch05.sec05.method;

public class ChatAtMethod {
    public static void main(String[] args) {
        String gender = checkGender("900212-1998756"); // "남자" 리턴
        String gender2 = checkGender("900212-2998756"); // "여자" 리턴

        // 8번째 문자가 '2', '4' > 여자리턴
        // 8번째 문자가 '1', '3' > 남자리턴
        // 8번째 문자가 '1','2','3','4' > 가 아니면 null 리턴
        System.out.println("gender1: " + gender);
        System.out.println("gender2: " + gender2);

    }
    public static String checkGender(String id) {
        if(id==null || id.length() < 8 ) {
            return null;
        }
        char genderCher = id.charAt(7);

        if(genderCher == '1' || genderCher == '3') {
            return "남자";
        } else if (genderCher =='2' || genderCher =='4') {
            return "여자";
        } else {
            return null;
        }
    }
}
