package com.jlc.actions;

import javax.servlet.http.*;
import com.jlc.jdbc.UserService;

/*
 * @Author : Hunterr
 * @company : JLC
 * @see		:https://github.com/Hunterr404
 */
public abstract class JlcBaseAction {
	static UserService userservice = null;
	static {
		userservice = new UserService();
	}

	public abstract String process(HttpServletRequest req, HttpServletResponse res) throws Exception;
}
