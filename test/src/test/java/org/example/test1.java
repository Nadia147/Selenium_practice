package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {

//  @BeforeMethod
//  public void driver(){
//      WebDriver driver = new ChromeDriver();
//  }





    }

    @Test
    public void test4() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.xpath("")).click();
        //driver.findElement(By.xpath("/div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).findElement((By) driver).click();
        //driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("CSE");
       // WebDriverWait wait = new WebDriverWait(driver, 10); WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"))); element.sendKeys("your text");

    }
    @Test
    public void textArea() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector("#autocomplete")).sendKeys("Bangladesh");
        Thread.sleep(2000);
    }


    @Test
    public void textArea2() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "ChromeDriver Path");
        WebDriver driver = new ChromeDriver();
        String url ="https://testingbot.com/";
        driver.get(url);
        driver.manage().window().maximize();
       // driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        Set<Cookie> cookiesList =  driver.manage().getCookies();
        for (Cookie getcookies :cookiesList) {
            System.out.println(getcookies);
        }
        driver.close();
    }
 @Test
  public void newwform() throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     driver.get("https://qavalidation.com/demo-form/");
     driver.manage().window().maximize();
     //textbox
     driver.findElement(By.xpath("//input[@id='g4072-fullname']")).sendKeys("hi");
     driver.findElement(By.xpath("//input[@id='g4072-email']")).sendKeys("chi@khai.com");
     driver.findElement(By.xpath("//input[@id='g4072-phonenumber']")).sendKeys("017094226009");
     //radio button
     //driver.findElement(By.xpath("//span[@id='g4072-gender-button']")).click();
     //Thread.sleep(2000);
     //driver.findElement(By.xpath("//div[@id='ui-id-2']")).click();
     //scroll
     JavascriptExecutor js = (JavascriptExecutor) driver;
     //js.executeScript("window.scrollBy(0,250)", "");
     //radio button
     driver.findElement(By.xpath("//span[@id='g4072-gender-button']")).click();
     driver.findElement(By.xpath("//div[@id='ui-id-2']")).click();
     js.executeScript("window.scrollBy(0,850)", "");


     //checkbox
     driver.findElement(By.xpath("//input[@value='API testing']")).click();
     driver.findElement(By.xpath("//input[@value='DB testing']")).click();
     //radio button
     driver.findElement(By.xpath("//span[@id='g4072-qatools-button']")).click();
     //driver.findElement(By.xpath("//div[@id='ui-id-6']")).click();
     //textbox
     driver.findElement(By.xpath("//textarea[@id='contact-form-comment-g4072-otherdetails']")).sendKeys("hello world!");
     Thread.sleep(5000);
     driver.quit();
   }




    @Test
    public void newwform2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qavalidation.com/demo-form/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(By.xpath("//input[@value='5']")).click();
        Select objSelect =new Select(driver.findElement(By.id("search-box")));
        objSelect.selectByVisibleText("Female");
    }
@Test
    public void ag_grid_table() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ag-grid.com/example/");
        //Thread.sleep(3000);
        //accept cookies
        driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();
        //scroll table
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector(\".ag-body-vertical-scroll-viewport\").scrollTop=3000");
        Thread.sleep(5000);
       //list
       List<WebElement> Header=driver.findElements(By.xpath("//*[@id=\"myGrid\"]/div/div/div[2]"));
       System.out.println(Header.size());
       driver.quit();

    }
    @Test
    public void ag_grid_table2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ag-grid.com/example/");
        Thread.sleep(3000);
        //accept cookies
        driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();
        //scroll table
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector(\".ag-body-vertical-scroll-viewport\").scrollTop=3000");
        Thread.sleep(5000);
        //list

        driver.quit();

    }



@Test
    public void ag_grid() throws InterruptedException{

    WebDriver driver = new ChromeDriver();

            // Set the path to the ChromeDriver executable
            //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
           driver.manage().window().maximize();
            // Initialize ChromeDriver
           // WebDriver driver = new ChromeDriver();

            // Navigate to the webpage containing the ag-Grid table
           driver.get("https://www.ag-grid.com/example/");
    driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();
    //scroll table
            // Locate the ag-Grid table
            WebElement agGrid = driver.findElement(By.cssSelector("div.ag-root"));

            // Locate all the rows within the table
            List<WebElement> rows = agGrid.findElements(By.cssSelector(".ag-center-cols-container > .ag-row"));

            // Iterate through each row
            for (WebElement row : rows) {
                // Locate the cells within each row
                List<WebElement> cells = row.findElements(By.cssSelector(".ag-cell"));

                // Iterate through each cell and retrieve the text
                for (WebElement cell : cells) {
                    System.out.print(cell.getText() + "\t");
                }
                System.out.println(); // Move to the next line for the next row
            }

            // Close the browser
            driver.quit();
        }

//    @Test
//    public void textArea3() throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.com");
//        Actions action = new Actions(driver);
//        WebElement searchbox = driver.findElement(By.name("q"));
//        action.sendKeys(Keys.chord(Keys.SHIFT + Keys.CONTROL + "s")).perform();
//    }



    @Test
    public void dragdrop() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        driver.manage().window().maximize();
        WebElement boxA = driver.findElement(By.xpath("//li[text()='A']"));
        WebElement boxB = driver.findElement(By.xpath("//li[text()='D']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(boxA);
        actions.contextClick(boxA);
        actions.doubleClick(boxA);
        Thread.sleep(5000);
        actions.clickAndHold();
        actions.moveToElement(boxB);
        Thread.sleep(5000);
        actions.release().perform();

    }
    @Test
    public void shop_management() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://shop.polymer-project.org/");

        driver.manage().window().maximize();
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "shop-app[page='home']";
        String cssSelectorForHost2 = ".iron-selected";
        Thread.sleep(1000);
        SearchContext shadow0 = driver.findElement(By.cssSelector("shop-app[page='home']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector(".iron-selected")).getShadowRoot();
        Thread.sleep(1000);
        //shadow11.findElement(By.cssSelector("a[aria-label=\"Men's Outerwear Shop Now\"]").click();
        shadow1.findElement(By.cssSelector("a[aria-label=\"Men's Outerwear Shop Now\"]")).click();
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,260)", "");
       //js.executeScript("window.scrollBy(0,360)", "");
       Thread.sleep(2500);
        //click a shirt
        driver.findElement(By.xpath("//shop-app[.='SHOP']")).click();


//        //into product
        String cssSelectorForHost3 = "shop-app[page='detail']";
        String cssSelectorForHost4 = "shop-detail[name='detail']";
        Thread.sleep(1000);
        SearchContext s1 = driver.findElement(By.cssSelector("shop-app[page='detail']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext s2 = s1.findElement(By.cssSelector("shop-detail[name='detail']")).getShadowRoot();
        Thread.sleep(1000);
        s2.findElement(By.cssSelector("select[aria-labelledby='sizeLabel']")).click();
        js.executeScript("window.scrollBy(0,260)", "");
        Thread.sleep(2500);


        s2.findElement(By.cssSelector("button[aria-label='Add this item to cart']")).click();

        //driver.findElement(By.xpath("/body/shop-app[@innertext='SHOP']")).click();
        js.executeScript("window.scrollBy(260,0)", "");

         //View cart
        String cssSelectorForHost5 = "shop-app[page='detail']";
        String cssSelectorForHost6 = ".opened";
        Thread.sleep(1000);
        SearchContext shadow2 = driver.findElement(By.cssSelector("shop-app[page='detail']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow3 = shadow2.findElement(By.cssSelector(".opened")).getShadowRoot();
        Thread.sleep(1000);
        shadow3.findElement(By.cssSelector("a[href='/cart']")).click();
        Thread.sleep(2500);


        //Chakeout
        String cssSelectorForHost7 = "shop-app[page='cart']";
        String cssSelectorForHost8 = "shop-cart[name='cart']";
        Thread.sleep(1000);
        SearchContext shadow4 = driver.findElement(By.cssSelector("shop-app[page='cart']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow5 = shadow4.findElement(By.cssSelector("shop-cart[name='cart']")).getShadowRoot();
        Thread.sleep(1000);
        shadow5.findElement(By.cssSelector("a[href='/checkout']")).click();


        //form
        String cssSelectorForHost9 = "shop-app[page='checkout']";
        String cssSelectorForHost10 = "shop-checkout[name='checkout']";
        Thread.sleep(1000);
        SearchContext shadow6 = driver.findElement(By.cssSelector("shop-app[page='checkout']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow7 = shadow6.findElement(By.cssSelector("shop-checkout[name='checkout']")).getShadowRoot();
        Thread.sleep(1000);
        //name
        shadow7.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("nadia@gmmail.com");
        //number
        Thread.sleep(1000);
        shadow7.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("0171171117");

        //ship add
        Thread.sleep(1000);
        shadow7.findElement(By.cssSelector("input[placeholder='Address'][name='shipAddress']")).sendKeys("Rajshahi");
        //ship city
        Thread.sleep(1000);
        shadow7.findElement(By.cssSelector("input[placeholder='City'][name='shipCity']")).sendKeys("Rajshahi");

        //ship state.

        Thread.sleep(1000);
        shadow7.findElement(By.cssSelector("input[placeholder='State/Province'][name='shipState']")).sendKeys("Natore");
        //zip
        Thread.sleep(1000);
        shadow7.findElement(By.cssSelector("input[placeholder='Zip/Postal Code'][name='shipZip']")).sendKeys("6000");
        //cardholder name
        Thread.sleep(1000);
        shadow7.findElement(By.cssSelector("input[placeholder='Cardholder Name']")).sendKeys("Diya");
        //card num
        Thread.sleep(1000);
        shadow7.findElement(By.cssSelector("input[placeholder='Card Number']")).sendKeys("000000000011223");
        //cvv
        Thread.sleep(1000);
        shadow7.findElement(By.cssSelector("input[placeholder='CVV']")).sendKeys("9999");
        //wait
        js.executeScript("window.scrollBy(0,260)", "");
        //click place order
        Thread.sleep(1000);
        shadow7.findElement(By.cssSelector("input[value='Place Order']")).click();
        Thread.sleep(1000);

        //end form

        js.executeScript("window.scrollBy(260,0)", "");

        Thread.sleep(2000);


        String cssSelectorForHost11 = "shop-app[page='checkout']";
        String cssSelectorForHost12 = "shop-checkout[name='checkout']";
        Thread.sleep(1000);
        SearchContext shadow000 = driver.findElement(By.cssSelector("shop-app[page='checkout']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow111 = shadow000.findElement(By.cssSelector("shop-checkout[name='checkout']")).getShadowRoot();
        Thread.sleep(1000);
        shadow111.findElement(By.cssSelector("a[href='/']"));
    }

    @Test
    public void shop_management_scroll() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://shop.polymer-project.org/checkout/success");

        driver.manage().window().maximize();
    }


        @Test
        public void testAssertFunctions_delete_cart() throws InterruptedException{
            WebDriver driver = new ChromeDriver();
            driver.get("https://shop.polymer-project.org/");

            driver.manage().window().maximize();

            String cssSelectorFor = "shop-app[page='home']";
            String cssSelectorForH= ".iron-selected";
            //Thread.sleep(1000);
            SearchContext shadow0 = driver.findElement(By.cssSelector("shop-app[page='home']")).getShadowRoot();
            //Thread.sleep(1000);
            SearchContext shadow1 = shadow0.findElement(By.cssSelector(".iron-selected")).getShadowRoot();
            //Thread.sleep(1000);
            String ActualTitle = shadow1.findElement(By.cssSelector(" div:nth-child(2) > h2:nth-child(2)")).getText();
             System.out.println(ActualTitle);
            //String ActualTitle = driver.getTitle();
            String ExpectedTitle = "Men's Outerwear";
            Assert.assertEquals(ActualTitle,ExpectedTitle );

            String cssSelectorForHost00 = "shop-app[page='home']";
            String cssSelectorForHost01 = ".iron-selected";
            Thread.sleep(1000);
            SearchContext shadow00 = driver.findElement(By.cssSelector("shop-app[page='home']")).getShadowRoot();
            Thread.sleep(1000);
            SearchContext shadow11 = shadow00.findElement(By.cssSelector(".iron-selected")).getShadowRoot();
            Thread.sleep(1000);
            //shadow11.findElement(By.cssSelector("a[aria-label=\"Men's Outerwear Shop Now\"]").click();
            shadow11.findElement(By.cssSelector("a[aria-label=\"Men's Outerwear Shop Now\"]")).click();
            driver.manage().window().maximize();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,260)", "");
            //js.executeScript("window.scrollBy(0,360)", "");
            Thread.sleep(2500);

            driver.findElement(By.xpath("//shop-app[.='SHOP']")).click();
            //This Element is inside 2 nested shadow DOM.
            String cssSelectorForHost1 = "shop-app[page='detail']";
            String cssSelectorForHost2 = "shop-detail[name='detail']";
            Thread.sleep(1000);
            SearchContext s1 = driver.findElement(By.cssSelector("shop-app[page='detail']")).getShadowRoot();
            Thread.sleep(1000);
            SearchContext s2 = s1.findElement(By.cssSelector("shop-detail[name='detail']")).getShadowRoot();
            Thread.sleep(1000);

            s2.findElement(By.cssSelector("option[value='XL']")).click();
            s2.findElement(By.cssSelector("option[value='5']")).click();
            js.executeScript("window.scrollBy(0,260)", "");
            Thread.sleep(2500);
            s2.findElement(By.cssSelector("button[aria-label='Add this item to cart']")).click();

            //view cart
            String cssSelectorForHost5 = "shop-app[page='detail']";
            String cssSelectorForHost6 = ".opened";
            Thread.sleep(1000);
            SearchContext shadow2 = driver.findElement(By.cssSelector("shop-app[page='detail']")).getShadowRoot();
            Thread.sleep(1000);
            SearchContext shadow3 = shadow2.findElement(By.cssSelector(".opened")).getShadowRoot();
            Thread.sleep(1000);
            shadow3.findElement(By.cssSelector("a[href='/cart']")).click();
            Thread.sleep(2500);
            //compare cart
            //type
            String cssSelectorForHost7 = "shop-app[page='cart']";
            String cssSelectorForHost8 = "shop-cart[name='cart']";
            String cssSelectorForHost9 = " div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > shop-cart-item:nth-child(1)";
            Thread.sleep(1000);
            SearchContext shadow4 = driver.findElement(By.cssSelector("shop-app[page='cart']")).getShadowRoot();
            Thread.sleep(1000);
            SearchContext shadow5 = shadow4.findElement(By.cssSelector("shop-cart[name='cart']")).getShadowRoot();
            Thread.sleep(1000);
            SearchContext shadow6 = shadow5.findElement(By.cssSelector(" div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > shop-cart-item:nth-child(1)")).getShadowRoot();
            Thread.sleep(1000);

            String actual = shadow6.findElement(By.cssSelector(".name")).getText();
            String expected = "Anvil L/S Crew Neck - Grey";
            Assert.assertEquals(actual,expected );
            System.out.println(actual);
            //size
            //This Element is inside 3 nested shadow DOM.
            String actual1 = shadow6.findElement(By.cssSelector(".size")).getText();
            String expected1 = "Size: XL";
            Assert.assertEquals(actual1,expected1 );
            System.out.println(actual1);
            //delete
            //This Element is inside 4 nested shadow DOM.
            String cssSelectorForHost11 = "shop-app[page='cart']";
            String cssSelectorForHost21 = "shop-cart[name='cart']";
            String cssSelectorForHost31 = " div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > shop-cart-item:nth-child(1)";
            String cssSelectorForHost41 = ".delete-button";
            Thread.sleep(1000);
            SearchContext shadow01 = driver.findElement(By.cssSelector("shop-app[page='cart']")).getShadowRoot();
            Thread.sleep(1000);
            SearchContext shadow111 = shadow01.findElement(By.cssSelector("shop-cart[name='cart']")).getShadowRoot();
            Thread.sleep(1000);
            SearchContext shadow21 = shadow111.findElement(By.cssSelector(" div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > shop-cart-item:nth-child(1)")).getShadowRoot();
            Thread.sleep(1000);
            SearchContext shadow31 = shadow21.findElement(By.cssSelector(".delete-button")).getShadowRoot();
            Thread.sleep(1000);
            shadow31.findElement(By.cssSelector("iron-icon")).click();

            //empty message
            //This Element is inside 2 nested shadow DOM.
            String cssSelectorForHost10 = "shop-app[page='cart']";
            String cssSelectorForHost12 = "shop-cart[name='cart']";
            Thread.sleep(1000);
            SearchContext shadow7 = driver.findElement(By.cssSelector("shop-app[page='cart']")).getShadowRoot();
            Thread.sleep(1000);
            SearchContext shadow8 = shadow7.findElement(By.cssSelector("shop-cart[name='cart']")).getShadowRoot();
            Thread.sleep(1000);
            String actual2 = shadow8.findElement(By.cssSelector(".empty-cart")).getText();
            String expected2 = "is empty.";
            System.out.println(actual2);
            Assert.assertEquals(actual2,expected2 );
            Thread.sleep(3000);
            //

        }
    @Test
    public void Multiple_item_cart() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://shop.polymer-project.org/");

        driver.manage().window().maximize();

        String cssSelectorFor = "shop-app[page='home']";
        String cssSelectorForH= ".iron-selected";
        //Thread.sleep(1000);
        SearchContext shadow0 = driver.findElement(By.cssSelector("shop-app[page='home']")).getShadowRoot();
        //Thread.sleep(1000);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector(".iron-selected")).getShadowRoot();
        //Thread.sleep(1000);
        String ActualTitle = shadow1.findElement(By.cssSelector(" div:nth-child(2) > h2:nth-child(2)")).getText();
        System.out.println(ActualTitle);
        //String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Men's Outerwear";
        Assert.assertEquals(ActualTitle,ExpectedTitle );

        String cssSelectorForHost00 = "shop-app[page='home']";
        String cssSelectorForHost01 = ".iron-selected";
        Thread.sleep(1000);
        SearchContext shadow00 = driver.findElement(By.cssSelector("shop-app[page='home']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow11 = shadow00.findElement(By.cssSelector(".iron-selected")).getShadowRoot();
        Thread.sleep(1000);
        //shadow11.findElement(By.cssSelector("a[aria-label=\"Men's Outerwear Shop Now\"]").click();
        shadow11.findElement(By.cssSelector("a[aria-label=\"Men's Outerwear Shop Now\"]")).click();
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,260)", "");
        //js.executeScript("window.scrollBy(0,360)", "");
        Thread.sleep(2500);

        driver.findElement(By.xpath("//shop-app[.='SHOP']")).click();
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "shop-app[page='detail']";
        String cssSelectorForHost2 = "shop-detail[name='detail']";
        Thread.sleep(1000);
        SearchContext s1 = driver.findElement(By.cssSelector("shop-app[page='detail']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext s2 = s1.findElement(By.cssSelector("shop-detail[name='detail']")).getShadowRoot();
        Thread.sleep(1000);

        s2.findElement(By.cssSelector("option[value='XL']")).click();
        s2.findElement(By.cssSelector("option[value='5']")).click();
        js.executeScript("window.scrollBy(0,260)", "");
        Thread.sleep(2500);
        s2.findElement(By.cssSelector("button[aria-label='Add this item to cart']")).click();

        //view cart
        String cssSelectorForHost5 = "shop-app[page='detail']";
        String cssSelectorForHost6 = ".opened";
        Thread.sleep(1000);
        SearchContext shadow2 = driver.findElement(By.cssSelector("shop-app[page='detail']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow3 = shadow2.findElement(By.cssSelector(".opened")).getShadowRoot();
        Thread.sleep(1000);
        shadow3.findElement(By.cssSelector("a[href='/cart']")).click();
        Thread.sleep(2500);
        //compare cart
        //type
        String cssSelectorForHost7 = "shop-app[page='cart']";
        String cssSelectorForHost8 = "shop-cart[name='cart']";
        String cssSelectorForHost9 = " div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > shop-cart-item:nth-child(1)";
        Thread.sleep(1000);
        SearchContext shadow4 = driver.findElement(By.cssSelector("shop-app[page='cart']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow5 = shadow4.findElement(By.cssSelector("shop-cart[name='cart']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow6 = shadow5.findElement(By.cssSelector(" div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > shop-cart-item:nth-child(1)")).getShadowRoot();
        Thread.sleep(1000);

        String actual = shadow6.findElement(By.cssSelector(".name")).getText();
        String expected = "Anvil L/S Crew Neck - Grey";
        Assert.assertEquals(actual,expected );
        System.out.println(actual);
        //size
        String actual1 = shadow6.findElement(By.cssSelector(".size")).getText();
        String expected1 = "Size: XL";
        Assert.assertEquals(actual1,expected1 );
        System.out.println(actual1);
        driver.navigate().back();
        driver.navigate().back();
        js.executeScript("window.scrollBy(260,0)", "");

        //return to main and add another
        //This Element is inside 4 nested shadow DOM.
        String SelectorForHost10 = "shop-app[page='list']";
        String SelectorForHost11 = "shop-list[name='list']";
        String SelectorForHost12 = " ul:nth-child(6) > li:nth-child(3) > a:nth-child(1) > shop-list-item:nth-child(1)";
        String SelectorForHost13 = "shop-image";
        Thread.sleep(1000);
        SearchContext sh7 = driver.findElement(By.cssSelector("shop-app[page='list']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext sh8 = sh7.findElement(By.cssSelector("shop-list[name='list']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext sh9 = sh8.findElement(By.cssSelector(" ul:nth-child(6) > li:nth-child(3) > a:nth-child(1) > shop-list-item:nth-child(1)")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext sh10 = sh9.findElement(By.cssSelector("shop-image")).getShadowRoot();
        Thread.sleep(1000);
        sh10.findElement(By.cssSelector("img[alt='Green Flex Fleece Zip Hoodie']")).click();
        //add to cart
        String SelectorForHost1 = "shop-app[page='detail']";
        String SelectorForHost2 = "shop-detail[name='detail']";
        Thread.sleep(1000);
        SearchContext sd1 = driver.findElement(By.cssSelector("shop-app[page='detail']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext sd2 = sd1.findElement(By.cssSelector("shop-detail[name='detail']")).getShadowRoot();
        Thread.sleep(1000);

        sd2.findElement(By.cssSelector("option[value='XL']")).click();
        sd2.findElement(By.cssSelector("option[value='5']")).click();
        js.executeScript("window.scrollBy(0,260)", "");
        Thread.sleep(2500);
        sd2.findElement(By.cssSelector("button[aria-label='Add this item to cart']")).click();
        Thread.sleep(1000);

        //cart page
        SearchContext sl2 = driver.findElement(By.cssSelector("shop-app[page='detail']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext sl3 = sl2.findElement(By.cssSelector(".opened")).getShadowRoot();
        Thread.sleep(1000);
        sl3.findElement(By.cssSelector("a[href='/cart']")).click();
        //total price calculate
        //This Element is inside 2 nested shadow DOM.
        String csstot1 = "shop-app[page='cart']";
        String csstot2 = "shop-cart[name='cart']";
        Thread.sleep(1000);
        SearchContext tl0 = driver.findElement(By.cssSelector("shop-app[page='cart']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext tl1 = tl0.findElement(By.cssSelector("shop-cart[name='cart']")).getShadowRoot();
        Thread.sleep(1000);
        String s = "Total\n" ;
        //$339.00
        String cart_total =  s+tl1.findElement(By.cssSelector(".subtotal")).getText();
        //System.out.println(cart_total);

        //go to form fill and submit
        String cssSelector7 = "shop-app[page='cart']";
        String cssSelector8 = "shop-cart[name='cart']";
        Thread.sleep(1000);
        SearchContext shadoww4 = driver.findElement(By.cssSelector("shop-app[page='cart']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadoww5 = shadoww4.findElement(By.cssSelector("shop-cart[name='cart']")).getShadowRoot();
        Thread.sleep(1000);
        shadoww5.findElement(By.cssSelector("a[href='/checkout']")).click();


        //form
        String SForHost9 = "shop-app[page='checkout']";
        String SForHost10 = "shop-checkout[name='checkout']";
        Thread.sleep(1000);
        SearchContext shadoww6 = driver.findElement(By.cssSelector("shop-app[page='checkout']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadoww7 = shadoww6.findElement(By.cssSelector("shop-checkout[name='checkout']")).getShadowRoot();
        Thread.sleep(1000);
        //name
        shadoww7.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("nadia@gmmail.com");
        //number
        Thread.sleep(1000);
        shadoww7.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("0171171117");
        //ship add
        Thread.sleep(1000);
        shadoww7.findElement(By.cssSelector("input[placeholder='Address'][name='shipAddress']")).sendKeys("Rajshahi");
        //ship city
        Thread.sleep(1000);
        shadoww7.findElement(By.cssSelector("input[placeholder='City'][name='shipCity']")).sendKeys("Rajshahi");
        //ship state.
        Thread.sleep(1000);
        shadoww7.findElement(By.cssSelector("input[placeholder='State/Province'][name='shipState']")).sendKeys("Natore");
        //zip
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,260)", "");
        //state
        String statecss1 = "shop-app[page='checkout']";
        String statecss2 = "shop-checkout[name='checkout']";
        Thread.sleep(1000);
        SearchContext st0 = driver.findElement(By.cssSelector("shop-app[page='checkout']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext st1 = st0.findElement(By.cssSelector("shop-checkout[name='checkout']")).getShadowRoot();
        Thread.sleep(1000);
        st1.findElement(By.cssSelector(" div:nth-child(2) > iron-pages:nth-child(1) > div:nth-child(1) > iron-form:nth-child(1) > form:nth-child(1) > div:nth-child(3) > section:nth-child(1) > div:nth-child(8) > shop-select:nth-child(2) > shop-md-decorator:nth-child(2)"));
        //
        shadoww7.findElement(By.cssSelector("input[placeholder='Zip/Postal Code'][name='shipZip']")).sendKeys("6000");
        //cardholder name
        Thread.sleep(1000);
        shadoww7.findElement(By.cssSelector("input[placeholder='Cardholder Name']")).sendKeys("Diya");
        //card num
        Thread.sleep(1000);
        shadoww7.findElement(By.cssSelector("input[placeholder='Card Number']")).sendKeys("000000000011223");
        //cvv
        Thread.sleep(1000);
        shadoww7.findElement(By.cssSelector("input[placeholder='CVV']")).sendKeys("9999");
        //wait
       // js.executeScript("window.scrollBy(0,260)", "");

        //form total

        String cssft1 = "shop-app[page='checkout']";
        String cssft2 = "shop-checkout[name='checkout']";
        Thread.sleep(1000);
        SearchContext ft0 = driver.findElement(By.cssSelector("shop-app[page='checkout']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext ft1 = ft0.findElement(By.cssSelector("shop-checkout[name='checkout']")).getShadowRoot();
        Thread.sleep(1000);
        String form_total = ft1.findElement(By.cssSelector(".row.total-row")).getText();

//        String cssft1 = "shop-app[page='checkout']";
//        String cssft2 = "shop-checkout[name='checkout']";
//        Thread.sleep(1000);
//        SearchContext ft0 = driver.findElement(By.cssSelector("shop-app[page='checkout']")).getShadowRoot();
//        Thread.sleep(1000);
//        SearchContext ft1 = ft0.findElement(By.cssSelector("shop-checkout[name='checkout']")).getShadowRoot();
//        Thread.sleep(1000);
//        String form_total = ft1.findElement(By.cssSelector(" div:nth-child(2) > iron-pages:nth-child(1) > div:nth-child(1) > iron-form:nth-child(1) > form:nth-child(1) > div:nth-child(3) > section:nth-child(2) > div:nth-child(8) > div:nth-child(2)")).getText();

        Assert.assertEquals(cart_total,form_total );
        System.out.println(cart_total);
        System.out.println(form_total);
        //click place order

        String cssclk1 = "shop-app[page='checkout']";
        String cssclk2 = "shop-checkout[name='checkout']";
        Thread.sleep(1000);
        SearchContext clk0 = driver.findElement(By.cssSelector("shop-app[page='checkout']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext clk1 = clk0.findElement(By.cssSelector("shop-checkout[name='checkout']")).getShadowRoot();
        Thread.sleep(1000);
        clk1.findElement(By.cssSelector("input[value='Place Order']")).click();
        //end form
        Thread.sleep(2500);
        //back to home.
        String cssend1 = "shop-app[page='checkout']";
        Thread.sleep(1000);
        SearchContext shadow = driver.findElement(By.cssSelector("shop-app[page='checkout']")).getShadowRoot();
        Thread.sleep(1000);
        shadow.findElement(By.cssSelector("a[aria-label='SHOP Home']")).click();
        Thread.sleep(2500);
        Thread.sleep(3000);
        //

    }
    @Test
    public void Multiple_ledis_item_cart() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://shop.polymer-project.org/");

        driver.manage().window().maximize();

        String cssSelectorFor = "shop-app[page='home']";
        String cssSelectorForH= ".iron-selected";
        //Thread.sleep(1000);
        SearchContext shadow0 = driver.findElement(By.cssSelector("shop-app[page='home']")).getShadowRoot();
        //Thread.sleep(1000);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector(".iron-selected")).getShadowRoot();
        //Thread.sleep(1000);
        String ActualTitle = shadow1.findElement(By.cssSelector(" div:nth-child(2) > h2:nth-child(2)")).getText();
        System.out.println(ActualTitle);
        //String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Men's Outerwear";
        Assert.assertEquals(ActualTitle,ExpectedTitle );

        String cssSelectorForHost00 = "shop-app[page='home']";
        String cssSelectorForHost01 = ".iron-selected";
        Thread.sleep(1000);
        SearchContext shadow00 = driver.findElement(By.cssSelector("shop-app[page='home']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow11 = shadow00.findElement(By.cssSelector(".iron-selected")).getShadowRoot();
        Thread.sleep(1000);
        //shadow11.findElement(By.cssSelector("a[aria-label=\"Men's Outerwear Shop Now\"]").click();
        shadow11.findElement(By.cssSelector("a[aria-label=\"Men's Outerwear Shop Now\"]")).click();
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,260)", "");
        //js.executeScript("window.scrollBy(0,360)", "");
        Thread.sleep(2500);

        driver.findElement(By.xpath("//shop-app[.='SHOP']")).click();
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "shop-app[page='detail']";
        String cssSelectorForHost2 = "shop-detail[name='detail']";
        Thread.sleep(1000);
        SearchContext s1 = driver.findElement(By.cssSelector("shop-app[page='detail']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext s2 = s1.findElement(By.cssSelector("shop-detail[name='detail']")).getShadowRoot();
        Thread.sleep(1000);

        s2.findElement(By.cssSelector("option[value='XL']")).click();
        s2.findElement(By.cssSelector("option[value='5']")).click();
        js.executeScript("window.scrollBy(0,260)", "");
        Thread.sleep(2500);
        s2.findElement(By.cssSelector("button[aria-label='Add this item to cart']")).click();

        //view cart
        String cssSelectorForHost5 = "shop-app[page='detail']";
        String cssSelectorForHost6 = ".opened";
        Thread.sleep(1000);
        SearchContext shadow2 = driver.findElement(By.cssSelector("shop-app[page='detail']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow3 = shadow2.findElement(By.cssSelector(".opened")).getShadowRoot();
        Thread.sleep(1000);
        shadow3.findElement(By.cssSelector("a[href='/cart']")).click();
        Thread.sleep(2500);
        //compare cart
        //type
        String cssSelectorForHost7 = "shop-app[page='cart']";
        String cssSelectorForHost8 = "shop-cart[name='cart']";
        String cssSelectorForHost9 = " div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > shop-cart-item:nth-child(1)";
        Thread.sleep(1000);
        SearchContext shadow4 = driver.findElement(By.cssSelector("shop-app[page='cart']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow5 = shadow4.findElement(By.cssSelector("shop-cart[name='cart']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow6 = shadow5.findElement(By.cssSelector(" div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > shop-cart-item:nth-child(1)")).getShadowRoot();
        Thread.sleep(1000);

        String actual = shadow6.findElement(By.cssSelector(".name")).getText();
        String expected = "Anvil L/S Crew Neck - Grey";
        Assert.assertEquals(actual,expected );
        //System.out.println(actual);
        //size
        String actual1 = shadow6.findElement(By.cssSelector(".size")).getText();
        String expected1 = "Size: XL";
        Assert.assertEquals(actual1,expected1 );
       // System.out.println(actual1);
        driver.navigate().back();
        driver.navigate().back();
        js.executeScript("window.scrollBy(260,0)", "");

        //return to main and add another
        //This Element is inside 4 nested shadow DOM.
        String SelectorForHost10 = "shop-app[page='list']";
        String SelectorForHost11 = "shop-list[name='list']";
        String SelectorForHost12 = " ul:nth-child(6) > li:nth-child(3) > a:nth-child(1) > shop-list-item:nth-child(1)";
        String SelectorForHost13 = "shop-image";
        Thread.sleep(1000);
        SearchContext sh7 = driver.findElement(By.cssSelector("shop-app[page='list']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext sh8 = sh7.findElement(By.cssSelector("shop-list[name='list']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext sh9 = sh8.findElement(By.cssSelector(" ul:nth-child(6) > li:nth-child(3) > a:nth-child(1) > shop-list-item:nth-child(1)")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext sh10 = sh9.findElement(By.cssSelector("shop-image")).getShadowRoot();
        Thread.sleep(1000);
        sh10.findElement(By.cssSelector("img[alt='Green Flex Fleece Zip Hoodie']")).click();
        //add to cart
        String SelectorForHost1 = "shop-app[page='detail']";
        String SelectorForHost2 = "shop-detail[name='detail']";
        Thread.sleep(1000);
        SearchContext sd1 = driver.findElement(By.cssSelector("shop-app[page='detail']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext sd2 = sd1.findElement(By.cssSelector("shop-detail[name='detail']")).getShadowRoot();
        Thread.sleep(1000);

        sd2.findElement(By.cssSelector("option[value='XL']")).click();
        sd2.findElement(By.cssSelector("option[value='5']")).click();
        js.executeScript("window.scrollBy(0,260)", "");
        Thread.sleep(2500);
        sd2.findElement(By.cssSelector("button[aria-label='Add this item to cart']")).click();
        Thread.sleep(1000);

        //cart page
        SearchContext sl2 = driver.findElement(By.cssSelector("shop-app[page='detail']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext sl3 = sl2.findElement(By.cssSelector(".opened")).getShadowRoot();
        Thread.sleep(1000);
        sl3.findElement(By.cssSelector("a[href='/cart']")).click();

        //image
        //This Element is inside 3 nested shadow DOM.
        String cssimg1 = "shop-app[page='cart']";
        String cssimg2 = "shop-cart[name='cart']";
        String cssimg3 = " div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > shop-cart-item:nth-child(1)";
        Thread.sleep(1000);
        SearchContext img0 = driver.findElement(By.cssSelector("shop-app[page='cart']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext img1 = img0.findElement(By.cssSelector("shop-cart[name='cart']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext img2 = img1.findElement(By.cssSelector(" div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > shop-cart-item:nth-child(1)")).getShadowRoot();
        Thread.sleep(1000);

        //String img_ = img2.findElement(By.cssSelector("shop-image"));
        //System.out.println(img_);
        WebElement l =driver.findElement(By.cssSelector("shop-image"));;
        //getAttribute() to get src of image
        System.out.println("Src attribute is: "+ l.getAttribute("src"));
        //driver.quit();
//        //This Element is inside 3 nested shadow DOM.
//        String cssSelectorForHost1 = "shop-app[page='cart']";
//        String cssSelectorForHost2 = "shop-cart[name='cart']";
//        String cssSelectorForHost3 = " div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > shop-cart-item:nth-child(2)";
//        Thread.sleep(1000);
//        SearchContext shadow0 = driver.findElement(By.cssSelector("shop-app[page='cart']")).getShadowRoot();
//        Thread.sleep(1000);
//        SearchContext shadow1 = shadow0.findElement(By.cssSelector("shop-cart[name='cart']")).getShadowRoot();
//        Thread.sleep(1000);
//        SearchContext shadow2 = shadow1.findElement(By.cssSelector(" div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > shop-cart-item:nth-child(2)")).getShadowRoot();
//        Thread.sleep(1000);
//        shadow2.findElement(By.cssSelector("a[title='Green Flex Fleece Zip Hoodie']"));
        //
        //driver.navigate().back();
        //driver.navigate().back();
        //total price calculate
        //This Element is inside 2 nested shadow DOM.
//        String csstot1 = "shop-app[page='cart']";
//        String csstot2 = "shop-cart[name='cart']";
//        Thread.sleep(1000);
//        SearchContext tl0 = driver.findElement(By.cssSelector("shop-app[page='cart']")).getShadowRoot();
//        Thread.sleep(1000);
//        SearchContext tl1 = tl0.findElement(By.cssSelector("shop-cart[name='cart']")).getShadowRoot();
//        Thread.sleep(1000);
//        String s = "Total\n" ;
//        //$339.00
//        String cart_total =  s+tl1.findElement(By.cssSelector(".subtotal")).getText();
        //System.out.println(cart_total);

//        //go to form fill and submit
//        String cssSelector7 = "shop-app[page='cart']";
//        String cssSelector8 = "shop-cart[name='cart']";
//        Thread.sleep(1000);
//        SearchContext shadoww4 = driver.findElement(By.cssSelector("shop-app[page='cart']")).getShadowRoot();
//        Thread.sleep(1000);
//        SearchContext shadoww5 = shadoww4.findElement(By.cssSelector("shop-cart[name='cart']")).getShadowRoot();
//        Thread.sleep(1000);
//        shadoww5.findElement(By.cssSelector("a[href='/checkout']")).click();
//
//
//        //form
//        String SForHost9 = "shop-app[page='checkout']";
//        String SForHost10 = "shop-checkout[name='checkout']";
//        Thread.sleep(1000);
//        SearchContext shadoww6 = driver.findElement(By.cssSelector("shop-app[page='checkout']")).getShadowRoot();
//        Thread.sleep(1000);
//        SearchContext shadoww7 = shadoww6.findElement(By.cssSelector("shop-checkout[name='checkout']")).getShadowRoot();
//        Thread.sleep(1000);
//        //name
//        shadoww7.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("nadia@gmmail.com");
//        //number
//        Thread.sleep(1000);
//        shadoww7.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("0171171117");
//        //ship add
//        Thread.sleep(1000);
//        shadoww7.findElement(By.cssSelector("input[placeholder='Address'][name='shipAddress']")).sendKeys("Rajshahi");
//        //ship city
//        Thread.sleep(1000);
//        shadoww7.findElement(By.cssSelector("input[placeholder='City'][name='shipCity']")).sendKeys("Rajshahi");
//        //ship state.
//        Thread.sleep(1000);
//        shadoww7.findElement(By.cssSelector("input[placeholder='State/Province'][name='shipState']")).sendKeys("Natore");
//        //zip
//        Thread.sleep(1000);
//        js.executeScript("window.scrollBy(0,260)", "");
//        //state
//        String statecss1 = "shop-app[page='checkout']";
//        String statecss2 = "shop-checkout[name='checkout']";
//        Thread.sleep(1000);
//        SearchContext st0 = driver.findElement(By.cssSelector("shop-app[page='checkout']")).getShadowRoot();
//        Thread.sleep(1000);
//        SearchContext st1 = st0.findElement(By.cssSelector("shop-checkout[name='checkout']")).getShadowRoot();
//        Thread.sleep(1000);
//        st1.findElement(By.cssSelector(" div:nth-child(2) > iron-pages:nth-child(1) > div:nth-child(1) > iron-form:nth-child(1) > form:nth-child(1) > div:nth-child(3) > section:nth-child(1) > div:nth-child(8) > shop-select:nth-child(2) > shop-md-decorator:nth-child(2)"));
//        //
//        shadoww7.findElement(By.cssSelector("input[placeholder='Zip/Postal Code'][name='shipZip']")).sendKeys("6000");
//        //cardholder name
//        Thread.sleep(1000);
//        shadoww7.findElement(By.cssSelector("input[placeholder='Cardholder Name']")).sendKeys("Diya");
//        //card num
//        Thread.sleep(1000);
//        shadoww7.findElement(By.cssSelector("input[placeholder='Card Number']")).sendKeys("000000000011223");
//        //cvv
//        Thread.sleep(1000);
//        shadoww7.findElement(By.cssSelector("input[placeholder='CVV']")).sendKeys("9999");
//        //wait
//        // js.executeScript("window.scrollBy(0,260)", "");
//
//        //form total
//
//        String cssft1 = "shop-app[page='checkout']";
//        String cssft2 = "shop-checkout[name='checkout']";
//        Thread.sleep(1000);
//        SearchContext ft0 = driver.findElement(By.cssSelector("shop-app[page='checkout']")).getShadowRoot();
//        Thread.sleep(1000);
//        SearchContext ft1 = ft0.findElement(By.cssSelector("shop-checkout[name='checkout']")).getShadowRoot();
//        Thread.sleep(1000);
//        String form_total = ft1.findElement(By.cssSelector(".row.total-row")).getText();
//
////        String cssft1 = "shop-app[page='checkout']";
////        String cssft2 = "shop-checkout[name='checkout']";
////        Thread.sleep(1000);
////        SearchContext ft0 = driver.findElement(By.cssSelector("shop-app[page='checkout']")).getShadowRoot();
////        Thread.sleep(1000);
////        SearchContext ft1 = ft0.findElement(By.cssSelector("shop-checkout[name='checkout']")).getShadowRoot();
////        Thread.sleep(1000);
////        String form_total = ft1.findElement(By.cssSelector(" div:nth-child(2) > iron-pages:nth-child(1) > div:nth-child(1) > iron-form:nth-child(1) > form:nth-child(1) > div:nth-child(3) > section:nth-child(2) > div:nth-child(8) > div:nth-child(2)")).getText();
//
//        Assert.assertEquals(cart_total,form_total );
//        System.out.println(cart_total);
//        System.out.println(form_total);
//        //click place order
//
//        String cssclk1 = "shop-app[page='checkout']";
//        String cssclk2 = "shop-checkout[name='checkout']";
//        Thread.sleep(1000);
//        SearchContext clk0 = driver.findElement(By.cssSelector("shop-app[page='checkout']")).getShadowRoot();
//        Thread.sleep(1000);
//        SearchContext clk1 = clk0.findElement(By.cssSelector("shop-checkout[name='checkout']")).getShadowRoot();
//        Thread.sleep(1000);
//        clk1.findElement(By.cssSelector("input[value='Place Order']")).click();
//        //end form
//        Thread.sleep(2500);
//        //back to home.
//        String cssend1 = "shop-app[page='checkout']";
//        Thread.sleep(1000);
//        SearchContext shadow = driver.findElement(By.cssSelector("shop-app[page='checkout']")).getShadowRoot();
//        Thread.sleep(1000);
//        shadow.findElement(By.cssSelector("a[aria-label='SHOP Home']")).click();
//        Thread.sleep(2500);
//        Thread.sleep(3000);
//        //

    }
    @Test
    public void shop_management20() throws InterruptedException {

        driver_method();

    }
    WebDriver driver = new ChromeDriver();
    public void driver_method() {
        driver.get("https://shop.polymer-project.org/");

        driver.manage().window().maximize();
    }
    public void home() throws InterruptedException {
        driver_method();
        String cssSelectorFor = "shop-app[page='home']";
        String cssSelectorForH= ".iron-selected";
        //Thread.sleep(1000);
        SearchContext shadow0 = driver.findElement(By.cssSelector("shop-app[page='home']")).getShadowRoot();
        //Thread.sleep(1000);
        SearchContext shadow1 = shadow0.findElement(By.cssSelector(".iron-selected")).getShadowRoot();
        //Thread.sleep(1000);
        String ActualTitle = shadow1.findElement(By.cssSelector(" div:nth-child(2) > h2:nth-child(2)")).getText();
        System.out.println(ActualTitle);
        //String ActualTitle = driver.getTitle();

        String ExpectedTitle = "Men's Outerwear";
        Assert.assertEquals(ActualTitle,ExpectedTitle );

        Thread.sleep(1000);
        SearchContext shadow00 = driver.findElement(By.cssSelector("shop-app[page='home']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext shadow11 = shadow00.findElement(By.cssSelector(".iron-selected")).getShadowRoot();
        Thread.sleep(1000);
        //shadow11.findElement(By.cssSelector("a[aria-label=\"Men's Outerwear Shop Now\"]").click();
        shadow11.findElement(By.cssSelector("a[aria-label=\"Men's Outerwear Shop Now\"]")).click();
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,260)", "");
        //js.executeScript("window.scrollBy(0,360)", "");
        Thread.sleep(2500);

        driver.findElement(By.xpath("//shop-app[.='SHOP']")).click();
        //This Element is inside 2 nested shadow DOM.
        String cssSelectorForHost1 = "shop-app[page='detail']";
        String cssSelectorForHost2 = "shop-detail[name='detail']";
        Thread.sleep(1000);
        SearchContext s1 = driver.findElement(By.cssSelector("shop-app[page='detail']")).getShadowRoot();
        Thread.sleep(1000);
        SearchContext s2 = s1.findElement(By.cssSelector("shop-detail[name='detail']")).getShadowRoot();
        Thread.sleep(1000);

        s2.findElement(By.cssSelector("option[value='XL']")).click();
        s2.findElement(By.cssSelector("option[value='5']")).click();
        js.executeScript("window.scrollBy(0,260)", "");
        Thread.sleep(2500);
        s2.findElement(By.cssSelector("button[aria-label='Add this item to cart']")).click();
    }





}