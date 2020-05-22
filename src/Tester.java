import utils.Utilities;

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
        computers.add((new Computer("Apple", null, 64)));

        Comparator<Computer> sortOrder;
        try {
            sortOrder = sortListComparator(Utilities.runSortAction());
            Collections.sort(computers, sortOrder);
        } catch (IllegalStateException ex) {
            Collections.sort(computers);
            System.err.println("Wrong input value! Using default sort order by Name");
        } finally {
            System.out.println(computers);
        }
    }

    private static Comparator<Computer> sortListComparator(String sortOrder) {
        return switch (sortOrder) {
            case "ram" -> Comparator.comparing(Computer::getMemory, Comparator.nullsFirst(Comparator.naturalOrder()));/*new ComputerMemoryComparator().reversed();*/
            case "cpu" -> Comparator.comparing(Computer::getCpu, Comparator.nullsFirst(Comparator.naturalOrder()));
            case "name" -> Comparator.comparing(Computer::getName, Comparator.nullsFirst(Comparator.naturalOrder()));
            default -> throw new IllegalStateException("Unexpected value: " + sortOrder);
        };
    }


}
