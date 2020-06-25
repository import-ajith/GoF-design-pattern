package com.design.behavioral.cor;


/**
 * Chain of responsibility pattern creates a chain of receiver objects for a request.
 * This pattern decouples sender and receiver of a request based on type of request.
 *
 * If one object cannot handle the request then it passes the same to the next receiver and so on.
 *
 * @author Ajithlal
 * */
public class ChainPatternTest {

    public static AbstractLogger getChainOfLoggers(){

        AbstractLogger consoleLogger=new ConsoleLogger(AbstractLogger.DEBUG);
        AbstractLogger fileLogger=new FileLogger(AbstractLogger.INFO);
        AbstractLogger errorLogger=new ErrorLogger(AbstractLogger.ERROR);

        fileLogger.setNextLogger(consoleLogger);
        consoleLogger.setNextLogger(errorLogger);
        return fileLogger;
    }


    public static void main(String[] args) {
        AbstractLogger loggerChain=getChainOfLoggers();
        System.out.println("Logger Chain  "+loggerChain);
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
     /*   loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");*/
       /* loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");*/
    }
}
