package EjercicioTemas789;

import java.util.*;
import java.lang.*;

public class Ejercicio6 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<Integer>();
        ArrayList<Integer> nums2 = new ArrayList<Integer>();


        for (int i=0; i <= 10; i++) {
            nums.add(i);

        }
        System.out.println(nums);


        for(int i=0;i<nums.size();i++) {
            if (nums.get(i) instanceof Integer) {
                Integer aux = nums.get(i);
                if (aux % 2 != 0) {
                    nums2.add(i);
                    //System.out.print(nums2.add(i) + " ");
                }
            }
        }
        System.out.println(nums2);

    }
}
