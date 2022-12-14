import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenderSection extends BasePage {
    private final By maleLabelLocator =new By.ByCssSelector("label[for='gender-radio-1']");
    private final By femaleLabelLocator =new By.ByCssSelector("label[for='gender-radio-2']");
    private final By otherLabelLocator =new By.ByCssSelector("label[for='gender-radio-3']");

    private final By maleRadioButtonLocator =By.id("gender-radio-1");
    private final By femaleRadioButtonLocator =By.id("gender-radio-2");
    private final By otherRadioButtonLocator =By.id("gender-radio-3");



    private WebDriver driver;
    public enum Genders{MALE,FEMALE,OTHERS}
    public GenderSection(WebDriver driver)
    {
        super(driver);
    }
    public void clickRadioButton(Genders genders)
    {
        switch (genders)
        {
            case MALE ->click(maleLabelLocator);
            case FEMALE ->click(femaleLabelLocator);
            case OTHERS ->click(otherLabelLocator);
        }

    }
    public boolean isRadioButtonChecked(Genders genders)
    {
        boolean isChecked=false;
        switch (genders)
        {
            case MALE -> isChecked=isSelected(maleRadioButtonLocator);
            case FEMALE -> isChecked=isSelected(femaleRadioButtonLocator);
            case OTHERS -> isChecked=isSelected(otherRadioButtonLocator);
        }
        return isChecked;
    }
}
