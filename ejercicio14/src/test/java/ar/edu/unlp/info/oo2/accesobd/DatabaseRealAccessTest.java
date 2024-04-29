package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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
    	assertNull(this.proxy.getSearchResults("select * from comics where id=1"));
    	proxy.login("OO2");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.proxy.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.proxy.getSearchResults("select * from comics where id=10"));
        proxy.logout();
        assertNull(this.proxy.getSearchResults("select * from comics where id=1"));
    }

    @Test
    void testInsertNewRow() {
    	assertEquals(this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")),0);
    	proxy.login("OO2");
        assertEquals(3, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.proxy.getSearchResults("select * from comics where id=3"));
        proxy.logout();
        assertNotEquals(3, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
    }
}