package com.mayab.calidad.tareas;

import java.util.Arrays;
import java.util.Collection;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.hamcrest.Matcher.*;

/**
 *
 * @author Andres
 */
@RunWith(Parameterized.class)
public class TrianguloSideTest {
    private Triangulo triangles;
    private  Integer number1;
    private  String expected;
    private  Integer number2;
    private Integer number3;

    public TrianguloSideTest(String e, Integer n1, Integer n2, Integer n3){
        this.expected = e;
        this.number1 = n1;
        this.number2 = n2;
        this.number3 = n3;

    }

    @Before
    public void initialize(){
        triangles = new Triangulo(number1,number2,number3);
    }
    
    @Parameterized.Parameters
     public static Collection data(){
        return Arrays.asList(new Object[][]{
        {"Equilateral",5,5,5},{"Scalene",8,10,5},{"Isosceles",5,5,3 },{"Scalene" ,30,10,15},{"Equilateral",10,10,10} });

    }    
    
    @Test
    public void getTypeTest(){
        String actual = triangles.getSideType();
        assertThat(actual, is(equalTo(expected)));
    }
    }
    

