package org.icet.final_task.exceptionHandling;

public class IdAlreadyNotExitsException extends RuntimeException {

    public IdAlreadyNotExitsException(String message) {
        super(message);
    }
}
