package config
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import java.util.concurrent.ThreadLocalRandom
import java.util.Random

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent as HttpTextBodyContent
import com.kms.katalon.core.testobject.RestRequestObjectBuilder as RestRequestObjectBuilder
import groovy.json.JsonBuilder as JsonBuilder
import groovy.json.JsonSlurper as JsonSlurper


public class transactionId {

	@Keyword
	public static String generateRandomNumber() {
		// Generate a random 10-digit number between 1000000000 and 9999999999
		Random rand = new Random();
		//long randomNum = (rand.nextLong() % ((9999999999L - 1000000000L) + 1)) + 1000000000L;
		long randomNum = Math.abs(rand.nextLong() % 9000000000L) + 1000000000L;

		String transactionPrefix = "TransactionId_";
		String transactionId = transactionPrefix + randomNum;
		return transactionId;
	}

	@Keyword
	public static String generateRandomNumberPROD() {
		// Generate a random 10-digit number between 1000000000 and 9999999999
		Random rand = new Random();
		long randomNum = (rand.nextLong() % ((9999999999L - 1000000000L) + 1)) + 1000000000L;

		String transactionPrefix = "TransactionId_PROD";
		String transactionId = transactionPrefix + randomNum;
		return transactionId;
	}

	@Keyword
	public static String generateRandomNumberPlaytech() {
		// Generate a random 10-digit number between 1000000000 and 9999999999
		Random rand = new Random();
		long randomNum = Math.abs(rand.nextLong() % 9000000000L) + 1000000000L;

		String transactionPrefix = "TransactionId_IMFS_UAT";
		String transactionId = transactionPrefix + randomNum;
		return transactionId;
	}
}