class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)==len(t):
            set1=set(s)
            set2=set(t)
            list1=list(sorted(set1))
            list2=list(sorted(set2))
            if len(list1)==len(list2):
                ctr=0
                for i in range(len(list1)):
                    if s.count(list1[i])==t.count(list2[i]) and list1[i]==list2[i]:
                        ctr=ctr+1
                if ctr==len(list1):
                    return True
        return False



