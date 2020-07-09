s = 'azcbobobegghakl'
temp = s[0]
longest = ""

for letter in s[1:]:
    if (letter >= temp[-1]):
        temp += letter
    else:
        if len(temp) > len(longest):
            longest = temp
            temp = letter
print(longest)


            
    
