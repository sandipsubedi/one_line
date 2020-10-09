# Question

1051. Height Checker

# Solutions


## Python
```python
def heightChecker(self, heights: List[int]) -> int:
	return sum([(1 if heights[i]!=x else 0) for (i,x) in enumerate(sorted(heights))])
``` 
