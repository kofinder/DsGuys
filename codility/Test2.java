package codility;

public class Test2 {

    static String solution(String s) {
        // write your code in Java SE 8
        int[] count = new int[10];
        for(char ch : s.toCharArray()){
            int temp = ch - '0';
            count[temp]++;
        }
        StringBuilder sb = new StringBuilder();
        int maxOdd = -1;
        for(int i = 0; i <= 9; i++){
            if(count[i] % 2 == 1) maxOdd = i;
        }
        if(maxOdd != -1) sb.append(maxOdd);
        for(int i = 1; i <=9 ; i++){
            int counter = count[i];
            if(count[i] == 0) continue;
            if(count[i] % 2 == 1) counter = count[i] - 1;
            for(int j = 0; j < counter / 2; j++){
                sb.append(i);
                sb.insert(0, i);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }


    // add main function to run this program
    public static void main(String[] args) {
        System.out.println(solution("39878"));
        // System.out.println(solution("00900"));
        // System.out.println(solution("00000"));
        // System.out.println(solution("54321"));
        // // 111,111,111,111
        // System.out.println(solution("1231234564"));
        // System.out.println(solution("0102030102"));
    }

}
