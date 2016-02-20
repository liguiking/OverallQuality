/**
 * 
 * 
 **/

package com.anyjoy.overall.domain.assessment;

import java.util.ArrayList;



/** 
 * <pre>
 * 
 * </pre>
 *  
 * @author 李贵庆2016年2月20日
 * @version 1.0
 **/
public class SameOptionFactory {

	private ArrayList<Option> ops = new ArrayList<>();
	
	private SameOptionFactory () {
		
	}
	
	private final static class Holder{
		private final static SameOptionFactory instance = new SameOptionFactory();
	}
	
	public static SameOptionFactory instanceOf() {
		return Holder.instance;
	}
	
	public SameOptionFactory addOption(Option option) {
		if(this.ops.contains(option)) {
			return this;
		}
		this.ops.add(option);
		return this;
	}
	
	public Option get(String title) {
		for(Option o:ops) {
			if(o.sameTile(title)) { 
				return o;
			}
		}
		
		return null;
	}
	
}

