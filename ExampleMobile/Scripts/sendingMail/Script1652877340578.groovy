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

Mobile.comment('Application will be tested')

//def appPath=PathUtil.relativeToAbsolutePath(GlobalVariable.G, RunConfiguration.getProjectDir())

Mobile.startExistingApplication('com.google.android.gm')

Mobile.tap(findTestObject('Object Repository/New Folder/android.widget.Button - Scrivi'), 0)

Mobile.setText(findTestObject('Object Repository/New Folder/android.widget.EditText'), 'samra.aliyeva@claritergroup.com', 
    0)

Mobile.tap(findTestObject('Object Repository/New Folder/android.widget.TextView - samra.aliyevaclaritergroup.com'), 0)

Mobile.setText(findTestObject('Object Repository/New Folder/android.widget.EditText - Oggetto'), 'mobile testing', 0)

Mobile.setText(findTestObject('Object Repository/New Folder/android.widget.EditText - Scrivi email'), '5th try on gmail', 
    0)

Mobile.comment('The email has been sent successfully')

Mobile.tap(findTestObject('Object Repository/New Folder/android.widget.TextView'), 0)

Mobile.closeApplication()

