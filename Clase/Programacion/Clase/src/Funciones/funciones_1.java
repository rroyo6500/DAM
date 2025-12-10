package Funciones;

import java.lang.reflect.Type;
import java.util.Scanner;

public class funciones {

    private static final Scanner IN = new Scanner(System.in);

    public static void main(String[] args){

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        mostrarArray(nums);

        nums[4] = 13;

        mostrarArray(nums);

        nums[5] = nums[3] + nums[4];

        mostrarArray(nums);

        System.out.print("Introduce una posicion: ");
        int pos = IN.nextInt();

        nums[pos-1] = 2;

        mostrarArray(nums);

    }

    public static void mostrarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
