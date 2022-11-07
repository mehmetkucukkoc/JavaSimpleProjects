package JavaInterviewCodingQuestions;

public class Main {
    public static void main(String[] args) {

        int num = 5;
        int sum = addNum(num);
        System.out.println("sum is = " + sum);


    }

    public static int addNum(int num) {
        if (num >= 1) {
            return num * addNum(num - 1);
        } else {
            return 1;
        }
    }

}





