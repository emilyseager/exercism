import java.util.*;

class RnaTranscription {


    Map<String, String> dnaToRna = new HashMap<String, String>();

    {
        dnaToRna.put("G", "C");
        dnaToRna.put("C", "G");
        dnaToRna.put("T", "A");
        dnaToRna.put("A", "U");
    }

    String transcribe(String dnaStrand) {

        String RNA = "";

        for (int i=0;i<dnaStrand.length();i++){

            String newChar = "";
            newChar = newChar + dnaStrand.charAt(i);
            RNA = RNA + dnaToRna.get(newChar);

        }

        return RNA;

    }



    }
