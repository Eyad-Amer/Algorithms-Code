# Algorithms Code - Java
## All algorithms implemented in Java (for education)
This project has more then 30 algorithms code in java:


## Alice and Bob algorithm
Description: Alice and Bob are playing a game. They are teammates, so they will win or lose together. Before the game starts, they can talk to each other and agree on a strategy. <br/><br/>
When the game starts, Alice and Bob go into separate soundproof rooms — they cannot communicate with each other in any way. They each flip a coin and note whether it came up Heads or Tails. (No funny business allowed — it has to be an honest coin flip and they have to tell the truth later about how it came out.) Now Alice writes down a guess as to the result of Bob’s coin flip; and Bob likewise writes down a guess as to Alice’s flip. <br/><br/>
If either or both of the written-down guesses turns out to be correct, then Alice and Bob both win as a team. But if both written-down guesses are wrong, then they both lose. <br/><br/>
Can you think of a strategy Alice and Bob can use that is guaranteed to win every time? <br/><br/>

### Possible strategies:
1. Alice calls a random number - Probability 50% to win.
2. Alice calls 1 and Bob calls 1 - Probability 75% to win.
3. Everyone says that he (she) received - Probability 50% to win.
4. Alice calls that she got, and Bob calls the opposite of what he received - Probability 100% to win.

### Why it works:
The above truth tables might be a sufficient demonstration, at least for the purposes of a proof, but it still seems like magic. Can we make it intuitively obvious? <br/><br/> 
We could restate the strategy like this: <br/>
- Alice always guesses Bob’s coin is the opposite of hers. <br/>
- Bob always guesses Alice’s coin is the same as his. <br/><br/>
Then it’s clear that one of them has to be right! The only options, for the whole system, are that the coins are different or the same.




























