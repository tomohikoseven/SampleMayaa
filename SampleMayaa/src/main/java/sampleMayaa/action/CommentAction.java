package sampleMayaa.action;

import org.seasar.struts.annotation.Execute;

public class CommentAction {

    @Execute(validator = false)
    public String index() {
    	return "comment.html";
    }
}
