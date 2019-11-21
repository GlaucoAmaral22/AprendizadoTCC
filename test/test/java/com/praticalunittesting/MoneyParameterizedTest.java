/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java.com.praticalunittesting;

import junitparams.JUnitParamsRunner;
import org.junit.Test;

import org.junit.runner.RunWith;

/**
 *
 * @author glauc
 */
@RunWith(JUnitParamsRunner.class)
public class MoneyParameterizedTest {
    private static final Object[] getMoney(){
        return new Object[] {
            new Object[] {10, "USD"},
            new Object[] {20, "EUR"}
        };
    }
    
    
    

}
