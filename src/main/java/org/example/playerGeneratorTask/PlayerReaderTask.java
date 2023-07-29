package org.example.playerGeneratorTask;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class PlayerReaderTask implements Callable<List<Player>> {
    String path = "/Users/rail/IdeaProjects/Java/SkillSpace_Java-Core/number_list/Players.json";

    public PlayerReaderTask(String path) {
        this.path = path;
    }

    @Override
    public List<Player> call() throws Exception {

        List<Player> players;
        ObjectMapper mapper = new ObjectMapper();

        players = mapper.readValue(new FileReader(path), new TypeReference<List<Player>>() {
        });

        if (players != null) {
            players = players.stream()
                    .filter(Player::isActive)
                    .filter(player -> player.getAge() >= 25 && player.getAge() <= 30)
                    .collect(Collectors.toList());
        }
        return players;
    }
}