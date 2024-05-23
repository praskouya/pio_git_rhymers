package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int MAX_CAPACITY = 12; 
    private static final int EMPTY = -1;
    private static final int MAX_INDEX = MAX_CAPACITY - 1;

    private final int[] numbers = new int[MAX_CAPACITY];

    private int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == MAX_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }
}
