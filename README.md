# Algorithms Code - Java
## All algorithms implemented in Java (for education)
This project has more then 30 algorithms code in java:
## Parking Problem algorithm.
- Description: The researcher must count how many cars are in a circular parking.
- algorithm:
1. first car mark in the 'V' sign.
2. continue with the circular parking until we find the 'V' sign and count the number of cars we passed.
3. if we find the 'V' sign then we will delete it and write 'W' sign in its place.
4. going back to the start point for a steps we counted.
5. if we see 'W' sign - we're done.
6. if we see a 'V' sign, we are progressing to the same number of steps we repeated. and go back to step 2.

### Example:
![ezgif-1-022155fca4c2](https://user-images.githubusercontent.com/40535130/63102084-16768d80-bf83-11e9-9eea-763cebab6df1.gif)
### Result:
![result](https://user-images.githubusercontent.com/40535130/63095001-bb3c9f00-bf72-11e9-8ed4-0d8c4f27bc23.jpg)

### Time Complexity:
- Worst case performance: O(n<sup>2</sup>).
- Best case performance: O(n).
- Average case performance: O(n<sup>2</sup>).

## Tortoise and Hare algorithm(Floyd's cycle-finding algorithm).
From Wikipedia(https://en.wikipedia.org/wiki/Cycle_detection):

