// Main Execution Class
public class staticEg {
    
    // 1. STATIC VARIABLE
    // Allocates memory only once. Shared among all instances of this class.
    private static String platformName;
    private static int totalUsers = 0;

    // Instance Variable (Non-Static)
    // Every object created gets its own separate copy of this variable.
    private String username;

    // 2. STATIC BLOCK
    // Runs exactly once when the JVM first loads the class into memory, 
    // and execution completes before the main method starts.
    static {
        System.out.println("[System Log] Static block executed. Initializing shared class resources...");
        platformName = "JavaDevCommunity";
    }

    // Constructor 
    public staticEg(String username) {
        this.username = username;
        totalUsers++; // Increments the shared global counter every time an object is made
    }

    // 3. STATIC METHOD
    // Can be called immediately using the class name without instantiating an object.
    // Core Constraint: Can only access other static members directly.
    public static void displayPlatformStats() {
        System.out.println("\n--- Static Context ---");
        System.out.println("Platform Name: " + platformName);
        System.out.println("Total Registered Users: " + totalUsers);
        
        // System.out.println(username); // Compile Error! Cannot access non-static field from static context.
    }

    // Instance Method (Non-Static)
    // Can access both non-static (instance) and static variables freely.
    public void displayUserProfile() {
        System.out.println("User Profile -> Name: " + this.username + " | Registered on: " + platformName);
    }

    // 4. STATIC NESTED CLASS
    // Does not require an outer class instance to be instantiated.
    public static class UtilityHelper {
        public static void printSeparator() {
            System.out.println("=========================================");
        }
    }

    // MAIN METHOD
    // Must be static so the JVM can call it instantly as the program entry point 
    // without spinning up an initial object payload in memory.
    public static void main(String[] args) {
        // Use static nested class utility without building Main objects
        UtilityHelper.printSeparator();
        System.out.println("Main method started execution.");

        // Invoke static method using the Class reference directly
        staticEg.displayPlatformStats();

        System.out.println("\nCreating distinct user objects...");
        // Instantiating distinct objects
        staticEg user1 = new staticEg("Alice");
        staticEg user2 = new staticEg("Bob");
        staticEg user3 = new staticEg("Charlie");

        System.out.println("\n--- Instance Context ---");
        // Verify unique instance variables alongside a shared static reference
        user1.displayUserProfile();
        user2.displayUserProfile();
        user3.displayUserProfile();

        // Call the static method again to see the mutated shared data state
        staticEg.displayPlatformStats();
        UtilityHelper.printSeparator();
    }
}
