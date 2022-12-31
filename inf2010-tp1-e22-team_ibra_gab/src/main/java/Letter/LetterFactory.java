package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter T graphically
     * @return BaseShape containing the letter T
     */
    public static BaseShape create_T() {
        double stripAdjustment = 1.4, adjustmentWidth = 2.5, adjustmentHeight = 1.47;
        Rectangle letterT = new Rectangle(stripeThickness/stripAdjustment, maxHeight);
        letterT.translate(new Point2d(0.0 ,-maxHeight));
        letterT.add(new Rectangle(halfMaxWidth*adjustmentWidth,stripeThickness/stripAdjustment)
                .translate(new Point2d(0.0, -maxHeight*adjustmentHeight)));
        return letterT;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        double adjustment = 30.0, adjustmentHeight = 10.0, adjustmentAngle = 3/4;
        double angle = 2, adjustmentY = 20.0, specialWidthModification = 5.0;
        Rectangle letterE = new Rectangle(stripeThickness, maxHeight).translate(new Point2d(-adjustment, -stripeThickness));
        letterE.add(new Rectangle(stripeThickness, halfMaxHeight-adjustmentHeight)
                .rotate(Math.PI/2).translate(new Point2d(maxWidth*adjustmentAngle+specialWidthModification, -adjustmentY)));
        adjustmentY = 103.0;
        letterE.add(new Rectangle(stripeThickness, halfMaxHeight).rotate(Math.PI/angle)
                .translate(new Point2d(maxWidth*adjustmentAngle, maxHeight-adjustmentY)));
        adjustmentY = 66.0;
        letterE.add(new Rectangle(stripeThickness, halfMaxHeight).rotate(Math.PI/angle)
                .translate(new Point2d(maxWidth*adjustmentAngle, -maxHeight+adjustmentY)));
        return letterE;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        double adjustmentX = 0.75;
        Ellipse letterO = new Ellipse(maxWidth, maxHeight);
        letterO.remove(new Ellipse(maxWidth*adjustmentX, maxHeight*adjustmentX));
        return letterO;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        double adjustmentX = 1.5, adjustmentY = 1.25;
        Ellipse letterC = new Ellipse(maxWidth,maxHeight);
        Ellipse smallerEllipseHole = new Ellipse(maxWidth/adjustmentX, maxHeight/adjustmentY);
        Rectangle rectangleHole = new Rectangle(halfMaxWidth*adjustmentX,halfMaxHeight);
        rectangleHole.translate(new Point2d(halfMaxWidth,0.0));
        letterC.remove(smallerEllipseHole).remove(rectangleHole);
        return letterC;
    }

    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A() {
        double adjustmentX = 43.0, angle = 2.0;
        Rectangle letterA = new Rectangle(halfStripeThickness, halfMaxHeight-stripeThickness)
                .rotate(Math.PI/angle).translate(new Point2d(-maxWidth+adjustmentX, 0.0));
        letterA.add(create_V().rotate(Math.PI).translate(new Point2d(halfStripeThickness, 0.0)));
        return letterA;
    }

    /** TODO
     * Create the letter V graphically
     * @return BaseShape containing the letter V
     */
    public static BaseShape create_V() {
        double adjustmentX = 100.0, angle = 9.0;
        Rectangle letterV = new Rectangle(halfStripeThickness, maxHeight).rotate(-Math.PI/angle);
        letterV.add(new Rectangle(halfStripeThickness, maxHeight).rotate(Math.PI/angle)
                .translate(new Point2d(maxHeight-adjustmentX, 0.0)));
        return letterV;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        double adjustment = 2.5, adjustmentX = 1.80, angle = 7.1;
        Rectangle letterN = new Rectangle(halfStripeThickness, maxHeight);
        letterN.add(new Rectangle(halfStripeThickness, maxHeight).translate(new Point2d(halfMaxWidth*adjustment,0.0)));
        adjustment = 10;
        letterN.add(new Rectangle(halfStripeThickness, maxHeight+adjustment)
                .rotate(-Math.PI/angle).translate(new Point2d(stripeThickness*adjustmentX, 1.0)));
        return letterN;
    }

    /** TODO
     * Create the letter M graphically
     * @return BaseShape containing the letter M
     */
    public static BaseShape create_M() {
        double adjustmentFirst = 1.5, adjustmentFactor = 2.7;
        Rectangle letterM = new Rectangle(halfStripeThickness, maxHeight).translate(new Point2d(0.0,-halfMaxHeight*adjustmentFirst));
        letterM.add(new Rectangle(halfStripeThickness, maxHeight).translate(new Point2d(halfMaxWidth*adjustmentFactor, -halfMaxHeight*adjustmentFirst)));
        adjustmentFactor = 6.5;
        letterM.add(new Rectangle(halfStripeThickness, halfMaxHeight)
                .rotate(-Math.PI/adjustmentFactor).translate(new Point2d(halfMaxWidth/adjustmentFirst, -maxHeight)));
        letterM.add(new Rectangle(halfStripeThickness, halfMaxHeight)
                .rotate(Math.PI/adjustmentFactor).translate(new Point2d(maxWidth, -maxHeight)));
        return letterM;
    }

}
