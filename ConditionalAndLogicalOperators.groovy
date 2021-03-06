class ConditionalAndLogicalOperators {
    static void main(String[] args){

        // ---------- CONDITIONALS ----------
        // Conditional Operators : ==, !=, >, <, >=, <=
        println("Conditional Operators : ==, !=, >, <, >=, <=");

        // Logical Operators : && || !
        println("Logical Operators : && || !");

        def ageOld = 6;
        println("\nageOld = ${ageOld}");
        println("if((ageOld > 5) && (ageOld < 18))");

        if(ageOld == 5){
            println("Go to Kindergarten");
        } else if((ageOld > 5) && (ageOld < 18)) {
            printf("Go to grade %d \n", (ageOld - 5));
        } else {
            println("Go to College");
        }

        println("\nTernary operator")
        def canVote = true;
        println("canVote = ${canVote}");

        // Ternary operator
        println("canVote ? \"Can Vote\" : \"Can't Vote\"")
        println(canVote ? "Can Vote" : "Can't Vote");

        // Switch statement
        println("\nSwitch statement");
        println("switch(ageOld) / case 16: / default:")
        switch(ageOld) {
            case 16: println("You can drive");
            case 18:
                println("You can vote");

                // Stops checking the rest if true
                break;
            default: println("Have Fun");
        }

        // Switch with list options
        println("\nSwitch with list options")
        println("case 0..6")
        switch(ageOld){
            case 0..6 : println("Toddler"); break;
            case 7..12 : println("Child"); break;
            case 13..18 : println("Teenager"); break;
            default : println("Adult");
        }
    }
}
