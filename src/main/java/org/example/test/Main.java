package org.example.test;

import java.io.*;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/rail/IdeaProjects/Java/SkillSpace_Java-Core/number_list/Cars.txt");

        List<Car> cars = carGenerator(10);

        Map<Integer, List<Car>> carsMap = cars.stream()
                .collect(Collectors.groupingBy(Car::getEngineСapacity));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Map.Entry<Integer, List<Car>> entry : carsMap.entrySet()) {
                writer.write("engineCapacity:" + entry.getKey() + ":" + entry.getValue().toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Car> carGenerator(int iterNumber) {
        List<Car> cars = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < iterNumber; i++) {
            CarModel carModel = CarModel.values()[random.nextInt(3)];
            int engineCapacity = random.nextInt(3) + 1;
            cars.add(new Car("Car" + (i + 1), carModel, engineCapacity));
        }

        return cars;
    }

}