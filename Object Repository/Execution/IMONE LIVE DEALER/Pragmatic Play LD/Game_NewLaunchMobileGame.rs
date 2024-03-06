<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Game_NewLaunchMobileGame</name>
   <tag></tag>
   <elementGuidId>1ff1ebbb-c5cf-434b-afc1-c82db91ea4c2</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>true</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{ \n \&quot;MerchantCode\&quot;:\&quot;${MerchantCode}\&quot;,\n \&quot;PlayerId\&quot;:\&quot;${PlayerId}\&quot;,\n \&quot;GameCode\&quot;:\&quot;${GameCode}\&quot;,\n \&quot;Language\&quot;:\&quot;${LANGUAGE}\&quot;,\n \&quot;IpAddress\&quot;:\&quot;192.168.105.145\&quot;,\n \&quot;ProductWallet\&quot;:\&quot;${ProductWallet}\&quot;,\n \&quot;Lobby\&quot;:\&quot;https://www.test.com\&quot;,\n \&quot;Http\&quot;:1,\n \&quot;IsDownload\&quot;:0,\n //\&quot;Tray\&quot;:\&quot;A\&quot;,\n \&quot;Route\&quot;:1,\n //\&quot;BetLimitId\&quot;:38\n}\n//HTTP for GG Fishing, Parameter will be ignored for other product wallets\n//IsDownload \u003d 0 default\n//          \u003d 1 Provider playerID and playerPassword\n//         \u003d 2 Only applicable to eBET, contains Game URL/Provider playerID/playerPassword\n//Tray only applicable to IG Lottery, VR Lottery, SG Win Lottery\n//Route only applicable to IG Lottery, SG Win Lottery\n&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>a79c5cad-0bb7-4fdc-8fae-8c1d54f1a96f</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.6.8</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${baseUrl}/Game/NewLaunchMobileGame</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.baseUrl</defaultValue>
      <description></description>
      <id>8a0c3a23-7bdb-4880-a6a9-e234f09fc363</id>
      <masked>false</masked>
      <name>baseUrl</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.MerchantCode</defaultValue>
      <description></description>
      <id>54983a09-710e-4ca6-b4a9-a6e88b29ecfe</id>
      <masked>false</masked>
      <name>MerchantCode</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.PlayerId</defaultValue>
      <description></description>
      <id>1ada4c99-5607-41bb-bc0c-01ecc2b7917b</id>
      <masked>false</masked>
      <name>PlayerId</name>
   </variables>
   <variables>
      <defaultValue>'imlive50029'</defaultValue>
      <description></description>
      <id>0c5b6195-d849-4882-9781-75591ca3e4ff</id>
      <masked>false</masked>
      <name>GameCode</name>
   </variables>
   <variables>
      <defaultValue>findTestData('IMONE/IM_LiveDealer/Pragmatic_Play_LD').getValue(8, 1)</defaultValue>
      <description></description>
      <id>4c713990-c65a-44ed-b0e9-d6b35ecb6a13</id>
      <masked>false</masked>
      <name>LANGUAGE</name>
   </variables>
   <variables>
      <defaultValue>findTestData('IMONE/IM_LiveDealer/Pragmatic_Play_LD').getValue(3, 1)</defaultValue>
      <description></description>
      <id>815ccf2f-d4c3-48e9-b03b-6b36267c7e70</id>
      <masked>false</masked>
      <name>ProductWallet</name>
   </variables>
   <variables>
      <defaultValue>findTestData('IMONE/IM_LiveDealer/Pragmatic_Play_LD').getValue(6, 1)</defaultValue>
      <description></description>
      <id>aaaa4a8c-ae66-4dc7-afc8-9fe3e88e6645</id>
      <masked>false</masked>
      <name>Currency</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.logging.KeywordLogger


RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

// Parse the response content as JSON
def jsonResponse = new JsonSlurper().parseText(response.getResponseText())

// Extract the 'Code' property from the response
def actualResponseCode = jsonResponse.Code.toString()
println(&quot;Code: $actualResponseCode&quot;)

// Expected response codes
String expectedResponseCodePass = &quot;0&quot;
String expectedResponseCodeFail = &quot;501&quot;

// Using custom verification method
WS.verifyElementPropertyValue(response, 'Code', expectedResponseCodePass)

// Print the result to the verification log
if (expectedResponseCodePass.equals(actualResponseCode)) {
    KeywordUtil.logInfo(&quot;Response code is 0. Passed.&quot;)
} else if (expectedResponseCodeFail.equals(actualResponseCode)) {
    KeywordUtil.markFailed(&quot;Response code is 501. Failed.&quot;)
} else {
    KeywordUtil.markFailed(&quot;Unexpected response code: &quot; + actualResponseCode + &quot;. Failed.&quot;)
}</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
