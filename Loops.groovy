class Loops {
    static void main(String[] args){

        // ---------- LOOPING ----------
        // While loop

        def i = 0;

        println("While loop");
        println("\nwhile(i < 10)")
        while(i < 10){

            // If i is odd skip back to the beginning of the loop
            if(i % 2){
                i++;
                continue;
            }

            // If i equals 8 stop looping
            if(i == 8){
                break;
            }

            println(i);
            i++;
        }

        // Normal for loop
        println("\nNormal for loop");
        println("for (i = 0; i < 5; i++)");
        for (i = 0; i < 5; i++) {
            println(i);
        }

        // for loop with a range
        println("\nfor loop with a range");
        println("for(j in 2..6)");
        for(j in 2..6){
            println(j);
        }

        // for loop with a list (Same with string)
        println("\nfor loop with a list (Same with string)");
        println("def randList = [10,12,13,14]");
        def randList = [10,12,13,14];
        println(("for(j in randList)"));

        for(j in randList){
            println(j);
        }

        // for loop with a map
        println("\nfor loop with a map");
        println('''def custs = [
                100 : "Paul",
                101 : "Sally",
                102 : "Sue"
        ]''');

        def custs = [
                100 : "Paul",
                101 : "Sally",
                102 : "Sue"
        ];

        println("for(cust in custs)");
        println("cust.value : cust.key");
        for(cust in custs){
            println("$cust.value : $cust.key ");
        }


    }
}
