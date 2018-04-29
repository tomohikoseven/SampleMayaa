package sampleMayaa.action;

import org.seasar.struts.annotation.Execute;

public class WriteAction {
    @Execute(validator = false)
    public String index() {
    	return "write.html";
    }

}
