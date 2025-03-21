package com.example.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface StringManipulationService {

    @WebMethod
    String reverseText(@WebParam(name = "text") String text);

    @WebMethod
    int countCharacters(@WebParam(name = "text") String text);
}