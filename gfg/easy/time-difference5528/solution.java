class Solution {
    public String timeGap(String st, String et) {
        int stSeconds = parseToSeconds(st);
        int etSeconds = parseToSeconds(et);

        int diffSeconds = etSeconds - stSeconds;
        if (diffSeconds < 0) {
            diffSeconds += 24 * 3600;
        }

        int hrs = diffSeconds / 3600;
        int mins = (diffSeconds % 3600) / 60;
        int secs = diffSeconds % 60;

        return String.format("%02d:%02d:%02d", hrs, mins, secs);
    }

    private int parseToSeconds(String time) {
        String[] parts = time.split(":");
        int h = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int s = Integer.parseInt(parts[2]);
        return h * 3600 + m * 60 + s;
    }
}