package com.example.bfhl_api.service.impl;

import com.example.bfhl_api.dto.BfhlRequest;
import com.example.bfhl_api.dto.BfhlResponse;
import com.example.bfhl_api.service.BfhlService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BfhlServiceImpl implements BfhlService {

    @Override
    public BfhlResponse processData(BfhlRequest request) {

        List<String> evenNumbers = new ArrayList<>();
        List<String> oddNumbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        List<String> specialCharacters = new ArrayList<>();

        int sum = 0;
        StringBuilder allLetters = new StringBuilder();

        for (String item : request.getData()) {

            if (item.matches("\\d+")) {

                int number = Integer.parseInt(item);
                sum += number;

                if (number % 2 == 0) {
                    evenNumbers.add(item);
                } else {
                    oddNumbers.add(item);
                }

            }
            else if (item.matches("[a-zA-Z]+")) {

                alphabets.add(item.toUpperCase());
                allLetters.append(item);

            }
            else {

                specialCharacters.add(item);

            }
        }

        String reversed = allLetters.reverse().toString();

        StringBuilder concatString = new StringBuilder();

        for (int i = 0; i < reversed.length(); i++) {

            char ch = reversed.charAt(i);

            if (i % 2 == 0) {
                concatString.append(Character.toUpperCase(ch));
            }
            else {
                concatString.append(Character.toLowerCase(ch));
            }
        }

        BfhlResponse response = new BfhlResponse();

        response.setIs_success(true);

        response.setUser_id("shikhiparmar_26062004");

        response.setEmail("shikhiparmar230715@acropolis.in");

        response.setRoll_number("0827CS231243");

        response.setEven_numbers(evenNumbers);

        response.setOdd_numbers(oddNumbers);

        response.setAlphabets(alphabets);

        response.setSpecial_characters(specialCharacters);

        response.setSum(String.valueOf(sum));

        response.setConcat_string(concatString.toString());

        return response;
    }
}