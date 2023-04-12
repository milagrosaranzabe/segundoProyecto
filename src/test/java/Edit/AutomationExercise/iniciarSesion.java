package Edit.AutomationExercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iniciarSesion {
	
	// Atributos
		String url ="https://automationexercise.com/";
		WebDriver driver;
		

	// CP 02 - Iniciar Sesión con credenciales válidas
	@Test
	public void abrirNavegador() {
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
			
			
		// Localización de elementos
			
		// 1. Hacer click en el botón "Signup/Login"
		WebElement btnLogin = driver.findElement(By.partialLinkText("Signup / Log"));
		btnLogin.click();
		
		// Email
		WebElement txtEmail = driver.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]"));
		txtEmail.sendKeys("pepita@gmail.com");
		
		// Contraseña
		WebElement txtPassword = driver.findElement(By.name("password"));
		txtPassword.sendKeys("test1234");
		
		
		// 2. Hacer click en el botón Login
		WebElement btnLogin2 = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		btnLogin2.click();
		
		
		// Cerrar el navegador
		driver.close();
		
	}

}
