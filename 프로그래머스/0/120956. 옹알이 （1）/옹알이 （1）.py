def solution(babbling):
    answer = 0
    l=["aya", "ye", "woo", "ma"]
    comb=["aya", "ye", "woo", "ma"]
    for i in l:
        for j in l:
            word=""
            word+=i+j
            comb.append(word)
    for i in l:
        for j in l:
            for r in l:
                word=""
                word+=i+j+r
                comb.append(word)
    for i in l:
        for j in l:
            for r in l:
                for t in l:
                    word=""
                    word+=i+j+r+t
                    comb.append(word)
    
    for str in babbling:
        if str in comb:
            answer+=1
        
    return answer