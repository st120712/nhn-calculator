import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2, result = 0;
        String operator;

        System.out.print("수식을 입력하시오 : ");
        String expression = sc.nextLine();

        String[] stChange = expression.split("\\s");
        num1 = Integer.parseInt(stChange[0]);
        num2 = Integer.parseInt(stChange[2]);
        operator = stChange[1];

        switch (operator){
            case "+":
                result = add(num1, num2);
                break;
            case "-":
                result = sub(num1, num2);
                break;
            case "*":
                result = mul(num1, num2);
                break;
            case "/":
                result = div(num1, num2);
                break;
        }

        System.out.println("결과는 " + result + "입니다.");




    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int mul(int a, int b){
        return 0;
    }

    public static int div(int a, int b){
        return 0;
    }



}
