class Logical{

public static void main(String[] args){

double weight = 50;
double height =4.9;

double checkweight = 50;
double checkheight = 5.0;

 // boolean res1 = weight>=checkweight && height>=checkheight; 
 // boolean res2 = weight>=checkweight || height>=checkheight;


boolean ans1  = weight>=checkweight;
boolean ans2 = height>=checkheight;

boolean ans3 = ans1 && ans2;

System.out.println(ans3);


}

}