package Operations;

import Expressions.ArithmeticExpression;
import Expressions.MinimalExpression;

/**
 * Represents a subtraction operation in an arithmetic expression.
 */
public class SubtractionOperation extends MinimalExpression {

    private final ArithmeticExpression left;
    private final ArithmeticExpression right;

    /**
     * Constructor for the subtraction class.
     * @param left the left operand of the subtraction.
     * @param right the right operand of the subtraction.
     */
    public SubtractionOperation(ArithmeticExpression left, ArithmeticExpression right) {
        super(left, right, '-');
        this.left = left;
        this.right = right;
    }

    /**
     * Evaluates the subtraction.
     * @return the result of the subtraction.
     */
    @Override
    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }
}

