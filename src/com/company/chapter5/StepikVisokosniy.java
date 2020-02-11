package com.company.chapter5;

// вам нужно отнять  выражение "кратен 100" от выражения "кратен 4" и к ним прибавить выражение "кратен 400".
public class StepikVisokosniy {

    public static int leapYearCount(int year) {
        int count = 0;

        for (int i = 0; i < year+1 ; i++) {
            if (i != 0){
               if (i % 4 == 0 && i % 100 != 0){
                   count++;
               }else {if (i%400 == 0){count++;}}
            }

        }
        return count;
    }



    public static void main(String[] args) {
            StepikVisokosniy stepikVisokosniy = new StepikVisokosniy();
        System.out.println(leapYearCount(100));

    }
}