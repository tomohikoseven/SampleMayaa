package sampleMayaa.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.annotation.Resource;
import org.seasar.struts.annotation.Execute;

public class ForEachAction {

	public List<String> lists;

    @Execute(validator = false)
    public String index() {
    	lists = new ArrayList<String>(5);
    	lists.add("１個目");
    	lists.add("２個目");
    	lists.add("３個目");
    	lists.add("４個目");
    	lists.add("５個目");
    	return "for.html";
    }
}
