package jpeixoto.experiments.seatrandomizer;
import java.util.Arrays;
/**
 * Created by codecadet on 28/01/16.
 */
public class Main {

    public static void main(String[] args) {


        Person[][] people = new Person[][]{{
                new Person("Joana F. "),
                new Person("Paulo    "),
                new Person("Mariana  "),
                new Person("Mike     ")
        }, {new Person("Milena   "),
                new Person("Joana P. "),
                new Person("Nuno     "),
                new Person("Miguel   ")},
                {new Person("Itamar   "),
                        new Person("P.Jairson"),
                        new Person("Joao     "),
                        new Person("Joana V. ")},
                {new Person("Felipe   "),
                        new Person("Sergio   "),
                        new Person("Andre    "),
                        new Person("Tiago    ")}};


        SeatRandomizer academia = new SeatRandomizer(people);

        academia.printSeats(people);
        System.out.println();
        academia.printSeats(academia.randomize());


    }



    }

