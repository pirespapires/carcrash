package jpeixoto.experiments.seatrandomizer;

/**
 * Created by codecadet on 28/01/16.
 */
public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" ");
        sb.append("Name:'").append(name).append('\'');
        sb.append(' ');
        return sb.toString();
    }
}
