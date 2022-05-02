class InputsAndOutputs {
    static void main(String[] args){

        // With double quotes we can insert variables
        println("With double quotes we can insert variables")
        def randString = "Random";
        println("A $randString string");

        // You can do the same thing with printf
        println("\nYou can do the same thing with printf")
        printf("A %s string \n", randString );

        // Use multiple values
        println("\nUse multiple values")
        printf("%-10s %d %.2f %10s \n", ['Stuff', 10, 1.234, 'Random']);

        // ---------- INPUT ----------
        print("Whats your name ");
        def fName = System.console().readLine();
        println("Hello " + fName);

        // You must cast to the right value
        // toInteger, toDouble
        println("\nYou must cast to the right value toInteger, toDouble");
        print("Enter a number ");
        def num1 = System.console().readLine().toDouble();
        print("Enter another ");
        def num2 = System.console().readLine().toDouble();
        printf("%.2f + %.2f = %.2f \n", [num1, num2, (num1 + num2)]);





    }
}
