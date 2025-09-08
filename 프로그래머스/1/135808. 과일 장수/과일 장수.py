def solution(k, m, score):
    answer = 0
    check=0
    score.sort()
    for i in range(len(score),m-1,-m):
        if k!=min(score[i-m:i]):
            k=min(score[i-m:i])
            answer+=k*m
        else:
            answer+=k*m
    return answer