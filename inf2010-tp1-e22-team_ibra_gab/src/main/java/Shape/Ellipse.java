package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        for (double j=-heightDiameter/2; j<=heightDiameter/2;j+=0.5){
            for(double i=-widthDiameter/2; i<=widthDiameter/2;i+=0.5){
                double xEquationEllipse=Math.pow(i,2.0)/(Math.pow(widthDiameter,2)/4);
                double yEquationEllipse=Math.pow(j,2.0)/(Math.pow(heightDiameter,2.0)/4);
                if (xEquationEllipse+yEquationEllipse<=1){
                    this.add(new Point2d(i,j));
                }
            }
        }
    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        for(Point2d point:coords){
            this.add(point);
        }
    }

    /** TODO
     * Translate the Ellipse by the given 2D point
     * @param point The 2D point by which to translate
     * @return The translated Ellipse
     */
    @Override
    public Ellipse translate(Point2d point) {
        super.translate(point);
        return this;
    }

    /** TODO
     * Rotate the Ellipse by the given angle (In Radians)
     * @param angle The angle by which to rotate
     * @return The rotated Ellipse
     */
    @Override
    public Ellipse rotate(Double angle) {
        super.rotate(angle);
        return this;
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        super.clone();
        return this;
    }
}
