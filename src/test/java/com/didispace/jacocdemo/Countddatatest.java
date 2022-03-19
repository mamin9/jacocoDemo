package com.didispace.jacocdemo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: mam
 * @Date: 2022/03/09/17:11
 * @Description:
 */
public class Countddatatest {
   @Test
    public  void  testSub(){
      Countdata test=new Countdata();
        int result=test.sub(10,5);
       System.out.println("---------------"+result);
       Assert.assertEquals(5,result);
    }


}
