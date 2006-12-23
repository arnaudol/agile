<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 
<html:form action="/userProject" focus="basicProjectPersistanceId">
<html:hidden property="userPersistanceId"/>
	<TR> 
		<TD class="textForBodyText">
			<bean:message key="pages.common.project"/> : 
		</TD>
		<TD>
		
			<html:select property="basicProjectPersistanceId" styleClass="textForBodyText">
	    	    <html:options collection="basicProjects" property="persistanceId" labelProperty="name"/>
	       	</html:select>
		
		</TD>
	</TR>
	<TR><TD>&nbsp;</TD></TR>
	<TR> 	
	<TD>&nbsp;</TD>
		<TD align="left">
			<html:submit property="action" styleClass="textForBodyText">
                <bean:message key="button.add"/>
            </html:submit>
            &nbsp;
			<html:submit property="action" styleClass="textForBodyText">
                <bean:message key="button.cancel"/>
            </html:submit>
		</TD>
	</TR>
</html:form>
</TABLE>