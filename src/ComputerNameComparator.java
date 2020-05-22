import java.util.Comparator;

public class ComputerNameComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
