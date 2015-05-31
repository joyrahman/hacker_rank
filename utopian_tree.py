import sys


def spring(h):
    return 2 * h


def summer(h):
    return h + 1


def main():
    t = int(input())
    array = []
    while t:
        array.append(int(input()))
        t -= 1

    for N in array:
        result = 1
        while N:
            if not N % 2:
                result = spring(result)
            else:
                result = summer(result)

            N -= 1
        print (result)


if __name__ == "__main__":
    main()
