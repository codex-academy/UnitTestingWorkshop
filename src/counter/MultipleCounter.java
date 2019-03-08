package counter;

public class MultipleCounter {

    private int currentCount = 0;
    private int countInThisMultiple = 0;

    public MultipleCounter(int countInThisMultiple) {
        this.countInThisMultiple = countInThisMultiple;
    }

    public void count() {
        this.currentCount += this.countInThisMultiple;
    }

    public int getCount() {
        return this.currentCount;
    }
}
