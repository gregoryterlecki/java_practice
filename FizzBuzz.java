/*
    FizzBuzz
    A very classic, potentially overdone interview question.
    https://blog.usejournal.com/about-coding-the-fizzbuzz-interview-question-9bcd08d9dfe5

    "
        Write a program that prints the numbers from 1 to 100.
        But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz".
        For numbers which are multiples of both three and five print "FizzBuzz".
    "

    If an interviewer were to ask this question, they might want to see if you understand the following:
    
    1. Are you writing the quick and dirty solution?
    2. Are you writing clean and maintainable code?
    3. Are you writing code that can change as the requirements do?
    4. Are you trying to flex your language / logical knowledge?



 */

public class FizzBuzz {

    /**
        This code is definitely the quick and dirty solution, not clean, 
        maintainable, can't easily change as the requirements do and doesn't 
        use any features of java other than a for loop and basic flow control 
        using if / else. 
     */
    public static void solution1(int length){
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    /**
        Here we can make a slight improvement, reducing the usages of 
        System.out.println to one instance by appending to an output string.
     */
    public static void solution2(int length){
        String output;
        for(int i = 1; i <= 100; i++){
            output = "";
            if(i % 3 == 0 && i % 5 == 0){
                output += "FizzBuzz";
            } else if(i % 3 == 0){
                output += "Fizz";
            } else if(i % 5 == 0){
                output += "Buzz";
            } else {
                output = Integer.toString(i);
            }
            System.out.println(output);
        }
    }

    /**
        At this point we still haven't thought about designing this code such that it
        is flexible with changing requirements.
        Let's say we want to print "Foo" when i is a multiple of 7.
        This would be tricky, because we could add another conditional for 7, but 
        when i is 21, we would get Fizz and not Foo.

        This means we would have to add more control structures and it could get unwieldy.

        Another good question is, why would we use if / else statements just to check a simple numeric value?
        A better alternative would be to use switch / case.
     */
    public static void solution3(int length) {
        String output;
        for(int i = 0; i <= length; i++){
            output = "";
            switch(true){

                case i % 3 == 0 && i % 5 == 0:
                    output += "FizzBuzz";
                    break;
                
                case i % 3 == 0:
                    output += "Fizz";
                    break;
                
                case i % 5 == 0:
                    output += "Buzz";
                    break;
                
                default: 
                    output = Integer.toString(i);
                    break;
            }
            System.out.println(output);
        }
    }

    public static void main(String[] args){
        int length = 100;
        solution2(length);
    }

}