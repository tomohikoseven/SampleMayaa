package sampleMayaa.action;

import java.util.Random;
import org.seasar.struts.annotation.Execute;

public class FormatNumberAction {

	public int randNum;

    @Execute(validator = false)
    public String index() {
    	Random rand = new Random();
        randNum = rand.nextInt(10001);  // ランダムに生成
    	return "formatNumber.html";
    }
}
