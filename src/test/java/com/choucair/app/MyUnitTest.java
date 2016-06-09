package com.choucair.app;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

//import org.junit.Assert.assertEquals;

/**
 * Created by wospina on 09/06/2016.
 */
public class MyUnitTest {

    @Test
    public void testForExceptions2() {
        MyUnit myUnit = new MyUnit();

        try {
            myUnit.throwIllegalArgumentException();

            fail("expected IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //ignore, this exception is expected.
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForExceptions1() {
        MyUnit myUnit = new MyUnit();

        myUnit.throwIllegalArgumentException();
    }

    @Test
    public void testGetTheSameObject() {
        MyUnit myUnit = new MyUnit();

        Assert.assertSame(myUnit.getTheSameObject(),
                myUnit.getTheSameObject());

        Assert.assertNotSame(myUnit.getTheSameObject(),
                myUnit.getTheSameObjectOther());
    }

    @Test
    public void testGetTheObject() {
        MyUnit myUnit = new MyUnit();

        Assert.assertNull(myUnit.getTheObject());

        Assert.assertNotNull(myUnit.getTheObjectNotnull());
    }

    @Test
    public void testGetTheBoolean() {
        MyUnit myUnit = new MyUnit();

        Assert.assertTrue (myUnit.getTheBoolean());

        Assert.assertFalse(myUnit.getTheBooleanFalse());
    }

    @Test
    public void testGetTheStringArray() {
        MyUnit myUnit = new MyUnit();

        String[] expectedArray = {"one", "two", "three"};

        String[] resultArray =  myUnit.getTheStringArray();

        Assert.assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testConcatenate(){
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("hola","Mundo");

        Assert.assertEquals("holaMundo", result);
        //Assert.assertTrue(false);

    }

    @Test
    public void testConcatenate2(){
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("hola","Mundo");

        Assert.assertEquals("holaMundo", result);
        //Assert.assertTrue(false);

    }
}

/*
assertArrayEquals()
assertEquals()
assertTrue() + assertFalse()
assertNull() + assertNotNull()
assertSame() and assertNotSame()
assertThat()
 */