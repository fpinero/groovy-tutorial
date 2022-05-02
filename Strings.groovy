class Strings {

    static void main(String[] args){

        def name = "Derek";
        // A string surrounded by single quotes is taken literally
        // but backslashed characters are recognized
        println('I am ${name}\n');
        println("I am $name\n");
        println("I am ${name} again\n");

        // Triple quoted strings continue over many lines
        def multString = '''I am
          a string
          that goes on
          for many lines''';

        println(multString);

        // You can access a string by index
        println("\n3rd Index of Name ${name} is " + name[3]);
        println("Index of r Derek is " + name.indexOf('r'));

        // You can also get a slice
        println("\n1st 3 Characters of Derek are" + name[0..2]);

        // Get specific Characters
        println("\nEvery Other Character " + name[0,2,4]);

        // Get characters starting at index
        println("\nSubstring at 1 " + name.substring(1));

        // Get characters at index up to another
        println("\nSubstring at 1 to 4 " + name.substring(1,4));

        // Concatenate strings
        println("\nConcatenate strings")
        println("\nMy Name " + name);
        println("\nMy Name ".concat(name) + "\n");

        // Repeat a string
        println("Repeat a string");
        def repeatStr = "What I said is \n" * 2;
        println(repeatStr);

        // Check for equality
        println("Check for equality")
        println("Derek == Derek : " + ('Derek'.equals('Derek')));
        println("Derek == derek : " + ('Derek'.equalsIgnoreCase('derek')));

        // Get length of string
        println("\nGet length of string");
        println("Size " + repeatStr.length());

        // Remove first occurance
        println("\nRemove first occurance of What");
        println(repeatStr - "What");

        // Split the string
        println("\nSplit the string");
        println(repeatStr.split(' '));
        println("\n" + repeatStr.toList());

        // Replace all strings
        println("\nReplace all strings, where I put she");
        println(repeatStr.replaceAll('I', 'she'));

        // Uppercase and lowercase
        println("Uppercase and lowercase\n");
        println("Uppercase " + name.toUpperCase());
        println("Lowercase " + name.toLowerCase());

        // <=> returns -1 if 1st string is before 2nd
        // 1 if the opposite and 0 if equal
        println("\n<=> returns -1 if 1st string is before 2nd, 1 if the opposite and 0 if equal")
        println("Ant <=> Banana " + ('Ant' <=> 'Banana'));
        println("Banana <=> Ant " + ('Banana' <=> 'Ant'));
        println("Ant <=> Ant " + ('Ant' <=> 'Ant'));


    }

}
