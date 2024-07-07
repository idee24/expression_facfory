package Expressions;

/**
 * MinimalExpression provides Implementation for ArithmeticExpression
 * with Pretty-printer and Absorb 0 rule.
 */
public abstract class MinimalExpression extends ArithmeticExpression {
    private Double constant;
    private String variable;
    private ArithmeticExpression left, right;
    private char operator;
    private boolean isBinaryOperation = true;

    private boolean isZeroConstantMultiplication = false;
    private boolean isZeroConstantAddition = false;

    protected MinimalExpression(double constant) {
        this.constant = constant;
    }

    protected MinimalExpression(String variable) {
        this.variable = variable;
    }

    //Constructor for Binary functions.
    protected MinimalExpression(ArithmeticExpression left, ArithmeticExpression right, char operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;

        //Identifying expression of additions or multiplications that use the constant 0.
        boolean leftOperandIsConstantAndZero = ((left.getClass() == Constant.class) && (left.evaluate() == 0));
        boolean rightOperandIsConstantAndZero = ((right.getClass() == Constant.class) && (right.evaluate() == 0));
        if ((operator == '*') && (leftOperandIsConstantAndZero  || rightOperandIsConstantAndZero)) {
            isZeroConstantMultiplication = true;
        }
        if ((operator == '+') && (leftOperandIsConstantAndZero  || rightOperandIsConstantAndZero)) {
            isZeroConstantAddition = true;
        }
    }

    //Constructor for unary functions.
    protected MinimalExpression(ArithmeticExpression operand, char operator) {
        this.left = operand;
        this.operator = operator;
        isBinaryOperation = false;
    }

    //providing the pretty-printer implementation.
    @Override
    protected void toString(StringBuilder sb) {
        if (isBinaryOperation) {

            if (isZeroConstantAddition) {
                sb.append("(");
                sb.append(left.evaluate() + right.evaluate());
                sb.append(")");
            }
            else if (isZeroConstantMultiplication) {
                sb.append("(");
                sb.append("0");
                sb.append(")");
            }
            else {
                sb.append("(");
                left.toString(sb);
                sb.append(" ");
                sb.append(operator);
                sb.append(" ");
                right.toString(sb);
                sb.append(")");
            }
        }
        else {
            sb.append("(");
            sb.append(operator);
            left.toString(sb);
            sb.append(")");
        }
    }
}
