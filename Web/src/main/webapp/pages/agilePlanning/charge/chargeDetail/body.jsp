<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>


<p class="textForBodyErrorMessage" align="left">&nbsp;<html:errors bundle="agilePlanning"/></p>

<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 

<html:form action="/charge" focus="shortDescription">

<TR> 
		<TD  width="20%">&nbsp;
			<html:hidden property="persistanceId"/>
			<html:hidden property="persistanceVersion"/>
			<html:hidden property="storyPersistanceId"/>
			<html:hidden property="taskPersistanceId"/>
		</TD>
	</TR>
	<TR> 
		<TD  width="20%" class="textForBodyText" >
			<bean:message key="pages.common.day"/> <font color="#FF0000">(*)</font> : 
		</TD>
		<TD>
			<html:text property="dayInString" maxlength="10" size="10" styleClass="field"/>
		</TD>
	</TR>
	<TR> 
		<TD  width="20%" class="textForBodyText">
			<bean:message key="pages.agilePlanning.charge.timeUsed"/> <font color="#FF0000">(*)</font> : 
		</TD>
		<TD>
			<html:text property="timeUsedToday" maxlength="6" size="6" styleClass="field"/>
		</TD>
	</TR>
	<TR> 
		<TD  width="20%" class="textForBodyText">
			<bean:message key="pages.agilePlanning.charge.daysNeededToFinish"/> <font color="#FF0000">(*)</font> : 
		</TD>
		<TD>
			<html:text property="daysNeededToFinish" maxlength="6" size="6" styleClass="field"/>
		</TD>
	</TR>
	<TR><TD>&nbsp;</TD></TR>
	<TR> 	
	<TD>&nbsp;</TD>
		<TD align="left">
			<html:submit property="action" styleClass="textForBodyText">
                <bean:message key="button.save"/>
            </html:submit>
            &nbsp;
            
            <logic:notEqual name="chargeForm" property="persistanceId" value="0">
            
				<html:submit property="action" styleClass="textForBodyText">
	                <bean:message key="button.delete"/>
	            </html:submit>
	            
	        </logic:notEqual>    
		</TD>
	</TR>
	<TR><TD>&nbsp;</TD></TR>
   	<TR><TD class="textForBodyRedText"><bean:message key="pages.common.mandatoryFields" /></TD></TR>
</html:form>
</TABLE>