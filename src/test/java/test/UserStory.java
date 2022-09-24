package test;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.Locators;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class UserStory {
    /*
    - Senaryoya üye kaydı oluşturmadan devam edilecek.
- Giyim--> Aksesuar--> Kadın İç Giyim-->Dizaltı Çorap bölümüne girilir.
- Açılan ürünün siyah olduğu doğrulanır.
- Sepete ekle butonuna tıklanır.
- Sepeti Görüntüle butonuna tıklanır.
- Sepeti Onayla butonuna tıklanır.
- Üye olmadan devam et butonuna tıklanır.
- Mail ekranı gelir.
- Sonrasında adres ekranı gelir. Adres oluştur dedikten sonra ödeme ekranı gelir.
- Siparişi tamamla butonuna tıklayarak, ödeme ekranına gidildiği ,doğru ekrana yönlendiklerini kontrol edecekler.

    */
    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("A101Url"));
        Locators locators = new Locators();
        locators.cerezlerButton.click();
        locators.giyimAksesuarSekmesi.click();
        locators.kadinIcGiyimSekmesi.click();
        locators.dizAltiCorapSekmesi.click();
        Thread.sleep(2000);
        List<WebElement> dizAltiCorapSecmeListesi = locators.dizAltiCorapListesi;
        int sayi = 1;
        for (int i = 0; i < dizAltiCorapSecmeListesi.size(); i++) {
            System.out.println(sayi + ". Corap = " + dizAltiCorapSecmeListesi.get(i).getText());
            sayi++;
            if (dizAltiCorapSecmeListesi.get(i).getText().contains("Siyah")) {
                dizAltiCorapSecmeListesi.get(i).click();
            }
        }
        Assert.assertTrue(locators.secilenRenkSiyahMi.isDisplayed());
        locators.sepeteEkleButton.click();
        locators.sepeteGoruntuleButton.click();
        locators.sepetiOnaylaButton.click();
        locators.uyeOlmadanDevamButton.click();
        Thread.sleep(2000);
        Assert.assertTrue(locators.emailtext.isDisplayed());
        locators.emailtextbox.click();
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        actions.sendKeys(faker.internet().emailAddress()).perform();
        locators.emailDevamEtButton.click();
        locators.yeniAdresOlusturButton.click();
        Thread.sleep(2000);
        locators.adresBasligibox.click();
        actions.sendKeys("Ev adresim",
                Keys.TAB,faker.name().firstName(),
                Keys.TAB,faker.name().lastName(),
                Keys.TAB,faker.phoneNumber().cellPhone()).perform();
        Select select = new Select(locators.ilbox);
        select.selectByIndex(2);
        Select select1 = new Select(locators.ilcebox);
        select1.selectByVisibleText("ÇANKAYA");
        Thread.sleep(2000);
        Select select2 = new Select(locators.mahallebox);
        select2.selectByIndex(1);
        locators.adresbox.click();
        actions.sendKeys(faker.address().fullAddress()).perform();
        locators.kaydetButton.click();
        locators.kargoRadioButton.click();
        Thread.sleep(2000);
        locators.kaydetVeDevamButton.click();
        locators.siparisiTamamlaButton.click();
        actions.sendKeys(Keys.HOME).perform();
        Assert.assertTrue(locators.odemeSecenekleri.isDisplayed());

    }
}


