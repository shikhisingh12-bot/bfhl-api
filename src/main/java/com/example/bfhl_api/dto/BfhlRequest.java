package com.example.bfhl_api.dto;

import java.util.List;

public class BfhlRequest {

    private List<String> data;

    public BfhlRequest() {
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}