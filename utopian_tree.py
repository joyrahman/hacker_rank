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

    for item in array:
        result = 1
        # while item:
        #     print("{}:{}>>".format(item, result))
        #     if (item % 2 == 1):
        #         result += result
        #     else:
        #         result += 1
        #
        #     item -= 1
        #     #print("<<{}:{}".format(item, result))
        for i in range(0,item):
            if i%2==0:
                result *= 2
            else:
                result += 1
            #print("{}:{}>>".format(i, result))

        print (result)


if __name__ == "__main__":
    main()
