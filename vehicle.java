public class vehicle {
    int numWheels;
    double price;
    int diskon;

    public int getNumWheels() {
        return this.numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public vehicle() {
        numWheels= 0;
        double price= 0;
    }

    public vehicle(int numWheels, double price) {
        this.numWheels = numWheels;
        this.price = price;
    }

    public void print(){
        System.out.println("numWheels : "+numWheels);
        System.out.println("price : "+ price);
    }

    
}

