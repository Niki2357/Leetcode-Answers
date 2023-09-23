class Solution {
    public static void main(String[] args){
        int num = 58;
        String output = intToRoman(num);
        System.out.println(output);
    }

    public static String timeString(String letter, int times){
        String answer = "";
        for(int i = 0; i < times; i++){
            answer += letter;
        }
        return answer;
    }

    public static String intToRoman(int num) {
        int M = num/1000;
        num %= 1000;
        int D = num/500;
        num %= 500;
        int C = num/100;
        num %= 100;
        int L = num/50;
        num %= 50;
        int X = num/10;
        num %= 10;
        int V = num/5;
        num %= 5;
        int I = num;
        String output = timeString("M", M);
        if (D == 1 && C == 4){
            output += "CM";
        } else if (D == 0 && C ==4){
            output += "CD";
        } else {
            output += timeString("D", D) + timeString("C", C);
        }
        if (L == 1 && X == 4){
            output += "XC";
        } else if (L == 0 && X ==4){
            output += "XL";
        } else {
            output += timeString("L", L) + timeString("X", X);
        }
        if (V == 1 && I == 4){
            output += "IX";
        } else if (V == 0 && I ==4){
            output += "IV";
        } else {
            output += timeString("V", V) + timeString("I", I);
        }
    

        return output;
    }
}