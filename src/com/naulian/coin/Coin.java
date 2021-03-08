package com.naulian.coin;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Coin {
    private static final String HEAD="head";
    private static final String TAIL="tail";

    Coin(){

    }

    void flip(){
        int random=new  Random().nextInt(2);
        if (random==0){
            System.out.println(HEAD);
        }else {
            System.out.println(TAIL);
        }
    }

    void flip(int count){
        List<String> headCount=new ArrayList<>();
        List<String> tailCount= new ArrayList<>();
        int i=0;
        while(i<count){
            int random = new Random().nextInt(2);
            if (random == 0) {
                System.out.println(HEAD);
                headCount.add(HEAD);
            } else {
                System.out.println(TAIL);
                tailCount.add(TAIL);
            }
            i++;
        }
        int headSize=headCount.size();
        System.out.println(headSize);
        int tailSize=tailCount.size();
        System.out.println(tailSize);

        float headPercent = (headSize/ (float) count) *100;
       float tailPercent= (tailSize/ (float) count) *100;

       String headString = new DecimalFormat("##.#").format(headPercent);
       String tailString = new DecimalFormat("##.#").format(tailPercent);
        System.out.println(headString+"% is Head \n"+tailString+"% is Tail");
    }
}
