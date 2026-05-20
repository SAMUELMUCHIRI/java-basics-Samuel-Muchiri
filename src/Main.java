import method.MethodExplorer;
import method.ControlFlow;
import method.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Class Initialization
        MethodExplorer explorer = new MethodExplorer();

        // Test values for my functions
        ArrayList<Integer> sampleNumbers = new ArrayList<>();;
        sampleNumbers.add(10);
        sampleNumbers.add(-15);
        sampleNumbers.add(0);
        sampleNumbers.add(-1);
        sampleNumbers.add(1);
        sampleNumbers.add(14352);


        Map<Integer , Boolean> eligibilityMap = new HashMap<>();
        eligibilityMap.put(20, true);
        eligibilityMap.put(17, false);
        eligibilityMap.put(25, true);
        eligibilityMap.put(19, false);


        ArrayList<Double> sampleCelsius = new ArrayList<>();;;;
        sampleCelsius.add(100.0);
        sampleCelsius.add(-15.0);
        sampleCelsius.add(0.0);


        //Iterating over values
        System.out.println("\n Executing convertTemperature Function");
        for (double n : sampleCelsius) {
            System.out.println(n + "°C is " + explorer.convertTemperature(n) + "°F");
        }

        System.out.println("\n Executing describeNumber Function");
        for (int n : sampleNumbers) {
            explorer.describeNumber(n);
        }

        System.out.println("\n Executing checkEligibility Function");
        for(Map.Entry<Integer, Boolean> entry : eligibilityMap.entrySet())
        {
            int age = entry.getKey();
            boolean hasID = entry.getValue();
            boolean isEligible = explorer.checkEligibility(age, hasID);
            System.out.println("Age: " + age + ", Has ID: " + hasID + " => Eligible: " + isEligible);
        }

        // Task Two

        ControlFlow flow = new ControlFlow();
        System.out.println("\n Executing getGrade Function");
        int[] scores = {95, 82, 68, 55, 45, 105};
        for (int score : scores) {
            System.out.println("Score: " + score + " => Grade: " + flow.getGrade(score));
        }

        System.out.println("\n Executing FizzBuzz Function");
        flow.fizzBuzz();

        System.out.println("\n Executing Countdown Function");
        flow.countdown(10);
        flow.countdown(5);

        //Student
        Student studentOne = new Student("Alice", 20, "A");
        Student studentTwo = new Student("Bob", 22, "B");
        studentOne.introduce();
        studentTwo.introduce();

    }
}
