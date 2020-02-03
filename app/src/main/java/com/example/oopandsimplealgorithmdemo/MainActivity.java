package com.example.oopandsimplealgorithmdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int listArr [] = {1,56,1,3,45,56,56,7,32,1,56};
        int arrL = listArr.length;
        int armie = 153;

        Log.d("TAG",Integer.toString(intSearch(listArr,arrL)));
        Log.d("TAG",Boolean.toString(armstrongChecker(armie)));
    }

    //// Check for most repeated INT

    int intSearch (int listArr[], int arrL){

        Map<Integer,Integer> numHash = new HashMap<Integer,Integer>();

        for(int i = 0; i < arrL; i++){

            int repeater = listArr[i];

            if (numHash.containsKey(repeater)){

                int howMany = numHash.get(repeater);
                howMany++;
                numHash.put(repeater,howMany);

            }
            else {

                numHash.put(repeater,1);
            }


        }
        int max = 0, res = -1;
        for(Map.Entry<Integer, Integer> hashVal : numHash.entrySet())
        {
            if (max < hashVal.getValue())
            {
                res = hashVal.getKey();
                max = hashVal.getValue();
            }
        }

        return res;


    }

    boolean armstrongChecker(int number){
       Integer compareNum = 0;
       String newNum = Integer.toString(number);
       int [] converter = new int[newNum.length()];
       int[] comparingArry = new int [converter.length];

       for (int i = 0; i < converter.length; i++)
       {
           converter[i] = newNum.toCharArray()[i] - '0';
           comparingArry[i] = (int) Math.pow(converter[i],converter.length);
           compareNum += comparingArry[i];

       }
       if(compareNum == number){

           return true;
       }
       else{

           return false;
       }








    }
}
