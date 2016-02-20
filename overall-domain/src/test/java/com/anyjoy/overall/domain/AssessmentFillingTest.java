/**
 * 
 * 
 **/

package com.anyjoy.overall.domain;

import org.junit.Test;

import com.anyjoy.overall.domain.assessment.Assessment;
import com.anyjoy.overall.domain.assessment.Item;
import com.anyjoy.overall.domain.assessment.Option;
import com.anyjoy.overall.domain.assessment.SameOptionFactory;
import com.anyjoy.overall.domain.assessment.Section;
import com.anyjoy.overall.domain.fill.AssessmentStudent;
import com.anyjoy.overall.domain.record.SelfAssessmentOfStudent;
import com.anyjoy.overall.domain.record.SelfAssessmetFillRecord;

/**
 * <pre>
 * 
 * </pre>
 * 
 * @author 李贵庆2016年2月20日
 * @version 1.0
 **/
public class AssessmentFillingTest {

	@Test
	public void testSelfFilling() throws Exception {

		String[] os = new String[] {"A","B","C","D"};
		
		SameOptionFactory.instanceOf().addOption(new Option(os[0], 5d)).addOption(new Option(os[1], 3d)).addOption(new Option(os[2], 2d))
				.addOption(new Option(os[3], 1d));
		Option[] ops = new Option[] {SameOptionFactory.instanceOf().get(os[0]),SameOptionFactory.instanceOf().get(os[1]),SameOptionFactory.instanceOf().get(os[2]),SameOptionFactory.instanceOf().get(os[3])};
        Section s1 = new Section();
        
        Section s11 = new Section();
        s11.addChildSection(new Item("Test11.1",ops));
        s11.addChildSection(new Item("Test11.2",ops));
        s11.addChildSection(new Item("Test11.3",ops));
        
        Section s12 = new Section();
        s12.addChildSection(new Item("Test12.1",ops));
        s12.addChildSection(new Item("Test12.2",ops));
        s12.addChildSection(new Item("Test12.3",ops));
        
        s1.addChildSection(s11);
        s1.addChildSection(s12);
        
        Section s2 = new Section();
        Section s21 = new Section();
        s21.addChildSection(new Item("Test21.1",ops));
        s21.addChildSection(new Item("Test21.2",ops));
        s21.addChildSection(new Item("Test21.3",ops));
        
        Assessment assessment = new Assessment("Test");
        assessment.addSection(s1);
        assessment.addSection(s2);
        
        AssessmentStudent as = new AssessmentStudent();
        as.receiveSelfAssessment(assessment);
        Option[] checkeds = new Option[9];
        for(int i = 0;i<checkeds.length;i++) {
        	checkeds[i] = SameOptionFactory.instanceOf().get(getChar()+"");
        }
        
        
        as.doSlefAssessment(checkeds);
        
		SelfAssessmentOfStudent selfAssessment = new SelfAssessmentOfStudent();

		SelfAssessmetFillRecord record = new SelfAssessmetFillRecord();

		
		
	}
	
	private char getChar() {
		String chars = "ABCD";
		return chars.charAt((int)(Math.random() * 4));
	}
}
