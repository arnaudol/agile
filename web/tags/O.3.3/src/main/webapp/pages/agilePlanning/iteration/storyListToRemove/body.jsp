<%@ taglib uri="/WEB-INF/displaytag-12.tld" prefix="display" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<p class="textForBodyErrorMessage" align="left"><html:errors bundle="agilePlanning"/></p>

<html:form action="/iteration.do">					

<input type=hidden name="iterationPersistanceId" value="<bean:write name="iterationPersistanceId" scope="request"/>">

<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 
	<TR> 
		<TD>
			  <display:table defaultsort="1" pagesize="10000" name="storyList" class="default" style="cellpadding:0;cellspacing=0;border:0;width:100%;align:left" requestURI="iteration.do?action=storiesToRemove" decorator="net.sf.pmr.struts.agilePlanning.release.story.table.Decorator">
   			  <display:column width="53" property="select" sortable="true" title="&nbsp;"/>
			  <display:column width="302" property="shortDescription" sortable="true" titleKey="pages.agilePlanning.story.shortDescription"/>
  			  <display:column width="95" property="businessValue" sortable="true" titleKey="pages.agilePlanning.story.businessValue"/>
   			  <display:column width="90" property="riskLevel" sortable="true" titleKey="pages.agilePlanning.story.riskLevel"/>
			  <display:column width="90" property="daysEstimated" sortable="true" titleKey="pages.agilePlanning.story.daysEstimated"/>
  			  <display:column width="90" property="percentCompleted" sortable="true" titleKey="pages.agilePlanning.story.completed"/>
			  <display:column width="56" align="center" property="warningImage" sortable="true" titleKey="pages.common.warning"/>
			</display:table>
		</TD>
	</TR>
</TABLE>

<logic:notEmpty name="storyList" scope="request"> 

<TABLE align="right">
	<TR><TD>&nbsp;</TD></TR>
	<TR> 	
	<TD>&nbsp;</TD>
		<TD align="left">
			<html:submit property="action" styleClass="textForBodyText">
                <bean:message key="button.removeStories"/>
            </html:submit>
            &nbsp;
			<html:submit property="action" styleClass="textForBodyText">
                <bean:message key="button.cancelRemoveStories"/>
            </html:submit>
		</TD>
	</TR>
</TABLE>

</logic:notEmpty>

</html:form>