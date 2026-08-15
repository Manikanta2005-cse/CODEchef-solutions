public static int longestPalindromeLength(String s) {
    // write your code here 
    Map<Character, Integer> freq = new HashMap<>();
    for (char ch : s.toCharArray()) {
        freq.put(ch, freq.getOrDefault(ch, 0) + 1);
    }
    
    int length = 0;
    boolean oddFound = false;
    for (int count : freq.values()) {
        if (count % 2 == 0) {
            length += count;
        } else {
            length += count - 1;
            oddFound = true;
        }
    }
    if (oddFound) {
        length += 1;
    }
    return length;
}
