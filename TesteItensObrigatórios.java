///Nesta bateria de testes realizo a verificação de todos os itens obrigatórios no sistema, validando se estão funcionando de forma correta.



package seleniumcurso;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TesteItensObrigatórios {
	@Test
	public void testeNomeObrigatório () {
		
		   
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.findElement(By.id("elementosForm:cadastrar")).click();
		Alert alert = driver.switchTo().alert(); //muda o foco para o alerta
	 Assert.assertEquals("Nome eh obrigatorio", alert.getText());
	    
		}


	@ Test
	 public void ValidarSobreNomeObrigatório () {
	 WebDriver driver = new ChromeDriver();
	 driver.get("file:" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
	 
	 driver.findElement(By.id("elementosForm:nome")).sendKeys("teste");
	 
	 driver.findElement(By.id("elementosForm:cadastrar")).click();
		Alert alert = driver.switchTo().alert();
		
		Assert.assertEquals("Sobrenome eh obrigatorio", alert.getText());
	 


	}@Test
	 

		public void ValidarSexo () {
		WebDriver driver = new ChromeDriver();
		driver.get("file:" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		driver.findElement(By.id("elementosForm:nome")).sendKeys("teste"); //preenche os dois obrigatorios
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("teste2");
		
		 driver.findElement(By.id("elementosForm:cadastrar")).click(); //clica em cadastrar
		 Alert alert = driver.switchTo().alert(); //altera o foco
	   	
		 Assert.assertEquals("Sexo eh obrigatorio", alert.getText()); //assert equals para ver se ele está solicitando o item obrigatorio
		    
		
		
		}
	@Test
			public void ValidarComidaVegetariana () {
			WebDriver driver = new ChromeDriver();
			driver.get("file:" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
			
			driver.findElement(By.id("elementosForm:nome")).sendKeys("teste"); //item obrigatório preencher
			driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("teste2"); //item obrigatório preencher
			driver.findElement(By.id("elementosForm:sexo:0")).click(); //item obrigatório preencher
			
			driver.findElement(By.id("elementosForm:comidaFavorita:0")).click(); //seleciona carne
			driver.findElement(By.id("elementosForm:comidaFavorita:3")).click(); //seleciona vegetariana
			
			driver.findElement(By.id("elementosForm:cadastrar")).click(); //clica no boyao
			Alert alert = driver.switchTo().alert(); //altera o foco
			
			Assert.assertEquals("Tem certeza que voce eh vegetariano?", alert.getText()); //verifica a mensagem de mal uso do usuário
			




	}
	@Test
			public void ValidarEsporte () {
			WebDriver driver = new ChromeDriver();
			driver.get("file:" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
			
			driver.findElement(By.id("elementosForm:nome")).sendKeys("teste"); //item obrigatório preencher
			driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("teste2"); //item obrigatório preencher
			driver.findElement(By.id("elementosForm:sexo:0")).click(); //item obrigatório preencher
			
			driver.findElement(By.id("elementosForm:comidaFavorita:0")).click(); //seleciona carne
			
			Select combo = new Select (driver.findElement(By.id("elementosForm:esportes"))); //abre o combo de selecões
			combo.selectByVisibleText("Futebol"); //seleciona esporte
			combo.selectByVisibleText("O que eh esporte?"); //e seleciona que n sabe oq é
			
			driver.findElement(By.id("elementosForm:cadastrar")).click(); //clica no boyao
			Alert alert = driver.switchTo().alert(); //altera o foco
			
			Assert.assertEquals("Voce faz esporte ou nao?", alert.getText()); //verifica a mensagem de mal uso do usuário
			
			
			
			
	}
			}


	
	

   
