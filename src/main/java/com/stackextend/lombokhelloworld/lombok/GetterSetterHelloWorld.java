package com.stackextend.lombokhelloworld.lombok;

import lombok.Getter;
import lombok.Setter;

public class GetterSetterHelloWorld {

    @Getter @Setter
    private String firstAttribute;

    @Getter
    private String secondAttribute;

    public void doSomething() {

        this.setFirstAttribute("value");
        this.getFirstAttribute();

        this.getSecondAttribute();
    }

}
