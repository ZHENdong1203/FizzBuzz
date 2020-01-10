package test;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;
import main.*;


public class FizzBuzzTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
}

@Test
public void testFizzBuzzTest() throws Exception{
    FizzBuzz fb=new FizzBuzz();

    assertEquals(fb.solution(23),"Fizz");
    assertEquals(fb.solution(35),"Fizz");

}


} 
