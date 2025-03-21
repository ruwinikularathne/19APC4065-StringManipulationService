package com.example.client;

import jakarta.xml.ws.Service;
import com.example.service.StringManipulationService;

import javax.xml.namespace.QName;
import java.net.URL;

public class TestClient {

    public static void main(String[] args) throws Exception {
        URL wsdlURL = new URL("http://localhost:8080/string-service/services/StringManipulationService?wsdl");

        QName serviceName = new QName("http://service.example.com/", "StringManipulationServiceImplService");
        QName portName = new QName("http://service.example.com/", "StringManipulationServiceImplPort");

        Service service = Service.create(wsdlURL, serviceName);
        StringManipulationService port = service.getPort(portName, StringManipulationService.class);

        // Test the reverseText method
        String input1 = "hello";
        String result1 = port.reverseText(input1);
        System.out.println("reverseText(\"" + input1 + "\") = \"" + result1 + "\"");

        // Test the countCharacters method
        String input2 = "hello world";
        int result2 = port.countCharacters(input2);
        System.out.println("countCharacters(\"" + input2 + "\") = " + result2);
    }
}