import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class Test_Gender_Selection extends BaseTest{
    @Test
    public void checkMaleRadioButton()
    {
        PracticeFormPage practiceFormPage=new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickRadioButton(GenderSection.Genders.MALE);
        Assertions.assertTrue(practiceFormPage.genderSection().isRadioButtonChecked(GenderSection.Genders.MALE),"" +
                "Male radio button is not checked !");

    }
    @Test
    public void checkFemaleRadioButton()
    {
        PracticeFormPage practiceFormPage=new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickRadioButton(GenderSection.Genders.FEMALE);
        Assertions.assertTrue(practiceFormPage.genderSection().isRadioButtonChecked(GenderSection.Genders.FEMALE),"" +
                "Female radio button is not checked !");

    }
    @Test
    public void checkOtherRadioButton()
    {
        PracticeFormPage practiceFormPage=new PracticeFormPage(driver);
        practiceFormPage.genderSection().clickRadioButton(GenderSection.Genders.OTHERS);
        Assertions.assertTrue(practiceFormPage.genderSection().isRadioButtonChecked(GenderSection.Genders.OTHERS),"" +
                "Others radio button is not checked !");

    }
}
