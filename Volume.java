import java.util.Scanner;
public class Volume
{
    public static void main(String[] args) 
    {
      Scanner sc= new Scanner(System.in);
      System.out.println("Select a case");
      System.out.println("1. For calculating the volume of a cube.");
      System.out.println("2. For calculating the volume of a cuboid.");
      System.out.println("3. For calculating the volume of a prism.");
      System.out.println("4. For calculating the volume of a sphere.");
     
      int case1=sc.nextInt();
      switch(case1)
      {
        case 1: System.out.println("This case is for calculating the volume of a cube.");
                System.out.println("Enter a side of the cube: ");
                int side= sc.nextInt();
                System.out.println("The volume of the cube is:"+(side*side*side));
        break;
        
        case 2: System.out.println("This case is for calculating the volume of a cuboid.");
                System.out.println("Enter the length of the cuboid: ");
                int length= sc.nextInt();
                System.out.println("Enter the breadth of the cuboid: ");
                int breadth= sc.nextInt();
                System.out.println("Enter the height of the cuboid: ");
                int height= sc.nextInt();
                System.out.println("The volume of the cuboid is:"+(length*breadth*height));
        break;
       
        case 3: System.out.println("This case is for calculating the volume of a prism.");
                System.out.println("Enter the area of base of the prism: ");
                int Area_base= sc.nextInt();
                System.out.println("Enter the height of the prism: ");
                int height_prism= sc.nextInt();
                System.out.println("The volume of prism is:"+(Area_base*height_prism));
        break;
        case 4: System.out.println("This case is for calculating the volume of a Sphere.");
                System.out.println("Enter the radius of the sphere: ");
                double radius= sc.nextDouble();
                System.out.println("The volume of sphere is:"+(4/3*3.14*radius*radius*radius));
        break;
        default:
        {
            System.out.println("Invalid case");
        }
        
      }
     sc.close();
    }

}