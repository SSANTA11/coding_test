def solution(n):
    answer=[]
    value=""
    for i in str(n):
        answer.append(i)
    answer.sort()
    answer.reverse()
    # for i in answer:
    #     value+=i
    # return int(value)
    return int("".join(answer))
       