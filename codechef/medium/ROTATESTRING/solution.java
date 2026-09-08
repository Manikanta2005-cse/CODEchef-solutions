public static boolean canRotate(String s, String goal) {
        if (s.length() != goal.length()) return false;
        String doubled = s + s; // Concatenate s with itself
        return doubled.contains(goal);
    }