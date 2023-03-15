public class Solution {

    int notContains(int[] arr){
        int min = 1;
        int counter = 0;

        while (counter <= arr.length) {
            counter++;
            for (int i : arr) {
                if (min == i) {
                    min++;
                    break;
                }

            }
        }
        return min;

    }

}
