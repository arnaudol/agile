<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<bean:parameter id="storyPersistanceId" name="storyPersistanceId" value="0"/>

<p class="textForLeftTitle"><bean:write name="basicProject.name" scope="session"/> > <bean:write name="story.shortDescription" scope="request"/><logic:present name="task.shortDescription" scope="request"> > <bean:write name="task.shortDescription" scope="request"/></logic:present>
</p>
<p class="textForLeftText"><bean:write name="numberOfCharge" scope="request"/> <bean:message key="pages.agilePlanning.charge.charges"/> (<a href="charge.do?action=detail&storyPersistanceId=<bean:write name="storyPersistanceId"/>&taskPersistanceId=<bean:write name="taskPersistanceId"/>"><bean:message key="pages.common.createnew"/></a>)
</p>

