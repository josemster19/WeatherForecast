package controller;

import java.util.List;

import model.DayForecast;
import model.Temperature;


//TODO

public class ForecastController {
	
	//TODO	
	
	private int displayScale = Temperature.CELSIUS_SCALE;
	
	/**
	 * @return Returns a List with the forecast for all week.
	 */
	public List<DayForecast> getWeekForecast(){
		//TODO
		//TODO remove the return 
		return null;
	}
		
	public int getDisplayScale() {
		//TODO
		//TODO remove the return 0
		return 0;
	}
	
	/**
	 * Return true if the current displayScale is Celcius 
	 * (Temperature.CELSIUS_SCALE)
	 * @return
	 */
	public boolean isCelsius() {
		//TODO
		//TODO remove the return false
		return false;
	}
	
	/**
	 * If the displayScale is Celcius switch displayScale to 
	 * Fahrenheit and the other way round.
	 * @return 
	 */
	public String switchScale() {
		
		//TODO
		//TODO remove the return null
		return null;
	}	
}
