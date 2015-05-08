package com.sds.icto.mysite.action.guestbook;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.web.Action;
import com.sds.icto.web.WebUtil;

public class FormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {
		WebUtil.forward( "/view/form_guestbook.jsp", request, response);
	}

}
