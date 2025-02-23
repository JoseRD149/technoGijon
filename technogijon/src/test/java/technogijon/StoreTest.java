package technogijon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StoreTest {

    private Store store;

    @BeforeEach
    public void setUp() {
        store = new Store();  // Initialize the store before each test
    }

    @Test
    public void testAddComputer() {
        // Step 1: Create a computer
        Computer computer = new Computer("Dell", 16, "Intel i7", "Windows 10", 1200.00);

        // Step 2: Add the computer to the store
        store.addComputer(computer);

        // Step 3: Verify that the computer was added
        List<Computer> computers = store.listComputers();
        assertEquals(1, computers.size(), "The store should have 1 computer.");
        assertEquals("Dell", computers.get(0).getBrand(), "The added computer should be from the brand Dell.");
    }

    @Test
public void testRemoveComputer() {
    // Step 1: Create a computer
    Computer computer = new Computer("Dell", 16, "Intel i7", "Windows 10", 1200.00);

    // Step 2: Add the computer to the store
    store.addComputer(computer);

    // Step 3: Verify that the computer was added
    assertEquals(1, store.listComputers().size(), "The store should have 1 computer.");

    // Step 4: Remove the computer by its brand
    store.removeComputer("Dell");

    // Step 5: Verify that the computer was removed
    assertEquals(0, store.listComputers().size(), "The store should have 0 computers after removal.");
}
}
