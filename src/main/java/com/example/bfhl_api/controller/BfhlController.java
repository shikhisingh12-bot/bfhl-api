package com.example.bfhl_api.controller;

import com.example.bfhl_api.dto.BfhlRequest;
import com.example.bfhl_api.dto.BfhlResponse;
import com.example.bfhl_api.service.BfhlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bfhl")
public class BfhlController {

    @Autowired
    private BfhlService bfhlService;

    @PostMapping
    public BfhlResponse processData(@RequestBody BfhlRequest request) {

        return bfhlService.processData(request);

    }
}