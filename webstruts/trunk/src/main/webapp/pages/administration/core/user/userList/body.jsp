<%@ taglib uri="/WEB-INF/displaytag-12.tld" prefix="display" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>

<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 
	<TR> 
		<TD><display:table pagesize="10" name="userList" class="default" style="cellpadding:0;cellspacing=0;border:0;width:100%;align:left" requestURI="user.do?action=list">
			  <display:column property="login" sortable="true" title="Login" href="user.do?action=detail" paramId="persistanceId" paramProperty="persistanceId"/>
			  <display:column property="firstName" sortable="true" title="First name"/>
			  <display:column property="lastName" sortable="true" title="Last name"/>
			  <display:column property="company.name" sortable="true" title="Company"/>
			</display:table>
		</TD>
	</TR>
</TABLE>