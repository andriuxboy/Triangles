package com.mayab.calidad.tareas;
import static java.lang.Math.*;
import java.util.Objects;
/**
 *
 * @author Andres
 */

public class Triangulo 
{
	private Integer side1;
	private Integer side2;
	private Integer side3;

	public Triangulo(Integer side1, Integer side2, Integer side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public int countSameSize(){
		int cont = 0;
                if(side1+side2<=side3 || side2+side3<=side1 || side1+side3<=side2)
                    throw new IllegalArgumentException("Arguments cannot create a Triangle");                
		if(Objects.equals(this.side1, this.side2))
			cont++;
		if(Objects.equals(this.side2, this.side3))
			cont++;
		if(Objects.equals(this.side1, this.side3))
			cont++;
                return cont;
	}

	public String getSideType(){
		String TriangleTypes[] = {"Scalene","Isosceles","Equilateral"} ;

                int i = countSameSize();
		if(countSameSize()<=2)
			return TriangleTypes[i];
		else
			return TriangleTypes[2];
	}
     
}
