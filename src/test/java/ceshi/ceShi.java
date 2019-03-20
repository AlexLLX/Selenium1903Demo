package ceshi;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ceShi {
    @Test
    public void compare1(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void compare2(){
        Assert.assertEquals(1,2);
    }
}
