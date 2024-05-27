class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int[] newFlowerbed = new int[flowerbed.length + 2];
        for (int i = 0; i < flowerbed.length; i++) {
            newFlowerbed[i + 1] = flowerbed[i];
        }
        // count consecutive 0s length
        int i = 0;
        int count = 0;
        int flowerCount = 0;
        while (i < newFlowerbed.length) {
            count = 0;
            if (newFlowerbed[i] == 0) {
                count++;
                while (i + 1 < newFlowerbed.length && newFlowerbed[i + 1] == 0) {
                    count++;
                    i++;
                }
                if (count >= 3) {
                    if (count % 2 == 0) {
                        count--;
                    }
                    flowerCount += count/2;
                }
            }
            i++;
        }
        if (flowerCount >= n) {
            return true;
        } else {
            return false;
        }
    }
}