import java.util.Comparator;

public class ComputerMemoryComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        return Integer.compare(o1.getMemory(),o2.getMemory());
    }
}
