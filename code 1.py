def sort(data):
    n = len(data)

    for i in range(n):
        for j in range(0, n - i - 1):
            if data[j] > data[j + 1]:
                data[j], data[j + 1] = data[j + 1], data[j]

# Usage
data = [4, 2, 7, 1, 9, 3]

sort(data)
