package OOP.staticVariable_counter;

// Define the Counter class
public class Counter {
    // Static variable to keep track of the count of instances
    private static int count = 0; //in any object call this ,effect this value like call c1 object and c2 object this value is effected

    // Constructor increments the static variable count
    public Counter() {
        count++;
    }

    // Static method to get the value of count
    public static int getCount() {
        return count;
    }

    // Main method to test the Counter class
    public static void main(String[] args) {
        // Create several Counter objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Print the value of count
        System.out.println("Count: " + Counter.getCount());
    }
}

