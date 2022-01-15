package pages;

import org.openqa.selenium.By;

import java.util.Hashtable;

public class HomePage extends BasePage {

    public Hashtable<String, By> homeElements;

    public HomePage() {
        super();
        this.homeElements = new Hashtable<>();
        homeElements.put("sign in title", By.xpath("//*[@title='Giriş Yap']"));
        homeElements.put("login button", By.xpath("//*[@id=\"login\"]"));
        homeElements.put("search input box", By.xpath("//input[@class='desktopOldAutosuggestTheme-input']"));
        homeElements.put("search button", By.xpath("//div[@class='SearchBoxOld-buttonContainer']"));
        homeElements.put("my account title", By.xpath("(//*[@title='Hesabım'])[1]"));
        homeElements.put("book, music, movie, hobby category title", By.xpath("//*[(text()='Kitap, Müzik, Film, Hobi')]//parent::span"));
        homeElements.put("remote control vehicles link button", By.xpath("//*[(text()='Uzaktan Kumandalı Araçlar')]//parent::a"));
        homeElements.put("delivery today title", By.xpath("//*[@title='Bugün Teslimat']"));
        homeElements.put("details button", By.xpath("//a[@class='sf-DeliveryTooltip-2zrc0']//parent::div"));
        homeElements.put("sepet",By.xpath("//*[@id=\"maincontent\"]/div[6]/div/table/tbody/tr[1]/td[1]/a"));
        homeElements.put("aramaalanı",By.cssSelector("#auto-complete-app > div > div > input"));
        homeElements.put("search",By.cssSelector("#auto-complete-app > div > div > i"));
        homeElements.put("popup",By.cssSelector("#Combined-Shape"));
        homeElements.put("giris",By.cssSelector("#account-navigation-container > div > div.account-nav-item.user-login-container > div.link.account-user > p"));
        homeElements.put("github",By.cssSelector("body > header > div > div.-main.flex--item > a.-logo.js-gps-track > span"));
        homeElements.put("singup",By.cssSelector("body > header > div > div.-main.flex--item > a.left-sidebar-toggle.p0.ai-center.jc-center.js-left-sidebar-toggle > span"));
        homeElements.put("singup",By.cssSelector("body > header > div > div.-main.flex--item > a.left-sidebar-toggle.p0.ai-center.jc-center.js-left-sidebar-toggle > span"));
        homeElements.put("singup",By.cssSelector("body > header > div > div.-main.flex--item > a.left-sidebar-toggle.p0.ai-center.jc-center.js-left-sidebar-toggle > span"));
        homeElements.put("question",By.cssSelector("#nav-questions > span"));
        homeElements.put("search",By.cssSelector("#search > div > input"));
        homeElements.put("SEARCH1",By.cssSelector("#search > div > input"));

        this.pageElements = homeElements;
    }
}
