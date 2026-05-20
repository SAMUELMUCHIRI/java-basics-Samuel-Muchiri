package method;

public class MethodExplorer {
    public double convertTemperature(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public boolean checkEligibility(int age, boolean hasID) {
        if (age >= 18 && hasID) {
            return true;
        } else {
            return false;
        }
    }

    public void describeNumber(int n)
    {
        String description = (n > 0) ? "positive" : (n < 0) ? "negative" : "zero";
        String evenOdd = (n%2 == 0) ? "even" : "odd";
        System.out.println(n + " is " + description + " and " + evenOdd + ".");;

    }
}
