public class Array2DExplorer {

    public static void main(String[] args) {
        int array [][] = {  {4,1,8,5},
                {0,2,3,4},
                {6,6,2,2} };
        Array2DExplorer exp = new Array2DExplorer();

        System.out.println("Test evenRow: \n Row w/ odd, Expecting: false \n Actual: " + exp.evenRow(array,0));
        System.out.println("Test evenRow: \n Row w/o odd, Expecting: true \n Actual: " + exp.evenRow(array,2));

        System.out.println();

        System.out.println("Test oddColSum: \n Col w/ odd Sum, Expecting: true \n Actual: " + exp.oddColSum(array,1));
        System.out.println("Test oddColSum: \n Col w/ even, Expecting: false \n Actual: " + exp.oddColSum(array,0));

        System.out.println();


        System.out.print("Test minRow: \n Expecting: {0 2 3 4} \n Actual: {");
        int [] row = exp.minRow(array);
        for(int i = 0; i < row.length; i++){
            System.out.print(row[i] + " ");
        }
        System.out.print("}");

    }

    //WRITE YOUR METHODS BELOW

    //returns true if all the numbers in the given row are even
    public boolean evenRow(int [][] mat, int row){
        for (int i = 0; i < mat[row].length; i++){
            if (!(mat[row][i] % 2 == 0)){
                return false;
            }
        }
        return true;
    }

    //returns true if the sum of the numbers the given col is odd.
    public boolean oddColSum(int[][] nums, int col){
        int sum = 0;
        for (int i = 0; i < nums[col].length; i++){
            sum += nums[col][i];
        }
        if (sum % 2 == 0){
            return false;
        } else {
            return true;
        }
    }

    //returns 1D array of the row in nums with the smallest int
    public int[] minRow(int [][] mat){
        int[] arr = new int[mat[0].length];

        int currentLowIndex = 0;
        int currentLow = mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            for (int a : mat[i]){
                if (a < currentLow){
                    currentLow = a;
                    currentLowIndex = i;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = mat[currentLowIndex][i];
        }

        return arr;
    }

    //looks through each element of the chosen row and returns the smallest integer from that row
    public int minRow(int[][] nums, int row){
        int currentLow = nums[row][0];
        for (int i = 0; i < nums[row].length; i++) {
            if (nums[row][i] < currentLow){
                currentLow = nums[row][i];
            }
        }
        return currentLow;
    }

    //searches through each column of an array and returns an array with the largest integer from each column
    public int[] colMaxs(int[][] matrix){
        int[] arr = new int[matrix[0].length];
        for (int j = 0; j < matrix[0].length; j++) {
            int high = matrix[0][j];
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] > high){
                    high = matrix[i][j];
                }
            }
            arr[j] = high;
        }
        return arr;
    }

    //calculates the row sum for every row and returns each of the values in an array. Index i of the return array contains the sum of elements in row i
    public int[] allRowSums(int[][] data){
        int[] arr = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            int sum = 0;
            for (int j = 0; j < data[i].length; j++) {
                sum += data[i][j];
            }
            arr[i] = sum;
        }
        return arr;
    }

    //calculates the average of each column in the array nums, and returns those values in an array of doubles
    public double[] averageCol(int[][] nums){
        double[] arr = new double[nums[0].length];
        for (int i = 0; i < nums[0].length; i++) {
            double sum = 0;
            for (int j = 0; j < nums.length; j++) {
                sum += nums[j][i];
            }
            arr[i] = sum/nums.length;
        }
        return arr;
    }

    //finds and returns the smallest even number in the array matrix. Assume that the array is filled with only positive ints
    public int smallEven(int[][] matrix){

    }

    //returns the row index number that has the greatest sum of its elements.
    public static int biggestRow(int[][] nums){

    }




}

