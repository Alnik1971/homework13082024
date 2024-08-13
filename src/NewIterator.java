import java.util.Iterator;
import java.util.Random;

public class NewIterator implements Iterator<Integer> {
    protected int min;
    protected int max;
    protected Random random;

    public NewIterator(Randoms randoms) {
        this.random = randoms.random;
        this.max = randoms.max;
        this.min = randoms.min;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return this.random.nextInt(this.max - this.min + 1) + this.min;
    }

}
