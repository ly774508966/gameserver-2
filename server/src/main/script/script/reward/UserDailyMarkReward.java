package script.reward;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import script.BattleOver;

import com.xinqihd.sns.gameserver.entity.user.User;
import com.xinqihd.sns.gameserver.script.ScriptManager;
import com.xinqihd.sns.gameserver.script.ScriptResult;

public class UserDailyMarkReward {
	
	private static final Logger logger = LoggerFactory.getLogger(BattleOver.class);

	public static ScriptResult func(Object[] parameters) {
		ScriptResult result = ScriptManager.checkParameters(parameters, 2);
		if ( result != null ) {
			return result;
		}
		
		User user = (User)parameters[0];
		int slot = (Integer)parameters[1];
		
		ArrayList rewards = new ArrayList(slot*2);
		
		result = new ScriptResult();
		result.setType(ScriptResult.Type.SUCCESS_RETURN);
		result.setResult(rewards);
		return result;
	}
	
}
