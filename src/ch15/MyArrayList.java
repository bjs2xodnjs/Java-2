package ch15;

import javax.swing.*;
import java.util.Arrays;

public class MyArrayList {
    private String[] arr = new String[0];

    public int size() {
        return arr.length;
    }

    public void add(String item) {
        String[] temp = new String[size() + 1];
        temp[size()] = item;
        // 기존값 복사
        for (int i = 0; i < size(); i++) {
            temp[i] = arr[i];
        }
        this.arr = temp;
    }

    public void add(int index, String item) {
        String[] temp = new String[size() + 1];
        temp[index] = item;
        for (int i = 0; i < size(); i++) {
//            if(i < index) {
//                temp[i] = arr[i];
//            } else {
//                temp[i + 1] = arr[i];
//            }
            temp[i < index ? i : i + 1] = arr[i];
        }
        this.arr = temp;
    }



    public String remove() {
        String[] temp = new String[this.size() - 1];
        String str = this.arr[this.size() - 1];

        for(int i=0; i< temp.length; i++ ) {
            temp[i] = arr[i];
        }
        arr = temp;
        return str;
    }


    // 점검용
    public void checkValues() {
        System.out.println(Arrays.toString(this.arr));
    }
    public String get(int idx) {
        return arr[idx];
    }
}
