package test;

import base.baseSetUp;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;
import pagesObjects.*;

import java.net.MalformedURLException;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class androidReserva extends baseSetUp {

    reservarPage reservarPage;

    @Test
    public void test_reservar() throws MalformedURLException, InterruptedException {

        Android_setUp();
        reservarPage = new reservarPage(driver);

        Thread.sleep(2000);
        reservarPage.clickAceptar();
        Thread.sleep(2000);
        reservarPage.clickX();
        Thread.sleep(2000);
        reservarPage.clickDestino();
        Thread.sleep(2000);
        reservarPage.insertDestino("Cuzco");
        Thread.sleep(2000);
        reservarPage.clickCuzco();
        Thread.sleep(2000);

        verticalSwipeByPercentages(0.6, 0.3, 0.5);
        verticalSwipeByPercentages(0.6, 0.3, 0.5);
        verticalSwipeByPercentages(0.6, 0.3, 0.5);
        verticalSwipeByPercentages(0.6, 0.3, 0.5);
        verticalSwipeByPercentages(0.6, 0.3, 0.5);
        verticalSwipeByPercentages(0.6, 0.3, 0.5);

        reservarPage.clickIda();
        reservarPage.clickVuelta();
        Thread.sleep(2000);
        reservarPage.clickFechas();

        reservarPage.clickPersonas();
        Thread.sleep(2000);
        reservarPage.clickMas();
        Thread.sleep(2000);

        verticalSwipeByPercentages(0.6, 0.3, 0.5);
        verticalSwipeByPercentages(0.6, 0.5, 0.5);
        verticalSwipeByPercentages(0.6, 0.5, 0.5);

        reservarPage.clickOk();
        Thread.sleep(2000);

        reservarPage.clickAplicar();
        Thread.sleep(2000);
        reservarPage.clickBuscar();
        Thread.sleep(2000);
        reservarPage.clickItem();
        Thread.sleep(2000);
        reservarPage.clickHabitacion();
        Thread.sleep(2000);
        reservarPage.clickReservar();


    }

    public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);



        new TouchAction(driver)
                .press(point(anchor, startPoint))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(anchor, endPoint))
                .release().perform();
    }

}
