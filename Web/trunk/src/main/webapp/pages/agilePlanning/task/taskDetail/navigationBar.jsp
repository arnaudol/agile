<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<p class="textForBodyTitle" align="left"><a href="story.do?action=list"><bean:message key="pages.common.list"/></a> > <a href="story.do?persistanceId=<bean:write name="taskForm" property="storyPersistanceId"/>&action=detail"><bean:message key="pages.common.detail"/></a> > <a href="task.do?action=list&storyPersistanceId=<bean:write name="taskForm" property="storyPersistanceId"/>"><bean:message key="pages.agilePlanning.task.tasks"/></a> > <bean:message key="pages.common.detail"/>

<logic:notEqual name="taskForm" property="persistanceId" value="0">
 > <a href="charge.do?action=list&storyPersistanceId=<bean:write name="taskForm" property="storyPersistanceId"/>&taskPersistanceId=<bean:write name="taskForm" property="persistanceId"/>"><bean:message key="pages.agilePlanning.charge.charges"/></a>
</logic:notEqual>

</p>
