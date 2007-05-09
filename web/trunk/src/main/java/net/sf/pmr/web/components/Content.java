/*
 * Home.java
 *
 * Created on 23 décembre 2006, 19:14
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.sf.pmr.web.components;

import org.apache.tapestry.BaseComponent;
import org.apache.tapestry.components.Block;

// TODO supprimer ce composant qui ne sert plus à rien.... utiliser directement le border à la place
public abstract class Content extends BaseComponent {
         
  public Block getSummaryBlock()
    {
      return (Block) getContainer().getComponent("summary");   
    }
  
  public Block getNavigationBarBlock()
    {
      return (Block) getContainer().getComponent("navigationBar");   
    }

}