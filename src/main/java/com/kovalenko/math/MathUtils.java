//package com.kovalenko.math;
//
//import org.mariuszgromada.math.mxparser.*;
//import org.mariuszgromada.math.mxparser.Expression;
//
//public class MathUtils {
//
//    public static double taylorSqrt(double alala) {
//
//        Argument x = new Argument("x = 4");
//        Expression e = new Expression("der(sum(k,0,10,(((-1)^k)*(2k!))/((1-2k)*((k!)^2)*(4^k))))", x);
//
//        //mXparser.consolePrint(e.calculate());
//
//        double s = 0;
//        double arg = 1.44;
//        for (int i = 1; i < 3; i++) {
//            double var1 = arg-1;
//            double var2 = (double) 3/2 - i;
//            //s += (Math.PI/2)*Math.pow(var1,i)/(st_gamma(var2)*factorial(i));
//            s += Math.pow(arg, i)*((Math.pow(-1, i)*factorial((2*i)))/((1-2*i)*Math.pow(factorial(i), 2)*Math.pow(4, i)));
//        }
//
//        System.out.println(s*10);
//
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        taylorSqrt(2);
//    }
//
//    public static int factorial(int n) {
//        int fact = 1; // this  will be the result
//        for (int i = 1; i <= n; i++) {
//            fact *= i;
//        }
//        return fact;
//    }
//
//    public static double st_gamma(double x){
//        return Math.sqrt(2*Math.PI/x)*Math.pow((x/Math.E), x);
//    }
//
//    public static double la_gamma(double x){
//        double[] p = {0.99999999999980993, 676.5203681218851, -1259.1392167224028,
//                771.32342877765313, -176.61502916214059, 12.507343278686905,
//                -0.13857109526572012, 9.9843695780195716e-6, 1.5056327351493116e-7};
//        int g = 7;
//        if(x < 0.5) return Math.PI / (Math.sin(Math.PI * x)*la_gamma(1-x));
//
//        x -= 1;
//        double a = p[0];
//        double t = x+g+0.5;
//        for(int i = 1; i < p.length; i++){
//            a += p[i]/(x+i);
//        }
//
//        return Math.sqrt(2*Math.PI)*Math.pow(t, x+0.5)*Math.exp(-t)*a;
//    }
//}
