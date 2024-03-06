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

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/SpadeGaming/NewLaunchGame'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/buttons/bttn_Fast_off_up'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/SpadeGaming/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/buttons/bttn_minus_over'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/SpadeGaming/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/buttons/btn_Free_arrow_up both'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/Bet value/div_1.50'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/SpadeGaming/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/buttons/btn_Free_arrow_up both'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/Bet value/div_2.00'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/SpadeGaming/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/buttons/btn_Free_arrow_up both'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/Bet value/div_2.50'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/SpadeGaming/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/buttons/btn_Free_arrow_up both'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/Bet value/div_5.00'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/SpadeGaming/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/buttons/btn_Free_arrow_up both'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/Bet value/div_10.00'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/SpadeGaming/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/buttons/btn_Free_arrow_up both'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/Bet value/div_20.00'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/SpadeGaming/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/buttons/btn_Free_arrow_up both'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/Bet value/div_25.00'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/SpadeGaming/Spin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/buttons/btn_Free_arrow_up both'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/Bet value/div_50.00'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/SpadeGaming/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/buttons/btn_Free_arrow_up both'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/Bet value/div_100.00'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/SpadeGaming/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/buttons/btn_Free_arrow_up both'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/Bet value/div_150.00'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/SpadeGaming/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/buttons/btn_Free_arrow_up both'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/Bet value/div_200.00'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/SpadeGaming/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/buttons/btn_Free_arrow_up both'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/Bet value/div_250.00'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/SpadeGaming/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/buttons/btn_Free_arrow_up both'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/Bet value/div_400.00'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/SpadeGaming/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/buttons/btn_Free_arrow_up both'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/Bet value/div_600.00'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/SpadeGaming/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/buttons/btn_Free_arrow_up both'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/Bet value/div_800.00'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/SpadeGaming/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/SpadeGaming/Adventure Iceland/buttons/bttn_add_over'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/SpadeGaming/Spin'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.closeBrowser()

