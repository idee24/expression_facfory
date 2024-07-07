import Expressions.ArithmeticExpression;
import Expressions.Constant;
import Expressions.Variable;
import Factory.ExpressionFactory;
import Factory.MinimalExpressionFactory;

public class Main {
    public static void main(String[] args) {
        ExpressionFactory factory = new MinimalExpressionFactory();

        // Example usage
        Variable x = factory.createVariable("x");
        Variable y = factory.createVariable("y");
        Constant constant = factory.createConstant(9.0);
        Constant zeroConstant = factory.createConstant(0.0);
        x.setValue(1.0);
        y.setValue(4.0);

        System.out.printf("\nWhere (x = %s) , (y = %s) and (constant = %s)\n\n", x.evaluate(), y.evaluate(), constant.evaluate());



        //Create a addition expression: (x + constant)
        ArithmeticExpression additionExpression = factory.performAddition(x, constant);
        System.out.println(additionExpression + " = " + additionExpression.evaluate());



        //Create a multiplication expression: (x * y)
        ArithmeticExpression multiplicationExpression = factory.performMultiplication(x, y);
        System.out.println(multiplicationExpression + " = " + multiplicationExpression.evaluate());



        //Create a simple expression:  (x * zeroConstant) + (y * constant)
        ArithmeticExpression simpleExpression = factory.performAddition(
                factory.performMultiplication(x, zeroConstant),
                factory.performMultiplication(y, constant)
        );
        System.out.println(simpleExpression + " = " + simpleExpression.evaluate());



        //Create a complex expression: (√((x * y) + (y / constant)))
        ArithmeticExpression expr = factory.getSquareRoot(
                factory.performDivision(
                    factory.performAddition(x, y),
                    factory.performMultiplication(y, constant)
                )
        );

        System.out.println(expr + " = " + expr.evaluate());
    }
}