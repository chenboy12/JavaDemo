package test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.Logger;

public class LogClass {
    protected final Log logfactory=LogFactory.getLog(LogClass.class);
    public void LogFun(){
        logfactory.info("infolog");
    }

    public  String Name;

    public void Log4j(){

    }
}


