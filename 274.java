class Solution {
    public static int hIndex(int[] citations) {
        int h = citations.length;
        for (int count = h; count > 0; count--) {
            for (int i = 0; i < count - 1; i++) {
                if (citations[i] == citations [i+1]) {
                    int temp = citations[i];
                    citations[i] = citations[i+1];
                    citations[i+1] = temp;
                }
            }
        }
        while (h>0) {
            int count = 0;
            for (int citation : citations) {
                if (citation >= h) {
                    count++;
                }
                if (count >= h) {
                    return h;
                }

            }
            h--;
        }
        return 0;

    }

    public static void main(String[] args) {
        int[] citations = {3,0,1,5,6};
        System.out.println(hIndex(citations));
    }
}

