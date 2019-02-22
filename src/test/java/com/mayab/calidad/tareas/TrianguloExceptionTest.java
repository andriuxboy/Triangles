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
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Andres
 */
public class TrianguloExceptionTest {
    private Triangulo triangles;
    private  Integer number1;
    private  String expected;
    private  Integer number2;
    private Integer number3;
        
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();    
    @Test
    public void getTypeTest(){
        triangles = new Triangulo(1,5,90);
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Arguments cannot create a Triangle");
        triangles.getSideType();
    }
    }
    

