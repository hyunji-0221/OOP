package strategy;
import java.util.Arrays;
import java.util.function.BiFunction;
enum Oper {
    PLUS("+", (num1, num2) -> num1 + num2),
    MINUS("-", (num1, num2) -> num1 - num2),
    MULTIPLY("*", (num1, num2) -> num1 * num2),
    DIVIDE("/", (num1, num2) -> num1 / num2);

    private String operator;
    private BiFunction<Double, Double, Double> expression;

    Oper(String operator, BiFunction<Double, Double, Double> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public static double calculate(String operator, double num1, double num2) {
        return getOperator(operator).expression.apply(num1, num2);
    }

    private static Oper getOperator(String operator) {
        return Arrays.stream(values())
                .filter(o -> o.operator.equals(operator))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("올바른 연산자가 아닙니다."));
    }
}

public class Calcul {
    double calculate(double a, String operator, double b) {
        return Oper.calculate(operator, a, b);
    }

    public static void main(String[] args) {
        Calcul c = new Calcul();
        double d = c.calculate(1,"+", 2);
        System.out.println("Result : "+d);
    }
}