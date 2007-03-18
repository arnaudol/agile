<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
	
<p class="textForLeftTitle"><bean:write name="basicProject.name" scope="session"/>
</p>
<p class="textForLeftText"><bean:write name="numberOfStory" scope="request"/> <bean:message key="pages.agilePlanning.stories"/> (<a href="story.do?action=detail"><bean:message key="pages.common.createnew"/></a>)
</p>
<p class="textForLeftText"><bean:write name="numberOfIteration" scope="request"/> <bean:message key="pages.agilePlanning.iterations"/> (<a href="iteration.do?action=detail"><bean:message key="pages.common.createnew"/></a>)
</p>
<p class="textForLeftText"><bean:write name="numberOfRelease" scope="request"/> <bean:message key="pages.agilePlanning.releases"/> (<a href="release.do?action=detail"><bean:message key="pages.common.createnew"/></a>)
</p>
