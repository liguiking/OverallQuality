/**
 * 
 * 
 **/

package com.anyjoy.overall.domain.assessment;

import java.util.HashSet;
import java.util.Set;

/** 
 * <pre>
 * 评价维度
 * </pre>
 *  
 * @author 李贵庆2016年2月20日
 * @version 1.0
 **/
public class Section {

	private String title;
	
	private String desc;
	
	private double rateOfTop = 0;
	
	private Set<Section> childSections;
	
	private Section top;
	
	private Set<Item> items;
	
	
	public void addChildSection(Section section){
		if(this.childSections == null) {
			this.childSections = new HashSet<>();
		}
		this.childSections.add(section);
		section.top = this;
	}
	
	public void addChildSection(Item item){
		if(this.items == null) {
			this.items = new HashSet<>();
		}
		this.items.add(item);
		item.groupBy(this);
	}
}

