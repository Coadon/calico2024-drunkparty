
def solve(N: int, M: int, G: list[list[int]], peak: int) -> int:
    """
    Return the maximum number of islands.

    N: number of rows
    M: number of columns
    G: grid of heights
    """
    # YOUR CODE HERE
    max = 0
    h = 0
    while True:
        h += 1
        

    return 0

def main():
    T = int(input())
    for _ in range(T):
        peak = 0
        N, M = map(int, input().split())
        G = [list(map(int, input().split())) for _ in range(N)]
        print(solve(N, M, G))

if __name__ == '__main__':
    main()
