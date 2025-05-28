public class Timer {
    private ClockHand seconds;
    private ClockHand tenths;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.tenths = new ClockHand(100);
    }
    
    public void advance() {
        this.tenths.advance();
        if (this.tenths.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return seconds + ":" + tenths;
    }
}
