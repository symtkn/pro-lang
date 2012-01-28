#Liste sonu yigitin tepesi
class Stack:
    def __init__(self):
        self.eleman = []

    def isEmpty(self):
        return self.eleman == []

    def push(self, eleman):
        return self.eleman.append(eleman)

    def peek(self):
	retrun self.eleman[len(self.eleman) - 1]

    def pop(self):
        return self.eleman.pop()

    def size(self):
        return len(self.eleman)

    def show(self):
        print self.eleman
