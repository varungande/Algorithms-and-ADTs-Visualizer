/********************
 * Class Name: HomePage
 * Author: Varun Gande
 * Description: This is the HomePage Object that the program starts with
 *	     
 ********************/

import java.awt.Color;
import java.awt.Graphics;

public class HomePage extends Page{

	/********************
	 * Function Name: paintScreen
	 * Author: Varun Gande
	 * Description: Paints the background
	 * Input Parameters: Graphics
	 * Return Types: Graphics
	 *	     
	 ********************/
	public static Graphics paintScreen(Graphics g) {
		g.setColor(new Color(131, 148, 188));
		return g;
	}
}
