import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tester {

    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();

        computers.add(new Computer("Mac PRO", "3,5 GHz", 32));
        computers.add((new Computer("Dell Precision T3630", "3,2 GHz", 16)));
        computers.add((new Computer("Dell Precision T3630", "3,2 GHz", 32)));
        computers.add((new Computer("Dell Precision T3000", "3,2 GHz", 32)));
        computers.add((new Computer("Dell Precision T3630", "3,0 GHz", 64)));

        /*Comparator<Computer> order = Comparator.comparing(Computer::getCpu).reversed();
        order.thenComparing(Computer::getMemory).reversed();
        order.thenComparing(Computer::getName);*/

        Comparator<Computer> sortOrder;
        sortOrder = new ComputerCpuComparator().reversed().thenComparing(new ComputerMemoryComparator().reversed().thenComparing(new ComputerNameComparator()));

        computers.sort(sortOrder);
        System.out.println(computers);

    }


}
