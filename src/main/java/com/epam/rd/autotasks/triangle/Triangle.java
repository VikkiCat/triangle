package com.epam.rd.autotasks.triangle;

class Triangle {
    Point A;
    Point B;
    Point C;

    public Triangle(Point a, Point b, Point c) {

        if (a==null||b==null||c==null||a.equals(b)||a.equals(c)||b.equals(c)) {
            throw new IllegalArgumentException();
        }
        if (((c.getY()-a.getY())*(b.getX()- a.getX())- (c.getX()- a.getX())*(b.getY()-a.getY()))/2 == 0){
            throw new IllegalArgumentException();
        }
        else {
            this.A = a;
            this.B = b;
            this.C = c;
        }

    }

    public double area() {
        double area = ((C.getY()-A.getY())*(B.getX()- A.getX())- (C.getX()- A.getX())*(B.getY()-A.getY()))/2;
        return Math.abs(area);
    }

    public Point centroid(){
        double x1 = A.getX(), x2 = B.getX(), x3 = C.getX(),
                y1 = A.getY(), y2 = B.getY(), y3 = C.getY();
        double x = (x1+x2+x3)/3;
        double y = (y1+y2+y3)/3;
        return new Point(x,y);
    }

}
