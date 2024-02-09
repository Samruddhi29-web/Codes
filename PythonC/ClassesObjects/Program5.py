class Demo:
    def __new__(self):
        print("memory allocate")
        return super().__new__(self)

    def __init__(self):
        print("In init")
obj = Demo()

