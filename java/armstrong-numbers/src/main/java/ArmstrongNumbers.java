class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		int count = 0;
		int number = numberToCheck;
		while (numberToCheck > 0){

			numberToCheck = numberToCheck / 10;
			count ++;

		}

        numberToCheck = number;


        double powerOf = 0;
		while (numberToCheck > 0){


			powerOf += Math.pow(numberToCheck % 10, count);
			numberToCheck = numberToCheck/10;

		}

		if( powerOf == number){ return true;}

		else {return false;}







	}

}

