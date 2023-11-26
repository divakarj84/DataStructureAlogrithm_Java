package main.java.dsa.sort;

public class LinearSearch {

    public static int linearSearch(int [] a, int key) {
        for(int i=0; i<a.length; i++) {
            if(a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {35,10,120,30,410,50,};
        int key = 135;
        int result = linearSearch(a,key);

        if(result != -1){
            System.out.println("Value or Key \'"+ key + "\' is present in the array at the position - "+result);
        } else {
            System.out.println("Entered value or key is not available in the array");
        }

    }
}
