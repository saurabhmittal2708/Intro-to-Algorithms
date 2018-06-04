def combine(a,am,b,bm):
	mutual=a[-1]+b[0]
	return max(am,bm,mutual)




def maxsubarray(a):
	if(len(a)==2):
		return a[0]+a[1]
	if(len(a)==1):
		return a[0]
	else:
		l=len(a)//2
		return combine(a[:l], maxsubarray(a[:l]), a[l:], maxsubarray(a[l:]))


def test(l=100000):
	a=[]
	for i in range(l):
		a.append(i)
	for i in range(i):
		a.append(l-i)
	return a

print(maxsubarray(test()))