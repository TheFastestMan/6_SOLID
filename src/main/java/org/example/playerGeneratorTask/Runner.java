package org.example.playerGeneratorTask;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Runner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(4);

        String path = "/Users/rail/IdeaProjects/Java/SkillSpace_Java-Core/number_list/Players.json";

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        PlayerGeneratorTask playerGeneratorTask = new PlayerGeneratorTask();


        Future<String> future = executorService.submit(playerGeneratorTask);

        try {
            String filePath = future.get();
            System.out.println("FIle name" + filePath);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        Future<List<Player>> readFuture = executorService.submit(new PlayerReaderTask(path));
        List<Player> activePlayers = readFuture.get();

        System.out.println(activePlayers);

        executorService.shutdown();

    }


}
