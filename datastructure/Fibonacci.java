package datastructure;

public class Fibonacci {
    static int calculate(int num) {
        if(num < 1) {
            return 0;
        } else if(num == 1 || num == 2) {
            return num - 1;
        }
        return calculate(num - 1) + calculate(num - 2);
    }
    public static void main(String[] args) {
        int result = calculate(8);
        System.out.println("Your Fibonacci result is: "+ result);
    }
}
