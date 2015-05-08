package com.sds.icto.mysite.servlet.action.main;

import com.sds.icto.web.Action;

public class ActionFactory {
	private static ActionFactory instance;
	
	private ActionFactory(){
		
	}
	
	public static ActionFactory getInstance(){
		
		if(instance ==null){
			instance = new ActionFactory();
		}
		
		return instance;
	}
	
	
	public Action getAction(String a){
		Action action = new IndexAction();
		
		
		
		
		
		return action;
//		if ("form".equals(a)) {
//			action = new FormAction();
//		} else if ("insert".equals(a)) {
//			action = new InsertAction();
//		}
//
//		if (action == null) {
//			action = new IndexAction();
//		}		
	}
	
}
