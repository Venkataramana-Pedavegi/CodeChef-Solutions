class Solution {
    public String timeGap(String st, String et) {
        // code here
        String[] start = st.split(":");
                String[] end = et.split(":");

                int startSeconds = Integer.parseInt(start[0]) * 3600
                                 + Integer.parseInt(start[1]) * 60
                                 + Integer.parseInt(start[2]);

                int endSeconds = Integer.parseInt(end[0]) * 3600
                               + Integer.parseInt(end[1]) * 60
                               + Integer.parseInt(end[2]);

                int diff = endSeconds - startSeconds;

                int hours = diff / 3600;
                diff %= 3600;

                int minutes = diff / 60;
                int seconds = diff % 60;

                return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}