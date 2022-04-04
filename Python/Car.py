from Account import Account

class Car:
    id = int
    license = str
    driver = Account("","")
    passegenger = int
    
    def __init__(self, license, drive):
        self.license = license
        self.drive=drive