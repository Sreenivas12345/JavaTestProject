package com.seenu.java;

import java.util.List;

public class Triangle {

	List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw() {
		for (Point point : points) {
			System.out.println("The Point(" + point.getX() + "," + point.getY() + ")");
		}
	}
	/*
	 * private Point pointA; private Point pointB; private Point pointC;
	 * 
	 * public Point getPointA() { return pointA; }
	 * 
	 * public void setPointA(Point pointA) { this.pointA = pointA; }
	 * 
	 * public Point getPointB() { return pointB; }
	 * 
	 * public void setPointB(Point pointB) { this.pointB = pointB; }
	 * 
	 * public Point getPointC() { return pointC; }
	 * 
	 * public void setPointC(Point pointC) { this.pointC = pointC; }
	 * 
	 * public void draw() {
	 * System.out.println("The PointA("+getPointA().getX()+","+getPointA().getY()+
	 * ")");
	 * System.out.println("The PointB("+getPointB().getX()+","+getPointB().getY()+
	 * ")");
	 * System.out.println("The PointA("+getPointC().getX()+","+getPointC().getY()+
	 * ")"); }
	 */
}
