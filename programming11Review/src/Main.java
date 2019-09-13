public class Main {
    //solve linear equation of ax + b = c
    public static double linearProblems (double a, double b, double c) {
        if (a = 0){
            return null;
        }
        return (c-b)/a;
   }
    //Requires 4 numbers of quadratic equation form ax2 + bx + c = 0
    /*
    effects returns the solution of quadratic formula
    if 0 answers in the index pos 0 == 0
    if 1 answers the index pos 0 == 1
    if 2 answers the index pos 0 == 2 solutuibs ub ubdex
    */
   public static double [] quadraticProblem(double a, double b, double c, double constant){
        double[] answer = new double [3];
        c = c - constant;
        //check discriminant
       if((b*b - 4*a*c) < 0 ){
           return answer;
       }
       else if ((b*b - 4*a*c) == 0){
           answer[0] = 1;
           answer[1] = (b * - 1 ) + Math.sqrt((b*b - 4*a*c)/2*a);
           return answer;
       }
       else{
           answer [0] = 2;
           answer[1] = (b * - 1 ) + Math.sqrt((b*b - 4*a*c)/2*a);
           answer[2] = (b * - 1 ) - Math.sqrt((b*b - 4*a*c)/2*a);
           return answer;
       }
   }
}
