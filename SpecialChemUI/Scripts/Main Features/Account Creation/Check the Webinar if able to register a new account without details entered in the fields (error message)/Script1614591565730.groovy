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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Random rnd = new Random()

randomNumber = (0 + rnd.nextInt(9999))

WebUI.openBrowser(GlobalVariable.coatingsURL)

WebUI.maximizeWindow()

WebUI.mouseOver(findTestObject('Account Creation/Webinar Registration/span_Selection Resources'))

WebUI.click(findTestObject('Account Creation/Webinar Registration/a_Webinar and Videos'))

WebUI.click(findTestObject('Account Creation/Webinar Registration/span_Webinar option'))

WebUI.verifyElementVisible(findTestObject('Account Creation/Webinar Registration/div_Login and Registration banner'))

WebUI.click(findTestObject('Account Creation/Online Intro Registration/span_REGISTER (free)'))

WebUI.click(findTestObject('Account Creation/Webinar Registration/span_SEND'))

WebUI.verifyElementVisible(findTestObject('Account Creation/div_Request online error message'))

WebUI.closeBrowser()

