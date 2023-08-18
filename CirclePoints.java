import java.util.Arrays;

public class CirclePoints {
    public static void main(String[] args) {
        int x1 = 3;
        int y1 = 4;
        int r1 = 5;
        int x2 = 14;
        int y2 = 18;
        int r2 = 18;
        int circleInterSectingEachOther = isCircleInterSectingEachOther(x1, y1, r1, x2, y2, r2);
        System.out.println(circleInterSectingEachOther);

    }

    private static void buildEqn(double eqn[],int x,int y,int r){
        double g =-1*x;
        double f =-1*y;
        for(int i=1;i<=5;i++){
            if(i==1 || i==2)
                eqn[i-1] = 1;
            else if(i==3)
                eqn[i-1] = 2*g;
            else if(i==4)
                eqn[i-1] = 2*f;
            else {
                double res = g*g+f*f-r*r;
                eqn[i - 1] = res;
            }
        }
    }

    private static double[] finalEqn(double[] eqn1,double[] eqn2){
        System.out.println(Arrays.toString(eqn1));
        System.out.println(Arrays.toString(eqn2));
        double[] finalEqn = new double[5];
        for(int i=0;i<5;i++){
            finalEqn[i] = eqn1[i] - eqn2[i];
        }
        System.out.println(Arrays.toString(finalEqn));
        return finalEqn;
    }

    public static int isCircleInterSectingEachOther(int x1, int y1, int r1, int x2, int y2, int r2) {

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(distance);
        if (distance == 0 && r1 == r2) {
            System.out.println("Overlapping circles");
            return 1;
        } else if (distance == (r1 + r2) || distance == Math.abs(r1 - r2)) {
            double x3 = x1 - (r1 * (x1 - x2)) / distance;
            double y3 = y1 - (r1 * (y1 - y2)) / distance;
            System.out.println("single intersection point (x,y)" + "(" + x3 + "," + y3 + ")");
            return 1;
        } else if (distance < (r1 + r2) && distance > Math.abs(r1 - r2)) {

            double[] eqn1 = new double[5];
            double[] eqn2 = new double[5];

            buildEqn(eqn1,x1,y1,r1);
            buildEqn(eqn2,x2,y2,r2);
            double[] finalEqn = finalEqn(eqn1,eqn2);


            double a=-1*finalEqn[2],b=-1*finalEqn[3],c=finalEqn[4],m1=eqn1[2],m2=eqn1[3],c1=eqn1[4];

            double[] quadraticY = new double[3];
            quadraticY[0] = a*a + b*b;
            quadraticY[1] = -1*(2*c*b + m1*a*b - m2*a*a);
            quadraticY[2] = m1*a*c + c*c + a*a*c1;

            System.out.println(Arrays.toString(quadraticY));
            b = quadraticY[1];
            a= quadraticY[0];
            c = quadraticY[2];

            double ry1 = (double) (-1*b + Math.sqrt(b*b - 4*a*c))/(2*a);
            double ry2 = (double) (-1*b - Math.sqrt(b*b - 4*a*c))/(2*a);

            double rx1 = -1*(finalEqn[4] + finalEqn[3]*ry1) /finalEqn[2];

            double rx2 = -1*(finalEqn[4] + finalEqn[3]*ry2) /finalEqn[2];

            System.out.println("Point 1 : "+"("+rx1+","+ry1+")");
            System.out.println("Point 2 : "+"("+rx2+","+ry2+")");

            return 1;
        }
        else {
            return 0;
        }
    }
}
