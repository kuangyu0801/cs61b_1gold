import static org.junit.Assert.*;
import org.junit.Test;
public class TestArrayDequeGold {

    public void testGetAndSize(ArrayDequeSolution ads,StudentArrayDeque sad) {
        int expected = ads.size();
        int actual = sad.size();
        //Integer intExpected;
        Integer intActual;
        Integer intExpected;

        assertEquals("size() error!", expected, actual);

        if(sad.size() != 0 && ads.size() !=0) {
            int randomIndex = StdRandom.uniform(sad.size());
            intExpected = (Integer) sad.get(randomIndex);
            intActual = (Integer) sad.get(randomIndex);
            assertEquals("get() error", intExpected, intActual);
        }
    }

    @Test
    public void randomCompare() {
        StudentArrayDeque<Integer> sad1 = new StudentArrayDeque<>();
        ArrayDequeSolution<Integer> ads1 = new ArrayDequeSolution<>();
        int expected;
        int actual;
        Integer intExpected;
        Integer intActual;
        for (int i = 0; i < 100; i+= 1) {
            int numberBetweenZeroAndOne = StdRandom.uniform(2);
            switch (numberBetweenZeroAndOne) {
                case 0: //addFirst
                    sad1.addFirst(i);
                    ads1.addFirst(i);
                    System.out.println("addFirst(" + i + ")");
                    break;
                case 1: //addLast
                    sad1.addLast(i);
                    ads1.addLast(i);
                    System.out.println("addLast(" + i + ")");
                    break;
            }
        }
        for (int i = 0; i < 100; i+= 1) {
            int numberBetweenZeroAndOne = StdRandom.uniform(2);
            switch (numberBetweenZeroAndOne) {
                case 0: //removeFirst
                    if(sad1.size() != 0 && ads1.size() !=0) {
                        intExpected =  sad1.removeFirst();
                        intActual = ads1.removeFirst();
                        System.out.println("removeFirst()");
                        assertEquals("removeLast()", intExpected, intActual);
                    }
                    break;
                case 1: //removeLast
                    if(sad1.size() != 0 && ads1.size() !=0) {
                        intExpected = sad1.removeLast();
                        intActual = ads1.removeLast();
                        System.out.println("removeLast()");
                        assertEquals("removeLast()", intExpected, intActual);
                    }
                    break;
            }
        }

        for (int i = 0; i < 100000; i+= 1) {
            int numberBetweenZeroAndFour = StdRandom.uniform(4);
            switch (numberBetweenZeroAndFour) {
                case 0: //addFirst
                    sad1.addFirst(i);
                    ads1.addFirst(i);
                    System.out.println("addFirst(" + i + ")");
                    break;
                case 1: //addLast
                    sad1.addLast(i);
                    ads1.addLast(i);
                    System.out.println("addLast(" + i + ")");
                    break;
                case 2: //removeFirst
                    if(sad1.size() != 0 && ads1.size() !=0) {
                        intExpected =  sad1.removeFirst();
                        intActual = ads1.removeFirst();
                        System.out.println("removeFirst()");
                        assertEquals("removeLast(" + i + ")", intExpected, intActual);
                    }
                    break;
                case 3: //removeLast
                    if(sad1.size() != 0 && ads1.size() !=0) {
                        intExpected = sad1.removeLast();
                        intActual = ads1.removeLast();
                        System.out.println("removeLast()");
                        assertEquals("removeLast(" + i + ")", intExpected, intActual);
                    }
                    break;
            }
        }
    }
}
