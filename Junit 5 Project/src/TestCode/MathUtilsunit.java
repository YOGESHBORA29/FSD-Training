package TestCode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import BussinessCode.Mathutils;



import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class MathUtilJunit5Test {



private static List<Integer> vals;

@BeforeAll
static void setUpBeforeClass() throws Exception {

vals=List.of(2,1,-2,3,-1,0,-2);

}



@Test
@DisplayName("Testing Sum of Values")
void testSum() {
Integer sum=Mathutils.sum(vals);
assertEquals(Integer.valueOf(2),sum);
}



@Test
@DisplayName("should Get Positive Values")
void testPositive() {
List pValues= Mathutils.positive(vals);
assertEquals(pValues, List.of(2,1,3));

}



@Test
@DisplayName("should Get negative Values")
void testNegative() {
List pValues= Mathutils.positive(vals);
assertEquals(pValues, List.of(-2,-1,-2));
}



}