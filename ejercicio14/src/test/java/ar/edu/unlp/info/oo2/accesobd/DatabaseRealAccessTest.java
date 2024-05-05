package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseRealAccessTest {
    private DatabaseAccess database;
    private DatabaseProxy proxy;

    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseRealAccess();
        this.proxy = new DatabaseProxy(this.database);
    }

    @Test
    void testGetSearchResults() {
    	Exception exception = assertThrows(RuntimeException.class, () -> {
    		this.proxy.getSearchResults("select * from comics where id=1");
        });
    	assertTrue(exception.getMessage().equals("No estas logueado."));
    	proxy.login("OO2");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.proxy.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.proxy.getSearchResults("select * from comics where id=10"));
        proxy.logout();
        assertThrows(RuntimeException.class,()->{this.proxy.getSearchResults("select * from comics where id=1");});
    }

    @Test
    void testInsertNewRow() {
    	assertThrows(RuntimeException.class,()->{this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor"));});
    	proxy.login("OO2");
        assertEquals(3, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.proxy.getSearchResults("select * from comics where id=3"));
        proxy.logout();
        assertThrows(RuntimeException.class,()->{this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor"));});
    }
}