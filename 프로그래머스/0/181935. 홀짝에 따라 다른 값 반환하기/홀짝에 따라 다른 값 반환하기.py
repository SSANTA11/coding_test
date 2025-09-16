def solution(n):
    a=0
    if n%2!=0 :
        for i in range(1,n+1,+2):
            a+=i
            print(a)
    else:
        for i in range(2,n+1,+2):
            a+=i**2
    return a

