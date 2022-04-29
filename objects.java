class objects {
    
    public static void main (String [] args){

        rectangles myrectangles = new rectangles();               
        myrectangles.length = 8.4;                                 //  Substituting length of rectangles
        myrectangles.width = 5.5;                                 //   Substituting  width of rectangles

        squares mysquares = new squares();                        
        mysquares.length = 8;                                     //  Substituting length of squares
        mysquares.width = 4.5;                                    //  Substituting  width of squares

        cubes_cuboids mycubes_cuboids = new cubes_cuboids(); 
        mycubes_cuboids.length = 20;                              // Substituting side length of cubes

        cubes_cuboids mycubes_cuboids2 = new cubes_cuboids();
        mycubes_cuboids2.length = 28;                              // Substituting length of the Cuboids
        mycubes_cuboids2.width = 22;                               // Substituting width of the Cuboids
        mycubes_cuboids2.height = 18;                              // Substituting heigth of the Cuboids

        cylinders mycylinders = new cylinders();
        mycylinders.radius = 2.5;                                   // Substituting radius of the Cylinder
        mycylinders.height = 15;                                    // Substituting height of the Cylinder

        spheres myspheres = new spheres();
        myspheres.radius = 4.5;                                    // Substituting radius of the spheres

        System.out.println("Calculate the Area of Rectangles" + "\n");
        System.out.println("Rectangles Area = " + myrectangles.length * myrectangles.width + "\n");    // Calculate and print Area of Rectangles    


        System.out.println("Calculate the Area of Squares" + "\n");
        System.out.println("Squares Area = " + mysquares.length * mysquares.width + "\n");             // Calculate and print Area of Squares


        System.out.println("Calculate the Volume of Cubes" + "\n");
        System.out.println("Cubes Volume = " + (mycubes_cuboids.length*mycubes_cuboids.length*mycubes_cuboids.length) + "\n");  // Calculate and print Volume of Cubes 

        System.out.println("Calculate the Volume of Cuboids" + "\n");
        System.out.println("Cuboids Volume = " + (mycubes_cuboids2.length*mycubes_cuboids2.width*mycubes_cuboids2.height) + "\n");  // Calculate and print Volume of Cuboids 

        // π = 22/7 = 3.14 as shown
        System.out.println("Calculate the Area and Volume of Cylinders" + "\n");
        System.out.println("Cylinders Area = " + (2 * 3.14 * (mycylinders.radius * mycylinders.radius) + 2 * 3.14 * mycylinders.radius * mycylinders.height));  // Calculate and print Area of Cylinders
        System.out.println("Cylinders Volume = " + 3.14 * (mycylinders.radius * mycylinders.radius) * mycylinders.height + "\n");       // Calculate and print Volume of Cylinders


        System.out.println("Calculate the Area and Volume of Spheres" + "\n");
        System.out.println("Spheres Area = " + (4 * 3.14 * (myspheres.radius * myspheres.radius)));       // Calculate and print Area of Spheres
        System.out.println("Spheres volume = " + (1.33 * 3.14 * (myspheres.radius*myspheres.radius*myspheres.radius) + "\n"));      // Calculate and print Volume of Spheres
        // 4/3 = 1.33 as shown

    }
}
