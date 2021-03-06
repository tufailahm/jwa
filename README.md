https://revature.zoom.us/s/7841280666#success


JDK 1.8
Eclipse /IntelliJ

Core Java 
--------------------------


What is Java ?
# Java

Java is an Object Oriented Programming language.
Java is a platform independent language
It was picked up by Oracle, that develops 1 common implementation of the JRE and JDK, and through their (and others) efforts, Java has become very widely used.

## Features/Characteristics

- Object Oriented
- Strongly and Statically Typed
- Platform indepdendent
- Leverages Java ByteCode (.class files) to accomplish distribution of Java programs
    - Makes it easier to share/collaborate
- Garbage Collector handles Memory Management for the developer
- The JVM is small, and so can be run on many different platforms
    - Particularly useful for embedded systems (Raspberry Pis)
- Many standard libraries are provided
- Relatively performant
    - Not as fast as C or C++, but faster than most other languages
- As of Java 8, introduced some APIs for Functional Programming




##***  JVM / JRE / JDK

JDK stands for Java Devlopment Kit		- JRE and JVM

JRE stands for Java Runtime Environment	- JVM

JVM stands for Java Virtual Machine

JDK contains the JRE, as well as many different developer tools, such as the compiler or the archiver.

JRE contains the JVM as well as supporting libraries that the JVM needs to function.



The Java Compiler is the executable that produces Java ByteCode from Java Source Code (From .java to .class)

The JVM (along with the libraries from the JRE) executes the Java ByteCode.



//Compilation
Checks for syntax errors
Converts the java code into bytecodes


//Execution



Hands on - 20 minutes


Customer
	int discount =10;
	int totalBillAmount=85000;

	payBill()
		should display final bill after discount


	applyDiscount()
		
		

	main()

		



	Your final bill after 20 % discount is : 68000 USD


<pre>
Solution :

package com.training.jwa;

public class Customer {
	int discount =25;
	int totalBillAmount=100000;
	int finalBillAmount = 0;
	public void payBill()
	{
		applyDiscount();
		System.out.println("Your final bill after discount is : "+finalBillAmount);
	}
	public void applyDiscount() {
		System.out.println("should apply the discount of "+ discount+"% in final amount");
		System.out.println("Applying "+ discount + "%");	//Applying 20%
		finalBillAmount = totalBillAmount - ( totalBillAmount / 100 * discount);
	}
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.payBill();
		
	}

}


</pre>

Classes and Objects
======================
 a class is a blueprint for how to create an object. 
an object is an instance of a class

Class							Object
Class is declared using class keyword. For example,class Student{}	Object is created through new keyword. For example, Student s1=new Student();
Class is declared once.					Object is created many times as per requirement.
Class doesn't allocated memory when it is created.		Object allocates memory when it is created.


Object Oriented Concepts
========================
An easy way to remember these is with the acronym A PIE. 
Please explain any of these with a real time example.

Four pillars of OOPS

Abstraction
-------------
showing relevant things
Abstraction is a process of hiding implementation details and exposes only the functionality to the user.
 In abstraction, we deal with ideas and not events. 
This means the user will only know ???what it does??? rather than ???how it does???.
By using abstract class
Real time example 
1. Applying brakes
2. Switching on our laptop/computer system
-- in java , we implement abstractingby interfaces and abstract classes (details in week2)

Encapsulation
---------------
Hiding the irrelavent things
Encapsulation is the process of wrapping code and data together into a single unit.
In order to achieve encapsulation in java follow certain steps as proposed below:

Declare the variables as private
Declare the setters and getters to set and get the variable values
Real time : school bag




Polymorphism
----------------
Many forms
Polymorphism is the ability to perform many things in many ways. The word Polymorphism is from two different Greek words- poly and morphs. ???Poly??? means many, and ???Morphs??? means forms. So polymorphism means many forms. 
The polymorphism can be present in the case of inheritance also. The functions behave differently based on the actual implementation.

Real-life Example:

1) A delivery person delivers items to the user. If it???s a postman he will deliver the letters. If it???s a food delivery boy he will deliver the foods to the user. Like this polymorphism implemented different ways for the delivery function.

2) Mobile phones


In java - overloading and overriding



Inheritance
------------
Inheritance is the process of one class inheriting properties and methods from another class in Java. Inheritance is used when we have is-a relationship between objects.  Inheritance in Java is implemented using extends keyword.

is -a relationship

Real-life Example:

The planet Earth and Mars inherits the super class Solar System and Solar system inherits the Milky Way Galaxy. So Milky Way Galaxy is the top super class for Class Solar System, Earth and Mars.


Employee
Manager
Tea
Clerk
Customer
Laptop
Cat

not passing is -a test
Cat extends Employee	
Tea extends Laptop

is-a test


Employee extends Manager	
Clerk extends Employee
Tea extends Beverages



Access specifiers in java
====================

4 access specifiers


public		- least restrictive , everybody can access it
private		- most restrictive, nobody can access it	
default		- package access, only the classes in the same package can access 
protected		- package + child clasess can access 




Access Modifiers
Access modifiers are keywords which define the ability of other code to access the given entity. Modifiers can be placed on classes, interfaces, enums, and class members. The access modifiers are listed below:

Modifier	Access Level
public	Available anywhere
protected	Within the same package, and this class' sub-classes
default	Within the same package
private	Only within the same class
The default access level requires additional clarification - this access level is "default" because there is no keyword to be used. This access level is also known as "package private".

Using private modifiers on instance variables - along with public getter and setter methods - helps with encapsulation, which is one of the pillars of object-oriented programming.


non access modifiers in java 
=====================

static, final, abstract 


Variables scopes in java
==================

4 types

local
instance
class/global
block 


When a variable is declared in a Java program, it is attached to a specific scope within the program, which determines where the variable resides. The different scopes of a variable in Java are:

Instance, or object, scope
Class, or static, scope
Method scope
Block scope

Instance scope means that the variable is attached to individual objects created from the class. When an instance-scoped variable is modified, it has no effect on other, distinct objects of the same class.

Class scoped variables reside on the class definition itself. This means that when objects update a class-scoped variable, the change is reflected across all instances of the class. Class scope is declared with the static keyword. Methods can also be declared as class scope. However, static methods cannot invoke instance methods or variables (think about it: which specific object would they reference?). Static methods and variables should be referenced through the class directly, not through an object. For example: MyClass.myStaticMethod() or MyClass.myStaticVariable.

Method scope is the scope of a variable declared within a method block, whether static or instance. Method-scoped variables are only available within the method they are declared; they do not exist after the method finishes execution (the stack frame is popped from the stack and removed from memory after execution).

Block scoped variables only exist within the specific control flow block, of which there are several in Java: for, while, and do-while loops, if/else-if/else blocks, switch cases, or even just regular blocks of code declared via curly braces ({}). After the block ends, variables declared within it are no longer available.


<pre>

package com.training.jwa;

public class ScopeVariableDemo {

	int num1=100;		//instance scope
	static int maxAge = 120;	//class/global scope
	public void display1() 
	{
		int num2 = 200;		//local/method scope
		
		for(int i=1;i<=3;i++) {	//block scope
			System.out.println(i); //1,2,3
		}
		
	}
	public void display2()
	{
		num1=10;
		
	}
	public static void main(String[] args)
	{
		int result =299;		//local scope
		
	}
}

</pre>


Constructors in java
===================

is a special method which will have same name as the class name
it does not have any return type. not even void
which will gets called automatically whenever you create an object
it is used to initialize instance variables


<pre>

package com.training.jwa;
/*
 * Constructors in java
===================

is a special method which will have same name as the class name
it does not have any return type. not even void
it will gets called automatically whenever you create an object
it is used to initialize instance/member variables
 */
public class Customer {
	
	int discount = 25;
	int totalBillAmount = 100000;
	

	public Customer() {		//default constructor
		System.out.println("Constructor called");
		totalBillAmount = 100;
		discount = 25;
	}
	public void sayHello() {
		System.out.println("Hello");
	}
	public void payBill() {
		int amount= applyDiscount();
		System.out.println("Your final bill after discount is : " + amount);
	}

	public int applyDiscount() {
		System.out.println("should apply the discount of " + discount + "% in final amount");
		System.out.println("Applying " + discount + "%"); // Applying 20%
		//local variable
		int finalBillAmount = totalBillAmount - ( (totalBillAmount /100) * discount);
		return finalBillAmount;
	}

	public static void main(String[] args) {
		System.out.println("Customer 1");
		Customer c1 = new Customer();
		c1.payBill();
		
		
		System.out.println("\nCustomer 2");
		Customer c2 = new Customer();
		c2.payBill();
	}
}


</pre>


JUnit
------------------------

TDD
When developing software, it is important to ensure that most if not all of the code being written is tested to verify the functionality of the code. One way to ensure this is to follow a process called test-driven development, or TDD.

TDD Process
The TDD process consists of writing unit tests first, before the application code has been written. Then, code can be written to make the test pass and the process can be completed for each piece of functionality required. Thus, the process is:

Write a unit test
Run the test => test will fail

Fix the test by writing application code
Retest until the test passes
Repeat
Following the TDD process can be useful for ensuring that a valid unit tests always exists for any class or method that is written. Later, when refactoring code, the unit tests give us confidence that we can change the source code without breaking existing functionality. If we mess up somewhere, when the unit tests are run we can pinpoint exactly where the problem lies. This makes debugging much easier.

Unit Testing
Unit testing is the testing of individual software components in isolation from the rest of the system. This is done by writing unit tests which execute the code we want to inspect. When the code under test deviates from an expected outcome or behavior, the test will fail. If a test passes, it means the application performs as expected (unless there is a problem with the test itself). In Java, the most common unit testing framework is called JUnit.



-- Junit
	
- a framework used to write unit test framework
- it has lot of annotations like @Test,@Before,@After,@BeforeEach,@AfterEach and many more 

What is JUnit ?
	- open source java unit test framework
	- junit5 is known as Jupiter
	You need JDK1.8 for jupiter
	** Compiler to JDK 1.8 


@Test

Use case : We want to create a method to add two numbers 

expected
actual

<pre>
package com.training.jwa;

public class Calculator {

	public int addNumbers(int i, int j) {
		return i+j;
	}

}




package com.training.jwa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
	
	@Test
	void testAddNumbers1() {
		int expected=20;
		Calculator calc = new Calculator();
		int actual = calc.addNumbers(10,10);
		assertEquals(expected, actual);	
	}
	
	@Test
	void testAddNumbers2() {
		int expected=20;
		Calculator calc = new Calculator();
		int actual = calc.addNumbers(3,17);
		assertEquals(expected, actual);	
	}
}

</pre>


============================================================================

Day2 Notes


JUnit Testing - More
Selenium 

@Test

@DisplayName
@Order
@MethodOrderer


Why do we want to order the tests?

How you order the tests in junit ? 

@Order annotation

@Test - declares a method as a test method
	@BeforeClass - declares a setup method that runs once, before all other methods in the class
@Before - declares a setup method that runs before each test method
@After - declares a tear-down method that runs after each test method
	@AfterClass - declares a tear-down method that runs once, after all other methods in the class



multiply (int num1,int num2)
{
	return num1*num2;
}


Test this method now 

Selenium

What is selenium ?
==========================
Selenium is an open-source tool that automates web browsers.
Selenium is an open source project for web browser automation.
 This means that Selenium consists of software that can control a web browser and perform actions like any human user could - for example, navigating to a website, clicking buttons, and filling out forms.
Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation


*** What is selenium web driver ?
Selenium WebDriver is the core of Selenium which provides an API in many different languages for programmers to write code to manipulate the browser.


Use case : I want the selenium to open the chrome browser and visit google.com
package com.training.jwa;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo1 {

	public static void main(String[] args) {
		System.setProperty
		("webdriver.chrome.driver","C:\\Users\\tufai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

	}

}


*** What is the use of WebDriverManager in selenium ?


WebDriverManager - which helps to setup the drivers of different browsers without downloading them manually.

WebDriverManager is an open-source Java library that carries out the management (i.e., download, setup, and maintenance) of the drivers required by Selenium WebDriver (e.g., chromedriver, geckodriver, msedgedriver, etc.) in a fully automated manner. 




Use case : I want the selenium to open the chrome browser or edge browser and visit google.com

I can use webdrivermanager from bonigracia to avoid 



Use case :: I want to test amazon search functionality

a) Setup the driver and open the browser
b) Navigate to amazon.in

c) maximize the browser
d) search for the textbox where to type




<input type="text" id="twotabsearchtextbox" value="ajanta designer wall clock copper" name="field-keywords" autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">

What is locators in selenium ?

A locator is a way to identify elements on a page. It is the argument passed to the Finding element methods.

List out some locators in selenium ?
class name	Locates elements whose class name contains the search value (compound class names are not permitted)
css selector	Locates elements matching a CSS selector
id	Locates elements whose ID attribute matches the search value
name	Locates elements whose NAME attribute matches the search value
link text	Locates anchor elements whose visible text matches the search value
partial link text	Locates anchor elements whose visible text contains the search value. If multiple elements are matching, only the first one will be selected.
tag name	Locates elements whose tag name matches the search value
xpath	Locates elements matching an XPath expression

What is xpath ?
What is XPath in Selenium?
XPath is a technique in Selenium to navigate through the HTML structure of a page. 
XPath enables testers to navigate through the XML structure of any document, and this can be used on both HTML and XML documents

XPath in Selenium is an XML path used for navigation through the HTML structure of the page.
 It is a syntax or language for finding any element on a web page using XML path expression. XPath can be used for both HTML and XML documents to find the location of any element on a webpage using HTML DOM structure.


Wait in selenium
=================

Implicit : (Automatic)
The Implicit Wait in Selenium is used to tell the web driver to wait for a certain amount of time before it throws a ???No Such Element Exception???. The default setting is 0. Once we set the time, the web driver will wait for the element for that time before throwing an exception.


Implicit Wait syntax:
driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);


Explicit : 
The Explicit Wait in Selenium is used to tell the Web Driver to wait for certain conditions (Expected Conditions) or maximum time exceeded before throwing ???ElementNotVisibleException??? exception. It is an intelligent kind of wait, but it can be applied only for specified elements. It gives better options than implicit wait as it waits for dynamically loaded Ajax elements.

Explicit Wait syntax:
WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);


<pre>

package com.training.jwa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * Use case :: I want to test amazon search functionality
 */
public class AmazonSerachFunctionalityTest {

	public static void main(String[] args) {
		String browserName = "chrome";
		
		WebDriver driver = null;
		if(browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		//implicit waits in selenium
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		driver.get("http://www.amazon.in");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphones");
		
		//locating text box by using xpath
		//relative	
		//driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mouse");
		//absolute path
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("speakers");
		
		//wait for 2 minutes
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 120);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"nav-search-submit-button\"]")));
		//hands on 
		//locate the search button and click on that, so that search result gets displayed
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	}
}


</pre>

What is JDK , JRE and JVM ? Java development kit, java runtime environment, java virtual machine
What is Java ? a strongly typed, object oriented, platform independent language
What are access modifiers in java ? default, private, public, protected
How default and protected are different ? protected is same package and child class
What are the different primitive data types that are there in Java ? int, byte, short, long, float, double, boolean and char
What are different scopes of a variables in java ? Instance, class, local, block
What is a constructor? method that shares same name as a class.
Can constructor can be overloaded?  Yes 
What is the difference between overloading and overriding ? overloading 
A mechanism of wrapping/binding of data is called Encapsulation. Is that True?? yes
Is Overriding a polymorphism concept? yes
Is Bubble Sort the simplest algorithm to Sort the elements in ascending Order? yes, quick sort 
Is following modifier concept correct? Public --> The code is accessible for only to particular classes False


What is unit testing ? Testing of each individual component of software
What is junit ? - Is an open source java testing framework. It have many annotations
What is the latest version of junit ?- JUnit 5
List out some junit annotations? @BeforeAll, @BeforeEach, @AfterAll, @AfterEach, @Test, @DisplayName, @Order
List out some junit assert methods ? AssertEqual, AssertNotEqual, AssertThrows

What is selenium? an open source tool for automating web browsers, used for testing
What is web driver ? Core of selenium, provides an api in different languages for programmers to write code and manipulate the browser
What is web driver manager ? A framework that lets us use different web drivers without needing to download each one individually
What is xpath?- Is a syntax used to locate an element in a web application
What are locators in selenium ?- ID, xpath, className, CSS selector, partial link
What is the difference between implicit and explicit wait in selenium ? implicit wait is waiting for a period while explicit wait is for a specific element
Is default wait time of Implicit wait in Selenium 0? yes
Selenium can test both Web and Desktop Applications. Is the statement correct? No it is a tool for testing web application
		The simple answer is no. Selenium is designed to automate web applications, not desktop applications.







QC will be assigned at the end of the second week which is 7/27 & 7/28



Day3
=====================================================
BDD
Cucumber
POM - selenium
Page Factory
Glue code
Gherkin
Gherkin keywords

Testing 
features


BDD :
BDD framework i.e. Behavior Driven Development is a software development approach that allows the tester/business analyst to create test cases in simple text language (English).



when i visit google.com
then i type mobile
then it should give the search results

Cucumber ??? A BDD Framework Tool
Cucumber is a Behavior Driven Development (BDD) framework tool to write test cases.

** Cucumber uses Gherkin language ( its like simple language with some keywords )

 its like simple language with some keywords


THEN
WHEN
SCENARIO
SCENARIO OUTLINE
AND

Selenium : is an automation tool for functional testing of web based applications.


Use case : saucedemo.com and check whether login is successful or not with valid credentials


Feature file - where you will be writing the steps

Feature : user validation 
Scenario: check whether login is successful or not with valid credentials

Given user is an login page
When user enters username and password
And user clicks on submit button
Then  user is navigated to the home page


Glue code : a class which implements all the steps 
 The glue is a part of Cucumber options that describes the location and path of the step definition file.




Data driven testing
=====================



We can use Scenario Outline instead of Scenario for repetive tests


Scenario Outline
Examples 	- are there to provide parameters


Scenario outline is exactly similar to the scenario structure, but the only difference is the provision of multiple inputs.


Examples : are used to provide data to scenario outline

Examples keyword is used to specify values for each parameter used in the scenario. Scenario Outline keyword must always be followed by the keyword Examples



Feature: user validation

  Scenario Outline: check whether login is successful or not with valid credentials
    Given user is an login page
    When user enters <username> and <password>
    And user clicks on submit button
    Then user is navigated to the home page

    Examples: 
      | username        | password     |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |
      | problem_user    | secret_sauce |
      | daniel          | richard      |
      | tufail          | ahmed        |



Glue Code 

package com.training.jwa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	String browserName = "chrome";
	WebDriver driver = null;
	
	@Given("user is an login page")
	public void user_is_an_login_page() {
		
		if(browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	    System.out.println("step - user is an login page");
	}

	@When("user enters {string} and {string}")
	public void user_enters_username_and_password(String username,String password) {
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
	    System.out.println("step - user enters username and password");

	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	    System.out.println("step - user clicks on submit button");
	    driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    System.out.println("step - user is navigated to the home page");
	    String actualURL = driver.getCurrentUrl();
	    String expectedURL = "https://www.saucedemo.com/inventory.html";
	    assertEquals(expectedURL, actualURL);

	}
	
}

----------------------------
What is background in cucumber ?

Background in Cucumber is used to define a step or series of steps that are common to all the tests in the feature file.

--------------------------

What is POM in selenium ?
Page object model

- design pattern to create repository
- a class is created for each page to identify web elements of that page
- it can also contain methods to do action on the objects
- separates test objects and test scripts

Advantages
--------------
Easy maintainence
Readability
Easier


package com.training.jwa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	By txt_username = By.id("user-name");
	By txt_password = By.id("password");
	By btn_login = By.id("login-button");
	
	By btn_logout = By.id("logout");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	
	public boolean checkLogoutDisplayed() {
		return driver.findElement(btn_logout).isDisplayed();
	}
	public boolean checkLoginDisplayed() {
		return driver.findElement(btn_login).isDisplayed();
	}
}



----------

package com.training.jwa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	String browserName = "chrome";
	WebDriver driver = null;
	LoginPage loginPage ;
	@Given("user is an login page")
	public void user_is_an_login_page() {
		
		if(browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		loginPage = new LoginPage(driver);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	    System.out.println("step - user is an login page");
	}

	@When("user enters {string} and {string}")
	public void user_enters_username_and_password(String username,String password) {
	//	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
	//	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		
	    System.out.println("step - user enters username and password");

	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	    System.out.println("step - user clicks on submit button");
//	    driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	    loginPage.clickLogin();

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    System.out.println("step - user is navigated to the home page");
	    String actualURL = driver.getCurrentUrl();
	    String expectedURL = "https://www.saucedemo.com/inventory.html";
	    assertEquals(expectedURL, actualURL);

	}
	
}



Q&A


What is  BDD and TDD?
 Explain Cucumber shortly.
 What language is used by Cucumber?
What is meant by a feature file?
What are the various keywords that are used in Cucumber for writing a scenario?
What is the purpose of a Scenario Outline in Cucumber?
 What programming language is used by Cucumber?
 What is the purpose of the Step Definition file in Cucumber?
What are the major advantages of the Cucumber framework?
 What symbol is used for parameterization in Cucumber?
 What is the file extension for a feature file?
 Explain the purpose of keywords that are used for writing a scenario in Cucumber.

Given
When
Then
And
 Provide an example of the TestRunner class in Cucumber.
What is POM in cucumber?
What is PageFactory in cucumber?

Core Java 
------------
What is super class for all the exceptions in java ?

New features in JDK1.8

Lambdas
Lambda Expressions were added in Java 8. A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
new Date Time API()
default and static methods in interface

=======================

1)
Difference between Array and ArrayList

1)Array is a fixed length data structure whereas ArrayList is a variable length Collection class. 
2)We cannot change length of array once created in Java but ArrayList can be changed. 
3) We cannot store primitives in ArrayList, it can only store objects. But array can contain both primitives and objects in Java.

2)
Difference between Set and List
1. The List is an ordered sequence.	1. The Set is an unordered sequence.
2. List allows duplicate elements	2. Set doesn???t allow duplicate elements.
2.Multiple null elements can be stored.	3.Null element can store only once.


What is Object class in java ? List some methods of object class?
super class for all the classes in java, toString,equals,hashCode,wait, notify



Difference between Statement,PreparedStatement ?
Statement is used for executing simple SQL Statements 
PreparedStatement is used for executing dynamic and pre-compiled repetitive SQL Statements.	? represents placeholders


What is the use of CallableStatement ?
CallableStatement is used to call stored procedure




https://github.com/tufailahm/core-java-jwa-recap


========================Types of testing and definitions==============
What is Testing ?
Testing is the process of executing a program to find logical errors. 
To make our software perform well it should be error-free. 
If testing is done successfully it will remove all the errors from the software. 


Principles of Testing:-
(i) All the tests should meet the customer requirements.
(ii) To make our software testing should be performed by a third party.
(iii) Exhaustive testing is not possible. As we need the optimal amount of testing based on the risk assessment of the application. 
(iv) All the tests to be conducted should be planned before implementing it 
(v) It follows the Pareto rule(80/20 rule) which states that 80% of errors come from 20% of program components. 
(vi) Start testing with small parts and extend it to large parts. 

Types of Testing:-

1. Unit Testing
It focuses on the smallest unit of software design.
 In this, we test an individual unit or group of interrelated units.
 It is often done by the programmer by using sample input and observing its corresponding outputs. 

Example:

a) In a program we are checking if the loop, method, or 
   function is working fine
b) Misunderstood or incorrect, arithmetic precedence.
c) Incorrect initialization


====================



2. Integration Testing
The objective is to take unit-tested components and build a program structure that has been dictated by design.
 Integration testing is testing in which a group of components is combined to produce output. 

Integration testing is of four types: (i) Top-down (ii) Bottom-up (iii) Sandwich (iv) Big-Bang 

Example:

(a) Black Box testing:- It is used for validation.  In this, we ignore internal working mechanisms and 
focus on what is the output?.

(b) White box testing:- It is used for verification.  In this, we focus on internal mechanisms i.e.
how the output is achieved?



Big-Bang - Everything will be combined at once and get tested. 
Top -down - top modules are integrated first
Bottom - up - bottopm modules are integrated first
Sandwich : Both top-down and Bottom-up will be used

3. Regression Testing
Every time a new module is added leads to changes in the program. 
** This type of testing makes sure that the whole component works properly even after adding components to the complete program. 

Example 

Plane example 



4. Smoke Testing
This test is done to make sure that the software under testing is ready or stable for further testing 
It is called a smoke test as the testing of an initial pass is done to check if it did not catch the fire or smoke in the initial switch on. 
Example: 

If the project has 2 modules so before going to the module  make sure that module 1 works properly

5. Alpha Testing
This is a type of validation testing. It is a type of acceptance testing which is done before the product is released to customers. It is typically done by QA people. 
Example: 

When software testing is performed internally within the organization

6. Beta Testing
The beta test is conducted at one or more customer sites by the end-user of the software. This version is released for a limited number of users for testing in a real-time environment 

Example: 
When software testing is performed for the limited number of people


7. System Testing
This software is tested such that it works fine for the different operating systems. It is covered under the black box testing technique. In this, we just focus on the required input and output without focusing on internal working. 
In this, we have security testing, recovery testing, stress testing, and performance testing 
Example: 

This includes functional as well as nonfunctional  testing

non functional - includes behavior testing and also which is not tested at functional testing level.
NON-FUNCTIONAL TESTING(NFT) is defined as a type of Software testing to check non-functional aspects (performance, usability, reliability, etc) of a software application. It is designed to test the readiness of a system as per nonfunctional parameters which are never addressed by functional testing.

An excellent example of non-functional test would be to check how many people can simultaneously login into a software.
Another example : logging, transaction, security




8. Stress Testing
In this, we give unfavorable conditions to the system and check how they perform in those conditions. 
Example: 

(a) Test cases that require maximum memory or other resources are executed
(b) Test cases that may cause thrashing in a virtual  operating system
(c) Test cases that may cause excessive disk requirement

9. Performance Testing
It is designed to test the run-time performance of software within the context of an integrated system. 
It is used to test the speed and effectiveness of the program. 
It is also called load testing. In it we check, what is the performance of the system in the given load.
Example: 

Checking several processor cycles.

10. Object-Oriented Testing
This testing is a combination of various testing techniques that help to verify and validate object-oriented software. This testing is done in the following manner: 

Testing of Requirements,
Design and Analysis of Testing,
Testing of Code,
Integration testing,
System testing,
User Testing.


11. User Acceptance Testing  (UAT)
Acceptance testing is done by the customers to check whether the delivered products perform the  desired tasks or not, as stated in requirements. 

Software testing can be divided into two steps: 
1. Verification: it refers to the set of tasks that ensure that the software correctly implements a specific function. 

2. Validation: it refers to a different set of tasks that ensure that the software that has been built is traceable to customer requirements. 

Verification: ???Are we building the product right???? 
Validation: ???Are we building the right product???? 




What are different types of software testing? 

Software Testing can be broadly classified into two types: 

1. Manual Testing: Manual testing includes testing software manually, i.e., without using any automation tool or any script.
 In this type, the tester takes over the role of an end-user and tests the software to identify any unexpected behavior or bug. 
There are different stages for manual testing such as unit testing, integration testing, system testing, and user acceptance testing. 

Testers use 
	test plans, 
	test cases, or 
	test scenarios to test software to ensure the completeness of testing. 
	Manual testing also includes exploratory testing, as testers explore the software to identify errors in it. 


** Manual testing is testing of the software where tests are executed manually by a QA Analyst.



2. Automation Testing: Automation testing, which is also known as Test Automation, is when the tester writes scripts and uses another software to test the product. 
	This process involves the automation of a manual process.
	 Automation Testing is used to re-run the test scenarios quickly and repeatedly, that were performed manually in manual testing.

	Apart from regression testing, automation testing is also used to test the application from a load, performance, and stress point of view. 
	It increases the test coverage, improves accuracy, and saves time and money when compared to manual testing. 

In Automated Software Testing, testers write code/test scripts to automate test execution.



=====================================Test Document

Test Policy
High Level document which details the principles, methods and important testing goals for an organization.
Outlines the testing objectives for an organization.
Describes how an organization will measure the effectiveness and efficiency of the testing process and strategies for improvement.


Test Plan
test plan is  detailed document which describes how a team should handle testing, in general.
and, It also Includes details for the test strategy, objectives, schedule, estimations and deliverables.

User Story
User stories are high-level, business artifacts which define software requirements or application features.

Test Scenario
A description of any functionality which can be tested and how it is expected to behave.
The test Scenario comprises multiple test cases which are used to verify functionality.

Test Summary

Test Strategy 

======================================================================
What is Testing lifecycle  ?

Software Testing Life Cycle (STLC)


1)Analysis
	2)Test Planning
		3)Test Development
			4)Environment Setup
				5)Test Execution
					6)Test Closure
		



=======================================================================
** what is a test plan?
test plan is  detailed document which describes how a team should handle testing, in general.
and, It also Includes details for the test strategy, objectives, schedule, estimations and deliverables.



=======================================================================
What is Requirement Traceability Matrix?
Requirement Traceability Matrix (RTM) is a document that maps and traces user requirement with test cases

login should be successful with valid credentials

testUserValidate()
{
	login(username,password);
}

Which Parameters to include in Requirement Traceability Matrix?
Requirement ID
Requirement Type and Description
Test Cases with Status





















What are the different types of Software Testing Techniques ? 

Software testing techniques can be majorly classified into two categories: 

1. Black Box Testing: The technique of testing in which the tester doesn???t have access to the source code of the software and is conducted at the software interface without any concern with the internal logical structure of the software is known as black-box testing. 

2. White-Box Testing: The technique of testing in which the tester is aware of the internal workings of the product, has access to its source code, and is conducted by making sure that all internal operations are performed according to the specifications is known as white box testing. 

Black Box Testing	White Box Testing
Internal workings of an application are not required.	Knowledge of the internal workings is a must.
Also known as closed box/data-driven testing.	Also known as clear box/structural testing.
End users, testers, and developers.	Normally done by testers and developers.
This can only be done by a trial and error method.	Data domains and internal boundaries can be better tested.
What are different levels of software testing? 

Software level testing can be majorly classified into 4 levels: 

1. Unit Testing: A level of the software testing process where individual units/components of a software/system are tested. The purpose is to validate that each unit of the software performs as designed. 

2. Integration Testing: A level of the software testing process where individual units are combined and tested as a group. The purpose of this level of testing is to expose faults in the interaction between integrated units. 

3. System Testing: A level of the software testing process where a complete, integrated system/software is tested. The purpose of this test is to evaluate the system???s compliance with the specified requirements. 

4. Acceptance Testing: A level of the software testing process where a system is tested for acceptability. The purpose of this test is to evaluate the system???s compliance with the business requirements and assess whether it is acceptable for delivery. 

software testing levels





------------
Test Plan
Test Cases
Test Scenarios
Use cases
scripts


-----------------------
Defects lifecycle
Features vs defects
Bugs	- errors

Defects are


bugs 
defects
errors


mistakes in coding is called error
** error found by tester is called defect
defect accpeted by development team then it is called a bug


Defect lifecycle
-----------------



What is Test Design? When to create Test Design?

Test design is a process that describes ???how??? testing should be done. It includes processes for the identifying test cases by enumerating steps of the defined test conditions. The testing techniques defined in test strategy or plan is used for enumerating the steps.

The test cases may be linked to the test conditions and project objectives directly or indirectly depending upon the methods used for test monitoring, control and traceability.

The objectives consist of test objectives, strategic objectives and stakeholder definition of success.

When to create test design?
After the test conditions are defined and sufficient information is available to create the test cases of high or low level, test design for a specified level can be created.

For lower level testing, test analysis and design are combined activity. For higher level testing, test analysis is performed first, followed by test design.

There are some activities that routinely take place when the test is implemented. These activities may also be incorporated into the design process when the tests are created in an iterative manner.

An example of such a case is creation of test data.

Test data will definitely be created during the test implementation. So it is better to incorporate it in the test design itself.

This approach enables optimization of test condition scope by creating low or high level test cases automatically.



Core Java 

  Exception Handling - Errors, Checked Exception, Unchecked Exception, Throws Vs Throw
=============================================================================


In java , 
errors
	syntax		Void
	logical		1-5	1,2,3,4
	runtime		errors at the time of execution are known as an exception

like ArithmeticException,ArrayIndexOutOfBoundsException,NullPointerException

** Throwable -super class for all the exceptions in java 


Throwable




Exception			Error(not in our control)
-
-RuntimeException
	- ArithmeticException,ArrayIndexOutOfBoundsException,NullPointerException
	-
	-
-



Handle 

	try
	catch
	finally keyword



**Checked Exception, Unchecked Exception
===============================

Checked
The Exception class and all of its subclasses, except for RuntimeException, are known as "checked exceptions"
 Checked exceptions are required to be handled or declared by the programmer - otherwise, the code will not compile.
Interrupted,FileNotFoundException
compile time exception



Unchecked
RuntimeException is a special type of exception - it, and all of its subclasses - are known as "unchecked exceptions". An unchecked exception is an exception that is not required to be handled or declared like checked exceptions are. Some examples include:

ArithmeticException for illegal math operations
IndexOutOfBoundsException for if you reference an index that is greater than the length of an array
NullPointerException for if you attempt to perform an operation on a reference variable that points to a null value



throw and throws

throw is a keyword which we can use inside the method to raise an exception using new keyword
The throw keyword in Java is used to explicitly throw an exception from a method or any block of code. 
We can throw either checked or unchecked exception. 
The throw keyword is mainly used to throw custom exceptions. 



throws is a keyword that we use alongside method name to delegate the checked exceptions
throws is a keyword in Java which is used in the signature of method to indicate that this method might throw one of the listed type exceptions.





Testing (Summary)

Unit Testing	A programmatic test that tests the internal working of a unit of code, such as a method or a function.
Integration Testing	Ensures that multiple components of systems work as expected when they are combined to produce a result.
Regression Testing	Ensures that existing features/functionality that used to work are not broken due to new code changes.
System Testing	Complete end-to-end testing is done on the complete software to make sure the whole system works as expected.
Smoke Testing	A quick test performed to ensure that the software works at the most basic level and doesn???t crash when it???s started. Its name originates from the hardware testing where you just plug the device and see if smoke comes out.
Performance Testing	Ensures that the software performs according to the user???s expectations by checking the response time and throughput under specific load and environment. 
User-Acceptance Testing	Ensures the software meets the requirements of the clients or users. This is typically the last step before the software is live, i.e. it goes to production.
Stress Testing	Ensures that the performance of the software doesn???t degrade when the load increases. In stress testing, the tester subjects the software under heavy loads, such as a high number of requests or stringent memory conditions to verify if it works well.
Usability Testing	Measures how usable the software is. This is typically performed with a sample set of end-users, who use the software and provide feedback on how easy or complicated it is to use the software. 
Security Testing	Now more important than ever. Security testing tries to break a software???s security checks, to gain access to confidential data. Security testing is crucial for web-based applications or any applications that involve money. 


What is regression testing in software testing?
What is end-to-end testing?
What is unit testing?
 What is a test environment?
A test environment consists of a server/computer on which a tester runs their tests. It is different from a development machine and tries to represent the actual hardware on which the software will run; once it???s in production.

Whenever a new build of the software is released, the tester updates the test environment with the latest build and runs the regression tests suite. Once it passes, the tester moves on to testing new functionality.

Explain black-box testing, white-box testing, and grey-box testing.

 Explain test scenarios, test scripts, and test cases in software testing.
What is a bug in software testing?

State the difference between bugs and errors
What is a Test Plan? What does it include?

. What is a Test Report? What does it include?
 What do you mean by Test Deliverables?
 What is a user story?
. What is defects in software testing?
 What is the software testing life cycle?
What is functional testing?
What is non-functional testing?

Core Java :
What is exception in java ?
What is the super class for all the exception in java ?
Difference between checked and unchecked exception in java ?
Difference between throw and throws ?
How you create custom exception in java ?
	By extending exception(checked) or runtimeexception(unchecked)
	By declaring constructors


---------Day 5


Interfaces and abstract classes

What is the difference between an abstract class and an interface?

An abstract class which contains abstract method(which will not have any body) and/or non abstract method as well
It can have constructors
It can have variables
You cannot create an object of abstract class

public abstract class Animal {
	public void sleep(){
	}
	public abstract void eat();
}
public class Dog extends Animal {
	
}


Animal a = new Animal();	//not possible to create an object of abstract class



Interface
----------------------------
all the methods are by default abstract in an interface 
cannot create constructor
it can contain only constants means final and static 
we use implements keyword to inherit
By interface , we can achieve multiple inheritance

You cannot create an object of interfaces

---------------------------------


What is the difference between overloading and overriding ?

Overloading : method having same name but different parameters
 When two or more methods in the same class have the same name but different parameters, it's called Overloading

Overriding :  method having same name and same parameters but these methods are rewritten in child class
When the method signature (name and parameters) are the same in the superclass and the child class, it's called Overriding.

Can we override static methods ?
No, we cannot override static methods


How can you restrict the creation of an object of class ?

We can do this by making the constrtuctor as private


How will you create string in java ?
1) by using new keyword
String data = new String("revature");
2) by initializing directly
String data1="revature"

String in java is immutable. it means that it cannot be changed


List out some string methods ?
tolowercase,touppercase,length,trim,equals,valueOf, slice,replace,split,concat,equalsIgnoreCase


What is the super class for all the classes in java ?
Object

List out some object class methods ?
equals,toString,finalize,hashCode,getClass,wait,notify


Animal extends Object
	sleep
	eat
Dog extends Animal
	sleep

	d.

What is String ?
String is a class in java.lang package. It is used to store group of characters


What is StringBuffer and StringBuilder? Difference between these two ?
Both are mutable and hence can be changed
StringBuffer is sync and slow and StringBuilder is not sync and fast.
StringBuffer is there since jdk1 but Stringbuilder introduced in jdk1.5



What are primitive data types?
There are 8 primitive data types
numbers : byte , short, int , long
decimal : float and double
boolean		- default value of boolean is false
char

what is difference between float and double?
range and capacity
float - 4 byte
double - 8 byte
by default decimal values in java are double

float marks=90.9;	//illegal
	4      8
float marks = 90.9f;//legal
	
What is static?
static belongs to class and not objects
The static keyword in Java is mainly used for memory management. The static keyword in Java is used to share the same variable or method of a given class. The users can apply static keywords with variables, methods, blocks, and nested classes.


What is String and String Buffer?




What is the difference between static and final variable?

final means constants, it cannot be changed once assigned
 The static keyword in Java is used to share the same variable or method of a given class. The users can apply static keywords with variables, methods, blocks, and nested classes.

final class cannot be inherited
final methods cannot be overridden
you can't make an abstract class and/or method final in Java because the abstract and final are both exclusive measurements


scopes
If your given instance variable, static variable ,and local variable where would you place them?
outside the method and inside the class  - instance variable, static variable
inside the method -= local variable

What scopes would the above variables belong to?


How and where could you access those variables?

How do you create Strings?
1) by using new keyword
String data = new String("revature");
2) by initializing directly
String data1="revature"

What is the difference between the two methods of creating Strings?

package com.training.jwa;

public class StringDemo {

	public static void main(String[] args) {

		// what is the difference between equals method and == operator
		// == checks the reference of two objects
		// equals method checks the value of two objects
		// What is the difference between the two methods of creating Strings?
		/*
		 * 1) by using new keyword 
		 * String data = new String("revature"); 
		 * 2) by initializing directly 
		 * String data1="revature"
		 * 
		 */
		String str1 = "revature";
		String str2 = new String("revature");

		System.out.println(str1 == str2); // ??
		System.out.println(str1.equals(str2)); // ??
	}

}




Asked me to expain each individual part of public void static main method
public 	
access specifier
	
static 		
non-access modifier	

return type		
void 

main
is not a keyword in java, but it is a special method that JVM looks in our class to start the execution

String args[]
command line argument - it can take parameters during the start time


			
What main method is static in java ?

Because JVM need not create an object to call the main method
Java main() method is always static, so that JVM can call it without the creation of an object or before the creation of an object of the class. 
In any Java program, the main() method is the starting point from where compiler starts program execution

What is the use of finally block in exception handling ?

try
{
}
catch
{
}
finally
{
	//this block will get called
	//closing the file and db connection done here
	//gets executed irrespective of exception is there or not
}

The finally block in java is used to put important codes such as clean up code e.g. closing the file or closing the connection. 
The finally block executes whether exception rise or not and whether exception handled or not.
 A finally contains all the crucial statements regardless of the exception occurs or not.



==============================================================================================

Collections


Data structure

Use case :I want to store and sort all my asociates name


array	- 10 size


sort - apply some algorithm (bubble,merge,quick,selection,insertion,heap sort)	-12 lines


testing 	- 15 lines


--------print the sorted names



1) addition and deletion is big problem here
2) lot of lines of code 

add any item
delete any item


Collection framework
================
	built in framework
	set of classes and interfaces to work with data structure
	
	benefits :
		less code
		tested code
		faster
		variety of classes to choose from
		easy learning curve

The Java collections framework is a set of classes and interfaces that implement commonly reusable collection data structures


Interface								Collection

Interface		
Set											

(Set will not accept duplicate value)					

Classes		
HashSet	- no order is guranenteed									
LinkedHashSet - as it is									
TreeSet	- sorted									


List
(can accept duplicate value)	

ArrayList		- iteration will be faster than linkedlist
LinkedList	- frequent addition and deletion
Vector		- same like arraylist ,it is not synchronized(faster than arraylist)


Do you know about Collections?
What is the difference between List and Set?
Difference between List and Set:

List	Set
1. The List is an indexed sequence.	1. The Set is an non-indexed sequence.
2. List allows duplicate elements	2. Set doesn???t allow duplicate elements.
3. Elements by their position can be accessed.	3. Position access to elements is not allowed.
4. Multiple null elements can be stored.	4. Null element can store only once.
5. List implementations are ArrayList, LinkedList, Vector, Stack	5. Set implementations are HashSet, LinkedHashSet, Treeset


What is the difference between Array and ArrayList?

Base	Array	ArrayList
Dimensionality 	It can be single-dimensional or multidimensional 	It can only be single-dimensional 
Traversing Elements 	For and for each generally is used for iterating over arrays 	Here iterator is used to traverse riverArrayList 
Length 	length keyword can give the total size of the array.	size() method is used to compute the size of ArrayList.
Size	It is static and of fixed length	It is dynamic and can be increased or decreased in size when required.
Speed	It is faster as above we see it of fixed size	It is relatively slower because of its dynamic nature 
Primitive Datatype Storage	Primitive data types can be stored directly unlikely objects	Primitive data types are not directly added unlikely arrays, they are added indirectly with help of autoboxing and unboxing
Generics	They can not be added here hence type unsafe 	They can be added here hence makingArrayList type-safe. 
Adding Elements 	Assignment operator only serves the purpose	Here a special method is used known as add() method  

Stack	- LIFO

Queue	- FIFO


---

Map
----------
It uses key value pairs

Map data = new HashMap();

data.add XXX error
data.put("E00827",89000);
data.put("E00827",19000);
data.put("E00829",69000);

HashMap		- no order is guranenteed	
TreeMap		- sorted based on keys
LinkedHashMap	- order will be as it is

Have you used Hash map if so how do you use it?
it takes key value pairs and no order is guranenteed	
HashMap		- no order is guranenteed	



Collections : Class 
It has lots of useful static methods like sort, reverse and many more
Collections class in java is a useful utility class to work with collections in java. 
The java. util. Collections class directly extends the Object class and exclusively consists of the static methods that operate on Collections or return them.

Collections.sort(names);

Collections.reverse(names);


Generics
==============
What is generics ?
The Java Generics programming is introduced in J2SE 5 to deal with type-safe objects. 
It makes the code stable by detecting the bugs at compile time.







What is Java? / Why Java?
What is JRE / JDK / JVM?
What is the root class from which every class extends?
What are the implicit modifiers for interface variables?
What are the primitive data types in Java?
What is the difference between method overloading and overriding?
Difference between extends and implements?
What are generics? What is the diamond operator (`<>`)?
What are enumerations (enums)?
Why are strings immutable in java?
What is the difference between `String`, `StringBuilder`, and `StringBuffer`?
What are annotations?
Explain stack vs heap?
What is a POJO? What is a bean?
How can you force garbage collection in Java?
What is the difference between `final`, `.finalize()`, and `finally`?
What is a Marker interface?
What are the access modifiers in Java? Explain them.
What are the non-access modifiers in Java?
What is the difference between static and final variables?
What are the default values for all data types in Java?
What are the implicit modifiers for interface variables / methods?
What is a wrapper class?
What is autoboxing / unboxing?
Is Java pass-by-value or pass-by-reference?
What is synchronized keyword?
What is the difference between `==` and `.equals()`?
First line of constructor?


What is the difference between an abstract class and an interface?
What is the difference between overloading and overriding ?
How can you restrict the creation of an object of class ?
List out some string methods ?
What is the super class for all the classes in java ?
List out some object class methods ?
What is String ?
What is StringBuffer and StringBuilder? Difference between these two ?
What are primitive data types?
what is difference between float and double?
What is String and String Buffer?
How do you create Strings?
What is the difference between the two methods of creating Strings?
What is collection framework ?
What is the difference between Array and ArrayList?

What is a Collection framework?
What is the difference between List and Set?
What are the advantages of the Collection framework?






























