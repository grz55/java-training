package com.grz55.javatraining;

import java.util.*;

public class StreamAPI {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(1);
        list.add(10);
        list.forEach(System.out::println);

        Map<Integer, String> map = new HashMap<>();
        map.put(2, "Hello");
        Set<Integer> integers = map.keySet();
        integers.forEach(System.out::println);

        Collection<String> values = map.values();
        List<String> stringList = new ArrayList<>(values);
        stringList.add("Abc");
        System.out.println(stringList.toString());

        Animal animal0 = new Animal("Ares", 12);
        Animal animal1 = new Animal("Benek", 15);
        Animal animal2 = new Animal("Balas", 15);
        Animal animal3 = new Animal("Cica", 20);
        Animal animal4 = new Animal("Akord", 10);

        List<Animal> animalsList = List.of(animal0, animal1, animal2, animal3);

        animalsList.stream()
                .forEach(animal -> System.out.println(animal));

        animalsList.stream().forEach(System.out::println);

        animalsList.stream()
                .map(animal -> animal.getName() + " " + animal.getAge())
                .forEach(System.out::println);

        System.out.println("Animal instance");

        animalsList.stream()
                .filter(animal -> animal.getAge() > 14)
                .forEach(System.out::println);

        long count = animalsList.stream()
                .filter(animal -> animal.getAge() > 14)
                .count();

        System.out.println(count);

        animalsList.stream()
                .sorted(Comparator.comparing(animal -> animal.getAge()))
                .forEach(System.out::println);

        System.out.println();

        animalsList.stream()
                .sorted(Comparator.comparing(Animal::getAge))
                .limit(2)
                .forEach(System.out::println);

        System.out.println();
        animalsList.stream()
                .sorted(Comparator.comparing(Animal::getAge))
                .skip(2)
                .forEach(System.out::println);

        System.out.println();

        Animal animal = animalsList.stream()
                .max(Comparator.comparing(Animal::getAge))
                .get();

        System.out.println(animal + "\n");

        Animal animal10 = animalsList.stream()
                .filter(animal5 -> animal5.getName().startsWith("C"))
                .findFirst().get();

        System.out.println(animal10 + " \n");

        boolean b = animalsList.stream().anyMatch(animal5 -> animal5.getAge() > 21);
        boolean c = animalsList.stream().anyMatch(animal5 -> animal5.getAge() > 19);
        //allMatch, noneMatch, anyMatch

        System.out.println(b + " " + c);

        String s = animalsList.stream()
                .map(Animal::getName)
                .reduce((name, name2) -> name + " " + name2).get();
        System.out.println(s);

        String s1 = animalsList.stream()
                .filter(animal5 -> animal5.getName().startsWith("B"))
                .map(Animal::getName)
                .reduce((name, name2) -> name + " " + name2).get();

        System.out.println(s1);

        animalsList.stream()
                .sorted(Comparator.comparing(Animal::getAge))
                .takeWhile(animal5 -> animal5.getAge() < 18)
                .forEach(System.out::println);

        System.out.println();
        animalsList.stream()
                .sorted(Comparator.comparing(Animal::getAge))
                .dropWhile(animal5 -> animal5.getAge() < 18)
                .forEach(System.out::println);

        String randomText = "This is a random text";
        randomText.chars().forEach(s2 -> System.out.print((char) s2));
    }

}
