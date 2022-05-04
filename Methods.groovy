class Methods {
    static void main(String[] args){

        // ---------- METHODS ----------
        // Methods allow us to break our code into parts and also
        // allow us to reuse code

        println("llama a sayHello()")
        sayHello();

        // Pass parameters
        println("\nllama a getSum(5,4)")
        println("5 + 4 = " + getSum(5,4));

        // Demonstrate pass by value
        def myName = "Derek";
        println("\nllama a passByValue(myName), valiendo myNane=Derek")
        passByValue(myName);
        println("In Main : " + myName);

        // Pass a list for doubling
        println("\nllama a doubleList(listToDouble), siendo listToDouble = [1,2,3,4]")
        def listToDouble = [1,2,3,4];
        listToDouble = doubleList(listToDouble);
        println(listToDouble);

        // Pass unknown number of elements to a method
        println("\nllama a sumAll(1,2,3,4)")
        def nums = sumAll(1,2,3,4);
        println("Sum : " + nums);

        // Calculate factorial (Recursion)
        println("\nllama a factorial(4)")
        def fact4 = factorial(4);
        println("Factorial 4 : " + fact4);


    }

    // ---------- METHODS ----------

    static def sayHello() {
        // Define them with def and static which means it is shared
        // by all instances of the class
        println(''' sayHello()
                    Define them with def and static which means it is shared
                    by all instances of the class''')
        println("\nHello\n");
    }

    // Methods can receive parameters that have default values
    static def getSum(num1=0, num2=0){
        println(''' getSum(num1=0, num2=0)
                    Methods can receive parameters that have default values''')
        return num1 + num2;
    }

    // Any object passed to a method is pass by value
    static def passByValue(name){
        println('''\npassByValue(name)
                Any object passed to a method is pass by value''')

        // name here is local to the function and can't
        // be accessed outside of it
        name = "esto vale name dentro de la función Rodolfo, a la salida su valor debe ser el definido en la clase que ha llamado al método";
        println("Name : " + name);
    }

    // passByValue(name)
    static def doubleList(list){
        println('''\ndoubleList(list)
                passByValue(name)''')

        // Collect performs a calculation on every item in the list
        def newList = list.collect { it * 2};
        return newList;
    }

    // Pass unknown number of elements to a method
    static def sumAll(int... num){
        println('''sumAll(int... num)
                Pass unknown number of elements to a method''')
        def sum = 0;

        // Performs a calculation on every item with each
        num.each { sum += it; }
        return sum;
    }

    // Calculate factorial (Recursion)
    static def factorial(num){
        println('''\nCalculate factorial (Recursion)
                factorial(num)
                Se llama a sí misma
                return (num * factorial(num - 1))''')
        if(num <= 1){
            return 1;
        } else {
            return (num * factorial(num - 1));
        }
    }
    // 1st: num = 4 * factorial(3) = 4 * 6 = 24
    // 2nd: num = 3 * factorial(2) = 3 * 2 = 6
    // 3rd: num = 2 * factorial(1) = 2 * 1 = 2



}
