# 🔁 Palindrome Number Checker (Java Console App)

This is a simple Java program that checks whether a given number is a **Palindrome**.  
A **palindrome number** is one that remains the same when its digits are reversed.  
For example: `121`, `1331`, `7` are palindromes.

---

## 💡 What This Program Does

- Accepts a number input from the user
- Reverses the number using basic arithmetic
- Compares the reversed number with the original
- Prints whether the number is a palindrome or not

---

## 📌 Sample Input and Output

Enter your number 121 This number 121 is a Palindrome

Enter your number 123 This number 123 is not a Palindrome

---

## 🧠 Logic Breakdown

### ➤ Reversing the Number
```java
while(num != 0) {
    int lastDigit = num % 10;
    newNum = newNum * 10 + lastDigit;
    num = num / 10;
}
➤ Checking Palindrome

if(initialNum == newNum)
    → It's a Palindrome
else
    → It's not a Palindrome
🛠 Requirements
Java 8 or higher

A Java IDE like Eclipse, IntelliJ, or simply the command line

🚀 How to Run (In Eclipse)
Create a Java project and add a class named Palindrome inside a package day6

Paste the code into the class file

Save and Run the program

Enter a number when prompted in the console

📂 Project Structure

src/
└── day6/
    └── Palindrome.java
🧩 Possible Enhancements
Check for string-based palindromes (like "madam")

Accept negative numbers or ignore spaces/symbols

Use a method to keep main() clean

👤 Author
This Java program was written as a basic exercise to practice:

Scanner for input

Loops and conditionals

Integer manipulation

Logical thinking and algorithmic flow

Happy coding! 🎉
