class Solution {
    static String findDay(int Day, int Month, int Year) {
        // Code Here
        Calendar cal = Calendar.getInstance();

               cal.set(Year, Month - 1, Day);

               String[] days = {
                   "SUNDAY",
                   "MONDAY",
                   "TUESDAY",
                   "WEDNESDAY",
                   "THURSDAY",
                   "FRIDAY",
                   "SATURDAY"
               };

               return days[cal.get(Calendar.DAY_OF_WEEK) - 1];
    }
}