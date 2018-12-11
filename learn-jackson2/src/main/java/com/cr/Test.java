package com.cr;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        //MyValue value = mapper.readValue("{\"name\":\"Bob\", \"age\":13, \"address\":\"China\"}", MyValue.class);
        MyValue value = mapper.readValue("{\"name\":\"Bob\", \"age\":13}", MyValue.class);
        System.out.println(value);

        String jsonString = mapper.writeValueAsString(value);
        System.out.println(jsonString);
    }

}
