package org.example.task1SINGLE;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logger {
    private static Logger instance;
    private Levels levels;

    private Logger(Levels levels) {
        this.levels = levels;
    }

    public static Logger getInstance(Levels levels) {
        if (instance == null) {
            instance = new Logger(levels);
        }
        return instance;
    }

    public void errorInform(String message, Levels level) {
        if (level.getLogLevel() >= this.levels.getLogLevel()) {
            File file = new File("src/main/resources/error.txt");
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(LocalDateTime.now() + "_" + level + "_" + message);
            } catch (IOException e) {
                System.out.println("Ops..." + e.getMessage());
            }
        } else
            System.out.println("Everything is good");
    }

}
