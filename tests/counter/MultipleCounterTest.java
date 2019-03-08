package counter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MultipleCounterTest {

    @Test
    public void shouldBeAbleToCountInTwos() {

        MultipleCounter counter = new MultipleCounter(2);

        counter.count();

        assertEquals(2, counter.getCount());

        ; // this should be 2

        counter.count();
        counter.count();
        counter.count();

        assertEquals(8, counter.getCount());

    }

    @Test
    public void shouldBeAbleToCountInSevens() {

        MultipleCounter counter = new MultipleCounter(7);

        counter.count();
        assertEquals(7, counter.getCount());

        counter.count();
        counter.count();
        counter.count();

        assertEquals(28, counter.getCount());

        // counter.getCount(); // this should be 28

    }

    @Test
    public void shouldBeAbleToHandleNoCount() {

        MultipleCounter counter = new MultipleCounter(7);

        assertEquals(0, counter.getCount());


    }

}
