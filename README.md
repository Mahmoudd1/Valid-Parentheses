# Successful-Pairs-of-Spells-and-Potions
## Problem Statement:

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid. An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
## Examples:

Input: s = "()"

Output: true

Input: s = "()[]{}"

Output: true

Input: s = "(]"

Output: false

Input: s = "([)]"

Output: false

Input: s = "{[]}"

Output: true

## Solution:
This problem can be solved using a stack data structure. We can start by iterating through the string from left to right, and for each character in the string, we can perform the following steps:

If the character is an opening bracket ('(', '{', '['), push it onto the stack.

If the character is a closing bracket (')', '}', ']'), pop the top element from the stack and check if it matches the corresponding opening bracket. If the brackets match, continue to the next character. If the brackets do not match, return false.
After iterating through the entire string, if the stack is empty, return true. If the stack is not empty, return false.
