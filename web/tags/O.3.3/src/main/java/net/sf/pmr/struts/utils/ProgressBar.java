/*
* Copyright 2005 Arnaud Prost
* 
* Arnaud.prost@gmail.com
* 
* This software is a computer program whose purpose is to ease the 
* management of software project.
* 
* This software is governed by the CeCILL  license under French law and
* abiding by the rules of distribution of free software.  You can  use, 
* modify and/ or redistribute the software under the terms of the CeCILL
* license as circulated by CEA, CNRS and INRIA at the following URL
* "http://www.cecill.info". 
* 
* As a counterpart to the access to the source code and  rights to copy,
* modify and redistribute granted by the license, users are provided only
* with a limited warranty  and the software's author,  the holder of the
* economic rights,  and the successive licensors  have only  limited
* liability. 
* 
* In this respect, the user's attention is drawn to the risks associated
* with loading,  using,  modifying and/or developing or reproducing the
* software by the user in light of its specific status of free software,
* that may mean  that it is complicated to manipulate,  and  that  also
* therefore means  that it is reserved for developers  and  experienced
* professionals having in-depth computer knowledge. Users are therefore
* encouraged to load and test the software's suitability as regards their
* requirements in conditions enabling the security of their systems and/or 
* data to be ensured and,  more generally, to use and operate it in the 
* same conditions as regards security. 
* 
* The fact that you are presently reading this means that you have had
* knowledge of the CeCILL license and that you accept its terms.
*/


package net.sf.pmr.struts.utils;

public class ProgressBar {
	
	private ProgressBar() {
	}

	public static String buildProgressBar(final double percent) {
		
		String progressBar = "";
		
		progressBar = progressBar + "<table cellpadding='0' cellspacing='0' width='100%' height='10' border='0'>";
		progressBar = progressBar +   "<tr class='odd'>";
		progressBar = progressBar +   "<td colspan='2'>"+ percent +"%</td>";
		progressBar = progressBar +   "</tr>";
		progressBar = progressBar +   "<tr>";
		
		if (percent != 0.0) {
			progressBar = progressBar +   "<td width='"+  percent + "%' height='6' bgcolor='green'><img height='6' width='5' src='images/vide_002.gif'></img></td>";
		} else {
			progressBar = progressBar +   "<td width='"+  percent + "%' height='6' bgcolor='green'><img height='6' width='0' src='images/vide_002.gif'></img</td>";
		}
		
		if ((100 - percent) != 0.0) {
			progressBar = progressBar +   "<td width='"+ (100 - percent) +"%' height='6' bgcolor='red'><img height='6' width='5' src='images/vide_002.gif'></img></td>";	
		} else {
			progressBar = progressBar +   "<td width='"+ (100 - percent) +"%' height='6' bgcolor='red'><img height='6' width='0' src='images/vide_002.gif'></img></td>";
		}
		
		progressBar = progressBar +   "</tr>";
		progressBar = progressBar +   "</table>";
		
		return progressBar;
	}

}
