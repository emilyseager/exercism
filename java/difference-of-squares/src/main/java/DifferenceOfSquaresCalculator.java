
class DifferenceOfSquaresCalculator {
    int squareOfSum ;
    int nSquared;

    int sumOfSquares;
    //int n = 0 ;
    int computeSquareOfSumTo(int input) {
        int sum=0;
        for(int m = 1; m <= input; m ++){

            sum += m;
            squareOfSum = (int) Math.pow(sum,2);

        }
        return squareOfSum;

    }

    int computeSumOfSquaresTo(int input) {
    int sumOfSquares = 0;
        for(int n = 1; n<= input; n ++){

            nSquared = (int) Math.pow(n,2);
            sumOfSquares += nSquared;

        }

        return sumOfSquares;
    }

    int computeDifferenceOfSquares(int input) {


        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
