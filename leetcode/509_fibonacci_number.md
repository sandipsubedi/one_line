# Question

509. Fibonacci Number

# Solutions


## Java
```java
// Using the golden ratio formula
class Solution {
    public int fib(int N) {
    return (int)Math.round(Math.pow((1 + Math.sqrt(5)) / 2, N)/ Math.sqrt(5));
    }
}
```