<%@ taglib uri="/WEB-INF/displaytag-12.tld" prefix="display" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>

<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 
	<TR> 
		<TD><display:table defaultsort="1" pagesize="10" name="releaseList" class="default" style="cellpadding:0;cellspacing=0;border:0;width:100%;align:left" requestURI="release.do?action=list" decorator="net.sf.pmr.struts.agilePlanning.release.table.Decorator">
			  <display:column width="300" property="number" sortable="true" title="Number" titleKey="pages.agilePlanning.release.number"/>
			  <display:column width="426" property="dateInString" sortable="true" title="Date" titleKey="pages.common.date"/>
 			  <display:column width="56" align="center" property="warningImage" sortable="true" titleKey="pages.common.warning"/>
			</display:table>
		</TD>
	</TR>
</TABLE>