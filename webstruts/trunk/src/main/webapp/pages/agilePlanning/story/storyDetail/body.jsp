<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<p class="textForBodyErrorMessage" align="left"><html:errors bundle="agilePlanning"/></p>

<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 

<html:form action="/story" focus="shortDescription">
<TR> 
		<TD width="30%">
			&nbsp;<html:hidden property="persistanceId"/>
		</TD>
		<TD>
			&nbsp;<html:hidden property="persistanceVersion"/>
		</TD>
	</TR>
	<TR> 
		<TD  width="30%" class="textForBodyText">
			<bean:message key="pages.agilePlanning.story.shortDescription"/> :
		</TD>
		<TD>
			<html:text property="shortDescription" maxlength="100" size="50" styleClass="field"/>
		</TD>
	</TR>
	<TR> 
		<TD  width="30%" class="textForBodyText" valign="top">
			<bean:message key="pages.agilePlanning.story.description"/> :
		</TD>
		<TD>
			<html:textarea property="description" cols="50" rows="5" styleClass="textarea"/>
		</TD>
	</TR>
	<TR> 
		<TD  width="30%" class="textForBodyText">
			<bean:message key="pages.agilePlanning.story.daysEstimated"/> :
		</TD>
		<TD>
			<html:text property="daysEstimated" maxlength="6" size="6" styleClass="field"/>
		</TD>
	</TR>
	<TR> 
		<TD  width="30%" class="textForBodyText">
			<bean:message key="pages.agilePlanning.story.riskLevel"/> :
		</TD>
		<TD>
			<html:select property="riskLevelId" styleClass="textForBodyText">
	    	    <html:options collection="riskLevels" property="id" labelProperty="description"/>
	       	</html:select>
		</TD>
	</TR>
		<TR> 
		<TD  width="30%" class="textForBodyText">
			<bean:message key="pages.agilePlanning.story.businessValue"/> :
		</TD>
		<TD>
			<html:select property="businessValueId" styleClass="textForBodyText">
	    	    <html:options collection="businessValues" property="id" labelProperty="description"/>
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
            &nbsp;
            
            <logic:notEqual name="storyForm" property="persistanceId" value="0">
            
				<html:submit property="action" styleClass="textForBodyText">
	                <bean:message key="button.delete"/>
	            </html:submit>
	            
	        </logic:notEqual>    
		</TD>
	</TR>
</html:form>
</TABLE>