package Operations;

import Expressions.ArithmeticExpression;
import Expressions.MinimalExpression;

/**
 * Represents a Multiplication operation in an arithmetic expression.
 */
public class MultiplicationOperation extends MinimalExpression {

    private final ArithmeticExpression left;
    private final ArithmeticExpression right;

    /**
     * Constructor for the Multiplication class.
     * @param left the left operand of the multiplication.
     * @param right the right operand of the multiplication.
     */
    public MultiplicationOperation(ArithmeticExpression left, ArithmeticExpression right) {
        super(left, right, '*');
        this.left = left;
        this.right = right;
    }

    /**
     * Evaluates the Multiplication.
     * @return the result of the Multiplication.
     */
    @Override
    public double evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
