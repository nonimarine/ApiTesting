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

response = WS.sendRequest(findTestObject('Authorization/GetToken'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Admin/Admin1-GetUser'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Admin/Admin2-Login'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Admin/Admin3-Organization'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/Attendance/Attendance1-PunchIn'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Object Repository/Attendance/Attendance2-PunchOut'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Employee/Employee01-EmployeeSearch'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Employee/Employee03-UpdateEmployeeDetail'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Employee/Employee04-EmployeeContactDetail'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Employee/Employee02-GetEmployeeID'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Employee/Employee05-SaveEmployeeCD'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Employee/Employee06-GetEmployeeDependent'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Employee/Employee07-GetSupervisor'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Employee/Employee08-SaveSupervisor'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Employee/Employee09-DeleteSupervisor'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Employee/Employee10-WorkExperience'))

WS.verifyResponseStatusCode(response, 200)

