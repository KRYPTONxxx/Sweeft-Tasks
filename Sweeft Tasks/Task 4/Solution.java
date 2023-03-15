public class Solution {

//                                             Variant I
    static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;

        StringBuilder result = new StringBuilder();
        int remainder = 0;


        while (i >= 0 || j >= 0){
            int sum = remainder;
            if (i >= 0){
                sum+= Integer.parseInt(String.valueOf(a.charAt(i)));
                i--;
            }
            if (j>=0){
                sum+= Integer.parseInt(String.valueOf(b.charAt(j)));
                j--;
            }
            remainder = sum / 2;
            result.append(sum % 2);
        }
        if (remainder > 0){
            result.append(remainder);
        }

        return result.reverse().toString();
    }





//                                          Variant II

    static String binaryString(String a, String b){
        String c = "";
        String last = "";
        int reminder = 0;

        if (a.length() > b.length()){
            int foradd = a.length() - b.length();
            while (foradd > 0){
                b = "0" + b;
                foradd -=1;
            }
        }
        else if (b.length() > a.length()) {
            int foradd = b.length() - a.length();
            while (foradd > 0){
                a = "0" + a;
                foradd -=1;
            }

        }

        for (int i = 1; i <= a.length(); i++){
            char aChar = a.charAt(a.length()-i);
            char bChar = b.charAt(b.length()-i);
            if (aChar == '1' && bChar == '1'){
                if(a.length()-i == 0 && reminder ==0){
                    c += "01";
                }
                else if(a.length()-i == 0 && reminder ==1){
                    c += "11";
                }

                else if(reminder ==1){
                    c+='1';
                }
                else {
                    c += "0";
                    reminder = 1;
                }
            }
            else if((aChar == '1' && bChar == '0') || (aChar == '0' && bChar == '1')){
                if (reminder == 1){
                    c+='0';
//                   reminder=0;
                }
                else {
                    c += '1';
                }
            }
            else {
                if (reminder == 1){
                    c+='1';
                    reminder=0;
                }
                else {
                    c += '0';
                }
            }
        }



        for (int j = 1; j <= c.length(); j++) {
            last += c.charAt(c.length() -j);
        }

        return last;

    }



}
