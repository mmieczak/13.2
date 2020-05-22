import java.util.Comparator;

public class ComputerCpuComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {
        return o1.getCpu().compareTo(o2.getCpu());
    }
}
