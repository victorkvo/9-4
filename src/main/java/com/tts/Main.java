package com.tts;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] fruitArray = {"orange", "apple", "banana"};
        int[] intArray;
        boolean[] boolArray;

        System.out.println("==== Arrays ====");
        System.out.println(fruitArray[1]);
        System.out.println(fruitArray.length);

        System.out.println("==== Collections ====");

        List<String> stringList = new ArrayList<>();
        List<String> stringLinkedList = new LinkedList();
        List<String> stringVector = new Vector();
        List<String> stringStack = new Stack();

        stringList.add("dog");
        stringList.add("house");
        stringList.add("cell phone");

        System.out.println("This is the second items in our list: " + stringList.get(1));
        System.out.println(stringList);

        stringList.remove(0);
        System.out.println("This is the size of my list: " + stringList.size());

        System.out.println("Now we will clear our list with the stringList.clear() command.");

        // this will completely remove all elements from our list
        stringList.clear();
        System.out.println(stringList);

        System.out.println("==== Reversy ====");


        stringList.add("dog");
        stringList.add("house");
        stringList.add("cell phone");

        Collections.reverse(stringList);

        System.out.println("Here is my list reversed: " + stringList);


        System.out.println("==== String Conversion ====");

        String myString = "I really love ice cream.";
        // we are going to split each item where there is an empty space
        // and it will become a new item in an array
        String[] strArr = myString.split(" ");

        List<String> splitList = new ArrayList<>();
        splitList = Arrays.asList(strArr);

        System.out.println(splitList);

        List<String> carList = Arrays.asList("BMW", "Honda", "Audi");
        Object[] carArr = carList.toArray();
        String carString = Arrays.toString(carArr);

        System.out.println(carString.replace("[", "")
        .replace("]", "")
        .replace(",", " "));

        System.out.println("==== Hash Map ====");

        HashMap<String, Integer> personMap = new HashMap<>();

        personMap.put("Mary", 37);
        personMap.put("Bob", 21);
        personMap.put("Susan", 63);

        System.out.println(personMap);
        System.out.println("This is the value associated with Mary: " + personMap.get("Mary"));
        System.out.println(personMap.keySet());

        for (String i : personMap.keySet()) {
            System.out.println("key: " + i + "\tvalue: " + personMap.get(i));
        }

        personMap.remove("Bob");
        System.out.println("is Bob in my map?" + personMap.containsKey("Bob"));

        System.out.println("==== Iterating ====");

        List<String> fruitList = Arrays.asList("plum", "grape", "fiji apple");

        for (String fruit : fruitList) {
            System.out.println("Here is one of my fruits: " + fruit);
        }

        // the two lines below will do the same thing.
        fruitList.forEach((fruit) -> System.out.println(fruit));
        fruitList.forEach(System.out::println);

        System.out.println("==== Linked List ====");

        LinkedList<String> animalList = new LinkedList<>();
        animalList.add("frog");
        animalList.add("giraffe");
        animalList.add("buffalo");
        animalList.add("mongoose");
        System.out.println(animalList);

        animalList.addFirst("shark");
        animalList.addLast("koala");
        animalList.add(3, "cuttlefish");
        System.out.println(animalList);

        // ADDITIONAL COMMANDS  FOR LINKED LISTS
//        animalList.remove(3);
//// Removes the element that is at the 3rd index of the LinkedList
//        animalList.remove("piranha");
//// Removes the first instance of "piranha" in the LinkedList
//        animalList.removeFirst();
//// Removes the first element of the LinkedList
//        animalList.removeLast();
//// Removes the last elements of the LinkedList
//        animalList.contains("giraffe");
//// Returns `true` if "giraffe" is present in the LinkedList
//        animalList.size();
//// Returns an integer denoting the size of the LinkedList
//        animalList.get(3);
//// Returns the value located at the 3rd index of the LinkedList
//        animalList.set(3, "emu");
////Sets the value at index 4 to "emu"

        System.out.println("==== Queues ====");

        Queue<Integer> myQueue = new LinkedList<>();

        for(int i=5; i<10; i++) {
            myQueue.add(i);
        }

        System.out.println("Elements of myQueue: " + myQueue);

        int removedHead = myQueue.remove();
        System.out.println("Removed element of myQueue: " + removedHead);
        System.out.println("Elements of myQueue: " + myQueue);

        // To view the head of queue
        int head = myQueue.peek();
        System.out.println("Head of myQueue: " + head);

        int size = myQueue.size();
        System.out.println("Size of myQueue: " + size);


        System.out.println("==== Stacks ====");

        Stack <Integer> myStack = new Stack<>();

        // push adds a value to the top of the stack
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println("myStack contains the following integers: " + myStack);

        // pop removes the value at the top of the stack
        myStack.pop();
        System.out.println("After myStack.pop(), myStack contains the following integers: " + myStack);

        // peek checks the value of the item at the top of the stack
        int peek = myStack.peek();
        System.out.println("myStack.peek() will return the top value of the stack ->  " + peek);

        boolean empty = myStack.empty();
        System.out.println("myStack.empty will return false because of stack in not empty ->  " + empty);


    }

}

