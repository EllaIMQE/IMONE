import com.kms.katalon.core.testobject.RequestObject as RequestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent as HttpTextBodyContent
import com.kms.katalon.core.testobject.RestRequestObjectBuilder as RestRequestObjectBuilder
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import java.util.Random as Random
import groovy.json.JsonBuilder as JsonBuilder
import groovy.json.JsonSlurper as JsonSlurper
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.callTestCase(findTestCase('Execution/IMONE SLOT/RedTiger/Perform Transfer'), [('MerchantCode') : GlobalVariable.MerchantCode
        , ('PlayerId') : GlobalVariable.PlayerId, ('ProductWallet') : findTestData('IMONE/IM_Slot/RedTiger').getValue(3, 1)
        , ('Amount') : findTestData('IMONE/IM_Slot/RedTiger').getValue(9, 1), ('transactionId') : GlobalVariable.generatedTransactionId], 
    FailureHandling.STOP_ON_FAILURE)

def MerchantCode = MerchantCode

def PlayerId = PlayerId

def ProductWallet = ProductWallet

def transactionId = GlobalVariable.generatedTransactionId

def requestBody = new JsonBuilder([('MerchantCode') : MerchantCode, ('PlayerId') : PlayerId, ('ProductWallet') : ProductWallet
    , ('TransactionId') : transactionId]).toPrettyString()

def builder = new RestRequestObjectBuilder()

def requestObject = builder.withRestRequestMethod('POST').withRestUrl(GlobalVariable.baseUrl + '/Transaction/CheckTransferStatus').withHttpHeaders(
    [new TestObjectProperty('Content-Type', ConditionType.EQUALS, 'application/json')]).withRestParameters([new TestObjectProperty(
        'MerchantCode', ConditionType.EQUALS, MerchantCode), new TestObjectProperty('PlayerId', ConditionType.EQUALS, PlayerId)
        , new TestObjectProperty('ProductWallet', ConditionType.EQUALS, ProductWallet), new TestObjectProperty('TransactionId', 
        ConditionType.EQUALS, transactionId)]).withTextBodyContent(requestBody).build()

// Send the request
def response = WS.sendRequest(requestObject)

// Verify the response status code
assert response.getStatusCode() == 200

// Parse the response JSON
def jsonResponse = new JsonSlurper().parseText(response.getResponseBodyContent())

// Verify response body fields
assert jsonResponse.Code == '0'

assert jsonResponse.Message == 'Successful.'

assert jsonResponse.Status == 'Approved'

println('Response Body: ' + response.getResponseBodyContent())

WebUI.comment('Merchant Code: ' + MerchantCode)

WebUI.comment('Player Id: ' + PlayerId)

WebUI.comment('Product Wallet: ' + ProductWallet)

WebUI.comment('Generate random number: ' + transactionId)

