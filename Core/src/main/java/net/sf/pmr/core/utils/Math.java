package net.sf.pmr.core.utils;

import java.math.BigDecimal;

public class Math {

	/**
	 * Constructeur privé
	 */
	private Math() {
	}
	
	/** 
	 * Arrondi un double à une précision donnée.
	 * @param doubleToRound double a arrondir.
	 * @param scale précision pour l'arrondi. Par exemple si scale=2 : arrondi à deux chiffres après la virgule.
	 * @return
	 */
	public static double round(final double doubleToRound, final int scale) {
		
        // arrondi à deux décimals
        BigDecimal bigDecimal = new BigDecimal(doubleToRound);
        
        // retourne la valeur arrondie
        return (bigDecimal.setScale(scale, BigDecimal.ROUND_DOWN)).doubleValue();
        
	}
	
	

}
