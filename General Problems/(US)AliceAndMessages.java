/* 

Alice and messages
Alice has K strings, each consisting only of lowercase letters that she wanted
to send to her friend. To avoid anyone else from being able to see them, she
encodes every string using the following rule:
• For every letter x if it is the pt letter of the alphabet starting from the
left, replace it with the f letter starting from the right. For example, the
string "abcd would be gncoded to 'zyxw:
However, due to a bug, a certain number of messages (possibly none) were
not encoded. You are given a list of N distinct strings containing all the
original messages as well as the encoded messages. You do not know how
many messages Alice originally started with.
Task
Determine the minimum possible value of K denoting the the number of
messages Alice initially started with.
Example
Assumptions
N=3
• Strings are ("aaa", "zzz", 'pqrs")

Approach
As "aaa" and "zzz" are encodings of each other, so Alice could have started
with either one of them initially and got the other one as a result of encoding
it, or she could have started with both and neither of them got encoded. For
"pqrs", as its encoded string does not exist in the final array, so it must have
been there initially and did not get encoded. Thus, there are three choices:
• Alice started with 2 strings ["aaa", "pers"/ and "aaa" got encoded to
"zzz" while "pqrs" did not get encoded.
• Alice started with 2 strings [ "zzz", "pqrs"] and "zzz" got encoded to
"aaa" while "pars" did wist get encoded.
• Alice started with 3 strings "aaa". "zzz". "pgrs" and none of the strings
got encoded.
The minimum number of strings Alice could have started with is 2. therefore
the answer is 2.
Function description
Complete the function findMessages provided in the editor. This function
takes the following 2 parameters and returns the required answer:
• N: Represents the total number of strings in the final array
• A: Represents the final array of strings with N elements

Input format
Note: This is the input format that you must use to provide custom input
(available above the Compile and Test button).
• The first line contains an integer N, denoting the number of strings
present in the final array.
• The second line contains N space-separated strings consisting of
lowercase letters only.
Output format
Print a single line containing à single integer representing the minimum
possible number of strings Alice could have had initially.
Constraints
1≤N≤10^5
1≤ |8| < 10


Sample Input 
5
aaa hack zzz abcd szxp

Sample Output 
4
*/
