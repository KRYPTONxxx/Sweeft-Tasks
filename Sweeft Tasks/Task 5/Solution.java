public class Solution {
    int countVariants(int stearsCount){

        Integer[] stears = new Integer[stearsCount];

        if(stearsCount<=0){
            System.out.println("stears have to be upper zero");

        }

        if(stearsCount==1){
            return 1;
        }

        stears[0] = 1;
        stears[1] = 2;

        for (int i = 2; i < stearsCount; i++) {
            stears[i] = stears[i-1] + stears[i-2];

        }


        return stears[stearsCount-1];
    }


}
