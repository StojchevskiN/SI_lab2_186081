package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.example.SILab2.checkCart;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    List<Item> mocklist= Arrays.asList( new Item("voda", "1234958212" , 200, 0.5F), new Item("mleko", "0234958212" , 400, 0.0F));

    @Test
    void checkCartTrue() {
        assertTrue(checkCart(mocklist, 600));
    }
    @Test
    void checkCartFalse() {
        assertFalse(checkCart(mocklist, 300));
    }

}