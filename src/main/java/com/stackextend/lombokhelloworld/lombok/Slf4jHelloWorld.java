package com.stackextend.lombokhelloworld.lombok;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Slf4jHelloWorld {

    public void doSomething() {

        log.info("This is a message from Lombok @Slf4j");

    }

}
