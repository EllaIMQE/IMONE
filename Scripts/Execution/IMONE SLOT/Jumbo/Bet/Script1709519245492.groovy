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

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/btn_turbo OFF'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/Jumbo/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/btn_turbo ON'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/btn_betOptions'), FailureHandling.CONTINUE_ON_FAILURE)

betFive = WebUI.getText(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/bets/btn_5'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/bets/btn_5'), FailureHandling.CONTINUE_ON_FAILURE)

betTextFive = WebUI.getText(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/btn_betOptions'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(betTextFive, betFive, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/Jumbo/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/btn_betOptions'), FailureHandling.CONTINUE_ON_FAILURE)

betThree = WebUI.getText(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/bets/btn_2.5'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/bets/btn_2.5'), FailureHandling.CONTINUE_ON_FAILURE)

betTextThree = WebUI.getText(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/btn_betOptions'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(betTextThree, betThree, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/Jumbo/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/btn_betOptions'), FailureHandling.CONTINUE_ON_FAILURE)

betTwo = WebUI.getText(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/bets/btn_1.5'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/bets/btn_1.5'), FailureHandling.CONTINUE_ON_FAILURE)

betTextTwo = WebUI.getText(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/btn_betOptions'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(betTextTwo, betTwo, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/Jumbo/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/btn_betOptions'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/bets/btn_1'), FailureHandling.CONTINUE_ON_FAILURE)

betTextOne = WebUI.getText(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/btn_betOptions'), FailureHandling.CONTINUE_ON_FAILURE)

betOne = WebUI.getText(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/bets/btn_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(betTextOne, betOne, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/Jumbo/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/btn_betOptions'), FailureHandling.CONTINUE_ON_FAILURE)

betZero = WebUI.getText(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/bets/btn_0.5'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/bets/btn_0.5'), FailureHandling.CONTINUE_ON_FAILURE)

betZero = WebUI.getText(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/btn_betOptions'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyEqual(betTextOne, betOne, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/btn_increase'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/btn_turbo OFF'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/Jumbo/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/btn_turbo ON'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Jumbo/Napoleon - JDB/button/btn_decrease'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/Jumbo/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

