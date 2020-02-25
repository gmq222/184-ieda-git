package com.baizhi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Tests {

    @Test
    public void contextLoads() {
        System.out.println("这是第一次修改");
        System.out.println();
        int a = 10;
        int b = 20;
        System.out.println(a + b);
         System.out.println("在gitbut上的修改");
        System.out.println("在idea上的修改----啦啦啦啦");
    }

}
