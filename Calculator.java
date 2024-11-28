import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("電卓だよ。");
        System.out.println("最初の数字を入力してね。");
        double num1 = scanner.nextDouble();
        System.out.print("演算子を入力してね。 (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.println("次の数字を入力してね。");
        double num2 = scanner.nextDouble();
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 != 0){
                    result = num1 / num2;
                }else{
                    System.out.println("おや、0で割れないようだ。");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("おや、演算子がおかしいようだ。");
                scanner.close();
                return;
        }
        System.out.println("ドゥルルルルルルルルルル。");
        System.out.println("ドゥンッ。");
        System.out.println(result);
        scanner.close();
    }
}
