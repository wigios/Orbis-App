package com.choucair.app;

import org.junit.Assert;

import static com.choucair.app.MyMatcher.matches;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

/**
 * Created by wospina on 09/06/2016.
 */
public class MyMatcherTest {

    @Test
    public void testThat() {
        MyUnit myUnit = new MyUnit();

        Assert.assertThat(myUnit.getTheSameObject(), matches("constant string"));

    }

    @Test
    public void testWithMatchers() {
        Assert.assertThat("this string", is("this string"));
        Assert.assertThat(123, is(123));
    }

    @Test
    public void testWithMatchers1() {

        Assert.assertThat(123, not( is(345) ) );

    }
}
