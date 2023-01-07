package lap03;

import java.util.Random;

public class Matrix {
	// Method signatures
	public static void createRandomMatrix(int[][] matrix) {
		Random random = new Random();
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = random.nextInt(25);
//				matrix[row][col] = (int) (Math.random() * 100 -50) + 50;
			}
		}
	}

	public static int[][] createRandomMatrix(int rows, int cols) {
		Random random = new Random();
		int[][] matrix = new int[rows][cols];
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				matrix[row][col] = random.nextInt(25);
			}
		}
		return matrix;
	}

	public static void print(int[][] matrix) {
		if (matrix == null) System.out.println("null");
		else {
			for (int row = 0; row < matrix.length; row++) {
				for (int col = 0; col < matrix[row].length; col++) {
					System.out.print(matrix[row][col] + " ");
				}
				System.out.println();
			}
		}
	}

	public static void print(double[][] matrix) {
		if (matrix == null) System.out.println("null");
		else {
			for (int row = 0; row < matrix.length; row++) {
				for (int col = 0; col < matrix[row].length; col++) {
					System.out.printf("%.2f ", matrix[row][col]);
				}
				System.out.println();
			}
		}
	}

	// Used in add(), subtract()
	public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
		return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
	}

	public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
		return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
	}

	public static int[][] add(int[][] matrix1, int[][] matrix2) {
		if (haveSameDimension(matrix1, matrix2)) {
			int[][] sum = new int[matrix1.length][matrix1[0].length];
			for (int row = 0; row < matrix1.length; row++) {
				for (int col = 0; col < matrix1[row].length; col++) {
					sum[row][col] = matrix1[row][col] + matrix2[row][col];
				}
			}
			return sum;
		} else return null;
	}

	public static double[][] add(double[][] matrix1, double[][] matrix2) {
		if (haveSameDimension(matrix1, matrix2)) {
			double[][] sum = new double[matrix1.length][matrix1[0].length];
			for (int row = 0; row < matrix1.length; row++) {
				for (int col = 0; col < matrix1[row].length; col++) {
					sum[row][col] = matrix1[row][col] + matrix2[row][col];
				}
			}
			return sum;
		} else return null;
	}

	public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
		if (haveSameDimension(matrix1, matrix2)) {
			int[][] subtract = new int[matrix1.length][matrix1[0].length];
			for (int row = 0; row < matrix1.length; row++) {
				for (int col = 0; col < matrix1[row].length; col++) {
					subtract[row][col] = matrix1[row][col] - matrix2[row][col];
				}
			}
			return subtract;
		} else return null;
	}

	public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
		if (haveSameDimension(matrix1, matrix2)) {
			double[][] subtract = new double[matrix1.length][matrix1[0].length];
			for (int row = 0; row < matrix1.length; row++) {
				for (int col = 0; col < matrix1[row].length; col++) {
					subtract[row][col] = matrix1[row][col] - matrix2[row][col];
				}
			}
			return subtract;
		} else return null;
	}

	public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
		if (matrix1[0].length == matrix2.length) {
			int row = matrix1.length;
			int col = matrix2[0].length;
			int[][] result = new int[row][col];

			for (int rowIdx = 0; rowIdx < row; rowIdx++) {
				for (int colIdx = 0; colIdx < col; colIdx++) {
					for (int i = 0; i < matrix1[0].length; i++) {
						result[rowIdx][colIdx] += matrix1[rowIdx][i] * matrix2[i][colIdx];
					}
				}
			}
			return result;
		} else return null;
	}

	public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
		if (matrix1[0].length == matrix2.length) {
			int row = matrix1.length;
			int col = matrix2[0].length;
			double[][] result = new double[row][col];

			for (int rowIdx = 0; rowIdx < row; rowIdx++) {
				for (int colIdx = 0; colIdx < col; colIdx++) {
					for (int i = 0; i < matrix1[0].length; i++) {
						result[rowIdx][colIdx] += (matrix1[rowIdx][i] * matrix2[i][colIdx]);
					}
				}
			}
			return result;
		} else return null;
	}

	public static void main(String[] args) {

		// Integer matrix
		int[][] intMatrix1 = new int[3][3];
		createRandomMatrix(intMatrix1);
		int[][] intMatrix2 = createRandomMatrix(3, 2);


		System.out.println("(*) Integer matrix: ");
		System.out.println("\nMatrix 1: ");
		print(intMatrix1);
		System.out.println("\nMatrix 2: ");
		print(intMatrix2);
		System.out.println("\nMatrix 1 have same dimension matrix 2: " + haveSameDimension(intMatrix1, intMatrix2));
		System.out.println("\nSum: ");
		print(add(intMatrix1, intMatrix2));
		System.out.println("\nMinus: ");
		print(subtract(intMatrix1, intMatrix2));
		System.out.println("\nMultiply: ");
		print(multiply(intMatrix1, intMatrix2));

		// Double matrix
		double[][] doubleMatrix1 = {{1.1, 2.2, 3.3}, {0.0, 1.1, 2.1}, {3.1, 1.5, 1.9}};
		double[][] doubleMatrix2 = {{1.5, 1.5, 1.5}, {0.2, 0.1, 0}, {1.1, 0.0, 0.0}};

		System.out.println("\n(*) Double matrix: ");
		System.out.println("\nMatrix 1: ");
		print(doubleMatrix1);
		System.out.println("\nMatrix 2: ");
		print(doubleMatrix2);
		System.out.println("\nMatrix 1 have same dimension matrix 2: " + haveSameDimension(doubleMatrix1, doubleMatrix2));
		System.out.println("\nSum: ");
		print(add(doubleMatrix1, doubleMatrix2));
		System.out.println("\nMinus: ");
		print(subtract(doubleMatrix1, doubleMatrix2));
		System.out.println("\nMultiply: ");
		print(multiply(doubleMatrix1, doubleMatrix2));
	}
}