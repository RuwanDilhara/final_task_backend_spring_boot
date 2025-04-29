package org.icet.final_task.config.exceptionHandling;

public class IdAlreadyNotExitsException extends RuntimeException {

    public IdAlreadyNotExitsException(String message) {
        super(message);
    }
}
