package com.lisz.builder;

public class ComplexTerrainBuilder implements TerrainBuilder {
	private Terrain terrain = new Terrain();
	@Override
	public TerrainBuilder buildWall() {
		terrain.setWall(new Wall(10, 10, 50, 50));
		return this;
	}

	@Override
	public TerrainBuilder buildFort() {
		terrain.setFort(new Fort(10, 10, 50, 50));
		return this;
	}

	@Override
	public TerrainBuilder buildMine() {
		terrain.setMine(new Mine(10, 10, 50, 50));
		return this;
	}

	@Override
	public Terrain build() {
		return terrain;
	}

}
