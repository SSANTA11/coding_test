def solution(a, b, c, d):
    answer = 0
    num=0
    if a==b==c==d:
        answer=a*1111
    elif a==b==c:
        answer=(10*a+d)**2
    elif a==b==d: 
        answer=(10*a+c)**2
    elif a==c==d:
        answer=(10*a+b)**2
    elif b==c==d:
        answer=(10*b+a)**2
    elif a==b and c==d:
        if (a-c)<0:
            num=(a-c)*-1
        else:
            num=a-c
        answer=(a+c)*num
    elif a==c and b==d:
        if (a-b)<0:
            num=(a-b)*-1
        else:
            num=a-b
        answer=(a+b)*num
    elif a==d and b==c:
        if (a-c)<0:
            num=(a-c)*-1
        else:
            num=a-c
        answer=(a+c)*num
    elif a==b:
        answer=c*d
    elif a==c:
        answer=b*d
    elif a==d:
        answer=c*b
    elif b==c:
        answer=a*d
    elif b==d:
        answer=c*a
    elif c==d:
        answer=a*b
    else:
        l=[a,b,c,d]
        answer=min(l)
    
                
    return answer