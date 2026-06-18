class Solution {
    public double angleClock(int hour, int minutes) {
        double h = (30 * hour)+(0.5 * minutes);
        double m = 6 * minutes;
        double angle = Math.abs(h-m);
        double ans = Math.min(angle,360-angle);

        return ans;
    }
}