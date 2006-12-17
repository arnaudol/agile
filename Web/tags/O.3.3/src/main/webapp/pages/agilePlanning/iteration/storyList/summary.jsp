<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>

<bean:parameter id="storyPersistanceId" name="storyPersistanceId" value="0"/>

<p class="textForLeftTitle"><bean:write name="basicProject.name" scope="session"/> > <bean:message key="pages.agilePlanning.iteration"/>
</p>
<p class="textForLeftText"><bean:write name="numberOfStory" scope="request"/> <bean:message key="pages.agilePlanning.stories"/> (<a href="iteration.do?action=storiesToAdd&iterationPersistanceId=<bean:write name="iterationPersistanceId"/>"><bean:message key="pages.common.add"/></a> / <a href="iteration.do?action=storiesToRemove&iterationPersistanceId=<bean:write name="iterationPersistanceId"/>"><bean:message key="pages.common.remove"/></a>)
</p>
<p class="textForLeftText"><bean:write name="numberOfStoryCompleted" scope="request"/> <bean:message key="pages.common.achieved"/>
</p>
<p class="textForLeftText"><bean:write name="numberOfStoryInProgress" scope="request"/> <bean:message key="pages.common.inProgress"/>
</p>
<p class="textForLeftText"><bean:write name="numberOfStoryLeft" scope="request"/> <bean:message key="pages.common.left"/>
</p>