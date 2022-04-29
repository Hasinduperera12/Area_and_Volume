class Area_Volume {
    
    public static void main (String [] args){

        RectCuboid myRectCuboid = new RectCuboid(18, 11, 6);
        SquaresCube mySquaresCube = new SquaresCube(8.5);
        Cylinder myCylinder = new Cylinder(4.2, 5.5);
        Spheres mySpheres = new Spheres(4.5);

        System.out.println("Length of the Rectangle = " + myRectCuboid.length);
        System.out.println("Breadth of the Rectangle = " + myRectCuboid.breadth);
        System.out.println("Height of the Rectangle = " + myRectCuboid.height + "\n");
        System.out.println("Area of the Rectangle = " + myRectCuboid.getAreRect());
        System.out.println("Area of the cuboid = " + myRectCuboid.getAreCuboid());
        System.out.println("Volume of the cuboid = " + myRectCuboid.getVolCuboid() + "\n");

        System.out.println("----------------------------" + "\n");

        System.out.println("Length of the Square = " + mySquaresCube.length + "\n");
        System.out.println("Area of the Square = " + mySquaresCube.getAreSquare());
        System.out.println("Area of the Cube = " + mySquaresCube.getAreCube());
        System.out.println("Volume of the Cube = " + mySquaresCube.getVolCube() + "\n");

        System.out.println("----------------------------" + "\n");

        System.out.println("Radius of the Cylinder = " + myCylinder.radius);
        System.out.println("Height of the Cylinder = " + myCylinder.height + "\n");
        System.out.println("Area of the Cylinder = " + myCylinder.getAreaCylinder());
        System.out.println("Volume of the Cylinder = " + myCylinder.getVolCylinder() + "\n");

        System.out.println("-------------------------------------------" + "\n");

        System.out.println("Radius of the Sphere = " + mySpheres.radius + "\n");
        System.out.println("Area of the Sphere = " + mySpheres.getAreaSphere());
        System.out.println("Volume of the Sphere = " + mySpheres.getVolSphere());
    }
}

class RectCuboid{
    double length;
    double breadth;
    double height;

    RectCuboid(double length,double breadth,double height)
    {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    double getAreRect()
    {
        return length * height;
    }

    double getAreCuboid()
    {
        return (2 * length * breadth) + (2*length*height)+(2*breadth*height);
    }

    double getVolCuboid()
    {
        return length*breadth*height;
    }
}

class SquaresCube{

    double length;

    SquaresCube(double length)
    {
        this.length = length;
    }

    double getAreSquare()
    {
        return length * length;
    }

    double getAreCube()
    {
        return 6 * length * length;
    }

    double getVolCube()
    {
        return length * length * length;
    }
}

class Cylinder{

    double radius;
    double height;

    Cylinder(double radius,double height)
    {
        this.radius = radius;
        this.height = height;
    }

    double getAreaCylinder()
    {
        return (2* Math.PI * radius * radius) + (2 * Math.PI * radius * height);
    }

    double getVolCylinder()
    {
        return Math.PI * radius * radius * height;
    }
}

class Spheres
{
    double radius;
    

    Spheres(double radius)
    {
        this.radius = radius;
    }

    double getAreaSphere()
    {
        return 4 * Math.PI * radius * radius;
    }

    double getVolSphere()
    {
        return (4 * Math.PI * radius * radius * radius);
    }
}