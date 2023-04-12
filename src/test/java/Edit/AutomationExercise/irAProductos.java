package Edit.AutomationExercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class irAProductos {

	// Atributos
	String url = "https://automationexercise.com/";
	WebDriver driver;

	// Abrir el navegador
	@Test
	public void abrirNavegador() {
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		// CP 04 - Comprar un producto
		
		// 1. Hacer click en el botón Products
		WebElement btnProducts = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]"));
		btnProducts.click();
		
		// Cerrar el navegador
		driver.close();
		
	}	

}
