class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int maxFreq = 0;
        int total = 0;

        for (int num : nums) {
            freq[num]++;
            int currentFreq = freq[num];

            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                total = currentFreq;
            } else if (currentFreq == maxFreq) {
                total += currentFreq;
            }
        }

        return total;
    }
}