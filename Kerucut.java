package com;

public class Kerucut {
    double r ;
    double t ;

    public Kerucut(double r , double t ) {
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
    
    
        public void lskerucut() {
            double n = t*t + r*r ;
            double p = 0.5 ;
            double s = Math.pow(n, p);
            
            double ls =  Math.PI * r * s ;
            
            System.out.println("Luas Selimut Kerucut = PI * r * s = " + (int)Math.ceil(ls));
        }
    
        public void lakerucut() {
            double la = Math.PI * r * r ;
            
            System.out.println("Luas Alas Kerucut = PI * r * r = " + (int)Math.ceil(la));
        }
    
        public void lpkerucut() {
            double n = t*t + r*r ;
            double p = 0.5 ;
            double s = Math.pow(n, p);
            double la = Math.PI * r * r ;
            double ls =  Math.PI * r * s ;
    
            double lp = la + ls ;
    
            System.out.println("Luas Permukaan Kerucut = Luas Alas + Luas Selimut = " + (int)Math.ceil(lp) + " cm");
        }
    
        public void vkerucut() {
            double volume = 0.33 * Math.PI * r * r * t;
            
            System.out.println("Volume Kerucut = 1/3 PI * r * r * t = " + (int)Math.ceil(volume));
        }
    
    

    @Override
    public String toString() {
        return "{" +
            " jari      ='" + getR() + "'" +
            ",tinggi    ='" + getT() + "'" +
            "}";
    }
        
}
