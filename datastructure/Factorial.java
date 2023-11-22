package datastructure;

public class Factorial {
    static int calculate(int num) {
        if(num == 0) {
            return 1;
        } 
        return num * calculate(num -1);
    }
    public static void main(String[] args) {
        int result = calculate(4);
        System.out.println("Your factorial result is: "+ result);
    }
}
