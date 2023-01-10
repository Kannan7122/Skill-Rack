//HEAD COUNT-BIRDS AND ANIMALS

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int l=sc.nextInt();
		int animal=(l/2)-h;
		int res=h-animal;
		System.out.println(res+" "+animal);
	}
}
