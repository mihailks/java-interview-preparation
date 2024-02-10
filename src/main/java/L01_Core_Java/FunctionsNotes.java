package L01_Core_Java;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionsNotes {

    /**
     * Function-има 2 аргумента. Първият е типа на входният аргумент,а вторият е типа на резултата.
     * Function е функция само с 1входен аргумент
     * Function<Integer, Integer> func=x->x*x;
     */


    int increment(int number) {
        return number + 1;
    }

    Function<Integer, Integer> increments = number -> number + 1;

    // като искаме да си я извикаме си използваме "apply"

    int a = increments.apply(1);
    int b = increments.apply(a);


//    ----------------------------


    /**
     * Consumer<T> е функция, която няма резултат. Тоест си е нещо, което е void.
     * .accept();
     */

    void printMethod(String message) {
        System.out.println(message);
    }

    Consumer<String> print = message -> System.out.println(message);
//        print.accept("Misho");


    /**
     * Supplier<T> - нещо, което не приема аргументи, но връща резултат
     * .get();
     */

    int genRandomInt() {
        Random random = new Random();
        return random.nextInt(51);
    }

    Supplier<Integer> getRandomInt = () -> new Random().nextInt(51);
    int random = getRandomInt.get();

    /**
     * Predicate<T> - нещо, което има винаги един входен аргумент и винаги връща boolean
     * .test();
     */

    boolean isEven(int number) {
        return number % 2 == 0;
    }

    Predicate<Integer> isEven = number -> number % 2 == 0;

//        System.out.print(isEven.test(6));
}
