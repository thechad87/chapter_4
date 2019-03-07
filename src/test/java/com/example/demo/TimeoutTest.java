package com.example.demo;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class TimeoutTest extends DemoApplicationTests {

    @Test(timeout = 2000)
    public void totalCashTest() throws InterruptedException {
        new Timeout().test();
    }

    public class Timeout {

        public void test() throws InterruptedException {
            TimeUnit.SECONDS.sleep(5000);
        }
    }
}
