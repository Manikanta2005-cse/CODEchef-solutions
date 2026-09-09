public static String findLargestOddSubstring(String num) {
        // Start from the end and find the last odd digit
        int i;
        for (i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if ((ch - '0') % 2 != 0) { // Check if digit is odd
                break;
            }
        }

        if (i == -1) {
            // No odd digit found
            return "-1";
        } else {
            // Return substring from start to the last odd digit
            return num.substring(0, i + 1);
        }
    }

