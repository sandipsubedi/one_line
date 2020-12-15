# Question 

1688. Count of Matches in Tournament

You are given an integer n, the number of teams in a tournament that has strange rules:

- If the current number of teams is even, each team gets paired with another team. A total of n / 2 matches are played, and n / 2 teams advance to the next round.
- If the current number of teams is odd, one team randomly advances in the tournament, and the rest gets paired. A total of (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams advance to the next round.
Return the number of matches played in the tournament until a winner is decided.


# Solutions

### Idea:

- We need to eliminate n - 1 teams to get one winner.
- And to eliminate n - 1 teams we must have n - 1 match.


## Java

```java
class Solution {
    public int numberOfMatches(int n) {
      return n-1;
    }
}
```

## Ruby

```ruby
# @param {Integer} n
# @return {Integer}
def number_of_matches(n)
    n-1
end
```