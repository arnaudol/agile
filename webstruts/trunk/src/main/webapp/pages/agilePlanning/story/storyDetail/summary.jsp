<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 
	<TR> 
		<TD height="17" class="textForLeftTitle"><bean:write name="basicProject.name" scope="session"/> > <bean:write name="storyForm" property="shortDescription"/></TD>
	</TR> 
	<TR> 
		<TD height="23" class="textForLeftText">&nbsp;</TD> 
	</TR> 
	<TR> 
		<TD height="23" class="textForLeftText"><bean:message key="pages.agilePlanning.story.completed"/> : <bean:write name="storyForm" property="percentCompleted"/> (<bean:write name="storyForm" property="daysCompleted"/> <bean:message key="pages.common.day(s)"/> </TD> 
	</TR> 
	<TR> 
		<TD height="23" class="textForLeftText"><bean:write name="storyForm" property="daysRemaining"/> <bean:message key="pages.common.day(s)"/> <bean:message key="pages.common.left"/>) </TD> 
	</TR> 
	<TR> 
		<TD height="23" class="textForLeftText">&nbsp;</TD> 
	</TR>

	 	<logic:greaterThan name="storyForm" property="differenceOfDaysBetweenEstimateAndTaskEstimate" value="0">
		 	<TR class="textForLeftTextInRed"><TD height="23"><img height='15' width='15' src='images/warning.gif'>
	 	</logic:greaterThan>

	 	<logic:lessEqual name="storyForm" property="differenceOfDaysBetweenEstimateAndTaskEstimate" value="0">
		 		<TR class="textForLeftText"><TD height="23">
	 	</logic:lessEqual>
	 	
		<bean:message key="pages.agilePlanning.story.differenceBetweenEstimateAndTaskEstimate"/> :</TD> 
	</TR>

	 	<logic:greaterThan name="storyForm" property="differenceOfDaysBetweenEstimateAndTaskEstimate" value="0">
		 	<TR class="textForLeftTextInRed"><TD height="23">
	 	</logic:greaterThan>

	 	<logic:lessEqual name="storyForm" property="differenceOfDaysBetweenEstimateAndTaskEstimate" value="0">
		 		<TR class="textForLeftText"><TD height="23">
	 	</logic:lessEqual>
	
		 <bean:write name="storyForm" property="differenceOfDaysBetweenEstimateAndTaskEstimate"/> <bean:message key="pages.common.day(s)"/> (<bean:write name="storyForm" property="differenceInPercentBetweenEstimateAndTaskEstimate"/>)</TD>
	</TR>
	
	 	<logic:greaterThan name="storyForm" property="differenceOfDaysBetweenEstimateAndTaskCharge" value="0">
		 	<TR class="textForLeftTextInRed"><TD height="23"><img height='15' width='15' src='images/warning.gif'>
	 	</logic:greaterThan>

	 	<logic:lessEqual name="storyForm" property="differenceOfDaysBetweenEstimateAndTaskCharge" value="0">
		 		<TR class="textForLeftText"><TD height="23">
	 	</logic:lessEqual>
	
		<bean:message key="pages.agilePlanning.story.differenceBetweenEstimateAndTaskCharge"/> :</TD>
	</TR>
	
	 	<logic:greaterThan name="storyForm" property="differenceOfDaysBetweenEstimateAndTaskCharge" value="0">
		 	<TR class="textForLeftTextInRed"><TD height="23">
	 	</logic:greaterThan>

	 	<logic:lessEqual name="storyForm" property="differenceOfDaysBetweenEstimateAndTaskCharge" value="0">
		 		<TR class="textForLeftText"><TD height="23">
	 	</logic:lessEqual>
	
		<bean:write name="storyForm" property="differenceOfDaysBetweenEstimateAndTaskCharge"/> <bean:message key="pages.common.day(s)"/> (<bean:write name="storyForm" property="differenceInPercentBetweenEstimateAndTaskCharge"/>)</TD>
	</TR>
		<TR>
		<TD>&nbsp;</TD> 
	</TR>  
</TABLE>