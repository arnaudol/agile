<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>

<bean:parameter id="storyPersistanceId" name="storyPersistanceId" value="0"/>

<p class="textForLeftTitle"><bean:write name="basicProject.name" scope="session"/> > <bean:write name="story.shortDescription" scope="request"/>
</p>
<p class="textForLeftText"><bean:write name="numberOfTask" scope="request"/> <bean:message key="pages.agilePlanning.task.tasks"/> (<a href="task.do?action=detail&storyPersistanceId=<bean:write name="storyPersistanceId"/>"><bean:message key="pages.common.createnew"/></a>)
</p>
<p class="textForLeftText"><bean:write name="numberOfTaskCompleted" scope="request"/> <bean:message key="pages.common.achieved"/>
</p>
<p class="textForLeftText"><bean:write name="numberOfTaskInProgress" scope="request"/> <bean:message key="pages.common.inProgress"/>
</p>
<p class="textForLeftText"><bean:write name="numberOfTaskLeft" scope="request"/> <bean:message key="pages.common.left"/>
</p>