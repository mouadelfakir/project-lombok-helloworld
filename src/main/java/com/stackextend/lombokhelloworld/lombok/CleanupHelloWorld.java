package com.stackextend.lombokhelloworld.lombok;

import lombok.Cleanup;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CleanupHelloWorld {

    public void doSomething() throws IOException {

        @Cleanup OutputStream out = new FileOutputStream("file");

        out.write(1);
        out.write(2);

    }

}
