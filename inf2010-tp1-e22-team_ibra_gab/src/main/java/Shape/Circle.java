package Shape;

import Point.Point2d;

public class Circle extends Ellipse {
    /** TODO
     * Create a filled circle that is centered on (0, 0)
     * @param radius Radius of the Circle
     */
    public Circle(Double radius) {
        super(radius,radius);
        for(double j=-radius; j<=radius;j+=0.5){
            for(double i=-radius; i<=radius;i+=0.5){
                if(radius>=Math.sqrt(Math.pow(i,2.0)+Math.pow(j,2.0))){
                    this.add(new Point2d(i,j));
                }
            }
        }
    }
}
