/**
 * 
 * 
 **/

package com.anyjoy.overall.domain.assessment;

import java.util.HashSet;
import java.util.Set;

/** 
 * <pre>
 * 评价指标
 * </pre>
 *  
 * @author 李贵庆2016年2月20日
 * @version 1.0
 **/
public class Item {
	private String caption;
	
	private Set<Option> options;
	
	private double rateInSection = 0;
	
	private Section groupTo;
	
	public Item(String caption,Option...options) {
		this.caption = caption;
		this.options = new HashSet<>();
		for(Option o:options) {
			this.options.add(o);
		}
	}
	
	public void groupBy(Section section) {
		this.groupTo = section;
	}
}

