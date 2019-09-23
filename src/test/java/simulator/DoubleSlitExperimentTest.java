package simulator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.Complex;
import model.ComplexMatrix;

public class DoubleSlitExperimentTest {

    @Test
    void likelihoodTest() {

        ComplexMatrix answerExpected = new ComplexMatrix(8, 8);

        // math1
        Complex c1 = new Complex(0.5, 0);
        Complex c2 = new Complex(0, 0);
        Complex c3 = new Complex(1, 0);
        Complex c4 = new Complex(0.3333333432674408, 0);

        // add

        answerExpected.addToMatrix(0, 0, c2);
        answerExpected.addToMatrix(0, 1, c1);
        answerExpected.addToMatrix(0, 2, c1);
        answerExpected.addToMatrix(0, 3, c2);
        answerExpected.addToMatrix(0, 4, c2);
        answerExpected.addToMatrix(0, 5, c2);
        answerExpected.addToMatrix(0, 6, c2);
        answerExpected.addToMatrix(0, 7, c2);
        answerExpected.addToMatrix(1, 0, c2);
        answerExpected.addToMatrix(1, 1, c2);
        answerExpected.addToMatrix(1, 2, c2);
        answerExpected.addToMatrix(1, 3, c2);
        answerExpected.addToMatrix(1, 4, c2);
        answerExpected.addToMatrix(1, 5, c2);
        answerExpected.addToMatrix(1, 6, c2);
        answerExpected.addToMatrix(1, 7, c2);
        answerExpected.addToMatrix(2, 0, c2);
        answerExpected.addToMatrix(2, 1, c2);
        answerExpected.addToMatrix(2, 2, c2);
        answerExpected.addToMatrix(2, 3, c2);
        answerExpected.addToMatrix(2, 4, c2);
        answerExpected.addToMatrix(2, 5, c2);
        answerExpected.addToMatrix(2, 6, c2);
        answerExpected.addToMatrix(2, 7, c2);
        answerExpected.addToMatrix(3, 0, c2);
        answerExpected.addToMatrix(3, 1, c4);
        answerExpected.addToMatrix(3, 2, c2);
        answerExpected.addToMatrix(3, 3, c3);
        answerExpected.addToMatrix(3, 4, c2);
        answerExpected.addToMatrix(3, 5, c2);
        answerExpected.addToMatrix(3, 6, c2);
        answerExpected.addToMatrix(3, 7, c2);
        answerExpected.addToMatrix(4, 0, c2);
        answerExpected.addToMatrix(4, 1, c4);
        answerExpected.addToMatrix(4, 2, c2);
        answerExpected.addToMatrix(4, 3, c2);
        answerExpected.addToMatrix(4, 4, c3);
        answerExpected.addToMatrix(4, 5, c2);
        answerExpected.addToMatrix(4, 6, c2);
        answerExpected.addToMatrix(4, 7, c2);
        answerExpected.addToMatrix(5, 0, c2);
        answerExpected.addToMatrix(5, 1, c4);
        answerExpected.addToMatrix(5, 2, c4);
        answerExpected.addToMatrix(5, 3, c2);
        answerExpected.addToMatrix(5, 4, c2);
        answerExpected.addToMatrix(5, 5, c3);
        answerExpected.addToMatrix(5, 6, c2);
        answerExpected.addToMatrix(5, 7, c2);
        answerExpected.addToMatrix(6, 0, c2);
        answerExpected.addToMatrix(6, 1, c2);
        answerExpected.addToMatrix(6, 2, c4);
        answerExpected.addToMatrix(6, 3, c2);
        answerExpected.addToMatrix(6, 4, c2);
        answerExpected.addToMatrix(6, 5, c2);
        answerExpected.addToMatrix(6, 6, c3);
        answerExpected.addToMatrix(6, 7, c2);
        answerExpected.addToMatrix(7, 0, c2);
        answerExpected.addToMatrix(7, 1, c2);
        answerExpected.addToMatrix(7, 2, c4);
        answerExpected.addToMatrix(7, 3, c2);
        answerExpected.addToMatrix(7, 4, c2);
        answerExpected.addToMatrix(7, 5, c2);
        answerExpected.addToMatrix(7, 6, c2);
        answerExpected.addToMatrix(7, 7, c3);

        ComplexMatrix answer = DoubleSlitExperiment.likelihood(2);

        assertEquals(answerExpected, answer);
    }

}