import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;



public class Scrabble  {

    public static void main(String[] args) {
        System.out.println("Enter a word");

        Map<String, Integer> wordsAndNumbers = new HashMap<String, Integer>();

        wordsAndNumbers.put("a",1);
        wordsAndNumbers.put("e",1);
        wordsAndNumbers.put("i",1);
        wordsAndNumbers.put("o",1);
        wordsAndNumbers.put("u",1);
        wordsAndNumbers.put("l",1);
        wordsAndNumbers.put("n",1);
        wordsAndNumbers.put("r",1);
        wordsAndNumbers.put("s",1);
        wordsAndNumbers.put("t",1);
        wordsAndNumbers.put("d",2);
        wordsAndNumbers.put("g",2);
        wordsAndNumbers.put("b",3);
        wordsAndNumbers.put("c",3);
        wordsAndNumbers.put("m",3);
        wordsAndNumbers.put("p",3);
        wordsAndNumbers.put("f",4);
        wordsAndNumbers.put("h",4);
        wordsAndNumbers.put("v",4);
        wordsAndNumbers.put("w",4);
        wordsAndNumbers.put("y",4);
        wordsAndNumbers.put("k",5);
        wordsAndNumbers.put("j",8);
        wordsAndNumbers.put("x",8);
        wordsAndNumbers.put("q",10);
        wordsAndNumbers.put("z",10);





        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String inputString = bufferedReader.readLine();

//            System.out.println(wordsAndNumbers.get(inputString));

            char[] inputCharArray = inputString.toCharArray();
            Integer score = 0;




            for (char indvChar : inputCharArray) {

//                String temp = Character.toString(indvChar);
//                System.out.println(temp);
//
//
//                System.out.println(wordsAndNumbers.get(temp));
                score = score + wordsAndNumbers.get(Character.toString(indvChar));

//                System.out.print();

//                System.out.print(wordsAndNumbers.get(Character.toString(indvChar)));


            }
            System.out.println(score);

//            int sum = 0;
//
//            for(int x=0; x<inputCharArray.length; x++) {
//
//                String stringArray = new String(inputCharArray);
//
//                System.out.println(stringArray);
//
//                sum += wordsAndNumbers.get(stringArray);
//            }


//            int i;
//
//            for (i = 0; i < inputChar.length; i++) {
//                System.out.print(inputChar.charAt(i));
//            }





//            System.out.println(inputChar);

//            System.out.println(wordsAndNumbers.get(inputChar));



        }



        catch(IOException e)
        {
            e.printStackTrace();
        }
    }


    }

