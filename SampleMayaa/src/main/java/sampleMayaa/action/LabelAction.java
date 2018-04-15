package sampleMayaa.action;

import org.seasar.struts.annotation.Execute;

public class LabelAction {
    @Execute(validator = false)
    public String index() {
    	return "label.html";
    }

}
