package Operations;

import Expressions.ArithmeticExpression;
import Expressions.MinimalExpression;

/**
 * Represents a square-root operation in an arithmetic expression.
 */
public class SquareRootOperation extends MinimalExpression {

    private final ArithmeticExpression operand;

    /**
     * Constructor for the SquareRootOperation class.
     * @param operand the operand of the square-root operation.
     */
    public SquareRootOperation(ArithmeticExpression operand) {
        super(operand, '√');
        this.operand = operand;
    }

    /**
     * Evaluates the Square-root.
     * @return the result of the square-root operation.
     */
    @Override
    public double evaluate() {
        return Math.sqrt(operand.evaluate());
    }
}
