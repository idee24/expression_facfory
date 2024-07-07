package Factory;

import Expressions.ArithmeticExpression;
import Expressions.Constant;
import Expressions.Variable;
import Operations.*;

/**
 * Class to create arithmetic expressions in a straightforward, compositional way.
 */
public class MinimalExpressionFactory implements ExpressionFactory {
    @Override
    public Constant createConstant(double value) {
        return new Constant(value);
    }

    @Override
    public Variable createVariable(String name) {
        return new Variable(name);
    }

    @Override
    public AdditionOperation performAddition(ArithmeticExpression a, ArithmeticExpression b) {
        return new AdditionOperation(a, b);
    }

    @Override
    public MultiplicationOperation performMultiplication(ArithmeticExpression a, ArithmeticExpression b) {
        return new MultiplicationOperation(a, b);
    }

    @Override
    public DivisionOperation performDivision(ArithmeticExpression a, ArithmeticExpression b) {
        return new DivisionOperation(a, b);
    }

    @Override
    public SubtractionOperation performSubtraction(ArithmeticExpression a, ArithmeticExpression b) {
        return new SubtractionOperation(a, b);
    }

    @Override
    public SquareRootOperation getSquareRoot(ArithmeticExpression a) {
        return new SquareRootOperation(a);
    }

    @Override
    public PowerOperation getPower(ArithmeticExpression a, ArithmeticExpression b) {
        return new PowerOperation(a, b);
    }
}
