class Solution {
    public static void main(String[] args){
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(numbers, target);
        System.out.println(result);
    }
    

    public static int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2;
        int[] result = new int[2];
        while (index1 < numbers.length){
            index2 = index1 + 1;
            if (index1 == 0 || numbers[index1] != numbers[index1 - 1]){
                while (index2 < numbers.length){
                    if (numbers[index1] + numbers[index2] == target){
                        result[0] = index1 + 1;
                        result[1] = index2 + 1;
                        break;
                    } else {
                        index2++;
                    }
                }
            }
            index1 += 1;
        }
        return result;
    }
}