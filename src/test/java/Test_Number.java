import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Number extends BaseTest{


    @Test
    public void setMobileNumber()
 {
    PracticeFormPage practiceFormPage=new PracticeFormPage(driver);
    String number =practiceFormPage.setRandomMobileNumber();
    practiceFormPage.setMobileNumber(number);
     Assertions.assertEquals(number,
             practiceFormPage.getMobileNumber(),
             "Number value is not correct !");
 }

}
