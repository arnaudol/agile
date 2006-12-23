<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<tiles:insert page="/layouts/base.jsp" flush="true">
<tiles:put name="title" value="Hello World" />
<tiles:put name="tabMenu" value="/tiles/projectTabMenu.jsp" />
<tiles:put name="pageSummary" value="/tiles/projectSummary.jsp" />
<tiles:put name="body" value="/tiles/blankBody.jsp" />
</tiles:insert>