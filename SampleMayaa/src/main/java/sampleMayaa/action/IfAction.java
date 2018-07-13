package sampleMayaa.action;

import java.util.Random;
import org.seasar.struts.annotation.Execute;

public class IfAction {

	public int randNum;

    @Execute(validator = false)
    public String index() {
    	Random rand = new Random();
        randNum = rand.nextInt(2);  // 0と1をランダムに生成
    	return "if.html";
    }
}
