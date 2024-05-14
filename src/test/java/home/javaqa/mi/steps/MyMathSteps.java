package home.javaqa.mi.steps;

import home.javaqa.mi.MyMath;
import home.javaqa.mi.context.Context;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;


public class MyMathSteps {

    private static final String ACTUAL_RESULT = "result";


    @Given("I sum numbers {int} and {int}")
    public void iSumNumbersAnd(int a, int b) {
        Context.put(ACTUAL_RESULT, MyMath.sum(a, b));
    }


    @When("I get result equals {int}")
    public void iGetResultEquals(int expectedResult) {
        assertEquals(Integer.valueOf(expectedResult), Context.get(ACTUAL_RESULT, Integer.class));
    }
}
