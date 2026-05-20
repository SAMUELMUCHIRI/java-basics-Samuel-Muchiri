package method;

public class ControlFlow {
    public String getGrade(int score) {
        if (score >= 90 && score <= 100) {
            return "A";
        } else if (score >= 75 && score < 90) {
            return "B";
        } else if (score >= 60 && score < 75) {
            return "C";
        } else if (score >= 50 && score < 60) {
            return "D";
        } else if (score < 50) {
            return "F";
        } else {
            return "Invalid Score";
        }
    }
/*
**   AI Sugesstion


    private String getFizzBuzzValue(int i) {
        int divisor = 0;
        if (i % 15 == 0) divisor = 15;
        else if (i % 3 == 0) divisor = 3;
        else if (i % 5 == 0) divisor = 5;

        switch (divisor) {
            case 15:
                return "FizzBuzz";
            case 3:
                return "Fizz";
            case 5:
                return "Buzz";
            default:
                return Integer.toString(i);
        }
    }

    public void fizzBuzz()
    {
        for(int i = 1; i<51 ;i++)
        {
            System.out.println(getFizzBuzzValue(i));
        }
    }



**  Summary of the refactoring:
Created a private helper method getFizzBuzzValue(int i) that:
Determines which divisor (15, 3, 5, or none) applies to the number
Uses a switch statement to return the appropriate FizzBuzz string value
Simplified the fizzBuzz() method to:
Simply iterate through 1-50 and call the helper method
Much cleaner and more readable than the nested ternary operators

* My comments : I find the AI generated code verbose and pretty hard to follow in solving the task . It still includes the if statements which is not okay .
*
 */

    public void fizzBuzz()
    {
        for(int i = 1; i<51 ;i++)
        {
            String output = (i%15 == 0)  ? "FizzBuzz" : (i%3 == 0) ? "Fizz" : (i%5 == 0) ? "Buzz" : Integer.toString(i);
            System.out.println(output);
        }
    }
    public void countdown(int n)
    {
        while(n > 0)
        {
            System.out.println(n);
            n--;
        }
        System.out.println("Go!");
    }
}
