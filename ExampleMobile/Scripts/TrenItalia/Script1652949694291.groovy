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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('com.lynxspa.prontotreno')

driver = MobileDriverFactory.getDriver()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/TrenItaliaOR/android.widget.ImageButton'), 0)

//Mobile.tap(findTestObject('Object Repository/TrenItaliaOR/android.widget.ImageButton (1)'), 0)
Mobile.tap(findTestObject('Object Repository/TrenItaliaOR/android.widget.TextView - Orbetello-Monte Argentario (2)'), 0)

Mobile.setText(findTestObject('Object Repository/TrenItaliaOR/android.widget.EditText - Stazione di arrivo (2)'), 'Termini', 
    0)

Mobile.tap(findTestObject('Object Repository/TrenItaliaOR/android.widget.TextView - Roma Termini'), 0)

Mobile.tap(findTestObject('Object Repository/TrenItaliaOR/android.widget.Button - RICERCA (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/TrenItaliaOR/android.widget.LinearLayout (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/TrenItaliaOR/android.widget.Button - AVANTI'), 0)

Mobile.tap(findTestObject('Object Repository/TrenItaliaOR/android.widget.TextView - Continua senza login'), 0)

Mobile.tap(findTestObject('Object Repository/TrenItaliaOR/android.widget.EditText - Nome'), 0)

Mobile.setText(findTestObject('Object Repository/TrenItaliaOR/android.widget.EditText - Nome (1)'), 'Samra', 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/TrenItaliaOR/android.widget.EditText - Cognome'), 0)

Mobile.setText(findTestObject('Object Repository/TrenItaliaOR/android.widget.EditText - Cognome (1)'), 'Aliyeva', 0)

Mobile.tap(findTestObject('Object Repository/TrenItaliaOR/android.widget.EditText - Email'), 0)

Mobile.setText(findTestObject('Object Repository/TrenItaliaOR/android.widget.EditText - Email (1)'), 'samra.aliyeva@claritergroup.com', 
    0)

Mobile.scrollToText('Conferma Email*')

Mobile.tap(findTestObject('Object Repository/TrenItaliaOR/android.widget.EditText - Conferma Email'), 0)

Mobile.setText(findTestObject('Object Repository/TrenItaliaOR/android.widget.EditText - Conferma Email (1)'), 'samra.aliyeva@claritergroup.com', 
    0)

Mobile.scrollToText('Numero di telefono')

Mobile.tap(findTestObject('Object Repository/TrenItaliaOR/android.widget.EditText - Numero di telefono'), 0)

Mobile.setText(findTestObject('Object Repository/TrenItaliaOR/android.widget.EditText - Numero di telefono (1)'), '333445566', 
    0)

Mobile.tap(findTestObject('Object Repository/TrenItaliaOR/android.widget.Button - PROCEDI'), 0)

Mobile.tap(findTestObject('Object Repository/TrenItaliaOR/android.widget.Button - AVANTI (1)'), 0)

//Mobile.tap(findTestObject('Object Repository/TrenItaliaOR/android.widget.Button - AVANTI (2)'), 0)
//Mobile.tap(findTestObject('Object Repository/TrenItaliaOR/lastAvanti'), 0)
Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/TrenItaliaOR/android.widget.Button - AVANTI (3)'), 0)

Mobile.tap(findTestObject('Object Repository/TrenItaliaOR/android.widget.Button - HO CAPITO'), 0)

Mobile.tap(findTestObject('Object Repository/TrenItaliaOR/android.widget.CheckBox (2)'), 0)

Mobile.tap(findTestObject('Object Repository/TrenItaliaOR/android.widget.Button - AVANTI (3)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

driver.closeApp()

