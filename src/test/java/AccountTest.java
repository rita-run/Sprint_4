import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {

    @Test
    //Тест провеяет минимальную допустимую длину
    public void nameMinLengthPositive() {
        Account account = new Account("a a");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    //Тест провеяет максимальную допустимую длину
    public void nameMaxLengthPositive() {
        Account account = new Account("12345678901234567 8");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    //Тест провеяет граничное значение недопустимой длины
    public void nameMinLengthNegative() {
        Account account = new Account("a ");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    //Тест провеяет граничное значение недопустимой длины
    public void nameMaxLengthNegative() {
        Account account = new Account("12345678901234567 89");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    //Тест проверяет, что количество пробелов больше одного вернет false
    public void moreThanOneSpace() {
        Account account = new Account("a  a");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    //Тест проверяет, что количество пробелов меньше одного вернет false
    public void noSpace() {
        Account account = new Account("aaa");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    //Тест проверяет, что пробел в начале строки вернет false
    public void spaceAtTheBeginning() {
        Account account = new Account(" aa");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    //Тест проверяет, что пробел в конце строки вернет false
    public void spaceAtTheEnd() {
        Account account = new Account("aa ");
        assertFalse(account.checkNameToEmboss());
    }
}
