import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswortTest {



    //GIVEN
    //Fri-Yay!10

    //WHEN
    //mindestens acht Zeichen
    //Zahlen enthalten

    //THEN
    //Länge des Passworts überprüfen
    //Prüfen, ob Zahlen enthalten
    //Prüfen, ob kleine/große Buchstaben enthalten
    //schlechte Passwörter wie "passwort" oder "123456" verbieten

    @Test
    void Test0() {
        assertEquals("Sehr gut. Dein Passwort hat eine ausreichende Länge.", Passwort.passwordCheck("Fri-Yay!10"));
    }

    @Test
    void Test1() {
        assertEquals("Perfekt. Dein Passwort enthält Zahlen.", Passwort.containsDigits("Fri-Yay!10"));
    }
}