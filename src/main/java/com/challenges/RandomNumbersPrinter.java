package com.challenges;

import java.util.Random;

public class RandomNumbersPrinter {
    public void printRandomNumbers() {
        Random random = new Random();

        // Generate a stream of 10 random integers using the Random class
        // Stream<Integer> randomNumberStream =
        // Stream.generate(random::nextInt).limit(10);

        // Print the random numbers using forEach method
        // randomNumberStream.forEach(System.out::println);

        // PRINT 10 RANDOM INTEGERS BUT KEEP THEM POSITIVE
        // random.ints(10, 1, Integer.MAX_VALUE).forEach(System.out::println);

        // THE METHOD SHOWN ONLINE FOR REVATURE INTERVIEW QUESTIONS
        random.ints().limit(10).forEach(System.out::println);
    }
}
