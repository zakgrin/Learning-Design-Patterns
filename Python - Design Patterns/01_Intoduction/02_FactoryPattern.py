# Classes
class Dog:
    """A simple dog class"""
    def __init__(self, name):
        self._name = name
    def speak(self):
        return("Woof!")

class Cat:
    """A simple dog class"""
    def __init__(self, name):
        self._name = name
    def speak(self):
        return("Meow!")

# This is the factory method (factory pattern): 
def get_pet(pet="dog"):
    """
    The factory method
    - we do not see objects
    - create objects from every class but return the needed!
    """
    # 
    pets = dict(dog=Dog("Hope"), cat=Cat("Peace"))
    return pets[pet]

# Program: 
if __name__ == '__main__':
    d = get_pet("dog")
    print(d.speak()) # Woof!
    c = get_pet("cat")
    print(c.speak()) # Meow!