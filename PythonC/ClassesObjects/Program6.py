class Employee:
    def __init__(self,empId,empName):
        print("In constructor")
        self.empId = empId
        self.empName = empName
    def empInfo(self):
        print(self.empId)
        print(self.empName)
emp1 = Employee(12,"Kanha")
emp2 = Employee(16,"Badhe")

emp1.empInfo()
emp2.empInfo()


