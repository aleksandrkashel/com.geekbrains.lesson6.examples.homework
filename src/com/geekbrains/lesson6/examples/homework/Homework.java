package com.geekbrains.lesson6.examples.homework;

public class Homework {
    public static void main(String[] args) {
        Animal[] participants = prepareParticipants();

        for (Animal participant : participants) {
            participant.jump(10);
        }


    }

    private static Animal[] prepareParticipants() {
        return new Animal[] {
                new Dog(500, 30),
                new Dog(300, 3),
                new Cat(400, 2),
                new Cat(200, 10),
                new Cat(200, 10),
                new Cat("Alex"),
                new Cat("Murzik"),
                new Cat("Barsik"),
        };
    }
}
