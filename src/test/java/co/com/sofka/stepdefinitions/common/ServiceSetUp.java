package co.com.sofka.stepdefinitions.common;


import io.restassured.RestAssured;
import org.apache.log4j.PropertyConfigurator;

import static co.com.sofka.util.Log4jValues.LOG4J_PROPERTIES_FILE_PATH;
import static co.com.sofka.util.Log4jValues.USER_DIR;

public class ServiceSetUp {
        private static final String BASE_URI = "http://automationpractice.com/index.php";
        private static final String BASE_PATH = "http://automationpractice.com/index.php?controller=authentication&back=my-account";


        protected void generalSetUp(){
            setUpLog4j2();
            setUpBases();
        }

        private void setUpLog4j2(){
            PropertyConfigurator.configure(USER_DIR.getValue()  + LOG4J_PROPERTIES_FILE_PATH.getValue());
        }

        private void setUpBases(){
            RestAssured.baseURI = BASE_URI;
            RestAssured.basePath = BASE_PATH;
        }
    }


