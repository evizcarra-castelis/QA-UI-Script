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

WebUI.setText(findTestObject('Account Creation/Webinar Registration/input_First Name'), 'QA')

WebUI.setText(findTestObject('Account Creation/Webinar Registration/input_Last Name'), 'Test')

WebUI.setText(findTestObject('Account Creation/Webinar Registration/input_Professional Email'), ('qa.castelis.test' + String.valueOf(
        randomNumber)) + '@yopmail.com')

WebUI.setText(findTestObject('Account Creation/Webinar Registration/input_Password'), GlobalVariable.password)

WebUI.setText(findTestObject('Account Creation/Webinar Registration/input_country Code'), '+ 632')

WebUI.setText(findTestObject('Account Creation/Webinar Registration/input_Phone Number'), '9123456789')

WebUI.setText(findTestObject('Account Creation/Webinar Registration/input_Job Title'), 'QA')

WebUI.selectOptionByIndex(findTestObject('Account Creation/Webinar Registration/input_Job Department'), 13, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Account Creation/Webinar Registration/input_Company'), 'Castelis')

WebUI.setText(findTestObject('Account Creation/Webinar Registration/input_City'), 'Manila')

WebUI.selectOptionByLabel(findTestObject('Account Creation/Webinar Registration/input_Country'), 'Philippines', true)

WebUI.selectOptionByIndex(findTestObject('Account Creation/Webinar Registration/input_Company Activity'), 19, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Account Creation/Webinar Registration/span_SEND'))

WebUI.click(findTestObject('Account Creation/Webinar Registration/span_Agree'))

WebUI.verifyElementVisible(findTestObject('Account Creation/div_Please confirm your email              _9e762d'))

WebUI.closeBrowser()

