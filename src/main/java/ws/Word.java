package ws;

/**
 * Created by Steti on 6/17/2017.
 */
public class Word {

    private final long id;
    private final String content;
    private long counter;

    public Word(Long id, String word) {
        this.id = id;
        this.content = word;
        this.counter = 1;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public long getCounter() {
        return counter;
    }

    public void setCounter(long counter) {
        this.counter = counter;
    }
}
