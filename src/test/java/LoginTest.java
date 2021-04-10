import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LoginTest extends BaseTest{

    @Test
    @Order(1)
    public void homePage(){
        methodsPage.homePage();
    }

    @Test
    @Order(2)
    public void login(){
        methodsPage.login("gittigidiyordenemehesap@gmail.com", "A1b2C3d4E5");
        //Assertions.assertEquals("gittigidiyordenemehesap@gmail.com", methodsPage.getUserName(), "UserName is True");
    }

    @Test
    @Order(3)
    public void searchComputer(){
        methodsPage.searchComputer("bilgisayar");
    }

    @Test
    @Order(4)
    public void goToPageTwo(){

        methodsPage.goToPageTwo();
    }

    @Test
    @Order(5)
    public void selectRandomComputer(){
        methodsPage.selectRandomComputer();
    }

    @Test
    @Order(6)
    public void addToBasket(){
        methodsPage.addToBasket();
    }

    @Test
    @Order(7)
    public void priceValue(){
        methodsPage.priceValue();
    }

    @Test
    @Order(8)
    public void goToBasket(){
        methodsPage.goToBasket();
    }

    @Test
    @Order(9)
    public void increaseBasketValue(){
        methodsPage.increaseBasketValue();
    }

    @Test
    @Order(10)
    public void clearBasket(){
        methodsPage.clearBasket();
    }
}
