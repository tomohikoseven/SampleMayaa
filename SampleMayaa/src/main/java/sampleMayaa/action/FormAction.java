package sampleMayaa.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;
import org.seasar.struts.annotation.ActionForm;

import sampleMayaa.form.*;

public class FormAction {
	@ActionForm
	@Resource
	protected FormForm formForm;

    @Execute(validator = false)
    public String index() {
    	return "form.html";
    }

}
