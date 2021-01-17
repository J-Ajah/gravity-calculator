/*
* Justice Uzoma Ajah
* */

public class GravityCalculator {


        public static void main(String[] arguments) {
            double gravity = -9.81; // Earth's gravity in m/s^2
            double initialVelocity = 0.0;
            double fallingTime = 10.0;
            double initialPosition = 0.0;
            double finalPosition = 0;

            // Programs initial output : The object's position after 10.0 secondds is 0.0 m

            finalPosition = (gravity * (Math.pow(fallingTime,2)))/2 + ((initialVelocity * fallingTime) + initialPosition) ;

            System.out.print("The object's position after " + fallingTime +
                            " seconds is ");
            System.out.printf("%.1f m. ", finalPosition );
        }



    }
