package com.Scopex.POMPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass_LoginPage {
	
	private WebDriver driver;
	
	
	@FindBy(xpath="//a[text()='Contact us']")
	private WebElement ContactUs;
	
	@FindBy(xpath="//a[text()='FAQs']")
	private WebElement FAQs;
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement Register;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement Login;
	
	@FindBy(xpath="//a[text()='Send money']")
	private WebElement SendMoney;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement EmailAddress;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement Password;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement LoginBtn;
	
	@FindBy(xpath="//div[text()='You have entered an invalid email address!.']")
	private WebElement LoginMessage;
	
	@FindBy(xpath="//input[@name='full_name']")
	private WebElement NameTextbox;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement EmailTextbox;
	
	@FindBy(xpath="//textarea[@name='message']")
	private WebElement MessageTextbox;
	
	public void ContactUsClick()
	{
		ContactUs.click();
	}
	
	public void FAQsClick()
	{
		FAQs.click();
	}
	
	public void RegisterClick()
	{
		Register.click();
	}
	
	public void LoginClick()
	{
		Login.click();
	}
	
	public void SendMoneyClick()
	{
		SendMoney.click();
	}
	
	public void EmailAddressSendKeys()
	{
		EmailAddress.sendKeys("abcde");
	}
	
	public void passwordSendKeys()
	{
	    Password.sendKeys("12345");	
	}
	
	public void LoginBtnClick()
	{
		LoginBtn.click();
	}
	
	public String LoginMessageText()
	{		
	   String LoginMessageEle = LoginMessage.getText();
	   return LoginMessageEle;
	}
	
	public boolean NameTextboxClick()
	{
		boolean Result1 = NameTextbox.isEnabled();
		return Result1;
	}
	
	public boolean EmailTextboxEnbled()
	{
		boolean Result2 = EmailTextbox.isEnabled();
		return Result2;
	}
	
	public boolean MessageTextboxEnbled()
	{
		boolean Result3 = EmailTextbox.isEnabled();
		return Result3;
	}
	
	
	
	
	public POMClass_LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
