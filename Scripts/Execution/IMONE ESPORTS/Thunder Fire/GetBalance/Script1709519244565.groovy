import org.openqa.selenium.By as By
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import groovy.json.JsonSlurper as JsonSlurper
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import java.math.BigDecimal as BigDecimal
import java.math.RoundingMode as RoundingMode

WebUI.callTestCase(findTestCase('Execution/IMONE ESPORTS/Thunder Fire/NewLaunchGame'), [:], FailureHandling.STOP_ON_FAILURE)

response = WS.sendRequest(findTestObject('Execution/IMONE ESPORTS/Thunderfire Esports/Player_GetBalance'))

def jsonSlurper = new JsonSlurper()

def jsonResponse = jsonSlurper.parseText(response.getResponseBodyContent())

def balance = jsonResponse.Balance

def bd = new BigDecimal(balance)

// Set scale to 2 decimal places
bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP)

// Format balance with commas and currency symbol
def formattedBalance = '¥ ' + String.format('%,.2f', bd)

// Print and verify
println("Balance is: $formattedBalance")

// Verify text present
WebUI.verifyTextPresent(formattedBalance, false)

WebUI.delay(5)

WebUI.closeBrowser()

