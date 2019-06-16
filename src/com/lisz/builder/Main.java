package com.lisz.builder;

public class Main {

	public static void main(String[] args) {
		TerrainBuilder terrainBuilder = new ComplexTerrainBuilder();
		Terrain terrain = terrainBuilder.buildWall()
					  					.buildFort()
					  					.buildMine()
					  					.build();
		System.out.println(terrain.getWall() + " - " + terrain.getFort() + " - " + terrain.getMine());
	}

}
