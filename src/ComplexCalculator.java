public class ComplexCalculator {
    private ComplexOperation operation;

    public void setOperation(ComplexOperation operation) {
        this.operation = operation;
    }

    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        return operation.execute(a, b);
    }
}
