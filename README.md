# calculator_java
simple calculator written in Java; supports addition, subtraction, multiplication and division

1. LOC project: 214 (Calculator.java & Start.java)
2. Calculator::evaluateExpression:
    - Cyclomatic Complexity: 12
    - Cognitive Complexity: 14
3. Calculator::Calculate:
    - Cyclomatic Complexity: 12
    - Cognitive Complexity: 15
4. Analiza statica (Sonarlint in VS Code):
    - Calculator.java - ln.4   - Add a private constructor to hide the implicit public one.
    - Calculator.java - ln.18  - Rename method "ToString" to prevent any misunderstanding/clash with method "toString" defined in superclass "java.lang.Object".
    - Calculator.java - ln.24  - Rename this method name to match the regular expression '^[a-z][a-zA-Z0-9]*$'                  ******
    - Calculator.java - ln.70  - Immediately return this expression instead of assigning it to the temporary variable "textResult".
    - Calculator.java - ln.183 - Remove this redundant jump.
    - Start.java      - ln.6   - Rename this local variable to match the regular expression '^[a-z][a-zA-Z0-9]*$'.    
