import method.MethodExplorer;

import java.awt.font.FontRenderContext;
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
        for (double n : sampleCelsius) {
            System.out.println(n + "°C is " + explorer.convertTemperature(n) + "°F");
        }

        for (int n : sampleNumbers) {
            explorer.describeNumber(n);
        }

        for(Map.Entry<Integer, Boolean> entry : eligibilityMap.entrySet())
        {
            int age = entry.getKey();
            boolean hasID = entry.getValue();
            boolean isEligible = explorer.checkEligibility(age, hasID);
            System.out.println("Age: " + age + ", Has ID: " + hasID + " => Eligible: " + isEligible);
        }
    }
}
