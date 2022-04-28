class GroovyTut{
  static void main(String[] args){

    println("Hello World");

    def age = 40;
    println("age=" + age);

    println("operaciones con enteros");
    println("-----------------------");

    println("age + 10 = " + (age + 10));
    println("age - 4 = " + (age - 4));
    println("age * 8 = " + (age * 8));
    println("age.intdiv(2) = " + (age.intdiv(2)));
    println("age % 4 = " + (age % 4));

    println("operaciones con floats")
    println("----------------------")
    println("5.2.plus(4.4) = " + (5.2.plus(4.4)));
    println("5.2.minus(4.4) = " + (5.2.minus(4.4)));
    println("5.2.multiply(4.4) = " + (5.2.multiply(4.4)))
    println("5.2 / 4.4 = " + (5.2 / 5.4));

    println("shortcuts");
    println("---------");
    println("age=" + age);
    println("age++ = " + (age++) + " muestra el valor y luego le suma uno");
    println("age=" + age);
    println("++age = " + (++age) + " le suma uno y luego muestra el valor");
    println("age=" + age);
    println("age-- = " + (age--) + " muestra el valor y luego le resta uno");
    println("age=" + age);
    println("--age = " + (--age) + " le resta uno y luego muestra el valor");
    println("age=" + age);

    // Largest values
    println("Largest values");
    println("--------------");
    println("Biggest Int " + Integer.MAX_VALUE);
    println("Smallest Int " + Integer.MIN_VALUE);

    println("Biggest Float " + Float.MAX_VALUE);
    println("Smallest Float " + Float.MIN_VALUE);

    println("Biggest Double " + Double.MAX_VALUE);
    println("Smallest Double " + Double.MIN_VALUE);

    // Math Functions
    println("Math Functions");
    println("--------------");
    def randNum = 2.0;
    println("Math.abs(-2.45) = " + (Math.abs(-2.45)));
    println("Math.round(2.45) = " + (Math.round(2.45)));
    println("randNum.pow(3) = " + (randNum.pow(3)));
    println("3.0.equals(2.0) = " + (3.0.equals(2.0)));
    println("randNum.equals(Float.NaN) = " + (randNum.equals(Float.NaN)));
    println("Math.sqrt(9) = " + (Math.sqrt(9)));
    println("Math.cbrt(27) = " + (Math.cbrt(27)));
    println("Math.ceil(2.45) = " + (Math.ceil(2.45)));
    println("Math.floor(2.45) = " + (Math.floor(2.45)));
    println("Math.min(2,3) = " + (Math.min(2,3)));
    println("Math.max(2,3) = " + (Math.max(2,3)));

    println("--------------");

    print("Number to the power of e");
    println("Math.log(2) = " + (Math.log(2)));
    println("--------------");
    println("Base 10 logarithm");
    println("Math.log10(2) = " + (Math.log10(2)));
    println("--------------");
    println("Degrees and radians");
    println("Math.toDegrees(Math.PI) = " + (Math.toDegrees(Math.PI)));
    println("Math.toRadians(90) = " + (Math.toRadians(90)));
    println("--------------");
    println("sin, cos, tan, asin, acos, atan, sinh, cosh, tanh");
    println("Math.sin(0.5 * Math.PI) = " + (Math.sin(0.5 * Math.PI)));
    println("--------------");
    println("Generate random value from 1 to 100");
    println("Math.abs(new Random().nextInt() % 100) + 1 = " + (Math.abs(new Random().nextInt() % 100) + 1));
    println("--------------");
    




  }
}
