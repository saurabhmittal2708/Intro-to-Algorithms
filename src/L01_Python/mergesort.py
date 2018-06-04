def merge(a, b):
	i,j=0,0
	c=[]
	while i< len(a) and j< len(b):
		if(a[i] < b[j]):
			c.append(a[i])
			i+=1
		else:
			c.append(b[j])
			j+=1
	if(i==len(a)):
		c.extend(b[j:])
	if(j==len(b)):
		c.extend(a[i:])
	return c

def mergesort(a):
	if len(a)==1:
		return a
	else:
		return merge(mergesort(a[:len(a)//2]), mergesort(a[len(a)//2:]))

print(mergesort([9,8,7,6,5,4,3,2,1]))
#print(merge([1,2,3], [4,5,6,]))
