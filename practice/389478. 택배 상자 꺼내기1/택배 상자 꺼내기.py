def solution(n, w, num):
    count={}
    floor=1
    for i in range(1,w+1):
        count[i]=0
    for j in range(1,n+1):
        if floor%2!=0:
            if j%w==0:
                count[6]+=1
                floor+=1
            else:
                count[j%w]+=1
        elif floor%2==0:
            if j%w==0:
                count[1]+=1
                floor+=1
            else:
                count[j-j%w]+=1
    print(count)
            