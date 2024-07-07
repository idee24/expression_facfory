package Operations;

import Expressions.ArithmeticExpression;
import Expressions.MinimalExpression;

/**
 * Represents a Division operation in an arithmetic expression.
 */
public class DivisionOperation extends MinimalExpression {

    private final ArithmeticExpression left;
    private final ArithmeticExpression right;

    /**
     * Constructor for the Division class.
     * @param left the left operand of the division.
     * @param right the right operand of the division.
     */
    public DivisionOperation(ArithmeticExpression left, ArithmeticExpression right) {
        super(left, right, '/');
        this.left = left;
        this.right = right;
    }

    /**
     * Evaluates the Division.
     * @return the result of the division.
     */
    @Override
    public double evaluate() {
        return left.evaluate() / right.evaluate();
    }
}

