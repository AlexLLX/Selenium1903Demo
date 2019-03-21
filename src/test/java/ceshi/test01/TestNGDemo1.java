package ceshi.test01;

import org.testng.annotations.*;
//TestNG部分注解介绍
//@BeforeTest(最前执行一次)
//@BeforeMethod(每N个test之前执行N次) @Test
//@AfterMethod(每N个test之后执行N次)
//@AfterTest(最后执行一次)
public class TestNGDemo1 {
    @BeforeTest
    public void beforeTest01(){
        System.out.println("这是BeforeTest注解");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是BeforeMethod注解");
    }
    @Test
    public void testCase1(){
        System.out.println("这是@Test注解,case1");
    }
    @Test
    public void testCase2(){
        System.out.println("这是@Test注解,case2");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("这是@AfterMethod注解");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("这是@AfterTest注解");
    }
}
