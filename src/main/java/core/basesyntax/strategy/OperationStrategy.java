package core.basesyntax.strategy;

import core.basesyntax.operation.OperationHandler;

public interface OperationStrategy {
    OperationHandler getHandler(String type);
}