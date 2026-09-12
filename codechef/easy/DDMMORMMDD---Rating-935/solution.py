# cook your dish here
# Function to solve each test case
def solve():
    X = int(input())
    S = input()
    
    carlsen_points = 0
    chef_points = 0
    
    # Calculate points for each game
    for char in S:
        if char == 'C':
            carlsen_points += 2
        elif char == 'N':
            chef_points += 2
        else:  # 'D' for draw
            carlsen_points += 1
            chef_points += 1
            
    # Determine prize money based on points
    if carlsen_points > chef_points:
        print(60 * X)
    elif carlsen_points == chef_points:
        print(55 * X)
    else:
        print(40 * X)

# Main function to handle multiple test cases
def main():
    t = int(input())
    for _ in range(t):
        solve()

if __name__ == '__main__':
    main()