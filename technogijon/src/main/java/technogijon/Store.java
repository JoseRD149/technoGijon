package technogijon;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private String name;
    private String owner;
    private String taxId;
    private List<Computer> computers;

    // Constructor
    public Store(String name, String owner, String taxId) {
        this.name = name;
        this.owner = owner;
        this.taxId = taxId;
        this.computers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public String getTaxId() {
        return taxId; }

    public List<Computer> listComputers() {
        return computers;
    }

    // Métodos de la tienda
    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(String brand) {
        computers.removeIf(computer -> computer.getBrand().equals(brand));
    }

    public Computer findComputerByBrand(String brand) {
        for (Computer computer : computers) {
            if (computer.getBrand().equals(brand)) {
                return computer;
            }
        }
        return null;
    }
}
