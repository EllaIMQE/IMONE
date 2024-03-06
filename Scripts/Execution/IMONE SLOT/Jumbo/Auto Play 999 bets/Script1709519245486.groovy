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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/Jumbo/NewLaunchGame'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/btn_turbo OFF'))

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/btn_auto spin'))

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/auto bet/btn_999'))

WebUI.waitForElementVisible(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/auto bet/span_15'), 15)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/auto bet/span_15'))

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/btn_turbo ON'))

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/btn_auto spin'))

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/auto bet/btn_number Of Spins'))

WebUI.delay(15)

WebUI.closeBrowser()

