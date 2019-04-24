package com.jlcindia.tags;

import java.io.Writer;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/*
 * @Author : Hunterr
 * @company : JLC
 * @see		:https://github.com/Hunterr404
 */
public class ErrorTag extends TagSupport {
	private String property;

	public void setProperty(String property) {
		this.property = property;
	}

	public int doENdTag() throws JspException {
		try {
			Object msg = pageContext.findAttribute(property);
			System.out.println(msg);
			if (msg != null) {
				Writer out = pageContext.getOut();
				out.write("<font color='red' size='4' >" + msg + "</font>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return super.doEndTag();
	}
}
