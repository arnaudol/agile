<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 
	<TR> 
		<TD height="23" class="textForLeftText">
			<TABLE>
				<TR>
					<TD class="textForLeftText"><bean:message key="pages.myWorkspace.myWorkspaceSummary.selectAProject"/> :</TD>
					<TD class="textForLeftText">
					
						<html:form action="/myWorkspace.do">					
			        	
							<html:select name="myWorkspaceForm" property="projectId" onchange="window.document.myWorkspaceForm.submit()">
					    	    <html:options collection="projects" property="persistanceId" labelProperty="name" />
			            	</html:select>

						</html:form>
				
				 	 </TD>
					 <TD height="23" class="textForLeftText">&nbsp;<a href="basicProject.do?action=detail"><img src="images/add.png" border="0" align="middle">&nbsp;<bean:message key="pages.myWorkspace.myWorkspaceSummary.createAProject"/></a></TD> 
				</TR> 
			</TABLE>
		</TD> 
	</TR>
</TABLE>

<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 
	<TR> 
		<TD align="left">
		
		<TR>
			<TD height="20">&nbsp;
		 	
			</TD>
		</TR>
		<TR>
			<TD align="left">
			
			<table width="20" border="0" align="left" cellpadding="0" cellspacing="0"> 
		        <tr> 
		          <td width="20">&nbsp;</td>
		        </tr>
		    </table>
		
		<!-- project summary-->
		
 			  <table width="310" border="0" align="left" cellpadding="0" cellspacing="0" class="configFond18"> 
		        <tr> 
		          <td width="5" height="5" rowspan="2" colspan="2" class="grayBackground5"><img height="5" width="5" src="images/coin0_h_g_gray.gif"></td> 
		          <td width="304" height="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="1" height="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="304" height="4" class="grayBackground5"><img height="4" width="1" src="images/vide_002.gif"></td> 
		          <td width="1" height="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr valign="top"> 
		          <td width="1" height="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="5" height="7" class="grayBackground5"><img height="5" width="4" src="images/vide_002.gif"></td> 
		          <td width="304" rowspan="2" class="whiteBackground2">
		        
			        <!-- begin body -->
			      
					<table width="304" height="15" bordercolor="grayBackground5" border="0" cellpadding="0" cellspacing="0" >	
						<tr>
							<td class="grayBackground5">		      
								<p class="configTexteForWorkspaceTitle"><bean:message key="pages.agilePlanning.projectPlanning"/></p>
					    	</td>
					    </tr>
				    </table>
				    				    
				    <p class="textForBodyText">
				    <b><a href="story.do?action=list" class="textForBodyText"><bean:write name="basicProject.numberOfStory" scope="request" /> 
				    	<bean:message key="pages.agilePlanning.stories"/></b></a>
				    	<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<bean:write name="basicProject.numberOfStoryCompleted" scope="request" /> <bean:message key="pages.common.achieved"/> - <bean:write name="basicProject.numberOfStoryInProgress" scope="request" /> <bean:message key="pages.common.inProgress"/> -  <bean:write name="basicProject.numberOfStoryLeft" scope="request" /> <bean:message key="pages.common.left"/> </p>
					<p class="textForBodyText">
				    <b><a href="iteration.do?action=list" class="textForBodyText"><bean:write name="basicProject.numberOfIteration" scope="request"/>
				    	 <bean:message key="pages.agilePlanning.iterations"/></b></a>
				    	 <!-- <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<!--  3 achieved - 6 left --></p>
					<p class="textForBodyText">
				    <b><a href="release.do?action=list" class="textForBodyText">
				    	<bean:write name="basicProject.numberOfRelease" scope="request"/> <bean:message key="pages.agilePlanning.releases"/></b></a>
				    		<!--<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  1 achieved - 2 left --></p>

					
					<!-- end body -->
				    
				  </td> 
		          <td width="1" class="grayBackground5" ><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="1" height="35" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="4" class="whiteBackground2"><img height="1" width="4" src="images/vide_002.gif"></td> 
		          <td width="1" class="grayBackground5" ><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="304" class="grayBackground5" colspan="3"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		      </table>
		      
			<table width="20" border="0" align="left" cellpadding="0" cellspacing="0"> 
		        <tr> 
		          <td width="20">&nbsp;</td>
		        </tr>
		    </table>       
		      
		    <table border="0" width="310">
		    	<tr>
		    		<td>
		      
 			  <table width="310" border="0" align="left" cellpadding="0" cellspacing="0" class="configFond18"> 
		        <tr> 
		          <td width="5" height="5" rowspan="2" colspan="2" class="grayBackground5"><img height="5" width="5" src="images/coin0_h_g_gray.gif"></td> 
		          <td width="304" height="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="1" height="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="304" height="4" class="grayBackground5"><img height="4" width="1" src="images/vide_002.gif"></td> 
		          <td width="1" height="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr valign="top"> 
		          <td width="1" height="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="5" height="5" class="grayBackground5"><img height="5" width="4" src="images/vide_002.gif"></td> 
		          <td width="304" rowspan="2" class="whiteBackground2">
				        
					        <!-- begin body -->
				
						<table width="304" height="15" bordercolor="grayBackground5" border="0" cellpadding="0" cellspacing="0" >	
								<tr><td class="grayBackground5">		      
									<p class="configTexteForWorkspaceTitle"><bean:message key="pages.agilePlanning.currentIterationPlanning"/></p>
							    </td></tr>
				    		</table>

							<logic:notEqual name="iteration.persistanceId" value="0">

						   		<p class="textForBodyText">
					    		<b><a href="iteration.do?action=storiesForIteration&iterationPersistanceId=<bean:write name="iteration.persistanceId" scope="request" />" class="textForBodyText"><bean:write name="iteration.numberOfStory" scope="request" /> 
					    		<bean:message key="pages.agilePlanning.stories"/></b></a>
					    		<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<bean:write name="iteration.numberOfStoryCompleted" scope="request" /> <bean:message key="pages.common.achieved"/> - <bean:write name="iteration.numberOfStoryInProgress" scope="request" /> <bean:message key="pages.common.inProgress"/> -  <bean:write name="iteration.numberOfStoryLeft" scope="request" /> <bean:message key="pages.common.left"/> </p>
					    		
						 		<p class="textForBodyText">
					    		<b><bean:write name="iteration.numberOfTask" scope="request" /> 
					    		<bean:message key="pages.agilePlanning.task.tasks"/></b>
					    		<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<bean:write name="iteration.numberOfTaskCompleted" scope="request" /> <bean:message key="pages.common.achieved"/> - <bean:write name="iteration.numberOfTaskInProgress" scope="request" /> <bean:message key="pages.common.inProgress"/> -  <bean:write name="iteration.numberOfTaskLeft" scope="request" /> <bean:message key="pages.common.left"/> </p>
					    		
				    		</logic:notEqual>
								
								<logic:equal name="iteration.persistanceId" value="0">
									
									<p class="textForBodyText">
									<bean:message key="pages.myWorkspace.myWorkspaceSummary.noCurrentIteration"/>
									</p>
									
									<p>&nbsp;</p>
									
								</logic:equal>
						    
							<!-- end body -->
						    
						  </td> 
					          <td width="1" class="grayBackground5" ><img height="1" width="1" src="images/vide_002.gif"></td> 
					        </tr> 
					        <tr> 
					          <td width="1" height="22" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
					          <td width="4" class="whiteBackground2" ><img height="1" width="4" src="images/vide_002.gif"></td> 
					          <td width="1" class="grayBackground5" ><img height="1" width="1" src="images/vide_002.gif"></td> 
					        </tr> 
					        <tr> 
					          <td width="304" class="grayBackground5" colspan="3"><img height="1" width="1" src="images/vide_002.gif"></td> 
					        </tr>
					        
					         
					      </table>
		      
			      </td>
		      </tr>
		 
		      <tr>
			      <td>

		 			  <table width="310" border="0" align="left" cellpadding="0" cellspacing="0" class="configFond18"> 
				        <tr> 
				          <td width="5" height="5" rowspan="2" colspan="2" class="grayBackground5"><img height="5" width="5" src="images/coin0_h_g_gray.gif"></td> 
				          <td width="304" height="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
				          <td width="1" height="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
				        </tr> 
				        <tr> 
				          <td width="304" height="4" class="grayBackground5"><img height="4" width="1" src="images/vide_002.gif"></td> 
				          <td width="1" height="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
				        </tr> 
				        <tr valign="top"> 
				          <td width="1" height="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
				          <td width="5" height="5" class="grayBackground5"><img height="5" width="4" src="images/vide_002.gif"></td> 
				          <td width="304" rowspan="2" class="whiteBackground2">
				        
					        <!-- begin body -->
				
							
							<table width="304" height="15" bordercolor="grayBackground5" border="0" cellpadding="0" cellspacing="0" >	
								<tr><td class="grayBackground5">		      
									<p class="configTexteForWorkspaceTitle"><bean:message key="pages.agilePlanning.myPlanning"/></p>
							    </td></tr>
				    		</table>
	
							<!-- 

						    <p class="textForBodyText">
							<b><a href="#" class="textForBodyText">5 stories</a></b>&nbsp;and&nbsp;<b><a href="#" class="textForBodyText">18 tasks</a></b></p>

							<!-- end body
						    
						  </td> 
				          <td width="1" class="grayBackground5" ><img height="1" width="1" src="images/vide_002.gif"></td> 
				        </tr> 
				        <tr> 
				          <td width="1" height="50" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
				          <td width="4" class="whiteBackground2" ><img height="1" width="4" src="images/vide_002.gif"></td> 
				          <td width="1" class="grayBackground5" ><img height="1" width="1" src="images/vide_002.gif"></td> 
				        </tr> 
				        <tr> 
				          <td width="304" class="grayBackground5" colspan="3"><img height="1" width="1" src="images/vide_002.gif"></td> 
				        </tr> 
				        
				         -->
				        
				      </table>
			      
				      </td>
			      </tr>
		      
		      </table>
		      
		      
		      <!--  
		      <table width="20" border="0" align="left" cellpadding="0" cellspacing="0"> 
		        <tr> 
		          <td width="20">&nbsp;</td>
		        </tr>
		    </table>       
		      -->
		      
		</TD>
	</TR>
	
	<!-- 
	
	<TR>
		<TD height="20">&nbsp;
		 
		</TD>
	</TR>
	
	 -->
	 
	 <TR>
		<TD align="left">
		
			<table width="20" border="0" align="left"  cellpadding="0" cellspacing="0"> 
		        <tr> 
		          <td width="20">&nbsp;</td>
		        </tr>
		    </table>
	 
	 			<!-- project summary-->
		
 			  <table width="310" border="0" align="left" cellpadding="0" cellspacing="0" class="configFond18"> 
		        <tr> 
		          <td width="5" height="5" rowspan="2" colspan="2" class="grayBackground5"><img height="5" width="5" src="images/coin0_h_g_gray.gif"></td> 
		          <td width="304" height="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="1" height="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="304" height="4" class="grayBackground5"><img height="4" width="1" src="images/vide_002.gif"></td> 
		          <td width="1" height="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr valign="top"> 
		          <td width="1" height="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="5" height="7" class="grayBackground5"><img height="5" width="4" src="images/vide_002.gif"></td> 
		          <td width="304" rowspan="2" class="whiteBackground2">
		        
			        <!-- begin body -->
			      
					<table width="304" height="15" bordercolor="grayBackground5" border="0" cellpadding="0" cellspacing="0" >	
						<tr>
							<td class="grayBackground5">		      
								<p class="configTexteForWorkspaceTitle"><bean:message key="pages.toDo.toDos"/></p>
					    	</td>
					    </tr>
				    </table>
				    				    
				    <p class="textForBodyText">
				    <b><a href="toDo.do?action=list" class="textForBodyText"><bean:write name="toDo.numberOfToDo" scope="request" /> 
				    	<bean:message key="pages.toDo.toDos"/></b></a></p>
					
					<!-- end body -->
				    
				  </td> 
		          <td width="1" class="grayBackground5" ><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="1" height="10" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="4" class="whiteBackground2"><img height="1" width="4" src="images/vide_002.gif"></td> 
		          <td width="1" class="grayBackground5" ><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="304" class="grayBackground5" colspan="3"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		      </table>
				
	 
			<!--  
	
	<TR>
		<TD align="left">
		
			<table width="20" border="0" align="left"  cellpadding="0" cellspacing="0"> 
		        <tr> 
		          <td width="20">&nbsp;</td>
		        </tr>
		    </table>
		
		
		 	  <table width="200" border="0" align="left" cellpadding="0" cellspacing="0"> 
		        <tr> 
		          <td width="5" rowspan="2" colspan="2"><img height="5" width="5" src="images/coin0_h_g.gif"></td> 
		          <td width="194" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="194" class="whiteBackground2"><img height="4" width="1" src="images/vide_002.gif"></td> 
		          <td width="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr valign="top"> 
		          <td width="1" height="50" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="4" class="whiteBackground2" ><img height="1" width="4" src="images/vide_002.gif"></td> 
		          <td width="194" rowspan="2" class="whiteBackground2">
		        
			        <!-- begin body -->
		
					<!-- 
		
					<p class="configTexte16">
				    Document(s)
				    <p class="textForBodyText">
				    - 1 new <br>
				    - 2 updaded <br>
				    - 1 gets customer approval <br>
				    
				     -->
				    
					<!-- end body -->
				  
				  <!-- 
				    
				  </td> 
		          <td width="1" class="grayBackground5" ><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="1" height="50" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="4" class="whiteBackground2" ><img height="1" width="4" src="images/vide_002.gif"></td> 
		          <td width="1" class="grayBackground5" ><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="194" class="grayBackground5" colspan="3"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		      </table>
		      
		      
		      
			<table width="20" border="0" align="left" cellpadding="0" cellspacing="0"> 
		        <tr> 
		          <td width="20">&nbsp;</td>
		        </tr>
		    </table>       
		      
		      <table width="200" border="0" align="left" cellpadding="0" cellspacing="0"> 
		        <tr> 
		          <td width="5" rowspan="2" colspan="2"><img height="5" width="5" src="images/coin0_h_g.gif"></td> 
		          <td width="194" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="194" class="whiteBackground2"><img height="4" width="1" src="images/vide_002.gif"></td> 
		          <td width="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr valign="top"> 
		          <td width="1" height="50" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="4" class="whiteBackground2" ><img height="1" width="4" src="images/vide_002.gif"></td> 
		          <td width="194" rowspan="2" class="whiteBackground2">
		        
			        <!-- begin body -->
		
					<!-- 
		
					<p class="configTexte16">
				    Message(s)
				    <p class="textForBodyText">
				    - 12 new messages <br>
				    - 2 new forum messages <br>

					<!-- end body -->
				    
				    <!-- 
				    
				  </td> 
		          <td width="1" class="grayBackground5" ><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="1" height="50" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="4" class="whiteBackground2" ><img height="1" width="4" src="images/vide_002.gif"></td> 
		          <td width="1" class="grayBackground5" ><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="194" class="grayBackground5" colspan="3"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		      </table>
		      
		      
		      
		      <table width="20" border="0" align="left" cellpadding="0" cellspacing="0"> 
		        <tr> 
		          <td width="20">&nbsp;</td>
		        </tr>
		    </table>       
		      
		      <!--  
		      
		      <table width="200" border="0" align="left" cellpadding="0" cellspacing="0"> 
		        <tr> 
		          <td width="5" rowspan="2" colspan="2"><img height="5" width="5" src="images/coin0_h_g.gif"></td> 
		          <td width="194" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="194" class="whiteBackground2"><img height="4" width="1" src="images/vide_002.gif"></td> 
		          <td width="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr valign="top"> 
		          <td width="1" height="50" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="4" class="whiteBackground2" ><img height="1" width="4" src="images/vide_002.gif"></td> 
		          <td width="194" rowspan="2" class="whiteBackground2">
		        
		        -->
			        <!-- begin body -->
		
				    <!--  Evolutions(s) -->
				    
					<!-- end body -->
				   <!-- 
				    
				  </td> 
		          <td width="1" class="grayBackground5" ><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="1" height="50" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="4" class="whiteBackground2" ><img height="1" width="4" src="images/vide_002.gif"></td> 
		          <td width="1" class="grayBackground5" ><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="194" class="grayBackground5" colspan="3"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		      </table>

		 
		</TD>
	</TR>


	
	<TR>
		<TD height="20">&nbsp;
		 
		</TD>
	</TR>
	
	<TR>
		<TD align="left">
		
			<table width="20" border="0" align="left" cellpadding="0" cellspacing="0"> 
		        <tr> 
		          <td width="20">&nbsp;</td>
		        </tr>
		    </table>
		
		 	<table width="200" border="0" align="left" cellpadding="0" cellspacing="0"> 
		        <tr> 
		          <td width="5" rowspan="2" colspan="2"><img height="5" width="5" src="images/coin0_h_g.gif"></td> 
		          <td width="194" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="194" class="whiteBackground2"><img height="4" width="1" src="images/vide_002.gif"></td> 
		          <td width="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr valign="top"> 
		          <td width="1" height="50" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="4" class="whiteBackground2" ><img height="1" width="4" src="images/vide_002.gif"></td> 
		          <td width="194" rowspan="2" class="whiteBackground2">
		        
			        <!-- begin body -->

				<!-- 
			      
					<p class="configTexte16">
				    Task(s)
				    <p class="textForBodyText">
				    - 3 new task(s) <br>
				    - 1 task behind schedule <br>
				    
					<!-- end body -->
				    
				  <!-- 
				    
				  </td> 
		          <td width="1" class="grayBackground5" ><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="1" height="50" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="4" class="whiteBackground2" ><img height="1" width="4" src="images/vide_002.gif"></td> 
		          <td width="1" class="grayBackground5" ><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="194" class="grayBackground5" colspan="3"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		      </table>
		      
			<table width="20" border="0" align="left" cellpadding="0" cellspacing="0"> 
		        <tr> 
		          <td width="20">&nbsp;</td>
		        </tr>
		    </table>       
		      
		      <table width="200" border="0" align="left" cellpadding="0" cellspacing="0"> 
		        <tr> 
		          <td width="5" rowspan="2" colspan="2"><img height="5" width="5" src="images/coin0_h_g.gif"></td> 
		          <td width="194" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="194" class="whiteBackground2"><img height="4" width="1" src="images/vide_002.gif"></td> 
		          <td width="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr valign="top"> 
		          <td width="1" height="50" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="4" class="whiteBackground2" ><img height="1" width="4" src="images/vide_002.gif"></td> 
		          <td width="194" rowspan="2" class="whiteBackground2">
		        
			        <!-- begin body -->
		
					<!-- 
		
					<p class="configTexte16">
				    Bug(s)
				    <p class="textForBodyText">
				    - 5 new bugs <br>
				    - 1 re-opened <br>
				    - 4 assigned <br>
				   
				    
					<!-- end body -->
				    
				    <!-- 
				    
				  </td> 
		          <td width="1" class="grayBackground5" ><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="1" height="50" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="4" class="whiteBackground2" ><img height="1" width="4" src="images/vide_002.gif"></td> 
		          <td width="1" class="grayBackground5" ><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="194" class="grayBackground5" colspan="3"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		      </table>
		      
		      
		      
		      <table width="20" border="0" align="left" cellpadding="0" cellspacing="0"> 
		        <tr> 
		          <td width="20">&nbsp;</td>
		        </tr>
		    </table>       
		      
		      <table width="200" border="0" align="left" cellpadding="0" cellspacing="0"> 
		        <tr> 
		          <td width="5" rowspan="2" colspan="2"><img height="5" width="5" src="images/coin0_h_g.gif"></td> 
		          <td width="194" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="194" class="whiteBackground2"><img height="4" width="1" src="images/vide_002.gif"></td> 
		          <td width="1" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr valign="top"> 
		          <td width="1" height="50" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="4" class="whiteBackground2" ><img height="1" width="4" src="images/vide_002.gif"></td> 
		          <td width="194" rowspan="2" class="whiteBackground2">
		        
			        <!-- begin body -->
		
					<!-- 
		
					<p class="configTexte16">
				    Evolutions(s)
				    <p class="textForBodyText">
				    - 1 new <br>
				    - 2 gets customer approval <br>
				    
					<!-- end body -->
				    
				     <!-- 
				    
				  </td> 
		          <td width="1" class="grayBackground5" ><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="1" height="50" class="grayBackground5"><img height="1" width="1" src="images/vide_002.gif"></td> 
		          <td width="4" class="whiteBackground2" ><img height="1" width="4" src="images/vide_002.gif"></td> 
		          <td width="1" class="grayBackground5" ><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		        <tr> 
		          <td width="194" class="grayBackground5" colspan="3"><img height="1" width="1" src="images/vide_002.gif"></td> 
		        </tr> 
		      </table>
		 
		 
		</TD>
	</TR>
	
	 -->
	
	<TR>
		<TD height="20">&nbsp;
		 
		</TD>
	</TR>
</TABLE>