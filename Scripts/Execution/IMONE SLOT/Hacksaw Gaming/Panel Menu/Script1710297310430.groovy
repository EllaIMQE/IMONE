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

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/Hacksaw Gaming/NewLaunchGame'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Hacksaw Gaming/Cubes 2/Panel/btn_icon-menu'))

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Hacksaw Gaming/Cubes 2/Panel/Icon Menu/btn_BUY BONUS_icon-sound'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Hacksaw Gaming/Cubes 2/Panel/Icon Menu/btn_BUY BONUS_icon-sound'))

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Hacksaw Gaming/Cubes 2/Panel/Icon Menu/btn_SOUND_icon-music'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Hacksaw Gaming/Cubes 2/Panel/Icon Menu/btn_SOUND_icon-music'))

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Hacksaw Gaming/Cubes 2/Panel/Icon Menu/btn_MUSIC_icon-turbo'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Hacksaw Gaming/Cubes 2/Panel/btn_icon-spin'))

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Hacksaw Gaming/Cubes 2/Panel/btn_icon-menu'))

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Hacksaw Gaming/Cubes 2/Panel/Icon Menu/btn_MUSIC_icon-turbo'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Hacksaw Gaming/Cubes 2/Panel/btn_icon-spin'))

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Hacksaw Gaming/Cubes 2/Panel/btn_icon-menu'))

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Hacksaw Gaming/Cubes 2/Panel/Icon Menu/btn_TURBO_icon-history'))

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Hacksaw Gaming/Cubes 2/Panel/Icon Menu/History/button_BIGGEST WINS'))

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Hacksaw Gaming/Cubes 2/Panel/Icon Menu/History/button_BIGGEST WINS current game'))

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Hacksaw Gaming/Cubes 2/Panel/Icon Menu/History/button_BET HISTORY'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Hacksaw Gaming/Cubes 2/Panel/btn_Close'))

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Hacksaw Gaming/Cubes 2/Panel/btn_icon-menu'))

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Hacksaw Gaming/Cubes 2/Panel/Icon Menu/btn_HISTORY_icon-info'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Execution/IMONE SLOT/Hacksaw Gaming/Cubes 2/Panel/btn_Close'))

WebUI.closeBrowser()

