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
import groovy.json.JsonSlurper as JsonSlurper

/*
 * import org.openqa.selenium.WebDriver as WebDriver import
 * org.openqa.selenium.chrome.ChromeDriver as ChromeDriver import
 * org.openqa.selenium.By as By import
 * org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait import
 * org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
 */
// Define a list of game codes
def testData = findTestData('IMONE/IM_Lottery/VR_Lottery')

def rowCount = testData.getRowNumbers()

for (int i = 1; i <= rowCount; i++) {
    def gameCode = testData.getValue('GameCode', i)

    def gameName = testData.getValue('Game Name', i)

    println("Launching game with code: $gameCode")

    response = WS.sendRequest(findTestObject('Execution/Execution Loop/LOTTERY Loop/VR Lottery/Game_NewLaunchGame', [('baseUrl') : GlobalVariable.baseUrl
                , ('MerchantCode') : GlobalVariable.MerchantCode, ('PlayerId') : GlobalVariable.PlayerId, ('GameCode') : gameCode
                , ('LANGUAGE') : findTestData('IMONE/IM_Lottery/VR_Lottery').getValue(8, 1), ('ProductWallet') : findTestData(
                    'IMONE/IM_Lottery/VR_Lottery').getValue(3, 1), ('Currency') : findTestData('IMONE/IM_Lottery/VR_Lottery').getValue(
                    6, 1)]))

    // Your existing code for processing the response and launching the game
    def jsonSlurper = new JsonSlurper()

    def jsonResponse = jsonSlurper.parseText(response.getResponseBodyContent())

    def gameUrl = jsonResponse.GameUrl

    println("GameUrl: $gameUrl")

    WebUI.comment('Game Code: ' + gameCode)

    WebUI.openBrowser(gameUrl, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(30)e = WebUI.getWindowTitle()

    WebUI.comment("Window Title: $windowTitle")

    if (windowTitle.contains(gameName)) {
        println("Window title matches game name: $gameName")
    } else {
        println("Window title does not match game name: $gameName")
    }
    
    WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)
}

