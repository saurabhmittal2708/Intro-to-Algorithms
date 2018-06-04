
def is1dPeak(A, i):
	if(i==len(A)-1):
		return A[i]>=A[i-1]
	if(i==0):
		return A[i]>=A[i+1]
	return (A[i]>=A[i+1])and(A[i]>=A[i-1])

def globalmax(A):
	return A.index(max(A))

def is2dPeak(A, j, i):
	colj=[row[j] for row in A]
	return(is1dPeak(colj,i) and is1dPeak(A[i], j))

def print2d(A):
	for B in A:
		print(B)


def brutesearch1d(A):
	for i in range(len(A)):
		if(is1dPeak(A,i)):
			return A[i]

def binarysearch1d(A):
	mid=len(A)//2
	if(is1dPeak(A,mid)):
		return A[mid]
	elif((A[mid]>=A[mid-1])and (A[mid]<= A[mid+1])):
		return binarysearch1d(A[:mid])
	elif((A[mid]<=A[mid-1])and (A[mid]>= A[mid+1])):
		return binarysearch1d(A[mid:])
	elif((A[mid]<=A[mid-1])and (A[mid]<= A[mid+1])):
		return binarysearch1d(A[mid:])

def binarysearch2d(A):
	midcol=len(A[0])//2
	row=globalmax([row[midcol] for row in A])
	if(is2dPeak(A, midcol, row)):
		return A[row][midcol]
	elif(A[row][midcol] < A[row][midcol+1]):
		return binarysearch2d([row[midcol:] for row in A])
	elif(A[row][midcol] < A[row][midcol-1]):
		return binarysearch2d([row[:midcol] for row in A])
	return None


	



def testcase1d(L=10000000):
	A=[]
	
	for i in range(L):
		A.append(i)
	for i in range(L):
		A.append(L+1-i)
	return A
def testcase2drandom(L=100):
	import random
	rng=random.Random()
	A=[]
	for i in range(L):
		B=[]
		for J in range(L):
			B.append(rng.randrange(10,L+10))
		A.append(B)
	print2d(A)
	return A


def testcase2d():
	A=[[1,2,3,4,5,6],[2,3,4,5,6,5],[7,6,8,1,4,5]]
	return A


def test1d():
	import time
	A=testcase1d()
	t0=time.clock()
	print(brutesearch1d(A))
	t1=time.clock()
	print(t1-t0)
	t0=time.clock()
	print(binarysearch1d(A))
	t1=time.clock()
	print(t1-t0)

def test2d():
	import time
	A=testcase2drandom(30)
	t0=time.clock()
	print(binarysearch2d(A))
	t1=time.clock()
	print(t1-t0)

#test1d()
test2d()
