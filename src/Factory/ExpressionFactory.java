package Factory;

import Expressions.ArithmeticExpression;
import Expressions.Constant;
import Expressions.Variable;
import Operations.*;

/**
 * Interface for a factory to create arithmetic expressions.
 */
public interface ExpressionFactory {
    Constant createConstant(double value);
    Variable createVariable(String name);
    AdditionOperation performAddition(ArithmeticExpression a, ArithmeticExpression b);
    MultiplicationOperation performMultiplication(ArithmeticExpression a, ArithmeticExpression b);
    DivisionOperation performDivision(ArithmeticExpression a, ArithmeticExpression b);
    SubtractionOperation performSubtraction(ArithmeticExpression a, ArithmeticExpression b);
    SquareRootOperation getSquareRoot(ArithmeticExpression a);
    PowerOperation getPower(ArithmeticExpression a, ArithmeticExpression b);
}
