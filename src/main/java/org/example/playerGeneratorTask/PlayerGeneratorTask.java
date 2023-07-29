package org.example.playerGeneratorTask;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class PlayerGeneratorTask implements Callable<String> {

    @Override
    public String call() throws Exception {
        Random random = new Random();
        List<Player> players = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int age = random.nextInt(21) + 20;
            String player = "player";
            boolean isActive = random.nextBoolean();
            players.add(new Player(player + (i + 1), age, isActive));
        }
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(players);

        String filePath = "/Users/rail/IdeaProjects/Java/SkillSpace_Java-Core/number_list/Players.json";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(json);
        }
        return filePath;
    }
}
