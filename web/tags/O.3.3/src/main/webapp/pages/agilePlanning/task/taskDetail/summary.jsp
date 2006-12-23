<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 
	<TR>
		<TD height="17" class="textForLeftTitle"><bean:write name="basicProject.name" scope="session"/> > <bean:write name="story.shortDescription" scope="request"/> > <bean:write name="taskForm" property="shortDescription"/></TD>
	</TR>
	<TR>
		<TD height="23" class="textForLeftText">&nbsp;</TD>
	</TR>
	<TR> 
		<TD height="23" class="textForLeftText"><bean:message key="pages.agilePlanning.task.completed"/> : <bean:write name="taskForm" property="percentCompleted"/> (<bean:write name="taskForm" property="daysCompleted"/> <bean:message key="pages.common.day(s)"/> </TD> 
	</TR> 
	<TR> 
		<TD height="23" class="textForLeftText"><bean:write name="taskForm" property="daysRemaining"/> <bean:message key="pages.common.day(s)"/> <bean:message key="pages.common.left"/>) </TD> 
	</TR> 
	<TR> 
		<TD height="23" class="textForLeftText">&nbsp;</TD> 
	</TR>

	 	<logic:greaterThan name="taskForm" property="differenceOfDaysBetweenEstimateAndCharge" value="0">
		 	<TR class="textForLeftTextInRed"><TD height="23"><img height='15' width='15' src='images/warning.gif'>
	 	</logic:greaterThan>

	 	<logic:lessEqual name="taskForm" property="differenceOfDaysBetweenEstimateAndCharge" value="0">
		 		<TR class="textForLeftText"><TD height="23">
	 	</logic:lessEqual>
	 	
		<bean:message key="pages.agilePlanning.story.differenceBetweenEstimateAndCharge"/> :</TD> 
	</TR>

	 	<logic:greaterThan name="taskForm" property="differenceOfDaysBetweenEstimateAndCharge" value="0">
		 	<TR class="textForLeftTextInRed"><TD height="23">
	 	</logic:greaterThan>

	 	<logic:lessEqual name="taskForm" property="differenceOfDaysBetweenEstimateAndCharge" value="0">
		 		<TR class="textForLeftText"><TD height="23">
	 	</logic:lessEqual>
	
		 <bean:write name="taskForm" property="differenceOfDaysBetweenEstimateAndCharge"/> <bean:message key="pages.common.day(s)"/> (<bean:write name="taskForm" property="differenceInPercentBetweenEstimateAndCharge"/>)</TD>
	</TR>
	<TR>
		<TD>&nbsp;</TD> 
	</TR>  
</TABLE>