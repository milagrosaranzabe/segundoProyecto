package Edit.AutomationExercise;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class enviarMensaje {

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
			
		//CP - 04 Enviar mensaje
		// 1. Hacer click en el botón Contact Us
		WebElement btnContactUs = driver.findElement(By.partialLinkText("Contact"));
		btnContactUs.click();
		
		// 2. Rellenar el formulario
		// Nombre
		WebElement txtName = driver.findElement(By.name("name"));
		txtName.sendKeys("Pepita");
		
		// Email
		WebElement txtEmail = driver.findElement(By.name("email"));
		txtEmail.sendKeys("test1234");
		
		// Asunto
		WebElement txtSubject = driver.findElement(By.name("subject"));
		txtSubject.sendKeys("Mensaje de contacto");
		
		// Mensaje
		WebElement txtMessage = driver.findElement(By.id("message"));
		txtMessage.sendKeys("Quiero solicitar más información acerca de la tienda online");
		
		// Adjunto de archivo.txt
		WebElement fileAttached = driver.findElement(By.name("upload_file"));
		fileAttached.sendKeys("C://archivoTest.txt");

		
		// 3. Hacer click en el botón Submit
		WebElement btnSubmit = driver.findElement(By.name("submit"));
		btnSubmit.click();
		
		
		// Cerrar el navegador
		driver.close();
		

	}

}
