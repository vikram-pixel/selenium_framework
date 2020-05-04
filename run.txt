set projectLocation=C:\Users\Tit tiri tiww\SeleniumAutomationFW
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml