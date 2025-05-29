package ch05.sec05;

public class Misson02 {
    public static void main(String[] args) {
        String fileName = "가나다라.haha.jpeg";

        String ext2 = ""; // 확장자 추출!!

        int fna = fileName.lastIndexOf(".");
        String ext  = fileName.substring(fna + 1) ;
        System.out.println("ext" + ext);



    }
}
