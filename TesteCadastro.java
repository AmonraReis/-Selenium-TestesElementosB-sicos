package seleniumcurso;

import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class TesteCadastro {
           @Test
           
           public void testeCadastro () {
       		
       		
       		WebDriver driver = new ChromeDriver();
       		driver.get("file:" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
       		driver.findElement(By.id("elementosForm:nome")).sendKeys("Luiny");
       		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Maria");
       		driver.findElement(By.id("elementosForm:sexo:1")).click();
       		driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
       		
       		new Select(driver.findElement(By.id("elementosForm:escolaridade"))).selectByVisibleText("Mestrado");
       		new Select(driver.findElement(By.id("elementosForm:esportes"))).selectByVisibleText("Futebol");
       		
       		driver.findElement(By.id("elementosForm:cadastrar")).click();
       		
       		Assert.assertTrue(driver.findElement(By.id("resultado")).getText().startsWith("Cadastrado")); //starts with verifica se inicio com cadastrado
       		Assert.assertTrue((driver.findElement(By.id("descNome")).getText()).endsWith("Luiny")); //verifica se terminou com luiny
       		Assert.assertEquals("Sobrenome: Maria", driver.findElement(By.id("descSobrenome")).getText());
       		Assert.assertEquals("Sexo: Feminino", driver.findElement(By.id("descSexo")).getText());
       		Assert.assertEquals("Comida: Pizza", driver.findElement(By.id("descComida")).getText());
       		Assert.assertEquals("Escolaridade: mestrado", driver.findElement(By.id("descEscolaridade")).getText());
       		Assert.assertEquals("Esportes: Futebol", driver.findElement(By.id("descEsportes")).getText());
       		
       		
       		
       		
       		
       		
       		
       		
       		
       				
       		
}
           
}
