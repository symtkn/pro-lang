class Queue:
	def __init__(self):
		self.items = []
	def isEmpty(self):
		return self.items == []
	def enqueue(self, item):
		self.items.insert(0,item)
	def dequeue(self):
		return self.items.pop()
	def size(self):
		return len(self.items)

def hotPotato(namelist, N):
	kuyruk = Queue()
	for isim in isimlist:
		kuyruk.enqueue(name)
	while kuyruk.size() > 1:
		for i in range(N):
			kuruk.enqueue(kuyruk.dequeue())
		kuyruk.dequeue()
	return kuyruk.dequeue()
	# Test
	cocuklar = ['symtkn', 'beyza', 'necmi', 'ayşe', 'akilopanta']
	kazanan = hotPotato(cocuklar, 5)
	print "Kazanan cocuk = ", kazanan

