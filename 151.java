class Solution {
    public static void main(String[] args){
        String s = "hello world";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        s = s.trim();
        int firstPointer = s.length()-1;
        int lastPointer = s.length()-1;

        String output = "";
        while (firstPointer >= 0){
            System.out.println(s.substring(firstPointer,firstPointer+1));
            if (! s.substring(firstPointer,firstPointer+1).equals(" ") && (firstPointer ==0 || s.substring(firstPointer-1,firstPointer).equals(" "))){
                output += s.substring(firstPointer,lastPointer+1) + " ";
                
                firstPointer -= 2;
                lastPointer = firstPointer;
            } else if (s.substring(firstPointer,firstPointer+1).equals(" ")){
                firstPointer -= 1;
                lastPointer -= 1;
            } else {
                firstPointer -= 1;
            }
        }
        output = output.trim();
        return output;
    }
}