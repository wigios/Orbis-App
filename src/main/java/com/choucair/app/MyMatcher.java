package com.choucair.app;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

/**
 * Created by wospina on 09/06/2016.
 */
public class MyMatcher {
    public static Matcher matches(final Object expected){

        return new BaseMatcher() {

            protected Object theExpected = expected;

            public boolean matches(Object o) {
                return theExpected.equals(o);
            }

            public void describeTo(Description description) {
                description.appendText(theExpected.toString());
            }
        };
    }
}
