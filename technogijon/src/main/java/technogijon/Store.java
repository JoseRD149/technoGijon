package technogijon;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Computer> computers;

    public Store() {
        this.computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);  // Agrega el computador a la lista
    }

    public List<Computer> listComputers() {
        return computers;  // Devuelve la lista de computadores
    }

    public void removeComputer(String brand) {
        computers.removeIf(computer -> computer.getBrand().equals(brand));  // Elimina el computador con la marca dada
    }
}
