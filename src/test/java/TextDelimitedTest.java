import com.effective.code.item2.Fields;
import com.effective.code.item2.TextDelimited;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by GURDIT_SINGH on 28-04-2015.
 */
public class TextDelimitedTest {

    @Test
    public void itShouldGetDelimiter(){
        TextDelimited textDelimited =new TextDelimited.builder(new Fields("a","b"),"|").build();
        Assert.assertEquals("|",textDelimited.getDelimiter());
    }

    public void itShouldGetSafeValue(){
        TextDelimited textDelimited =new TextDelimited.builder(new Fields("a","b"),"|").safe(true).build();
        Assert.assertTrue(textDelimited.isSafe());
    }
}
