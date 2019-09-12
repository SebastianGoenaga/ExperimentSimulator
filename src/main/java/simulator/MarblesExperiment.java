package simulator;

import model.Complex;
import model.ComplexMatrix;

public class MarblesExperiment {

    ComplexMatrix booleanMatrix;

    public MarblesExperiment(int n) {
        booleanMatrix = new ComplexMatrix(n, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                booleanMatrix.addToMatrix(i, j, new Complex(0, 0));
            }
        }
    }

    public void  setRelation(int i, int j) {
        if (booleanMatrix.getElement(i, j).getpReal() == 1) {
            booleanMatrix.addToMatrix(i, j, new Complex(0, 0));
        } else if (booleanMatrix.getElement(i, j).getpReal() == 0) {
            booleanMatrix.addToMatrix(i, j, new Complex(1, 0));
        }
    }


}
