package jpeixoto.experiments.seatrandomizer;

import java.util.Arrays;

/**
 * Created by codecadet on 25/01/16.
 */
public class SeatRandomizer {

    //private Person[]unforgitables;

    private Person[][] people;


    public SeatRandomizer(Person[][] people){
        this.people = people;
    }



    public Person[][] randomize() {
        int row;
        int column;
        Person[][] newpeople = new Person[people.length][people[0].length];

        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people[i].length; j++) {
                row = RandomGenerator.getRandom(people.length - 1 );
                column = RandomGenerator.getRandom(people[i].length-1);
               //avoid repeating people
                 while(people[row][column] == (null)) {
                    row = RandomGenerator.getRandom(people.length-1);
                    column = RandomGenerator.getRandom(people[i].length-1);
                    continue;
                }
                newpeople[i][j] = people[row][column];
                people[row][column] = null;

            }
        }
        return newpeople;
    }


    public void printSeats(Person[][] people){
        int count = 1;
        for (int i = 0; i < people.length;i++){
            for(int j = 0; j < people[i].length ; j++){
                if(count % people[i].length == 0){
                    System.out.println(people[i][j]);
                }
                else{
                    System.out.print(people[i][j]);
                }
                count++;
            }
        }
    }
}

