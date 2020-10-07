# Question

836. Rectangle Overlap

# Solutions


## Java
```java
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
      
      // Checking that the second rectangle is not on the top: bottom: left and up. (Clockwise)  
      return !(rec2[1] >= rec1[3] || rec2[0] >= rec1[2]  || rec2[2] <= rec1[0] || rec1[1] >= rec2[3]);
    }
}
```