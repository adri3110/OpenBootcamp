package Ejercicios121314;

import java.util.ArrayList;
/*En este ejercicio tenia demasiados comentarios, tanto del enunciado del propio ejercicio como comentarios por linea
    de cada cosa que hacia mi codigo, inclusive codigo comentado que no se estaba utilizando para nada
 */
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
                }
            }
        }
        System.out.println(nums2);
    }
}
