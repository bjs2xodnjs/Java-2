package ch03;

public class Confirmation03 {
    public static void main(String[] args) {
        int pensils = 534;
        int students = 30;

        // 학생 한 명이 가지는 연필 수
        int pencilsPerStudent = pensils / students;
        System.out.println(pencilsPerStudent);

        int pencilsLeft = pensils % students;
        System.out.println(pencilsLeft);
    }
}
