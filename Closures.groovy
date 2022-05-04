class Closures {
    static void main(String[] args){
        // ---------- CLOSURES ----------
        // Closures represent blocks of code that can except parameters
        // and can be passed into methods.

        // Alternative factorial using a closure
        // num is the excepted parameter and call can call for
        // the code to be executed
        println(''' ---------- CLOSURES ----------
         Closures represent blocks of code that can except parameters
         and can be passed into methods.

         Alternative factorial using a closure
         num is the excepted parameter and call can call for
         the code to be executed\n''');
        println('''ejecutando:
                def getFactorial = { num -> (num <= 1) ? 1 : num * call(num - 1) }
                println("Factorial 4 : " + getFactorial(4));''')
        def getFactorial = { num -> (num <= 1) ? 1 : num * call(num - 1) }
        println("Factorial 4 : " + getFactorial(4));

        // A closure can access values outside of it
        println("\nA closure can access values outside of it")
        def greeting = "Goodbye";
        println('''Ejecutando:
                def sayGoodbye = {theName -> println("$greeting $theName")}''');
        def sayGoodbye = {theName -> println("$greeting $theName")}
        println("llamado a sayGoodbye(\"Derek\")");
        sayGoodbye("Derek");


        // each performs an operation on each item in list
        def numList = [1,2,3,4];
        println("\neach performs an operation on each item in list");
        println("se ejecuta numList.each { println(it); }");
        numList.each { println(it); }

        // Do the same with a map
        println("\nDo the same with a map");
        println('''def employees = [
                'Paul' : 34,
                'Sally' : 35,
                'Sam' : 36
        ]''')
        def employees = [
                'Paul' : 34,
                'Sally' : 35,
                'Sam' : 36
        ];

        println("employees.each { println({it.key : it.value}\"); }")
        employees.each { println("${it.key} : ${it.value}"); }

        // Print only evens
        println("\nPrint only evens")
        def randNums = [1,2,3,4,5,6];
        println("randNums.each {num -> if(num % 2 == 0) println(num);}")
        randNums.each {num -> if(num % 2 == 0) println(num);}

        // find returns a match
        println("\nfind returns a match")
        def nameList = ['Doug', 'Sally', 'Sue'];
        println("def matchEle = nameList.find {item -> item == 'Sue'}")
        def matchEle = nameList.find {item -> item == 'Sue'}
        println(matchEle);

        // findAll finds all matches
        println("\nfindAll finds all matches")
        def randNumList = [1,2,3,4,5,6];
        println("def numMatches = randNumList.findAll {item -> item > 4}")
        def numMatches = randNumList.findAll {item -> item > 4}
        println(numMatches);

        // any checks if any item matches
        println("\nany checks if any item matches");
        println("\"> 5 : \" + randNumList.any {item -> item > 5})");
        println("> 5 : " + randNumList.any {item -> item > 5});

        // every checks that all items match
        println("\nevery checks that all items match");
        println("\"> 1 : \" + randNumList.every {item -> item > 1}");
        println("> 1 : " + randNumList.every {item -> item > 1});

        // collect performs operations on every item
        println("\ncollect performs operations on every item");
        println("\"Double : \" + randNumList.collect { item -> item * 2})")
        println("Double : " + randNumList.collect { item -> item * 2});

        // pass closure to a method
        println("\npass closure to a method")
        def getEven = {num -> return(num % 2 == 0)}
        def evenNums = listEdit(randNumList, getEven);
        println("Evens : " + evenNums);
    }

    static def listEdit(list, clo){
        println("dentro del método listEdit")
        return list.findAll(clo);
    }
}
