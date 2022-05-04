class OOP {
    static void main(String[] args){
        // ---------- OOP ----------
        // Classes are blueprints that are used to define objects
        // Every object has attributes (fields) and capabilities
        // (methods)

        // Create an Animal object with named parameters
        // def king = new Animal(name : 'King', sound : 'Growl');
        // or with a Constructor

        println('''// ---------- OOP ----------
        // Classes are blueprints that are used to define objects
        // Every object has attributes (fields) and capabilities
        // (methods)

        // Create an Animal object with named parameters
        // def king = new Animal(name : 'King', sound : 'Growl');
        // or with a Constructor''')
        println('''\ndef king = new Animal('King', 'Growl');

        println("${king.name} says ${king.sound}");

        // Change an object attribute with a setter
        king.setSound('Grrrr');
        println("${king.name} says ${king.sound}");

        king.run();

        println(king.toString());\n''');

        def king = new Animal('King', 'Growl');

        println("${king.name} says ${king.sound}");

        // Change an object attribute with a setter
        king.setSound('Grrrr');
        println("${king.name} says ${king.sound}");

        king.run();

        println(king.toString());

        println("-" * 25);

        // With inheritance a class can inherit all fields
        // and methods of another class
        println('''\n// With inheritance a class can inherit all fields
        // and methods of another class\n''');

        println('''def grover = new Dog('Grover', 'Grrrrr', 'Derek');
        king.makeSound();
        grover.makeSound();\n''');

        def grover = new Dog('Grover', 'Grrrrr', 'Derek');

        king.makeSound();
        grover.makeSound();
    }
}
