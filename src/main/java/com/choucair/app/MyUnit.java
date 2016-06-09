package com.choucair.app;

import java.util.Arrays;

/**
 * Created by wospina on 09/06/2016.
 */
public class MyUnit {

    public void throwIllegalArgumentException(){
        System.out.println("Hola mundo");
    }

    public String concatenate(String one, String two){
        return one + two;
    }

    public String[] getTheStringArray (){
        String[] expectedArray = {"one", "two", "three"};
        return expectedArray;
    }

    public Boolean getTheBoolean(){
        return true;
    }

    public Boolean getTheBooleanFalse(){
        return false;
    }

    public String getTheObject(){
        return null;
    }

    public String getTheObjectNotnull(){
        return "Hi";
    }

    public String getTheSameObject(){
        return "constant string";
    }

    public Integer getTheSameObjectOther(){
        return 5;
    }
}