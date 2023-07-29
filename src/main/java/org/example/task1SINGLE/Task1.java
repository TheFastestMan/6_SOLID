package org.example.task1SINGLE;

public class Task1 {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance(Levels.TRACE);

        logger.errorInform("Message: ", Levels.DEBUG);
    }

}
