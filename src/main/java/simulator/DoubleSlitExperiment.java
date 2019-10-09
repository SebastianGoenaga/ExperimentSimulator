package simulator;

import model.Complex;
import model.ComplexMatrix;

public class DoubleSlitExperiment {

    public static ComplexMatrix likelihood(int number) {
		int blancos = (number * 2) + 1;
		int matsize = 1 + number + blancos;
		double n1 = 1 / (float) number;
		double n2 = 1 / (float) 3;
		int total = number;
		ComplexMatrix mat1 = new ComplexMatrix(matsize, matsize);

		for (int i = 0; i < mat1.getN(); i++) {
			for (int j = 0; j < mat1.getM(); j++) {
				 mat1.addToMatrix(i, j, new Complex(0, 0));
			}
		}
		for (int i = 0; i < mat1.getN(); i++) {
			for (int j = 0; j < mat1.getM(); j++) {
                
				if (j > 0 && j <= number && i ==0) {
					mat1.addToMatrix(i, j, new Complex(n1, 0));
				}
				if (1 <= j && j <= number && i == 1) {
					int p = total;
					for (int z = 0; z < 3; z++) {
						mat1.addToMatrix(j + p, j, new Complex(n2, 0));
						p += 1;
					}
					total += 1;
				}
				if (i == j && i > number && j > number) {
					mat1.addToMatrix(i, j, new Complex(1, 0));
				}
			}
		}
		return mat1;

	}

	public static ComplexMatrix likelihood(int number, int r) {
		int rendijas = r;
		int blancos = (number * 2) + 1;
		int matsize = 1 + number + blancos;
		double n1 = 1 / (float) number;
		double n2 = 1 / (float) 3;
		int total = number;
		int count = 0;
		ComplexMatrix mat1 = new ComplexMatrix(matsize, matsize);

		for (int i = 0; i < mat1.getN(); i++) {
			for (int j = 0; j < mat1.getM(); j++) {
				 mat1.addToMatrix(i, j, new Complex(0, 0));
			}
		}
		for (int i = 0; i < mat1.getN(); i++) {
			for (int j = 0; j < mat1.getM(); j++) {
                
				if (j > 0 && j <= number && i ==0) {
					mat1.addToMatrix(i, j, new Complex(n1, 0));
				}
				if (1 <= j && j <= number && i == 1) {
					int p = total;
					for (int z = 0; z < 3; z++) {
						mat1.addToMatrix(j + p, j, new Complex(n2, 0));
						p += 1;
						count += rendijas + count;
					}
					total += 1;
				}
				if (i == j && i > number && j > number) {
					mat1.addToMatrix(i, j, new Complex(1, 0));
				}
			}
		}
		return mat1;

	}

}