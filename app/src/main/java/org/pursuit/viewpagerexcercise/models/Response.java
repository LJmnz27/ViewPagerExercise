package org.pursuit.viewpagerexcercise.models;

import java.util.List;

public class Response{
	private List<PlanetsItem> planets;

	public void setPlanets(List<PlanetsItem> planets){
		this.planets = planets;
	}

	public List<PlanetsItem> getPlanets(){
		return planets;
	}

}