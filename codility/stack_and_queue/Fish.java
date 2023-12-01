package codility.stack_and_queue;
import java.util.*;


public class Fish {

    static int solution(int[] A) {
            Arrays.sort(A);
    
            int smallest = 1;
    
            for(int num: A) {
                if(num == smallest) {
                    smallest++;
                }
            }
    
            return smallest;
    }


    public static void main(String[] args) {
        int[] A = { 3, 2, 1 };

        System.out.println("Result: " + solution(A));

    }
}
