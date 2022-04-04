from Car import Car
from Account import Account

if __name__ == "__main__":
    print("Hola mundo")

car=Car("AMS235", Account("Andres Herrera","321321ASD"))
print(vars(car))
print(vars(car.drive))