package ceshi.test01;

import org.testng.Assert;
import org.testng.annotations.Test;
//TestNG部分常用校验方式介绍
//相等:Assert.assertEquals(); 不等:Assert.assertNotEquals();
//不为空:Assert.assertNotNull(); 为空:Assert.assertNull();
public class TestNGDemo2 {
    @Test
    public void assertNull(){
        String a=null;
        Assert.assertNull(a);
    }
    @Test
    public void assertNotNull(){
        String a=" ";
        Assert.assertNotNull(a);
    }
    @Test
    public void assertEqual(){
        String a="abc" ;
        String b="abc";
        Assert.assertEquals(a,b,"a is equal with b?");
    }
    @Test
    public void  assertNotEqual(){
        String a="abc";
        String b="abcd";
        Assert.assertNotEquals(a,b,"a is equal with b?");
    }
}
