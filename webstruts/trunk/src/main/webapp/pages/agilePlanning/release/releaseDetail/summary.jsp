<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<p class="textForLeftTitle"><bean:write name="basicProject.name" scope="session"/> > <bean:message key="pages.agilePlanning.release"/> <bean:write name="releaseForm" property="number"/>
</p>