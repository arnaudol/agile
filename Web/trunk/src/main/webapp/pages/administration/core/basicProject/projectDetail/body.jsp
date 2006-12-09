<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<p class="textForBodyErrorMessage" align="left">&nbsp;<html:errors bundle="core"/></p>

<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 
<html:form action="/basicProject" focus="code">
<html:hidden property="persistanceVersion"/>
<html:hidden property="persistanceId"/>
	<TR> 
		<TD class="textForBodyText">
			<bean:message key="pages.core.basicProjectDetail.code"/> <font color="#FF0000">(*)</font> : 
		</TD>
		<TD>
			<html:text property="code" maxlength="100" size="20" styleClass="field"/>
		</TD>
	</TR>
	<TR> 
		<TD class="textForBodyText">
			<bean:message key="pages.core.basicProjectDetail.name"/> <font color="#FF0000">(*)</font> : 
		</TD>
		<TD>
			<html:text property="name" maxlength="100" size="20" styleClass="field"/>
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
                <bean:message key="button.cancel"/>
            </html:submit>
             &nbsp;
            <!-- 
			<html:submit property="action" styleClass="textForBodyText">
                <bean:message key="button.delete"/>
            </html:submit>
             -->
		</TD>
	</TR>
	<TR><TD>&nbsp;</TD></TR>
   	<TR><TD class="textForBodyRedText"><bean:message key="pages.common.mandatoryFields" /></TD></TR>
</html:form>
</TABLE>