package org.example;

import java.util.PriorityQueue;

public class Toy {
    private String id;
    private String name;
    private int frequency;

    public Toy(String id, String name, int frequency) {
        this.id = id;
        this.name = name;
        this.frequency = frequency;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public static void main(String[] args) {
        Toy toy1 = new Toy("1", "Teddy Bear", 5);
        Toy toy2 = new Toy("2", "LEGO Set", 3);
        Toy toy3 = new Toy("3", "Doll", 7);

        PriorityQueue<Toy> toyQueue = new PriorityQueue<>(10, (t1, t2) -> Integer.compare(t2.getFrequency(), t1.getFrequency()));
        toyQueue.add(toy1);
        toyQueue.add(toy2);
        toyQueue.add(toy3);

        // Вызываем метод get 10 раз и записываем результат в файл
        for (int i = 0; i < 10; i++) {
            Toy nextToy = toyQueue.poll();
            System.out.println("Getting toy: " + nextToy.getName());
            // Запись в файл
            // Для записи в файл можно использовать, например, BufferedWriter
        }
    }
}