import org.example.Main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
    @ParameterizedTest
    @CsvSource({"below,elbow", "study,DUSTY", "act!,cat!", "anagram,nag a ram"})
    public void testIsAnagramTrue(String first, String second) {
        assertTrue(Main.isAnagram(first, second));
    }

    @ParameterizedTest
    @CsvSource({"car,plane", "cat,dog", ",", ",empty"})
    public void testIsAnagramFalse(String first, String second) {
        assertFalse(Main.isAnagram(first, second));
    }
}