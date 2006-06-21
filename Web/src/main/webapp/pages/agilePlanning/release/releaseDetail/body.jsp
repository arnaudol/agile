<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<p class="textForBodyErrorMessage" align="left">&nbsp;<html:errors bundle="agilePlanning"/></p>

<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 
<html:form action="/release" focus="number">
<TR> 
		<TD  width="20%">
			&nbsp;<html:hidden property="persistanceId"/>
		</TD>
		<TD>
			&nbsp;<html:hidden property="persistanceVersion"/>
		</TD>
	</TR>
	<TR> 
		<TD  width="20%" class="textForBodyText">
			<bean:message key="pages.agilePlanning.release.number"/> <font color="#FF0000">(*)</font> :
		</TD>
		<TD>
			<html:text property="number" maxlength="50" size="20" styleClass="field"/>
		</TD>
	</TR>
	<TR> 
		<TD  width="20%" class="textForBodyText">
			<bean:message key="pages.common.date"/> <font color="#FF0000">(*)</font> : 
		</TD>
		<TD class="textForBodyText">
			<html:text property="dateInString" maxlength="10" size="10" styleClass="field"/> (dd/mm/yyyy)
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
            
           <logic:notEqual name="releaseForm" property="persistanceId" value="0">
            
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