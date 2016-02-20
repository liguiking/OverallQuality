/**
 * 
 * 
 **/

package com.anyjoy.overall.domain.fill;

import com.anyjoy.overall.domain.assessment.Assessment;
import com.anyjoy.overall.domain.assessment.Option;
import com.anyjoy.overall.domain.record.SelfAssessmetFillRecord;

/** 
 * <pre>
 * 参评学生
 * </pre>
 *  
 * @author 李贵庆2016年2月20日
 * @version 1.0
 **/
public class AssessmentStudent {

	private Assessment selfAssessment;
	
	public Assessment useSelfAssessment() {
		return null;
	}

	public void receiveSelfAssessment(Assessment assessment) {
		this.selfAssessment = assessment;
	}

	public void doSlefAssessment(Option[] checkeds) {
		// TODO Auto-generated method stub
		
	}
}

