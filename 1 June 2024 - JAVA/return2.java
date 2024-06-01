// Java program to illustrate return must not be always
// last statement, but must be last statement
// in a method to execute

// Main class
class return2 {

    // Method 1
    // Helper method
    // Since return type of demofunction method is void
    // so this method should not return any value
    void demofunction(double i)
    {
        // Demo condition check
        if (i < 9)

            // See here return need not be last
            // statement but must be last statement
            // in a method to execute
            return;

        else
            ++i;
    }

    // Method 2
    // main driver method
    public static void main(String[] args)
    {
        // Calling the method
        new return2().demofunction(10);

        // Display message to illustrate
        // successful execution of program
        System.out.println("Program executed successfully");
    }
}