package com.grz55.javatraining;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ObjectOrientedTraining {

    public static void main(String[] args) {

        Animal cat = new Animal();
        System.out.println("Without attributes initialization: " + cat.name + " " + cat.age + " " + cat.isHappy);

        Car.howManyCarsCreated();

        Car car = new Car();
        car.drive();
        Truck truck = new Truck();
        truck.drive();
        Car car1 = new Car();

        Car.howManyCarsCreated();

        /*Scanner scanner = new Scanner(System.in);
        int consoleNumber = scanner.nextInt();*/

        Animal animal = new Cat();
        System.out.println(animal.age + " " + animal.isHappy + " " + animal.name);

        Cat cat1 = new Cat();
        cat1.giveSound();

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(outerClass.a + innerClass.b);


        System.out.println("This is the inner private class access through outer method: " + outerClass.showPrivateInnerSecond());

        OuterClass.InnerStatic outerClass1 = new OuterClass.InnerStatic();
        System.out.println(outerClass1.d);

        System.out.println(Employee.age);   //interface attribute access
        Employee manager = new Manager();
        System.out.println(manager.print());

        Manager manager2 = new Manager();
        System.out.println(manager2.print());

        System.out.println(manager.age);
        System.out.println(manager2.age);

        Waiter waiter = new Waiter();
        System.out.println(waiter.print()); //interface default method with body called

        System.out.println(States.ALASKA);

        System.out.println("-----------");
        for (States state : States.values()) {
            System.out.println(state);
        }

        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now());

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(LocalDateTime.now().format(dateTimeFormatter));
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("E");
        System.out.println(LocalDateTime.now().format(dateTimeFormatter2));

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("first");
        arrayList.add("second");
        System.out.println(arrayList.get(0));
        arrayList.set(1, "number 1");
        System.out.println(arrayList.get(1));
        arrayList.remove(0);
        System.out.println(arrayList.get(0));
        arrayList.clear();
        System.out.println(arrayList.size());
        arrayList.add("first");
        arrayList.add("second");
        arrayList.add("third");
        arrayList.add("fourth");
        arrayList.add("aaa I'm first");
        for (String numbersWords : arrayList) {
            System.out.println(numbersWords);
        }

        Collections.sort(arrayList);
        System.out.println("After sorting");
        for (String numbersWords : arrayList) {
            System.out.println(numbersWords);
        }


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.addFirst(0);
        linkedList.addLast(3);

        Iterator<Integer> iterator = linkedList.iterator(); //can modify collection while iterating
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            if (integer < 2) {
                iterator.remove();
            }
        }

        System.out.println("Printing after removing numbers < 2 ");

        for (Integer integerNumbers : linkedList) {
            System.out.println(integerNumbers);
        }


        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Five");
        hashMap.put(4, "Four");     // replaced, because key exists

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry);
        }

        System.out.println(hashMap);

        hashMap.forEach((k, v) -> System.out.println("key" + k + " value" + v));

        System.out.println("foreach key value");
        for (Integer key : hashMap.keySet()) {
            System.out.println(key + " " + hashMap.get(key));
        }

        System.out.println("foreach valuesset");
        for (String values : hashMap.values()) {
            System.out.println(values);
        }

        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("Volvo");
        cars.add("Volvo");
        cars.add("Mercedes");
        cars.add("Dodge");
        cars.add("Renault");

        System.out.println(cars);
        System.out.println(cars.contains("Volvo"));

        Iterator<String> it = cars.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        Integer wrapInteger = 34;
        System.out.println("\n" + wrapInteger.doubleValue());

        Integer myInt = 100;
        String myString = myInt.toString();
        System.out.println(myString.length());

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

        int age = 19;
        if (age < 18) {
            throw new NotAdultException(age);
        } else {
            System.out.println("You are adult");
        }

        String regex = "java";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("programming languages: c++, java, kotlin");
        System.out.println(regex + " found? " + matcher.find());

        regex = "n{2}"; //at least 2 'n' in a row
        pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher("NNANA haha baba");
        System.out.println(regex + " found? " + matcher.find());

        Singer singer = new Singer();
        Thread thread = new Thread(singer);
        thread.start();
    }
}
