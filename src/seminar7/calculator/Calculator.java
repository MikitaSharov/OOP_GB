package seminar7.calculator;

import seminar7.factory.OperationFactory;
import seminar7.operation.Operation;

public class Calculator {
    public double calculate (double num1, double num2, String operator) {
        Operation operation = OperationFactory.createOperation(operator);
        return operation.operate(num1, num2);
    }
}
