def solution(s):
    p_count=0
    y_count=0
    s=s.upper()
    for i in s:
        if 'P'==i:
            p_count+=1
        if 'Y'==i:
            y_count+=1
    if p_count==y_count:
        return True
    if p_count!=y_count:
        return False
