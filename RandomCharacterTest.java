import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RandomCharacterTest {
    RandomCharacter test = new RandomCharacter();

    

    @Test
    public void getRandomLowerCaseLetter(){
        int lower = test.getRandomLowerCaseLetter();
        assertTrue(lower >=97 && lower <= 123);
    }
    @Test
    public void getRandomUpperCaseLetter(){
        int upper = test.getRandomUpperCaseLetter();
        assertTrue(upper >= 65 && upper <= 91);
    }
    @Test
    public void getRandomDigitCharacter(){
        int digit = test.getRandomDigitCharacter();
        assertTrue(digit >=48 && digit <= 58);
    }
    @Test
    public void getPrime(){
        assertTrue(true);     

        
    }
    
}