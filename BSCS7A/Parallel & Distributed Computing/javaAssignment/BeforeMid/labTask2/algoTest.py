import time

A=[[1,2,3,4,5],[6,7,8,9,10],[11,12,13,14,15],[16,17,18,19,20],[21,22,23,24,25]]


def algo1():
    startTime = time.time()
    print("[" , end=" ")
    for i in range(len(A)):
        print("[",end="")
        for j in range(len(A)):
            print(A[i][j]**2 ,end="  ")
        print("]" , end=" ")
    print("]")
    endTime = time.time()
    timeTaken = (endTime - startTime ) * 10**3
    return timeTaken


def algo2():
    start = time.time()
    print("[" , end=" ")
    for i in range(len(A)):
        print("[",end="")
        for j in range(len(A)):
            print(A[j][i]**2 ,end="  ")
        print("]" , end=" ")
    print("]")
    end = time.time()
    e_time = (end - start ) * 10**3
    return e_time

execTime1 = algo2()
execTime = algo1()

print("\n \n ******** RESULT: ********\n \n")
print(f"Execution time taken by Algo 1: {execTime:.03f} ms")
print(f"Execution time taken by Algo 2: {execTime1: .03f} ms")

if(execTime < execTime1):
    print("First algo take less time than Second algo")
elif(execTime1 < execTime):
    print("Second Algo take less time than First algo ")
else:
    print("Both algo take same time ")
