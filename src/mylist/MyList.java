package mylist;

import java.util.Arrays;

public class MyList {

    private int[] arr = new int[0];

    public void add(int value) {
        int[] tmp = new int[arr.length + 1];
        System.arraycopy(arr, 0, tmp, 0, arr.length);
        tmp[tmp.length - 1] = value;
        arr = tmp;
    }

    public int get(int index) {
        return arr[index];
    }

    public void set(int index, int value) {
        this.arr[index] = value;
    }


    public void add(int index, int value) {
        int[] tmp = new int[arr.length + 1];
        System.arraycopy(arr, 0, tmp, 0, index);
        tmp[index] = value;
        System.arraycopy(arr, index, tmp, index + 1, arr.length - index);
        arr = tmp;
    }

    public void remove(int index) {
        int[] tmp = new int[arr.length - 1];
        System.arraycopy(arr, 0, tmp, 0, index);
        System.arraycopy(arr, index + 1, tmp, index, arr.length - index - 1);
        arr = tmp;
    }

    public void removeByValue(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                int[] tmp = new int[arr.length - 1];
                System.arraycopy(arr, 0, tmp, 0, i);
                System.arraycopy(arr, i + 1, tmp, i, arr.length - i - 1);
                arr = tmp;
                break;
            }
        }
    }

    public void sortInsert() {
        int[] tmp = Arrays.copyOf(arr, arr.length);
        int temp;
        for (int i = 0; i < tmp.length; i++) {
            for (int j = i; j > 0; j--) {
                if (tmp[j] < tmp[j - 1]) {
                    temp = tmp[j];
                    tmp[j] = tmp[j - 1];
                    tmp[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        arr = tmp;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}