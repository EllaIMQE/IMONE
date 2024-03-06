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

WebUI.callTestCase(findTestCase('Execution/IMONE FINANCIAL/Fin Game/NewLaunchGame'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE FINANCIAL/Fin Game/Page/Panel/btn_Watchlist'))

WebUI.enhancedClick(findTestObject('Execution/IMONE FINANCIAL/Fin Game/Page/Panel/btn_Orders'))

WebUI.enhancedClick(findTestObject('Execution/IMONE FINANCIAL/Fin Game/Page/Panel/Orders/button_LongShort'))

WebUI.enhancedClick(findTestObject('Execution/IMONE FINANCIAL/Fin Game/Page/Panel/Orders/btn_Closed position'))

WebUI.enhancedClick(findTestObject('Execution/IMONE FINANCIAL/Fin Game/Page/Panel/Orders/button_Futures'))

WebUI.enhancedClick(findTestObject('Execution/IMONE FINANCIAL/Fin Game/Page/Panel/btn_Tutorial'))

WebUI.callTestCase(findTestCase('Execution/IMONE FINANCIAL/Fin Game/Panel/Tutorial Page'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE FINANCIAL/Fin Game/Page/Panel/btn_Game rules'))

WebUI.enhancedClick(findTestObject('Execution/IMONE FINANCIAL/Fin Game/Page/Panel/btn_game rules close'))

WebUI.callTestCase(findTestCase('Execution/IMONE FINANCIAL/Fin Game/Panel/Mode'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

