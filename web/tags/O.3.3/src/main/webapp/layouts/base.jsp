<%@ page language="java" %>
<%@ taglib uri="/tags/struts-tiles" prefix="tiles" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<%-- Push tiles attributes in page context --%>
<tiles:importAttribute />

<!DOCTYPE HTML PUBLIC "-//w3c//dtd html 4.0 transitional//en">
<html>
	<head>
		<title><tiles:getAsString name="title"/></title>
		<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
		<link href="<html:rewrite page="/styles/styles.css"/>" rel="stylesheet" type="text/css">
		<link href="<html:rewrite page="/styles/display.css"/>" rel="stylesheet" type="text/css">
	</head>
	
	<body class="body"> 

		<!-- begin header -->
		<div id="Header">
		
			<table cellpadding="0" cellspacing="0" border="0" width="100%">
				<tr>
					<td width="100%" colspan="3"><img src="images/vide.gif" width="1" height="5" border="0" alt=""></td>
				</tr>
				<tr>
					<td width="1%">&nbsp;</td>
					<td width="98%" align="right"><a href="myWorkspace.do"><bean:message key="pages.myWorkspace.myWorkspace"/></a> <!-- | <a href=# class="headerLink">My Preferences</a> | <a href="#" class="headerLink">Global Managament</a> --> | <a href="user.do?action=list"><bean:message key="pages.layout.base.pmAdministration"/></a> | <a href="#"><bean:message key="pages.layout.base.about"/></a> | Logged as Arnaud Prost - <a href="#">logout</a></td>
					<td width="1%" align="right">&nbsp;</td>
				</tr>
				<tr>
					<td width="1%">&nbsp;</td>
					<td width="98%" align="left"><h1>Agile !</h1></td>
					<td width="1%">&nbsp;</td>
				</tr>
				<tr>
					<td width="100%" colspan="3"><img src="images/vide.gif" width="1" height="10" border="0" alt=""></td>
				</tr>
			</table>
			
		</div>
		<!-- end header -->
	
		<!-- begin tabs -->
		
		<logic:present name="tabMenu">
		
			<div id="Tabs">
			
				<table cellpadding="0" cellspacing="0" border="0" bgcolor="#003366" width="100%">
					<tr>
						<td width="1%" class="empty">&nbsp;</td>
							<!-- tiles for tabs-->			
							<tiles:insert attribute="tabMenu"/>
							<!-- tiles -->								
						<td class="empty">&nbsp;</td>
					</tr>
				</table>
				
			</div>
			<!-- end tabs -->	
		
		</logic:present>
				
		<!-- begin body -->
		<div id="Body">
		
			<table cellpadding="0" cellspacing="0" border="0" bgcolor="#E5E5E5" width="100%">
		
				<!-- body with summary -->
				<logic:present name="pageSummary">
					
					<tr>
						<td colspan="5" width="100%" height="10">&nbsp;</td>
					</tr>
					<tr>
						<td width="1%" height="40">&nbsp;</td>
						<td width="1%" bgcolor="#FFFFFF" class="leftAndTop" height="40" >&nbsp;</td>
						<td width="67%" bgcolor="#FFFFFF" class="top" height="40">
						
							 <logic:present name="navigationBar">
						
								 <!-- tiles for navigation bar -->
								 <tiles:insert attribute="navigationBar"/>
							     <!-- tiles -->
						     
						     </logic:present>
						     
						     <logic:notPresent name="navigationBar">
									&nbsp; 
						     </logic:notPresent>
						
						</td>
						<td width="1%" align="right" bgcolor="#FFFFFF" class="rightAndTop" height="40">&nbsp;</td>
						<td width="30%" rowspan="5" align="center" valign="top" bgcolor="#E5E5E5">
						
							 <div id="Summary">
								<table cellpadding="0" cellspacing="0" border="0" align="center" valign="top" width="90%">
									<tr>
										<td>&nbsp;</td>
										<td>
										
											<div id="Summary">
										
											<!-- tiles for page sumary-->			
											<tiles:insert attribute="pageSummary"/>
											<!-- tiles -->			
													
									 		</div>
											
										</td>
										<td>&nbsp;</td>
									</tr>
								</table>
							 </div>
						
						</td>
					</tr>
					<tr>
						<td width="1%" >&nbsp;</td>
						<td width="1%" bgcolor="#FFFFFF" class="left" >&nbsp;</td>
						<td width="66%" align="left" valign="top" bgcolor="#FFFFFF">
						
							 <!-- tiles for body -->			
							 <tiles:insert attribute="body"/>
							 <!-- tiles -->					    
						
						</td>
						<td width="1%" bgcolor="#FFFFFF" class="right">&nbsp;</td>
						<td width="30%" bgcolor="#E5E5E5">&nbsp;</td>
					</tr>
					<tr>
						<td width="1%" height="40">&nbsp;</td>
						<td width="1%" bgcolor="#FFFFFF" class="leftAndBottom" height="40" >&nbsp;</td>
						<td width="67%" bgcolor="#FFFFFF" class="bottom" height="40">&nbsp;</td>
						<td width="1%" align="right" bgcolor="#FFFFFF" class="rightAndBottom" height="40">&nbsp;</td>
						<td width="30%" bgcolor="#E5E5E5">&nbsp;</td>
					</tr>
					<tr>
						<td width="100%" colspan="5">&nbsp;</td>
					</tr>
					
				</logic:present>
				
				<!-- body without summary -->
				<logic:notPresent name="pageSummary">
				
					<tr>
						<td colspan="5" width="100%" height="10">&nbsp;</td>
					</tr>
					<tr>
						<td width="1%" height="40">&nbsp;</td>
						<td width="1%" bgcolor="#FFFFFF" class="leftAndTop" height="40" >&nbsp;</td>
						<td width="96%" bgcolor="#FFFFFF" class="top" height="40">
						
							 <logic:present name="navigationBar">
						
								 <!-- tiles for navigation bar -->
								 <tiles:insert attribute="navigationBar"/>
							     <!-- tiles -->
						     
						     </logic:present>
						     
						     <logic:notPresent name="navigationBar">
									&nbsp;
						     </logic:notPresent>
						
						</td>
						<td width="1%" align="right" bgcolor="#FFFFFF" class="rightAndTop" height="40">&nbsp;</td>
						<td width="1%" height="40">&nbsp;</td>
					</tr>
					<tr>
						<td width="1%" >&nbsp;</td>
						<td width="1%" bgcolor="#FFFFFF" class="left" >&nbsp;</td>
						<td width="96%" align="left" valign="top" bgcolor="#FFFFFF">
						
							 <!-- tiles for body -->			
							 <tiles:insert attribute="body"/>
							 <!-- tiles -->					    	
						
						</td>
						<td width="1%" bgcolor="#FFFFFF" class="right">&nbsp;</td>
						<td width="1%" >&nbsp;</td>
					</tr>
					<tr>
						<td width="1%" height="40">&nbsp;</td>
						<td width="1%" bgcolor="#FFFFFF" class="leftAndBottom" height="40" >&nbsp;</td>
						<td width="96%" bgcolor="#FFFFFF" class="bottom" height="40">&nbsp;</td>
						<td width="1%" align="right" bgcolor="#FFFFFF" class="rightAndBottom" height="40">&nbsp;</td>
						<td width="1%" height="40">&nbsp;</td>
					</tr>
					<tr>
						<td width="100%" colspan="5">&nbsp;</td>
					</tr>	
			
				</logic:notPresent>
				
			</table>
			
		</div>
		<!-- end body -->
			
	</body>
	
</html>