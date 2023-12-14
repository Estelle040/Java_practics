import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

import static java.lang.Math.abs;

public class Calc {
    Stack<Double> numbers;

    Calc() {
        numbers = new Stack<>();
    }

    public String calculate(String expression) throws Exception {
        if (Objects.equals(expression, ""))
        {
            throw new Exception("Empty expression");
        }
        String[] expressionSplit = Arrays.stream(expression.split(" ")).filter(e -> !e.trim().isEmpty()).toArray(String[]::new);
        if (!numbers.isEmpty()) {
            for (int i = 0; i < expression.length() - 1; i++) {
                expressionSplit[i] = expressionSplit[i+1];
            }
            expressionSplit = Arrays.stream(expressionSplit).filter(e -> !e.trim().isEmpty()).toArray(String[]::new);
        }
        return calculating(expressionSplit);
    }

    private String calculating(String[] exp) throws Exception{
        for (int i = 0 ; i < exp.length; i++) {
            if (Objects.equals(exp[i], ".")) {
                throw new Exception("Unexpected dot");
            }
            if (exp[i].charAt(0) >= '0' && exp[i].charAt(0) <= '9' || exp[i].charAt(0) == '.') {
                numbers.push(Double.parseDouble(exp[i]));
            }
            else if (Objects.equals(exp[i], "e")) {
                numbers.push(Math.E);
            }
            else if (Objects.equals(exp[i], "π")) {
                numbers.push(Math.PI);
            }
            else {
                if (numbers.size() < 2) {
                    throw new Exception("Not enough numbers");
                }
                double op2 = numbers.pop();
                double op1 = numbers.pop();
                if (Objects.equals(exp[i], "+")) {
                    numbers.push(op1 + op2);
                }
                else if (Objects.equals(exp[i], "-")) {
                    numbers.push(op1 - op2);
                }
                else if (Objects.equals(exp[i], "*")) {
                    numbers.push(op1 * op2);
                }
                else {
                    if (op2 == 0) {
                        throw new Exception("Division by zero");
                    }
                    numbers.push(op1 / op2);
                }
            }
        }
        if (numbers.size() != 1) {
            throw new Exception("Not enough ops");
        }
        double out = numbers.pop();
        if (abs(out - (int) out) < 0.00000000000000000001) {
            return Integer.toString((int)out);
        }
        return Double.toString(out);
    }

    public void clearStack() {
        numbers.clear();
    }
}
