<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<p class="textForBodyErrorMessage" align="left">&nbsp;<html:errors bundle="agilePlanning"/></p>

<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 

<html:form action="/task" focus="shortDescription">
<TR> 
		<TD  width="20%">
			&nbsp;<html:hidden property="persistanceId"/>
		</TD>
		<TD>
			&nbsp;<html:hidden property="persistanceVersion"/>
		</TD>
		<TD>
			&nbsp;<html:hidden property="storyPersistanceId"/>
		</TD>
	</TR>
	<TR> 
		<TD  width="20%" class="textForBodyText" >
			<bean:message key="pages.agilePlanning.task.shortDescription"/> <font color="#FF0000">(*)</font> : 
		</TD>
		<TD>
			<html:text property="shortDescription" maxlength="100" size="50" styleClass="field"/>
		</TD>
	</TR>
	<!-- 
	<TR> 
		<TD  width="20%" class="textForBodyText" >
			<bean:message key="pages.agilePlanning.task.description"/> : 
		</TD>
		<TD>
			<html:text property="description" maxlength="100" size="50" styleClass="textForBodyText"/>
		</TD>
	</TR>
	 -->
	<TR> 
		<TD  width="20%" class="textForBodyText">
			<bean:message key="pages.agilePlanning.task.daysEstimated"/> : 
		</TD>
		<TD>
			<html:text property="daysEstimated" maxlength="6" size="6" styleClass="field"/>
		</TD>
	</TR>
	<TR> 
		<TD  width="20%" class="textForBodyText">
			<bean:message key="pages.agilePlanning.task.owner"/> :
		</TD>
		<TD>
			<html:select property="developperPersistanceId" styleClass="textForBodyText">
	    	    <html:options collection="members" property="persistanceId" labelProperty="lastName"/>
	       	</html:select>
		</TD>
	</TR>
	<TR><TD>&nbsp;</TD></TR>
	<TR> 	
	<TD>&nbsp;</TD>
		<TD align="left">
			<html:submit property="action" styleClass="textForBodyText">
                <bean:message key="button.save"/>
            </html:submit>
            
            <logic:notEqual name="taskForm" property="persistanceId" value="0">
            
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