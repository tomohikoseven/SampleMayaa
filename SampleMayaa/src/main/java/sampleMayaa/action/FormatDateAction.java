package sampleMayaa.action;

import java.util.Date;
import org.seasar.struts.annotation.Execute;

public class FormatDateAction {

	public Date date = null;

    @Execute(validator = false)
    public String index() {
    	date = new Date();
    	return "formatDate.html";
    }
}
