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
grade = 'A';
}
else if (mark>=60 && mark<=74){
grad = 'B';
}
else if (mark>=50 && mark<=59){
grade = 'c';
}
else if (mark>=40 && mark<49){
grade = 'd';
}

else{
grade ='F';
}
 assert (grade == 'A' && mark >= 75) ||
               (grade == 'B' && mark >= 60 && mark < 75) ||
               (grade == 'C' && mark >= 50 && mark < 60) ||
               (grade == 'D' && mark >= 40 && mark < 50) ||
               (grade == 'F' && mark < 40) : "Incorrect Grade Assigned";
System.out.print("The grade for the Enterd mark is :" + grade);

}
}

}



