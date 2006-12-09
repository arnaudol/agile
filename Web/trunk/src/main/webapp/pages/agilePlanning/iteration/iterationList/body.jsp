<%@ taglib uri="/WEB-INF/displaytag-12.tld" prefix="display" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>

<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 
	<TR> 
		<TD><display:table defaultsort="1" pagesize="10" name="iterationList" class="default" style="cellpadding:0;cellspacing=0;border:0;width:100%;align:left" requestURI="iteration.do?action=list" decorator="net.sf.pmr.struts.agilePlanning.iteration.table.Decorator">
			  <display:column width="343" property="startInString" sortable="true" title="Start"/>
			  <display:column width="343" property="endInString" sortable="true" title="End"/>
   			  <display:column width="90" property="percentCompleted" sortable="true" titleKey="pages.agilePlanning.iteration.completed"/>			  
			</display:table>
		</TD>
	</TR>
</TABLE>