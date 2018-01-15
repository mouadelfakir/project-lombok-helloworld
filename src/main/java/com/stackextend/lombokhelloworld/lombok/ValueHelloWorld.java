package com.stackextend.lombokhelloworld.lombok;

import lombok.Value;

@Value
public class ValueHelloWorld {

    private String firstAttribute;
    private String secondAttribute;

    public void doSomething() {

        this.getFirstAttribute();
        this.getSecondAttribute();
    }

}
