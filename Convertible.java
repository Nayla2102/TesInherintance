public class Convertible extends Car {
    String roofType;

   //Constuctor Parameter

    public String getRoofType() {
        return this.roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public Convertible(){
        super();
        roofType = "";
    }
    
    public Convertible(String roofType){
        this.roofType = roofType;
    }

    public void print(){
        System.out.println("roofType :"+ roofType);
    }
}
