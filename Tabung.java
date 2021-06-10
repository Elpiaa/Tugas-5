package com;

public class Tabung {
    double r ;
    double t ;

    public Tabung(double r , double t){
        this.r = r ;
        this.t = t ;
    }
    
        public double getR() {
            return this.r;
        }
    
        public void setR(double r) {
            this.r = r;
        }
    
        public double getT() {
            return this.t;
        }
    
        public void setT(double t) {
            this.t = t;
        }
    
    
    public void lptabung () {
        double lp = 2 * Math.PI * r * (r + t);
                
        System.out.println("Luas Permukaan Tabung = 2 * PI * r * ( r + t ) = " + (int)Math.ceil(lp));
    }
    
    public void lstabung() {
        double ls = 2 * Math.PI * r * t ;
            
        System.out.println("Luas Selimut Tabung = 2 * PI * r * t = " + (int)Math.ceil(ls));
    }
    
    public void latabung() {
        double la = Math.PI * r * r;
            
        System.out.println("Luas Alas Tabung = PI * r * r = " + (int)Math.ceil(la));
    }
    
    public void lntabung() {
        double la = Math.PI * r * r;
        double ls = 2 * Math.PI * r * t ;
    
        double ln = la + ls ;
            
        System.out.println("Luas Tanpa Tutup Tabung = Luas Selimut + Luas Alas = " + (int)Math.ceil(ln));
    }
    
    public void vtabung() {
        double volume = Math.PI * r * r * t ;
            
        System.out.println("Volume Tabung = PI * r * r * t = " + (int)Math.ceil(volume) + " cm");
    }
    
    
        @Override
        public String toString() {
            return "{" +
                " jari-jari ='" + getR() + "'" +
                ",tinggi    ='" + getT() + "'" +
                "}";
        }
    
}
