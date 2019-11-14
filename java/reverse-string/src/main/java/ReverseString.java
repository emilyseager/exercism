class ReverseString {

    String reverse(String inputString) {

        String emptystring = "";

        for (int i = inputString.length(); i > 0; i-- ){


            System.out.println(inputString.length());

            emptystring =  emptystring + inputString.charAt(i-1);

        }


    return emptystring;


    }
  
}

