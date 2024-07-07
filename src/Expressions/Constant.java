package Expressions;


/**
 * Represents a constant in an arithmetic expression.
 */
public class Constant extends MinimalExpression {
    private final double value;

    /**
     * Constructor for the Constant class.
     * @param value the value of the constant.
     */
    public Constant(double value) {
        super(value);
        this.value = value;
    }

    /**
     * Evaluates the constant.
     * @return the value of the constant.
     */
    @Override
    public double evaluate() {
        return value;
    }

    @Override
    protected void toString(StringBuilder sb) {
        sb.append(value);
    }
}
