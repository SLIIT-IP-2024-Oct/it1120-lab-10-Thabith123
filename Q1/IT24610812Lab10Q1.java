import java.util.Scanner;
public class IT24610812Lab10Q1{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.print("Enter the mark(0-100):");
int mark = sc.nextInt();

assert(mark<=100 && mark>=0):"Invalid Mark";

System.out.print("mark is validated");



char grad;
if(mark>=75){
grad = 'A';
}
else if (mark>=60 && mark<=74){
grad = 'B';
}
else if (mark>=50 && mark<=59){
grad = 'c';
}
else if (mark>=40 && mark<49){
grad = 'd';
}

else{
grad ='F';
}

System.out.print("The grade for the Enterd mark is :" + grad);

}

}



