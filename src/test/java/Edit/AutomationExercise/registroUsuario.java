package Edit.AutomationExercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class registroUsuario {
	
	// Atributos
	String url ="https://automationexercise.com/";
	WebDriver driver;
	

	// CP 01 - Registrar Usuario con credenciales válidas
	@Test
	public void abrirNavegador() {
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		// Localización de elementos
		
		// 1. Hacer click en el botón "Signup/Login"
		WebElement btnSignUp = driver.findElement(By.partialLinkText("Signup / Log"));
		btnSignUp.click();
		
		
		// 2. Completar el formulario de "SignUp"
		// Nombre
		WebElement txtName = driver.findElement(By.name("name"));
		txtName.sendKeys("pepita");
		
		// Se crea una variable para generar un correo aleatorio
		String email = "test" + Math.random() + "@gmail.com"; //Es buena práctica colocar test para la pruebas

		// Email
		WebElement txtEmail = driver.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]"));
		txtEmail.sendKeys(email);
		
		
		// 3. Hacer click en el botón Sign up
		WebElement btnSignup = driver.findElement(By.xpath("//button[contains(text(),'Signup')]"));
		btnSignup.click();
		
		
		// 4.  Completar la Información de cuenta
		// Botón de radio
		WebElement radTitle = driver.findElement(By.id("id_gender2"));
		radTitle.click();
		
		// Contraseña
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("test1234");
		
		// Día
		Select selDays = new Select(driver.findElement(By.id("days")));
		selDays.selectByVisibleText("12  ");
		
		// Mes
		Select selMonth = new Select(driver.findElement(By.name("months")));
		selMonth.selectByValue("1");
		
		// Año
		Select selYear = new Select(driver.findElement(By.id("years")));
		selYear.selectByIndex(28);
		
		// Checkbox Newsletter
		WebElement checkNews = driver.findElement(By.xpath("//label[contains(text(),'Sign up for our newsletter!')]"));
		checkNews.click();
		
		// CheckBox Offers
		WebElement checkOffers = driver.findElement(By.xpath("//label[contains(text(),'Receive special offers from our partners!')]"));
		checkOffers.click();
		
		
		// 5. Completar la Información de la dirección
		// Nombre
		WebElement txtFirstname = driver.findElement(By.id("first_name"));
		txtFirstname.sendKeys("Pepita");
		
		// Apellido
		WebElement txtLastname = driver.findElement(By.id("last_name"));
		txtLastname.sendKeys("Perez");
		
		// Compañia
		WebElement txtCompany = driver.findElement(By.id("company"));
		txtCompany.sendKeys("Pepita Inc.");
		
		// Dirección
		WebElement txtAddress = driver.findElement(By.id("address1"));
		txtAddress.sendKeys("Libertad 2023");
		
		// País
		Select selCountry = new Select(driver.findElement(By.id("country")));
		selCountry.selectByValue("United States");
		
		// Estado
		WebElement txtState = driver.findElement(By.id("state"));
		txtState.sendKeys("Florida");
		
		// Ciudad
		WebElement txtCity = driver.findElement(By.id("city"));
		txtCity.sendKeys("Miami");
		
		// Código Postal
		WebElement txtCode = driver.findElement(By.id("zipcode"));
		txtCode.sendKeys("33124");
		
		// Celular
		WebElement txtMobile = driver.findElement(By.id("mobile_number"));
		txtMobile.sendKeys("90056742");
		
		
		// 6. Hacer click en el botón Create Account
		WebElement btnCreateAcc = driver.findElement(By.xpath("//button[contains(text(),'Create Account')]"));
		btnCreateAcc.click();
		
		
		// 7. Hacer click en el botón Continue
		WebElement btnContinue = driver.findElement(By.linkText("Continue"));
		btnContinue.click();
		
		
		// Cerrar la ventana del navegador
		driver.close();
	}

	
}
