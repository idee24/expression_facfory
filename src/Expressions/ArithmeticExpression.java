package Expressions;

/**
 * Abstract class to represent an arithmetic expression.
 */
public abstract class ArithmeticExpression {

    /**
     * Evaluates the arithmetic expression.
     * @return the result of the evaluation.
     */
    public abstract double evaluate();

    /**
     * Overrides toString() to provide custom implementation
     * for Pretty-printer using StringBuilder.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toString(sb);
        return sb.toString();
    }

    protected abstract void toString(StringBuilder sb);

}
