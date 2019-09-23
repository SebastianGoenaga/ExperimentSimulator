package simulator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Complex;
import model.ComplexVector;

class MarblesExperimentTest {

    @Test
    void clickForwardTest() {

        MarblesExperiment marblesExperiment = new MarblesExperiment(6);
        marblesExperiment.setRelation(2, 1);
        marblesExperiment.setRelation(2, 5);
        marblesExperiment.setRelation(3, 3);
        marblesExperiment.setRelation(4, 2);
        marblesExperiment.setRelation(5, 0);
        marblesExperiment.setRelation(5, 4);

        ComplexVector stateVector = new ComplexVector(6);
        stateVector.addToMatrix(0, new Complex(6, 0));
        stateVector.addToMatrix(1, new Complex(2, 0));
        stateVector.addToMatrix(2, new Complex(1, 0));
        stateVector.addToMatrix(3, new Complex(5, 0));
        stateVector.addToMatrix(4, new Complex(3, 0));
        stateVector.addToMatrix(5, new Complex(10, 0));

        marblesExperiment.createStateVector(stateVector);

        ComplexVector answer = marblesExperiment.clickForward();

        ComplexVector answerExpected = new ComplexVector(6);
        answerExpected.addToMatrix(0, new Complex(0, 0));
        answerExpected.addToMatrix(1, new Complex(0, 0));
        answerExpected.addToMatrix(2, new Complex(12, 0));
        answerExpected.addToMatrix(3, new Complex(5, 0));
        answerExpected.addToMatrix(4, new Complex(1, 0));
        answerExpected.addToMatrix(5, new Complex(9, 0));

        assertEquals(answerExpected, answer);
    }

    @Test
    void nclickForwardTest() {

        MarblesExperiment marblesExperiment = new MarblesExperiment(6);
        marblesExperiment.setRelation(2, 1);
        marblesExperiment.setRelation(2, 5);
        marblesExperiment.setRelation(3, 3);
        marblesExperiment.setRelation(4, 2);
        marblesExperiment.setRelation(5, 0);
        marblesExperiment.setRelation(5, 4);

        ComplexVector stateVector = new ComplexVector(6);
        stateVector.addToMatrix(0, new Complex(6, 0));
        stateVector.addToMatrix(1, new Complex(2, 0));
        stateVector.addToMatrix(2, new Complex(1, 0));
        stateVector.addToMatrix(3, new Complex(5, 0));
        stateVector.addToMatrix(4, new Complex(3, 0));
        stateVector.addToMatrix(5, new Complex(10, 0));

        marblesExperiment.createStateVector(stateVector);

        ComplexVector answer = marblesExperiment.clickForward(10);

        ComplexVector answerExpected = new ComplexVector(6);
        answerExpected.addToMatrix(0, new Complex(0, 0));
        answerExpected.addToMatrix(1, new Complex(0, 0));
        answerExpected.addToMatrix(2, new Complex(12, 0));
        answerExpected.addToMatrix(3, new Complex(5, 0));
        answerExpected.addToMatrix(4, new Complex(1, 0));
        answerExpected.addToMatrix(5, new Complex(9, 0));

        assertEquals(answerExpected, answer);

    }

    @Test
    void clickBackTest() {

        MarblesExperiment marblesExperiment = new MarblesExperiment(6);
        marblesExperiment.setRelation(2, 1);
        marblesExperiment.setRelation(2, 5);
        marblesExperiment.setRelation(3, 3);
        marblesExperiment.setRelation(4, 2);
        marblesExperiment.setRelation(5, 0);
        marblesExperiment.setRelation(5, 4);

        ComplexVector stateVector = new ComplexVector(6);       
        stateVector.addToMatrix(0, new Complex(0, 0));
        stateVector.addToMatrix(1, new Complex(0, 0));
        stateVector.addToMatrix(2, new Complex(12, 0));
        stateVector.addToMatrix(3, new Complex(5, 0));
        stateVector.addToMatrix(4, new Complex(1, 0));
        stateVector.addToMatrix(5, new Complex(9, 0));

        marblesExperiment.createStateVector(stateVector);

        ComplexVector answer = marblesExperiment.clickBack();

        ComplexVector answerExpected = new ComplexVector(6);
        answerExpected.addToMatrix(0, new Complex(9, 0));
        answerExpected.addToMatrix(1, new Complex(12, 0));
        answerExpected.addToMatrix(2, new Complex(1, 0));
        answerExpected.addToMatrix(3, new Complex(5, 0));
        answerExpected.addToMatrix(4, new Complex(9, 0));
        answerExpected.addToMatrix(5, new Complex(12, 0));
        

        assertEquals(answerExpected, answer);
    }

    @Test
    void nClicksBackTest() {

        MarblesExperiment marblesExperiment = new MarblesExperiment(6);
        marblesExperiment.setRelation(2, 1);
        marblesExperiment.setRelation(2, 5);
        marblesExperiment.setRelation(3, 3);
        marblesExperiment.setRelation(4, 2);
        marblesExperiment.setRelation(5, 0);
        marblesExperiment.setRelation(5, 4);

        ComplexVector stateVector = new ComplexVector(6);
        stateVector.addToMatrix(0, new Complex(0, 0));
        stateVector.addToMatrix(1, new Complex(0, 0));
        stateVector.addToMatrix(2, new Complex(12, 0));
        stateVector.addToMatrix(3, new Complex(5, 0));
        stateVector.addToMatrix(4, new Complex(1, 0));
        stateVector.addToMatrix(5, new Complex(9, 0));

        marblesExperiment.createStateVector(stateVector);

        ComplexVector answer = marblesExperiment.clickForward(10);

        ComplexVector answerExpected = new ComplexVector(6);
        answerExpected.addToMatrix(0, new Complex(0, 0));
        answerExpected.addToMatrix(1, new Complex(0, 0));
        answerExpected.addToMatrix(2, new Complex(9, 0));
        answerExpected.addToMatrix(3, new Complex(5, 0));
        answerExpected.addToMatrix(4, new Complex(12, 0));
        answerExpected.addToMatrix(5, new Complex(1, 0));

        assertEquals(answerExpected, answer);

    }
}