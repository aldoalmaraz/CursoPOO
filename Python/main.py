from Car import Car
if __name__ == "__main__":
    print("Hola mundo")
    car=Car()
    car.license= "AAMAQ"
    car.driver= "Andres Herrera"
    print(vars(car))

    car2=Car()
    car2.license= "AAMAQ"
    car2.driver= "Andrea Herrera"
    print(vars(car2))