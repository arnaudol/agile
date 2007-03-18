<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<p class="textForBodyErrorMessage" align="left"><html:errors bundle="toDo"/></p>

<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 

<html:form action="/toDo" focus="description">
<TR> 
		<TD width="15%">
			&nbsp;<html:hidden property="persistanceId"/>
		</TD>
		<TD>
			&nbsp;<html:hidden property="persistanceVersion"/>
		</TD>
	</TR>
	<TR> 
		<TD  width="15%" class="textForBodyText" valign="top">
			<bean:message key="pages.toDo.description"/> :
		</TD>
		<TD>
			<html:textarea property="description" cols="70" rows="10" styleClass="textarea"/>
		</TD>
	</TR>
	<TR> 
		<TD  width="15%" class="textForBodyText">
			<bean:message key="pages.toDo.date"/> : 
		</TD>
		<TD class="textForBodyText">
			<html:text property="dateInString" maxlength="10" size="10" styleClass="field"/> (dd/mm/yyyy)
		</TD>
	</TR>
	<TR> 
	<TD  width="15%" class="textForBodyText">
			<bean:message key="pages.toDo.done"/> : 
		</TD>
		<TD class="textForBodyText">
			<html:checkbox property="done" styleClass="field"/>
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
            
            <logic:notEqual name="toDoForm" property="persistanceId" value="0">
            
				<html:submit property="action" styleClass="textForBodyText">
	                <bean:message key="button.delete"/>
	            </html:submit>
	            
	        </logic:notEqual>    
		</TD>
	</TR>
</html:form>
</TABLE>