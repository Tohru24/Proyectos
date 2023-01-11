lst = ['a', 'ab', 'abc', 'bac']
a=list(filter(lambda k: 'ab' in k, lst))
print(a)