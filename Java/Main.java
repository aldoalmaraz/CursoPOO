class Main {

    public static void main(String[] args) {
    System.out.println("Hola mundo");
    Car car = new Car ("AAMA234", new Account("Andres Herrera","AND123"));     
    car.passegenger=4;
    car.printDataCar();

    Car car2 = new Car ("AAMA234",new Account ("ANDREA Herrera","ANDa787878"));     
    car2.passegenger=3;
    car2.printDataCar();
    }


}
