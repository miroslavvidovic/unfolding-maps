package basic;

import processing.core.PApplet;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;

/**
 * 
 * A basic interactive map.
 */
public class Basic extends PApplet {

	UnfoldingMap map;

	public void setup() {
		size(800, 600, OPENGL);

		map = new UnfoldingMap(this, new Google.GoogleTerrainProvider());
		map.zoomAndPanTo(14, new Location(41.886, 12.491)); //Rome
			
		MapUtils.createDefaultEventDispatcher(this, map);
	}

	public void draw() {
		background(0);
		map.draw();
	}

}
