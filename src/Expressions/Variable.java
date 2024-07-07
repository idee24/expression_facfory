package Expressions;

import Expressions.ArithmeticExpression;

/**
 * Represents a variable in an arithmetic expression.
 */
public class Variable extends MinimalExpression {

    private final String name;
    private double value;

    /**
     * Constructor for the Variable class.
     * @param name name of the variable.
     */
    public Variable(String name) {
        super(name);
        this.name = name;
    }

    /**
     * Sets the value of the variable.
     * @param value the new value of the variable.
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Evaluates the variable.
     * @return the value of the variable.
     */
    @Override
    public double evaluate() {
        return value;
    }

    @Override
    protected void toString(StringBuilder sb) {
        sb.append(name);
    }

}
