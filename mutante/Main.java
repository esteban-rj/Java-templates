
import java.util.Arrays;

public class Main {

    // function to traspose matrix
    public static String[][] trasposeMatrix(String[][] matrix) {
        String[][] matrixTraspose = new String[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrixTraspose[j][i] = matrix[i][j];
            }
        }

        return matrixTraspose;
    }

    // function to create diagonal matrix
    public static String[][] rotateMatrix45(String[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int diagonal = rows + cols - 1;

        String[][] matrixRotate = new String[diagonal][diagonal];

        for (int i = 0; i < diagonal; i++) {
            for (int j = 0; j < diagonal; j++) {
                matrixRotate[i][j] = " ";
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixRotate[i + j][j] = matrix[i][j];
            }
        }

        return matrixRotate;
    }
    //  make mirror of the matrix
    public static String[][] mirrorMatrix(String[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        String[][] matrixMirror = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixMirror[i][j] = matrix[i][cols - j - 1];
            }
        }

        return matrixMirror;
    }

    public static void main(String[] args) {
        String[] entry = {
            "ATGCGA",
            "CAGTGC",
            "TTATGT",
            "AGAAGG",
            "CCCCTA",
            "TCACTG"
        };

        String[] dna = {
            "AAAA",
            "TTTT",
            "CCCC",
            "GGGG",
        };

        var dNAMatrix = Arrays.stream(dna).map(mapper -> mapper.split("")).toArray(String[][]::new);


        String[][] matrix = Arrays.stream(entry).map(mapper -> mapper.split("")).toArray(String[][]::new);
        String[][] matrixTraspose = trasposeMatrix(matrix);
        String[][] matrixRotate = rotateMatrix45(matrix);
        String[][] matrixRotateInverse = rotateMatrix45(mirrorMatrix(matrix));

        // check if there is a sequence of DNA in the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < dNAMatrix.length; k++) {
                    if (j <= matrix[i].length - dNAMatrix[k].length) {
                        if (Arrays.equals(Arrays.copyOfRange(matrix[i], j, j + dNAMatrix[k].length), dNAMatrix[k])) {
                            System.out.println("DNA found in the matrix:"+ Arrays.toString(dNAMatrix[k]));
                        }
                    }
                }
            }
        }

        for (int i = 0; i < matrixTraspose.length; i++) {
            for (int j = 0; j < matrixTraspose[i].length; j++) {
                for (int k = 0; k < dNAMatrix.length; k++) {
                    if (j <= matrixTraspose[i].length - dNAMatrix[k].length) {
                        if (Arrays.equals(Arrays.copyOfRange(matrixTraspose[i], j, j + dNAMatrix[k].length), dNAMatrix[k])) {
                            System.out.println("DNA found in the matrix traspose:"+ Arrays.toString(dNAMatrix[k]));
                        }
                    }
                }
            }
        }

        for (int i = 0; i < matrixRotate.length; i++) {
            for (int j = 0; j < matrixRotate[i].length; j++) {
                for (int k = 0; k < dNAMatrix.length; k++) {
                    if (j < matrixRotate[i].length - dNAMatrix[k].length) {
                        if (Arrays.equals(Arrays.copyOfRange(matrixRotate[i], j, j + dNAMatrix[k].length), dNAMatrix[k])) {
                            System.out.println("DNA found in the matrix rotate:"+ Arrays.toString(dNAMatrix[k]));
                        }
                    }
                }
            }
        }

        for (int i = 0; i < matrixRotateInverse.length; i++) {
            for (int j = 0; j < matrixRotateInverse[i].length; j++) {
                for (int k = 0; k < dNAMatrix.length; k++) {
                    if (j < matrixRotateInverse[i].length - dNAMatrix[k].length) {
                        if (Arrays.equals(Arrays.copyOfRange(matrixRotateInverse[i], j, j + dNAMatrix[k].length), dNAMatrix[k])) {
                            System.out.println("DNA found in the matrix rotate inverse:"+ Arrays.toString(dNAMatrix[k]));
                        }
                    }
                }
            }
        }


    }

}