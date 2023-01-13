public class Triangle extends GeometricObject {
    private double s1 = 1.0;
    private double s2 = 1.0;
    private double s3 = 1.0;

    public Triangle() {
    }

    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

        /** Return sides */
    public double getS1() {
        return s1;
    }

    public double getS2() {
        return s2;
    }

    public double getS3() {
        return s3;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public void setS3(double s3) {
        this.s3 = s3;
    }
    //calculate perimeter

    public double getPerimeter() {
        return s1 + s2 + s3;
    }

    //calculate area
    public double getArea() {
        double x = getPerimeter() / 2;
        return Math.sqrt(x * ((x - s1) * (x - s2) * (x - s3)));
    }

}