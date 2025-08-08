personas = [
    ('Marco', 11),
    ('Jerome', 22)
]
personas = list(map(lambda t: (t[0], t[1]+1), personas))
personas = list(filter(lambda t: t[1]>18, personas))
print(personas)
