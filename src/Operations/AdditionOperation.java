package Operations;

import Expressions.ArithmeticExpression;
import Expressions.MinimalExpression;

/**
 * Represents an addition operation in an arithmetic expression.
 */
public class AdditionOperation extends MinimalExpression {

    private final ArithmeticExpression left, right;

    /**
     * Constructor for the Addition class.
     * @param left the left operand of the addition.
     * @param right the right operand of the addition.
     */
    public AdditionOperation(ArithmeticExpression left, ArithmeticExpression right) {
        super(left, right, '+');
        this.left = left;
        this.right = right;
    }

    /**
     * Evaluates the addition.
     * @return the result of the addition.
     */
    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
