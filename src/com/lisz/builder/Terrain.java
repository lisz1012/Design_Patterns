package com.lisz.builder;

public class Terrain {
	private Wall wall;
	private Fort fort;
	private Mine mine;
	
	public Terrain() {}
	
	public Terrain(Wall wall, Fort fort, Mine mine) {
		super();
		this.wall = wall;
		this.fort = fort;
		this.mine = mine;
	}
	public Wall getWall() {
		return wall;
	}
	public void setWall(Wall wall) {
		this.wall = wall;
	}
	public Fort getFort() {
		return fort;
	}
	public void setFort(Fort fort) {
		this.fort = fort;
	}
	public Mine getMine() {
		return mine;
	}
	public void setMine(Mine mine) {
		this.mine = mine;
	}
	
}
