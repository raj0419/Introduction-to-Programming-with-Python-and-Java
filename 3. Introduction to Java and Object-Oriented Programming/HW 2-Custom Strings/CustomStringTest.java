import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomStringTest {
    CustomString myCustomString;

    @BeforeEach
    public void setUp() throws Exception {
        this.myCustomString = new CustomString();
    }
    @Test
    void testGetString() {
        assertNull(this.myCustomString.getString());

        this.myCustomString.setString("hello");
        assertEquals("hello", this.myCustomString.getString());
    }
    @Test
    void testSetString() {
        assertNull(this.myCustomString.getString());
        this.myCustomString.setString("Good-bye!");
        assertEquals("Good-bye!", this.myCustomString.getString());
        this.myCustomString.setString(null);
        assertNull(this.myCustomString.getString());
        this.myCustomString.setString("");
        assertEquals("", this.myCustomString.getString());
        this.myCustomString.setString("Davide Di Criscito");
        assertEquals("Davide Di Criscito", this.myCustomString.getString());
    }
    @Test
    void testRemove() {
        assertEquals("", this.myCustomString.remove(""));
        this.myCustomString.setString(null);
        assertEquals("", this.myCustomString.remove(""));
        this.myCustomString.setString("my lucky numbers are 6, 8, and 19.");
        assertEquals("my lucky numbes e , 8, nd 19.", this.myCustomString.remove("ra6"));
        this.myCustomString.setString("My name is Davide Di Criscito");
        assertEquals("My name s ave  Crscto", this.myCustomString.remove("Di"));
        this.myCustomString.setString("TesTing CaSe InSesItive");
        assertEquals("eing Cae IneIive", this.myCustomString.remove("ts"));
        this.myCustomString.setString("ThIs MeThOd Is CaSe InSeSiTiVe");
        assertEquals("Ths eThOd s CSe nSeSTVe", this.myCustomString.remove("mai"));
    }
    @Test
    void testReverse() {
        assertEquals("", this.myCustomString.reverse(""));
        this.myCustomString.setString(null);
        assertEquals("", this.myCustomString.reverse(""));
        this.myCustomString.setString("abc, XYZ; 123.");
        assertEquals("aBC, xyz; 123.", this.myCustomString.reverse("bcdxyz@3210."));
        this.myCustomString.setString("TeStInG CaSe");
        assertEquals("tEsTInG CasE", this.myCustomString.reverse("test"));
        this.myCustomString.setString("asdf123  double Space");
        assertEquals("ASdf123  doublE spAcE", this.myCustomString.reverse("123sae"));
        this.myCustomString.setString("LOWER case upper CASE");
        assertEquals("lower casE uppER CASe", this.myCustomString.reverse("LOWER"));
    }
    @Test
    void testFilterLetters() {
        assertEquals("", this.myCustomString.filterLetters('E', false));
        this.myCustomString.setString(null);
        assertEquals("", this.myCustomString.filterLetters('E', false));
        this.myCustomString.setString("abcdefghz");
        assertEquals("abcdef", this.myCustomString.filterLetters('g', true));
        this.myCustomString.setString("My name is Davide Di Criscito");
        assertEquals("My nm is vi i risito", this.myCustomString.filterLetters('f', false));
        this.myCustomString.setString("Testing space");
        assertEquals("Tstin sp", this.myCustomString.filterLetters('h', false));
    }
}