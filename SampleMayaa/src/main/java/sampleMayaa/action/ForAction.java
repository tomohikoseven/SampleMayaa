package sampleMayaa.action;

import org.seasar.struts.annotation.Execute;

public class ForAction {

    @Execute(validator = false)
    public String index() {
    	return "for.html";
    }
}
