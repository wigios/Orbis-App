package com.choucair.app;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wospina on 09/06/2016.
 */
public class MyConcatenatorTest {

    @Test
    public void testConcatenate(){
        String concatenated =
                MyConcatenator.concatenate(
                        "one", "two", "three", "four");

        Assert.assertEquals("one,two,three,four", concatenated);
    }
}
