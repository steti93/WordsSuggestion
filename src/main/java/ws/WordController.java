package ws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Steti on 6/17/2017.
 */
@RestController
public class WordController {
    ArrayList<Word> allWords = new ArrayList<Word>();
    AtomicLong id = new AtomicLong();

    @RequestMapping("/word")
    public Word getWord(@RequestParam(value = "name", defaultValue = "Hello") String name) {
        Word word = new Word(id.incrementAndGet(),name);
        allWords.add(word);
        return word;
    }

    @RequestMapping("/words")
    public ArrayList<Word> getAllWords(WebRequest webRequest){
        return allWords;
    }

}
