<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>

<p class="textForBodyErrorMessage" align="left">&nbsp;<html:errors bundle="agilePlanning"/></p>

<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 
<html:form action="/iteration" focus="start">
<TR> 
		<TD width="20%">
			&nbsp;<html:hidden property="persistanceId"/>
		</TD>
		<TD>
			&nbsp;<html:hidden property="persistanceVersion"/>
		</TD>
	</TR>
	<TR> 
		<TD  width="20%" class="textForBodyText">
			<bean:message key="pages.agilePlanning.iteration.start"/> <font color="#FF0000">(*)</font> :
		</TD>
		<TD class="textForBodyText">
			<html:text property="startDateInString" maxlength="10" size="10" styleClass="field"/>  (dd/mm/yyyy)
		</TD>
	</TR>
	<TR> 
		<TD  width="20%" class="textForBodyText">
			<bean:message key="pages.agilePlanning.iteration.end"/> <font color="#FF0000">(*)</font> :
		</TD>
		<TD class="textForBodyText">
			<html:text property="endDateInString" maxlength="10" size="10" styleClass="field"/> (dd/mm/yyyy)
		</TD>
	</TR>
		<TR> 
		<TD  width="20%" class="textForBodyText">
			<bean:message key="pages.agilePlanning.iteration.numberOfDays"/> <font color="#FF0000">(*)</font> :
		</TD>
		<TD class="textForBodyText">
			<html:text property="days" maxlength="100" size="5" styleClass="field"/>
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
			<html:submit property="action" styleClass="textForBodyText">
                <bean:message key="button.delete"/>
            </html:submit>
		</TD>
	</TR>
	<TR><TD>&nbsp;</TD></TR>
   	<TR><TD class="textForBodyRedText"><bean:message key="pages.common.mandatoryFields" /></TD></TR>
</html:form>
</TABLE>