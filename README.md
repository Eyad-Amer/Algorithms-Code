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
From [Wikipedia](https://en.wikipedia.org/wiki/Cycle_detection): Tortoise and hare algorithm is a pointer algorithm that uses only two pointers, which move through the linked list at different speeds.
The algorithm thus maintains two pointers into the given linked list, one (the tortoise) at x[i], and the other (the hare) at x[2i].
At each step of the algorithm, it increases i by one, moving the tortoise one step forward and the hare two steps forward in the linked list, and then compares the sequence values at these two pointers.

### Proof of Floyd Cycle Chasing (Tortoise and Hare):
first we will prove that the rabbit and the turtle meet, thus prove that the linked list is circular.
The figure illustrates a list with a cycle. The cycle has a length of n and we are initially m steps away from the cycle. Also let's say that the meeting point is k steps away from the cycle beginning and tortoise and hare meets when tortoise has taken i total steps. (Hare would have taken 2i total steps by then).
<br/>
<br/> The following 2 conditions must hold: 
<br/>  i = m + p * n + k
<br/> 2i = m + q * n + k
<br/><br/>
The first one says that tortoise moves i steps and in these i steps it first gets to the cycle. Then it goes through the cycle p times for some positive number p. Finally it goes over k more nodes until it meets hare.
A similar is true for hare. It moves 2i steps and in these 2i steps it first gets to the cycle. Then it goes through the cycle q times for some positive number q. Finally it goes over k more nodes until it meets tortoise.
As hare travels with double the speed of tortoise, and time is constant for both when they reach the meeting point.
So by using simple speed, time and distance relation,
<br/>
<br/> 2 * ( m + p * n + k ) = m + q * n + k
<br/> => 2m + 2pn + 2k = m + nq + k 
<br/> =>  m + k = ( q - 2p ) * n
<br/><br/>
Among m, n, k, p, q, the first two are properties of the given list. If we can show that there is at least one set of values for k, q, p that makes this equation true we show that the hypothesis is correct.
<br/>
<br/> One such solution set is as follows:
<br/> p = 0
<br/> q = m
<br/> k = m n - m

### Example: To find the meeting point.
![ezgif-1-beef2379ac93](https://user-images.githubusercontent.com/40535130/63119456-e3df8b80-bfa8-11e9-8541-7bd12f1f34de.gif)

### Example: To find the loop starting point.
![ezgif-1-a87a6e6556e6](https://user-images.githubusercontent.com/40535130/63136119-2620c100-bfd9-11e9-9420-2f548bba8947.gif)

### Example: To find the length of the cycle.
![ezgif-1-f44ef6ec015b](https://user-images.githubusercontent.com/40535130/63136640-9b8d9100-bfdb-11e9-8163-8e075c8c7dd3.gif)

### Time Complexity: 
- Average case performance: O(n).

## Alice and Bob algorithm
Description: Alice and Bob are playing a game. They are teammates, so they will win or lose together. Before the game starts, they can talk to each other and agree on a strategy. <br/>
When the game starts, Alice and Bob go into separate soundproof rooms — they cannot communicate with each other in any way. They each flip a coin and note whether it came up Heads or Tails. (No funny business allowed — it has to be an honest coin flip and they have to tell the truth later about how it came out.) Now Alice writes down a guess as to the result of Bob’s coin flip; and Bob likewise writes down a guess as to Alice’s flip. <br/>
If either or both of the written-down guesses turns out to be correct, then Alice and Bob both win as a team. But if both written-down guesses are wrong, then they both lose. <br/>
Can you think of a strategy Alice and Bob can use that is guaranteed to win every time? <br/>




























