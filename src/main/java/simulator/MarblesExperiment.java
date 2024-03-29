package simulator;

import calculator.MatrixCalculator;
import model.Complex;
import model.ComplexMatrix;
import model.ComplexVector;

public class MarblesExperiment {

    int n;
    ComplexMatrix booleanMatrix;
    ComplexVector stateVector;

    public MarblesExperiment(int n) {
        this.n = n;
        booleanMatrix = new ComplexMatrix(n, n);
        stateVector = new ComplexVector(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                booleanMatrix.addToMatrix(i, j, new Complex(0, 0));
            }
        }
    }

    public void createStateVector(ComplexVector vector) {
        for (int i = 0; i < n; i++) {
            stateVector.addToMatrix(i, vector.getElement(i, 0));
        }
    }

    public void setRelation(int i, int j) {
        if (booleanMatrix.getElement(i, j).getpReal() == 1) {
            booleanMatrix.addToMatrix(i, j, new Complex(0, 0));
        } else if (booleanMatrix.getElement(i, j).getpReal() == 0) {
            booleanMatrix.addToMatrix(i, j, new Complex(1, 0));
        }
    }

    public ComplexVector clickForward() {
        stateVector = MatrixCalculator.actionOverVector(booleanMatrix, stateVector);
        return stateVector;
    }

    public ComplexVector clickForward(int n) {
        for (int i = 0; i < n; i++) {
            stateVector = MatrixCalculator.actionOverVector(booleanMatrix, stateVector);
        }
        return stateVector;
    }

    public ComplexVector clickBack() {
        ComplexMatrix transBooleanMatrix = MatrixCalculator.transposedMatrix(booleanMatrix);
        stateVector = MatrixCalculator.actionOverVector(transBooleanMatrix, stateVector);
        return stateVector;
    }

    public ComplexVector clickBack(int n){
        ComplexMatrix transBooleanMatrix = MatrixCalculator.transposedMatrix(booleanMatrix);
        for (int i = 0; i < n; i++) {
            stateVector = MatrixCalculator.actionOverVector(transBooleanMatrix, stateVector);
        }
        return stateVector;
    }

}
