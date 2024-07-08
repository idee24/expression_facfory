# Arithmetic Expressions Project

## Overview

This project provides a framework for creating and evaluating arithmetic expressions using variables, constants, and basic arithmetic operations (addition, multiplication, division, and square roots).

## Project Structure

- `Expressions`: Classes for different types of expressions (`ArithmeticExpression`, `Constant`, `Variable`).
- `Factory`: Factory classes for creating expressions (`ExpressionFactory`, `MinimalExpressionFactory`).

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Java IDE or text editor (e.g., IntelliJ IDEA, Eclipse, VS Code)

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/arithmetic-expressions.git
    cd arithmetic-expressions
    ```
2. Open the project in your preferred IDE.

### Running the Project

Execute the `Main` class to see the example usage of the expression framework.

```java
import Expressions.*;
import Factory.*;

public class Main {
    public static void main(String[] args) {
        ExpressionFactory factory = new MinimalExpressionFactory();

        Variable x = factory.createVariable("x");
        Variable y = factory.createVariable("y");
        Constant constant = factory.createConstant(9.0);
        Constant zeroConstant = factory.createConstant(0.0);
        x.setValue(1.0);
        y.setValue(4.0);

        System.out.printf("\nWhere (x = %s), (y = %s), (constant = %s)\n\n", x.evaluate(), y.evaluate(), constant.evaluate());

        ArithmeticExpression additionExpression = factory.performAddition(x, constant);
        System.out.println(additionExpression + " = " + additionExpression.evaluate());

        ArithmeticExpression multiplicationExpression = factory.performMultiplication(x, y);
        System.out.println(multiplicationExpression + " = " + multiplicationExpression.evaluate());

        ArithmeticExpression simpleExpression = factory.performAddition(
                factory.performMultiplication(x, zeroConstant),
                factory.performMultiplication(y, constant)
        );
        System.out.println(simpleExpression + " = " + simpleExpression.evaluate());

        ArithmeticExpression expr = factory.getSquareRoot(
                factory.performDivision(
                    factory.performAddition(x, y),
                    factory.performMultiplication(y, constant)
                )
        );
        System.out.println(expr + " = " + expr.evaluate());
    }
}
```

### Output

```
Where (x = 1.0), (y = 4.0), (constant = 9.0)

x + 9.0 = 10.0
x * y = 4.0
(x * 0.0) + (y * 9.0) = 36.0
√((x * y) + (y / constant)) = √((1.0 * 4.0) + (4.0 / 9.0)) = √(4.444444444444445) = 2.1081851067789197
```

## License

This project is licensed under the MIT License. See the LICENSE file for details.

## Contact

For questions or issues, open an issue on GitHub or contact the repository owner at idee1140@gmail.com.
