package algorithms;

import java.util.ArrayList;

public class Task_10_11 {

    private static ArrayList<RandomTriangle> triangles;

    public ArrayList<RandomTriangle> getTriangles() {
        return triangles;
    }

    public Task_10_11() {
        triangles = new ArrayList<>();
        triangles.add(new RandomTriangle(1));
        triangles.add(new RandomTriangle(2));
        triangles.add(new RandomTriangle(3));
    }

    public RandomTriangle getRandomTriangleWithMaxArea() {
        var triangle = triangles.get(0);
        for (var itemTriangle:
             triangles) {
            if(triangle.getArea() < itemTriangle.getArea())
                triangle = itemTriangle;
        }
        return triangle;
    }


    public RandomTriangle getRandomTriangleWithMaxPerimeter() {
        var triangle = triangles.get(0);
        for (var itemTriangle:
                triangles) {
            if(triangle.getPerimeter() < itemTriangle.getPerimeter())
                triangle = itemTriangle;
        }
        return triangle;
    }
}
