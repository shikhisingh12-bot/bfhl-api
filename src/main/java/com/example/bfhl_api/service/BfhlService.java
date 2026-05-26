package com.example.bfhl_api.service;

import com.example.bfhl_api.dto.BfhlRequest;
import com.example.bfhl_api.dto.BfhlResponse;

public interface BfhlService {

    BfhlResponse processData(BfhlRequest request);

}