import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class PracticeFormPage extends BasePage{

    private final GenderSection genderSection;
    private final By nameLocator = By.id("firstName");
    private final By lastNameLocator =By.id("lastName");
    private final By emailLocator =By.id("userEmail");
    private final By mobileNumberLocator=By.id("userNumber");
    private int randomNumber;
    private String rd[]=new String[10];



    public PracticeFormPage(WebDriver driver)
    {
        super(driver);
        driver.get("https://demoqa.com/automation-practice-form");
        genderSection =new GenderSection(driver);

    }
    public GenderSection genderSection()
    {
        return this.genderSection;
    }
    public String setRandomMobileNumber()
    {
        Random random=new Random();
       for (int i=0;i<10;i++)
       {
           randomNumber=random.nextInt(10);
           rd[i]=Integer.toString(randomNumber);
       }
       String number = rd[0] + rd[1] + rd[2] + rd[3] + rd[4] + rd[5] + rd[6] + rd[7] + rd[8] + rd[9];
       return number;

    }
    public void setMobileNumber(String mobileNumber)
    {
        type(mobileNumberLocator,mobileNumber);

    }
    public void setName(String nameAsString)
    {
       type(nameLocator,nameAsString);


    }
    public void setLastName(String lastNameAsString)
    {
        type(lastNameLocator,lastNameAsString);

    }
    public void setEmail(String mailAdress)
    {
        type(emailLocator,mailAdress);

    }
    public String getMobileNumber()
    {
        return find(mobileNumberLocator).getAttribute("value");
    }
    public String getName()
    {
        return find(nameLocator).getAttribute("value");

    }
    public String getLastName()
    {
       return find(lastNameLocator).getAttribute("value");

    }
    public String getEmail()
    {
       return find(emailLocator).getAttribute("value");

    }
}
