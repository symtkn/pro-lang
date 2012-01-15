# -*- coding: cp1254 -*-
def sesli_anagram(s1,s2):
    n1,n2 = 0,0
    sesli = "aeiuoAEIOU"
    for i in s1:
        if i in sesli:
            n1 += 1
        else : pass
    for k in s2:
        if k in sesli:
            n2 += 1
        else : pass
    if n1 ==n2 :return "Dizgiler eşit sayıda sesli harfe sahiptirler."
    else : pass
    
