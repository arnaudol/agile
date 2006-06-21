<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 
	<TR> 
		<TD height="17" class="textForLeftTitle"><bean:message key="pages.core.summary.title"/></TD> 
	</TR> 
	<TR> 
		<TD height="23" class="textForLeftText"><bean:message key="pages.core.userDetail.sumary.memberOf"/> <bean:write name="numberOfProject" scope="request"/> <bean:message key="pages.common.project"/></TD> 
	</TR> 
	<TR> 
		<TD height="23" class="textForLeftText">
		<logic:notEqual name="persistanceId" scope="request" value="0">
			<a href="userProject.do?action=detail&userPersistanceId=<bean:write name="persistanceId" scope="request" />">
		</logic:notEqual>
			<bean:message key="pages.core.userDetail.sumary.add"/>
		<logic:notEqual name="persistanceId" scope="request" value="0">
			</a>
		</logic:notEqual>
		</TD> 
	</TR> 
	<TR> 
		<TD height="23" class="textForLeftText"><bean:message key="pages.core.userDetail.sumary.remove"/></TD> 
	</TR> 
	<TR> 
		<TD> </TD> 
	</TR> 
</TABLE>