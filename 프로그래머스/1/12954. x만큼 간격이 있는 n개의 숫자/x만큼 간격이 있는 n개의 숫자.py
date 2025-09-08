def solution(x, n):
    num=x
    answer = []
    while len(answer)!=n:
        answer.append(num)
        num+=x
    return answer