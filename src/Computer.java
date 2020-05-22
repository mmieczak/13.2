public class Computer implements Comparable<Computer>{
    private String name;
    private String cpu;
    private int memory;

    public Computer(String name, String cpu, int memory) {
        this.name = name;
        this.cpu = cpu;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public int compareTo(Computer c) {
        return this.name.compareTo(c.getName());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }
}
