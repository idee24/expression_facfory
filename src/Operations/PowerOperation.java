package Operations;

import Expressions.ArithmeticExpression;
import Expressions.MinimalExpression;

/**
 * Represents a power operation in an arithmetic expression.
 */
public class PowerOperation extends MinimalExpression {

    private final ArithmeticExpression left;
    private final ArithmeticExpression right;

    /**
     * Constructor for the Power class.
     * @param left the left operand of the power operation.
     * @param right the right operand of the power operation.
     */
    public PowerOperation(ArithmeticExpression left, ArithmeticExpression right) {
        super(left, right, '^');
        this.left = left;
        this.right = right;
    }

    /**
     * Evaluates the Power.
     * @return the result of the Power operation.
     */
    @Override
    public double evaluate() {
        return Math.pow(left.evaluate(), right.evaluate());
    }
}

