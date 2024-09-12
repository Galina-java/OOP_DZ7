import java.util.logging.Logger;

public class LoggingDecorator implements ComplexOperation {
    private final ComplexOperation operation;
    private static final Logger logger = Logger.getLogger(LoggingDecorator.class.getName());

    public LoggingDecorator(ComplexOperation operation) {
        this.operation = operation;
    }

    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = operation.execute(a, b);
        logger.info(String.format("Выполнена операция %s с числами %s и %s. Результат: %s",
                operation.getClass().getSimpleName(), a, b, result));
        return result;
    }
}
