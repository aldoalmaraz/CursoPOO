class Car {
    Integer id;
    String licence;
    Account driver;
    private Integer passegenger;
    
    public Car(String license,Account driver ){
         this.licence=license;
         this.driver=driver;
    }

    void printDataCar(){
System.out.println("License: " + licence + " Driver: " + driver.name+ " Pasajero: "+ passegenger);

    }
    public Integer GetPassegenger(){

     return passegenger;
    }

    public void setPassengenger(Integer passeInteger){
this.passegenger=passeInteger;

    }
}
