package com;

public class Segitiga {
    double a ;
    double t ;
    double x ;
    double y ;
    double z ;


    public Segitiga(double a , double t ,  double x , double y , double z){
        this.a = a;
        this.t = t;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    
        public Segitiga() {
    }


        public double getA() {
            return this.a;
        }
    
        public void setA(double a) {
            this.a = a;
        }
    
        public double getT() {
            return this.t;
        }
    
        public void setT(double t) {
            this.t = t;
        }
    
        public double getX() {
            return this.x;
        }
    
        public void setX(double x) {
            this.x = x;
        }
    
        public double getY() {
            return this.y;
        }
    
        public void setY(double y) {
            this.y = y;
        }
    
        public double getZ() {
            return this.z;
        }
    
        public void setZ(double z) {
            this.z = z;
        }
    
        public void lsegitiga() {
            double l = 0.5 * this.a * this.t ;
            System.out.println("Luas Segitiga = 1/2 * alas * tinggi = "+ (int)Math.ceil(l));
        }
    
        public void Keliling() {
            double k = this.x + this.y + this.z ;
            System.out.println("Keliling Segitiga = x + y + z =  " + (int)k );
        }
    
        @Override
        public String toString() {
            return "" +
                "Alas   = " + getA() + "'\n" +
                "Tinggi = " + getT() + "'\n" +
                "x      = " + getX() + "'\n" +
                "y      = " + getY() + "'\n" +
                "z      = " + getZ() + "'\n" +
                "}";
        }
}



