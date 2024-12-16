def sort(data: List) -> List:
 
    if not isinstance(data, list):
        raise TypeError("Input must be a list.")
    
    n = len(data)

    for i in range(n):
        for j in range(0, n - i - 1):
            # Handle non-comparable elements
            if not hasattr(data[j], '__lt__') or not hasattr(data[j + 1], '__lt__'):
                raise TypeError("List contains non-comparable elements.")
            if data[j] > data[j + 1]:
                data[j], data[j + 1] = data[j + 1], data[j]

    return data

data = [4, 2, 7, 1, 9, 3]
sorted_data = sort(data)
print(sorted_data)  # Output: [1, 2, 3, 4, 7, 9]
