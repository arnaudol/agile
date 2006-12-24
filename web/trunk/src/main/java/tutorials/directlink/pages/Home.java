/*
 * Home.java
 *
 * Created on 23 décembre 2006, 19:14
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package tutorials.directlink.pages;

import org.apache.tapestry.annotations.Persist;
import org.apache.tapestry.html.BasePage;

public abstract class Home extends BasePage
{
    @Persist
    public abstract int getCounter();
    public abstract void setCounter(int counter);
    
    public void doClick()
    {
        int counter = getCounter();
        
        counter++;
        
        setCounter(counter);
    }
    
    public void doClear()
    {
     
        setCounter(0);
    }
    
        public void doClick(int increment)
    {
        int counter = getCounter();
        
        counter += increment;
        
        setCounter(counter);
    }  
}