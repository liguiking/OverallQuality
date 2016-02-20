/**
 * 
 * 
 **/

package com.anyjoy.overall.domain.assessment;

import java.util.HashSet;
import java.util.Set;

/** 
 * <pre>
 * 等级评价表
 * </pre>
 *  
 * @author 李贵庆2016年2月20日
 * @version 1.0
 **/
public class Assessment {

	private String name;
	
	private Set<Section> sections;
	
	public Assessment(String name) {
		this.name = name;
	}
	
	public void addSection(Section section) {
		if(this.sections == null) {
			this.sections = new HashSet<>();
		}
		
		this.sections.add(section);
	}
}

