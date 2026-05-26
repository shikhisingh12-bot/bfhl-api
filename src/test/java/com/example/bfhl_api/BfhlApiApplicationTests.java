package com.example.bfhl_api;

import com.example.bfhl_api.dto.BfhlRequest;
import com.example.bfhl_api.dto.BfhlResponse;
import com.example.bfhl_api.service.impl.BfhlServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BfhlApiApplicationTests {

    @Test
    void testProcessData() {

        BfhlServiceImpl service = new BfhlServiceImpl();

        BfhlRequest request = new BfhlRequest();

        request.setData(Arrays.asList("a", "1", "334", "4", "R", "$"));

        BfhlResponse response = service.processData(request);

        assertEquals("339", response.getSum());

        assertEquals(2, response.getEven_numbers().size());

        assertEquals(1, response.getOdd_numbers().size());

        assertTrue(response.getAlphabets().contains("A"));

        assertTrue(response.getSpecial_characters().contains("$"));

        assertEquals("Ra", response.getConcat_string());
    }
}