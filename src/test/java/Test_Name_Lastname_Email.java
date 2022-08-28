import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Name_Lastname_Email extends BaseTest {
    @Test
    @Order(1)
    public void setName()
    {
        PracticeFormPage practiceFormPage=new PracticeFormPage(driver);
        practiceFormPage.setName("Brad");
        Assertions.assertEquals("Brad",practiceFormPage.getName(),"Name value is not correct !");

    }
    @Test
    @Order(3)
    public void setLastName()
    {
        PracticeFormPage practiceFormPage=new PracticeFormPage(driver);
        practiceFormPage.setLastName("Wayne");
        Assertions.assertEquals("Wayne",practiceFormPage.getLastName(),"Last name value is not correct !");
    }
    @Test
    @Order(2)
    public void setEmail()
    {
        PracticeFormPage practiceFormPage=new PracticeFormPage(driver);
        practiceFormPage.setEmail("waynebrad@gmail.com");
        Assertions.assertEquals("waynebrad@gmail.com",practiceFormPage.getEmail(),"Email value is not correct !");
    }
}
