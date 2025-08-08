personas = [
    ('Marco', 21),
    ('Jerome', 22)
]

print (list(map(lambda t: (t[0], t[1]+1), personas)))
