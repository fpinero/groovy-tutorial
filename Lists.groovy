class Lists {
    static void main(String[] args){

        // Lists hold a list of objects with an index

        def primes = [2,3,5,7,11,13];

        // Get a value at an index
        println("Get a value at an index");
        println("2nd Prime " + primes[1]);
        println("3rd Prime " + primes.get(2));

        // They can hold anything
        println("\nLists can hold anything")
        def employee = ['Derek', 40, 6.25, [1,2,3]];
        println("employee = " + employee +"\n")

        println("2nd Number employee[3][1] = " + employee[3][1]);

        // Get the length
        println("\nGet the length");
        println("primes = " + primes);
        println("primes Length = " + primes.size());

        // Add an index
        println("\nAdd an index");
        primes.add(17);
        println("primes = " + primes);

        // Append to the right
        println("\nAppend to the right");
        println("primes<<19");
        primes<<19;
        println("primes = " + primes);
        println("primes.add(23)");
        primes.add(23);
        println("primes = " + primes);

        // Concatenate 2 Lists
        println("\nConcatenate 2 Lists");
        println("primes + [29,31]")
        primes = primes + [29,31];
        println("primes = " + primes);

        // Remove the last item
        println("\nRemove the last item");
        println("primes - [31]")
        primes = primes - [31];
        println("primes = " + primes);
        println("primes.remove((primes.size()-1))")
        primes.remove((primes.size()-1));
        println("primes = " + primes);

        // Check if empty
        println("\nCheck if empty")
        println("Is empty " + primes.isEmpty());

        // Get 1st 3
        println("\nGet 1st 3")
        println("primes[0..2]")
        println("1st 3 " + primes[0..2]);

        println("primes = " + primes);

        // Get matches
        println("\nGet matches");
        println("primes.intersect([2,3,7,44])")
        println("Matches " + primes.intersect([2,3,7,44]));

        // Reverse
        println("\nReverse");
        println("primes.reverse()");
        println("Reverse " + primes.reverse());

        // Sorted
        println("\nSorted");
        println("primes.sort()");
        println("Sorted " + primes.sort());

        // Pop last item
        println("\nPop first item");
        println("primes.pop()");
        println("First " + primes.pop());
        println("primes.pop()");
        println("Last " + primes.pop());



    }
}
