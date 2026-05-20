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
