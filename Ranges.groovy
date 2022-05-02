class Ranges {
    static void main(String[] args){
        println("Ranges represent a range of values in shorthand notation\n")

        def oneTo10 = 1..10;
        def aToZ = 'a'..'z';
        def zToA = 'z'..'a';

        println("def oneTo10 = 1..10");
        println("oneTo10 =  ${oneTo10}");
        println("\ndef aToZ = 'a'..'z'");
        println("aToZ = ${aToZ}");
        println("\ndef zToA = 'z'..'a'");
        println("zToA = ${zToA}");

        // Get size
        println("\nGet size");
        println("oneTo10.size()")
        println("Size =" + oneTo10.size());

        // get index
        println("\nget index");
        println("2nd Item = oneTo10.get(1)");
        println("2nd Item = " + oneTo10.get(1));

        // Check if range contains
        println("\nCheck if range contains");
        println("oneTo10.contains(11)");
        println("Contains 11 = " + oneTo10.contains(11));

        // Get last item
        println("\nGet last item");
        println("oneTo10.getTo()");
        println("Get Last = " + oneTo10.getTo());
        println("\nGet first item");
        println("oneTo10.getFrom()");
        println("Get First = " + oneTo10.getFrom());

    }
}
