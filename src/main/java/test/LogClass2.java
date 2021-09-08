package test;

public class LogClass2 extends  LogClass{
        public void LogFun(){
            logfactory.info("子类的日志");
            logfactory.debug("子类的错误日志");
        }
}
