/**
 * 
 * 
 **/

package com.anyjoy.overall.domain.assessment;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * <pre>
 * 
 * </pre>
 * 
 * @author 李贵庆2016年2月20日
 * @version 1.0
 **/
public class Option {

	private String title;

	private double value;
	
	public Option() {
		
	}

	public Option(String title, double value) {
		super();
		this.title = title;
		this.value = value;
	}

	public int hashCode() {
		return new HashCodeBuilder().append(this.title).append(this.value).toHashCode();
	}

	public boolean equals(Object o) {
		if (!(o instanceof Option)) {
			return false;
		}

		Option other = (Option) o;
		return new EqualsBuilder().append(this.title, other.title).append(this.value, other.value).isEquals();
	}

	public boolean sameTile(String title) {
		return this.title.equals(title);
	}
}
