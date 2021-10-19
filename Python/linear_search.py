#Linear Search in Python

def linear_search(n,x):
    arr=[]
    for i in range(1,n):
        arr.append(i)
    count=0
    flag=0
    for i in arr:
        count+=1
        if(i==x):
            print("Found it at: " +str(i))
            flag=1
            break
            
    if(flag==0):
        print("Number not found")
    
    print("Number of iterations= " +str(count))

n=int(input("What is the range of number?"))
x=int(input("What element do you want to search?"))

linear_search(n,x)
