package technogijon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StoreTest {

    private Store store;
    @BeforeEach
    public void setUp() {
        store = new Store("Techno Gijón", "José Romero", "123456789");
    }
    

    @Test
    public void testAddComputer() {
        Computer computer = new Computer("Dell", 16, "Intel i7", "Windows 10", 1200.00);

        store.addComputer(computer);

        List<Computer> computers = store.listComputers();
        assertEquals(1, computers.size(), "The store should have 1 computer.");
        assertEquals("Dell", computers.get(0).getBrand(), "The added computer should be from the brand Dell.");
    }

    @Test
public void testRemoveComputer() {
    Computer computer = new Computer("Dell", 16, "Intel i7", "Windows 10", 1200.00);

    store.addComputer(computer);

    assertEquals(1, store.listComputers().size(), "The store should have 1 computer.");

    store.removeComputer("Dell");

    assertEquals(0, store.listComputers().size(), "The store should have 0 computers after removal.");
}

@Test
public void testFindComputerByBrand() {
    Computer computer = new Computer("Dell", 16, "Intel i7", "Windows 10", 1200.00);

    store.addComputer(computer);

    Computer foundComputer = store.findComputerByBrand("Dell");

    assertNotNull(foundComputer, "The computer should be found.");
    assertEquals("Dell", foundComputer.getBrand(), "The found computer should be from the brand Dell.");
}
@Test
public void testListComputers() {
    Computer computer1 = new Computer("Dell", 16, "Intel i7", "Windows 10", 1200.00);
    Computer computer2 = new Computer("HP", 8, "Intel i5", "Windows 10", 800.00);

    store.addComputer(computer1);
    store.addComputer(computer2);

    List<Computer> computersList = store.listComputers();

    assertEquals(2, computersList.size(), "The store should have 2 computers.");
    assertTrue(computersList.contains(computer1), "The store should contain the Dell computer.");
    assertTrue(computersList.contains(computer2), "The store should contain the HP computer.");
}
@Test
public void testStoreNameOwnerAndTaxId() {
    // Crear una tienda con nombre y propietario
    Store store = new Store("Techno Gijón", "José Romero","123456789");

    // Verificar que el nombre y propietario son correctos
    assertEquals("Techno Gijón", store.getName(), "The store's name should be Techno Gijón.");
    assertEquals("José Romero", store.getOwner(), "The store's owner should be José Romero.");
    assertEquals("123456789", store.getTaxId(), "The store's tax ID should be 123456789.");
}
}
