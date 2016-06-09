package com.choucair.app;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;

/**
 * Created by wospina on 09/06/2016.
 */
public class connectionTest {

    @Test
    public void testIt() throws Exception {
        System.out.println("");

        /*Connection connection = getConnection();
        connection.setAutoCommit(false);    //begin transaction

        MyDao      myDao      = new MyDaoImpl(connection);

        try{

            myDao.insertABC("1", "one");
            myDao.insertABC("2", "two");

            Assert.assertEquals("one", myDao.readABC("1"));
            Assert.assertEquals("two", myDao.readABC("2"));


            myDao.update("1", "oneOne");
            myDao.update("2", "twoTwo");

            Assert.assertEquals("oneOne", myDao.readABC("1"));
            Assert.assertEquals("twoTwo", myDao.readABC("2"));


            myDao.delete("1");
            myDao.delete("2");

            Assert.assertNull(myDao.readABC("1"));
            Assert.assertNull(myDao.readABC("2"));


        } finally {
            connection.rollback();
            connection.close();
        }*/
    }

    @Test
    public void testIt1() throws Exception {
        System.out.println("");

        /*Connection connection = getConnection();
        connection.setAutoCommit(false);    //begin transaction

        MyDao      myDao      = new MyDaoImpl(connection);

        try{

            myDao.insertABC("1");
            myDao.insertABC("2");

            Assert.assertEquals("1", myDao.readABC("1"));
            Assert.assertEquals("2", myDao.readABC("2"));

        } finally {
            connection.rollback();
            connection.close();
        }*/
    }
}
