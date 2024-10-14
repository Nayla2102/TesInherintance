public class Car extends vehicle {
    int numDoors;
    boolean isElectric;

    public int getNumDoors() {
        return this.numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isIsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public Car() {
        super();
        numDoors = 0;
        isElectric = true;

    }
    
    public Car (int numDoors, boolean isElectric){
        this.numDoors = numDoors;
        this.isElectric = isElectric;
    }

    public void print(){
        System.out.println("numDoors :"+ numDoors);
        System.out.println("isElectric : "+isElectric);
    }





    
}
