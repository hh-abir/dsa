public class ZigZag {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 6, 10 },
                { 2, 5, 9, 13 },
                { 4, 8, 12, 15 },
                { 7, 11, 14, 16 }
        };
            for (int x = 0; x < matrix[0].length; x++) {
                System.out.println(matrix[x][0]);
                matrix[x][0] = 0;
                for (int i = x-1; i >= 0; i--) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (matrix[i][j] != 0){
                            System.out.println(matrix[i][j]);
                            matrix[i][j] = 0;
                            break;
                        }
                    }
                }
            }
            for (int x = 1; x < matrix.length; x++) {
                System.out.println(matrix[matrix.length-1][x]);
                matrix[matrix.length-1][x] = 0;
                for (int i = matrix.length-2; i >= 0; i--) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (matrix[i][j] != 0){
                            System.out.println(matrix[i][j]);
                            matrix[i][j] = 0;
                            break;
                        }
                    }
                }
            }
    }
}