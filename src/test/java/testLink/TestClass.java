package testLink;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass {
	//WebDriver driver=ActionClass.driver;
	
	@BeforeClass
	public void launch()
	{
		 ActionClass.launchBrowser();
	}
	@Test
	public void test001_basic_auth_test() throws InterruptedException, AWTException{
		String text=ActionClass.basic_auth();
		Assert.assertEquals(text, "Congratulations! You must have the proper credentials.");
		Reporter.log("Congratulations! You must have the proper credentials.");
	}
	
	/*@Test
	public void test002_Check_for_Broken_Image() throws InterruptedException{
		ActionClass.Broken_Images();
	}
	 
	@Test
	public void test003_aExit_Intent() throws InterruptedException, AWTException{
		String text=ActionClass.Exit_Intent();
		Assert.assertEquals(text, "THIS IS A MODAL WINDOW");
	}
	
	@Test 
	public void test003_bExit_Intent_Dissappear() throws InterruptedException, AWTException{
		Assert.assertFalse(ActionClass.Exit_Intent_Dissappear());
	
	}
	
	
	
	
	@Test
	public  void test004_Sortable_Data_Tables() {
		ActionClass.Sortable_Data_Tables();
		
	}
	  @Test
	   public void test005_authenticate(){
		
		   Assert.assertTrue(ActionClass.verify_login_page());
	   }
	   
	   @Test
	   public void test006_authenticate_Invalid(){
		 
		   String element= ActionClass.verify_invalid_credentiails();
		   Assert.assertEquals(element, "Your username is invalid!");
	   }
	   
	   @Test
	   public void test007_authenticate_valid() throws InterruptedException{
		 
		   String element= ActionClass.verify_valid_credentiails();
		   System.out.println(element);
		   Assert.assertEquals(element, "Youloggedoutofthesecurearea!×");
	   }
	   
	
	   @Test
	   public void test008_test_For_3Images_Displayed() throws InterruptedException{
		 
		   int size = ActionClass.test_For_3Images_Displayed();
		   System.out.println(size);
		   
		   Assert.assertEquals(size, 3);
	   }
	   
	   @Test
	   public void test009_Hover_mouse_over(){
		   
		   WebElement details= ActionClass.Hover_mouse_over();
		 
		   //Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'name: user1')]")).isDisplayed());
		   
		   Assert.assertTrue(details.isDisplayed());
				   
//		   Assert.assertEquals(uname, "name: user1");
//		   Assert.assertEquals(viewProfile, "View profile");
		   
	   }
	   
	
	 @Test
	   public void test010_WYSIWYG_Editor_Visible() throws InterruptedException
	   {	WebElement element=ActionClass.WYSIWYG_Editor_Visible();
	   Assert.assertTrue(element.isDisplayed());
		   
	   }
	
	   @Test
	   public void test011_WYSIWYG_Editor() throws InterruptedException
	   {	
		    String  text= ActionClass.WYSIWYG_Editor();
		    Assert.assertEquals(text, "strong");
		   
	   }
	 
	   @Test
	   public void test012_Status_Codes() throws InterruptedException
	   {
		   int text= ActionClass.Status_Codes();
		   System.out.println(text);
		   //Assert.assertEquals(text,"Thispagereturneda404statuscode.ForadefinitionandcommonlistofHTTPstatuscodes,gohere");
		   Assert.assertEquals(text,404);
	   }
	  

*/}