
class Matrix {
    private int[][] matrix;

    Matrix(String matrixAsString) {

        //String matrixAsString = "1 2 3\n4 5 6\n7 8 9\n8 7 6";
        String[] stringRows = matrixAsString.split("\n");
        matrix = new int[stringRows.length][];

        for (int i = 0; i < stringRows.length; i++) {

            String[] stringCols = stringRows[i].split("\\s");
            int[] row = new int[stringCols.length];

            for (int j = 0; j < stringCols.length; j++) {

                row[j] = Integer.parseInt(stringCols[j]);

            }
            matrix[i] = row;
        }

    }

    int[] getRow(int rowNumber) {

        return matrix[rowNumber-1];
    }

    int[] getColumn(int columnNumber) {
        int[] col = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {

            col[i] = matrix[i][columnNumber-1];

        }
        return col;
    }


}




