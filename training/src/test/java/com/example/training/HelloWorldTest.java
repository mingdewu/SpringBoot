package com.example.training;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HelloWorldTest {

    @Test
    public void testHelloWorld() {
        System.out.println("hello");
        String hello = "Hello, World!";
        assertEquals("Hello, Worldasdadas!", hello);
        System.out.println(hello);
    }
}