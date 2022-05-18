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

Mobile.startExistingApplication('com.amazon.mShop.android.shopping')

Mobile.tap(findTestObject('Object Repository/AmazonOR/android.widget.ImageView'), 0)

Mobile.setText(findTestObject('Object Repository/AmazonOR/android.widget.EditText - Cerca su Amazon.it'), 'pantene shampoo', 
    0)

Mobile.tap(findTestObject('Object Repository/AmazonOR/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/AmazonOR/android.widget.TextView - Pantene Pro-V Miracles Forti  Lunghi, Set Per Capelli 1X Shampoo 225ml, 1x Balsamo 200ml, 1X Maschera 160ml, con Biotina e Bamb'), 
    0)

Mobile.tap(findTestObject('Object Repository/AmazonOR/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/AmazonOR/android.widget.Button - Aggiungi al carrello'), 0)

Mobile.closeApplication()

