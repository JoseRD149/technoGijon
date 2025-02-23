package technogijon;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Computer> computers;

    public Store() {
        this.computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);  
    }

    public List<Computer> listComputers() {
        return computers;  
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
