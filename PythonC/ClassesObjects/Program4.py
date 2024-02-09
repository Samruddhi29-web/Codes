class Employee:
    def __init__(self):
        print("In constructor")
        self.x = 10
        self.y = 20
    def disp(self):
        print(self.x)
        print(self.y)
obj = Employee()

obj.disp()
