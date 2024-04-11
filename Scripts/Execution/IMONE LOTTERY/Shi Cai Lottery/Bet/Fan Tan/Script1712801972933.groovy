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

WebUI.enhancedClick(findTestObject('Execution/IMONE LOTTERY/Shi Cai Lottery/Page/Lotto Games'))

WebUI.enhancedClick(findTestObject('Execution/IMONE LOTTERY/Shi Cai Lottery/LottoGames/GameList/btn_FanTan'))

WebUI.enhancedClick(findTestObject('Execution/IMONE LOTTERY/Shi Cai Lottery/LottoGames/ChooseLottery/btn_PK10 Fan Tan'))

WebUI.enhancedClick(findTestObject('Execution/IMONE LOTTERY/Shi Cai Lottery/LottoGames/ChooseType/FanTan/PK10FanTan/btn_NewLuckyAirship'))

WebUI.enhancedClick(findTestObject('Execution/IMONE LOTTERY/Shi Cai Lottery/FanTan/input_Custom'))

WebUI.setText(findTestObject('Execution/IMONE LOTTERY/Shi Cai Lottery/FanTan/input_Custom'), '1')

WebUI.enhancedClick(findTestObject('Execution/IMONE LOTTERY/Shi Cai Lottery/FanTan/1Jing'))

WebUI.setText(findTestObject('Execution/IMONE LOTTERY/Shi Cai Lottery/FanTan/input_1Jing'), '1')

WebUI.enhancedClick(findTestObject('Execution/IMONE LOTTERY/Shi Cai Lottery/FanTan/3Fan'))

WebUI.setText(findTestObject('Execution/IMONE LOTTERY/Shi Cai Lottery/FanTan/input_3Fan'), '1')

WebUI.enhancedClick(findTestObject('Execution/IMONE LOTTERY/Shi Cai Lottery/FanTan/3Nim4'))

WebUI.setText(findTestObject('Execution/IMONE LOTTERY/Shi Cai Lottery/FanTan/input_3Nim4'), '1')

WebUI.enhancedClick(findTestObject('Execution/IMONE LOTTERY/Shi Cai Lottery/FanTan/Kwok'))

WebUI.setText(findTestObject('Execution/IMONE LOTTERY/Shi Cai Lottery/FanTan/input_Kwok'), '1')

WebUI.enhancedClick(findTestObject('Execution/IMONE LOTTERY/Shi Cai Lottery/Page/button_Bet Now'))

WebUI.enhancedClick(findTestObject('Execution/IMONE LOTTERY/Shi Cai Lottery/Page/button_Confirm'))

WebUI.enhancedClick(findTestObject('Execution/IMONE LOTTERY/Shi Cai Lottery/Page/button_ContinueGaming'))

