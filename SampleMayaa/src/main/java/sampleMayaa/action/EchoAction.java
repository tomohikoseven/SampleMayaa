package sampleMayaa.action;

import org.seasar.struts.annotation.Execute;

public class EchoAction {
    @Execute(validator = false)
    public String index() {
    	return "echo.html";
    }

}
