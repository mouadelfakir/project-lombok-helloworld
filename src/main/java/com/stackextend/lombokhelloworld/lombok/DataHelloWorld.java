package com.stackextend.lombokhelloworld.lombok;

import lombok.Data;

@Data
public class DataHelloWorld {

    private String firstAttribute;
    private String secondAttribute;

    public void doSomething() {

        this.setFirstAttribute("value 1");
        this.setSecondAttribute("value 2");

        this.getFirstAttribute();
        this.getSecondAttribute();
    }

}
