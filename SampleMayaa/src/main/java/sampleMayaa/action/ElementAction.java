package sampleMayaa.action;

import org.seasar.struts.annotation.Execute;

public class ElementAction {

    @Execute(validator = false)
    public String index() {
    	return "element.html";
    }
}
