package com.stackextend.lombokhelloworld.lombok;

import lombok.ToString;

@ToString
public class ToStringHelloWorld {

    private String firstAttribute;

    private void doSomething() {

        this.toString();

    }

}
