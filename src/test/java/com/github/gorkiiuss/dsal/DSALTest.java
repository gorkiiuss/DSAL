package com.github.gorkiiuss.dsal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DSALTest {

    @Test
    void getVersion() {
        assertEquals(DSAL.getVersion(), "0.0.0");
    }
}