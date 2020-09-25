package ua.step.homework;

/**
 * Написать и методы работы с квадратными матрицами (матрицы
 * представить в виде двухмерных массивов). 
 * Должны присутствовать методы:
 * • создания единичной (диагональной) матрицы (метод createOne)
 * • создания нулевой матрицы (метод createNull)
 * • сложение матриц (метод sumMatrix)
 * • умножения матриц (метод productMatrix)
 * • умножение матрицы на скаляр (метод productMatrix)
 * • определение детерминанта матрицы (метод determinant)
 * • вывод матрицы на консоль (метод printMatrix)
 */
public class Task01 {

	public static void main(String[] args){
		printMatrix(createOne(5,5));
	}

	/**
	 * Создает единичную матрицу
	 * @param n - количество строк
	 * @param m - количество колонок
	 * @return единичную (диагональную) матрицу
	 */
	public static int[][] createOne (int n, int m) {
		int[][] matrix;
		matrix = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (j == i){
					matrix[i][j] = 1;
				}
			}
		}
		return matrix;
	}

	/**
	 * Создает нулевую матрицу
	 * @param n - количество строк
	 * @param m - количество колонок
	 * @return нулевую матрицу
	 */
	public static int[][] createNull (int n, int m) {
		return new int[n][m];
	}

	/**
	 * Вычисляет сумму двух матриц
	 * @param one - первая матрица
	 * @param two - вторая матрица
	 * @return сумму двух матриц
	 */
	public static int[][] sumMatrix(int[][] one, int[][] two) {
		int[][] array_summa;
		array_summa = new int[one.length, one.length];
		for (int i=0; i<one.length; i++){
			for (int j=0; j<one.length; j++){
				array_summa[i][j] = one[i][j] + two[i][j];
			}
		}
	}

	/**
	 * Вычисляет произведение двух матриц
	 * @param one - первая матрица
	 * @param two - вторая матрица
	 * @return произведение матриц
	 */
	public static int[][] productMatrix(int[][] one, int[][] two) {
		// TODO: удалите исключение и пишите здесь код
		throw new RuntimeException("Not implemented yet");
	}

	/**
	 * Вычисляет произведение матрицы на скаляр
	 * @param matrix - матрица
	 * @param num - скаляр
	 * @return произведение матрицы на скаляр
	 */
	public static int[][] productMatrix(int[][] matrix, int num) {
		// TODO: удалите исключение и пишите здесь код
		throw new RuntimeException("Not implemented yet");
	}

	/**
	 * Вычисляет детерминант матрицы
	 * @param matrix - матрица
	 * @return детерминант матрицы
	 */
	public static int determinant(int[][] matrix) {
		// TODO: удалите исключение и пишите здесь код
		throw new RuntimeException("Not implemented yet");
	}

	/**
	 * Печатает матрицу в стандартный поток вывода
	 * @param matrix - матрица
	 */
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
