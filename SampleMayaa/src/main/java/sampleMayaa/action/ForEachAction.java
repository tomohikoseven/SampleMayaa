package sampleMayaa.action;

import org.seasar.struts.annotation.Execute;

public class ForEachAction {

	public String[] lists;

    @Execute(validator = false)
    public String index() {
    	lists = new String[5];

    	lists[0] = "１個目";
    	lists[1] = "２個目";
    	lists[2] = "３個目";
    	lists[3] = "４個目";
    	lists[4] = "５個目";

    	return "forEach.html";
    }
}
