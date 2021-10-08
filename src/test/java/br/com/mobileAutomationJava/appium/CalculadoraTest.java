package br.com.mobileAutomationJava.appium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.*;


public class CalculadoraTest {
    DriverFactory driverFactory = new DriverFactory();

    @BeforeEach
    public void inicializarWebdriver() throws MalformedURLException {

        driverFactory = new DriverFactory();
        driverFactory.setCapabilities("Android","ChronosMobile64", "uiautomator2", "com.android.calculator2","com.android.calculator2.Calculator");
        driverFactory.setDriver();
    }

    @AfterEach
    public void finalizaDriver(){

        driverFactory.getDriver().quit();
    }

    @Test
    public void validarMultiplicacao() {

        clicaElementoPorId("digit_7");
        clicaElementoPorId("op_mul");
        clicaElementoPorId("digit_9");
        clicaElementoPorId("eq");
        String resultado = driverFactory.getDriver().findElement(By.id("result")).getText();
        assertEquals("63", resultado);
    }

    @Test
    public void validarSoma() {

        clicaElementoPorId("digit_7");
        clicaElementoPorId("op_add");
        clicaElementoPorId("digit_9");
        clicaElementoPorId("eq");
        String resultado = driverFactory.getDriver().findElement(By.id("result")).getText();
        assertEquals("16", resultado);
    }

    @Test
    public void validarSubtracao() {

        clicaElementoPorId("digit_7");
        clicaElementoPorId("op_sub");
        clicaElementoPorId("digit_9");
        clicaElementoPorId("eq");
        String resultado = driverFactory.getDriver().findElement(By.id("result")).getText();
        assertEquals("−2", resultado);
    }

    @Test
    public void validarDivisao() {

        clicaElementoPorId("digit_7");
        clicaElementoPorId("op_div");
        clicaElementoPorId("digit_9");
        clicaElementoPorId("eq");
        String resultado = driverFactory.getDriver().findElement(By.id("result")).getText();
        assertEquals("0.777777777777", resultado);
    }

    public void clicaElementoPorId(String id){

        driverFactory.getDriver().findElement(By.id(id)).click();
    }
}
