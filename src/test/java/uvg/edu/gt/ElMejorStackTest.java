package uvg.edu.gt;

import static org.junit.Assert.*;

import org.junit.Test;

import uvg.edu.gt.Components.ElMejorStack;
import uvg.edu.gt.Components.UVGStack;

public class ElMejorStackTest {
    
    @Test
    public void testStackCreation(){
        UVGStack<Integer> intStack = new ElMejorStack<Integer>();
        UVGStack<String> stringStack = new ElMejorStack<String>();
        UVGStack<Double> doubleStack = new ElMejorStack<Double>();
        UVGStack<Float> floatStack = new ElMejorStack<Float>();

        intStack.push(1);
        stringStack.push("HI");

        
    }

    @Test 
    public void testIsEmpty(){
        UVGStack<String> stack = new ElMejorStack<String>();
        assertTrue(stack.isEmpty());

    }
}
