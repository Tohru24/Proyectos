seq = ['sopa','perros','sal','gato','grande']
a=list(filter(lambda k: 's' in k[0].lower(), seq))
print(a)
