package com.java.programming.masterclass.functionalinterface;

import org.junit.jupiter.api.Test;

public class MyFunctionalInterfaceTest {

    @Test
    public void functional_interface_behavior_test() {
        onTheFly(() -> System.out.println("SAM Executed !!!"));
    }

    private void onTheFly(MyFunctionalInterface functionalInterface) {
        functionalInterface.samMethod();
    }
}
