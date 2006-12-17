<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<p class="textForBodyTitle" align="left"><a href="iteration.do?action=list"><bean:message key="pages.common.list"/></a> > <bean:message key="pages.common.detail"/>

<logic:notEqual name="iterationForm" property="persistanceId" value="0">
 > <a href="iteration.do?action=storiesForIteration&iterationPersistanceId=<bean:write name="iterationForm" property="persistanceId"/>"><bean:message key="pages.agilePlanning.stories"/>
</logic:notEqual>

</a></p>
