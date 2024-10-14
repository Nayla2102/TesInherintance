public class Bicycle extends vehicle {
    String bikeType;

    public String getBikeType() {
        return this.bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public Bicycle (){
        super();
        bikeType = "";


    }

    public Bicycle (String bikeType){
        this.bikeType = bikeType;
    }

    public void print(){
        System.out.println("bikeType :"+ bikeType);
    }
}

