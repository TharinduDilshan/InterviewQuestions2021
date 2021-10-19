print("program to calculate parcentage")
marks=int(input("Enter the full marks :"))
ob1=int(input("Enter the obtained marks in first subject :"))
ob2=int(input("Enter the obtained marks in second subject :"))
ob3=int(input("Enter the obtained marks in third subject :"))
ob4=int(input("Enter the obtained marks in fourth subject :"))
ob5=int(input("Enter the obtained marks in fifth subject :"))
print("Total Full marks is", marks)
total = (ob1+ob2+ob3+ob4+ob5)
print("total marks you obtained:", total)
avg = total/5
print("average of total subjects:", avg)
perc = (total/marks)*100
print("Your overall percentage is :", perc)
