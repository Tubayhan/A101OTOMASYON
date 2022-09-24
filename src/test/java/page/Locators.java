package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Locators {

    public Locators() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    public WebElement cerezlerButton;

   @FindBy(xpath = "(//a[@href='/giyim-aksesuar/'])[1]")
    public WebElement giyimAksesuarSekmesi;

   @FindBy(xpath = "(//a[@href='/giyim-aksesuar/kadin-ic-giyim/'])[2]")
    public WebElement kadinIcGiyimSekmesi;

   @FindBy(xpath = "(//a[@href='/giyim-aksesuar/dizalti-corap/'])[2]")
    public WebElement dizAltiCorapSekmesi;

   @FindBy(xpath = "//li[@class='col-md-4 col-sm-6 col-xs-6 set-product-item']")
    public List<WebElement> dizAltiCorapListesi;

   @FindBy(xpath = "//span[text()='SİYAH']")
    public WebElement secilenRenkSiyahMi;

   @FindBy(xpath = "//button[@class='add-to-basket button green block with-icon js-add-basket']")
    public WebElement sepeteEkleButton;

   @FindBy(xpath = "(//a[@title='Sepeti Görüntüle'])[2]")
    public WebElement sepeteGoruntuleButton;

   @FindBy(xpath = "(//a[@title='Sepeti Onayla'])[2]")
    public WebElement sepetiOnaylaButton;

   @FindBy(xpath = "//a[@title='ÜYE OLMADAN DEVAM ET']")
    public WebElement uyeOlmadanDevamButton;

   @FindBy(xpath = "//label[.='E-mail']")
    public WebElement emailtext;

   @FindBy(xpath = "//input[@name='user_email']")
    public WebElement emailtextbox;

   @FindBy(xpath = "//button[@class='button block green']")
    public WebElement emailDevamEtButton;

   @FindBy(xpath = "(//a[@title='Yeni adres oluştur'])[1]")
    public WebElement yeniAdresOlusturButton;

   @FindBy(xpath = "//input[@name='title']")
    public WebElement adresBasligibox;

   @FindBy(xpath = "//select[@class='js-cities']")
    public WebElement ilbox;

   @FindBy(xpath = "//select[@name='township']")
    public WebElement ilcebox;

   @FindBy(xpath = "//select[@name='district']")
    public WebElement mahallebox;

   @FindBy(xpath = "//textarea[@name='line']")
    public WebElement adresbox;

   @FindBy(xpath = "//button[@class='button green js-set-country js-prevent-emoji']")
    public WebElement kaydetButton;

   @FindBy(xpath = "(//div[@class='radio'])[3]")
    public WebElement kargoRadioButton;

   @FindBy(xpath = "//button[@class='button block green js-proceed-button']")
    public WebElement kaydetVeDevamButton;

   @FindBy(xpath = "//span[@class='order-complete']")
    public WebElement siparisiTamamlaButton;

   @FindBy(xpath = "(//span[@class='hidden-xs'])[2]")
    public WebElement odemeSecenekleri;










}

