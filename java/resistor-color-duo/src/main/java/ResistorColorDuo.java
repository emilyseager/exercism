class ResistorColorDuo {


    String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};



    int colorCode(String color) {
        //int location =;
        for (int i =0 ; i< colors.length; i++){

            if (colors[i] == color ){
                return  i;

            }


        }
        return 0;
    }

    public String[] colors() {


        return colors;
    }

    int value(String[] colors) {
        String count = "";
        for (int i=0; i<2;i++) {
            count = count + colorCode(colors[i]);

        }
        return Integer.parseInt(count);


    }

}