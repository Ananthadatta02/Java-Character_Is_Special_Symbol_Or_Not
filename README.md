
# Special Character Identifier in Java

This Java program determines whether the entered character is a **special character** or not.

## 📌 Description

The program prompts the user to input a single character. It then checks whether the character is a **special symbol** — meaning it is **not** an uppercase or lowercase alphabet or a digit. If it is indeed a special character, the program prints the character along with its **ASCII value**. Otherwise, it notifies the user that the character is not a special character.

---

## 💻 Code Explanation

```java
package test_27_03_25;

import java.util.Scanner;

public class Char_Is_SpecialSymbolOrNot 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Special Character");
        
        // Takes the first character of the user input
        char ch = s.next().charAt(0);

        // Checks if the character is NOT (A-Z or a-z or 0-9)
        if(!(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') || ch >= '0' && ch <= '9')
        {   
            System.out.print(ch);
            System.out.println(" ASCII is --> " + (int)ch);
        }
        else
            System.out.println("Not a Special Character");
    }
}
```

### 🔍 Logical Breakdown

1. `Scanner` class is used to read user input.
2. `s.next().charAt(0)` captures the **first character** entered by the user.
3. The `if` condition:
   - `!(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')` → ensures the character is **not** an alphabet.
   - `|| ch >= '0' && ch <= '9'` → allows digits **incorrectly** (This is actually a **logical error**; should be `&&` not `||`).
4. If the condition is true, the program prints the ASCII value of the character.
5. If not, it prints "Not a Special Character".

### ⚠️ Note:

The current condition contains a **logical error**. The corrected version should be:

```java
if(!( (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') ))
```

This ensures only non-alphanumeric characters (true special symbols) are detected.

---

## ✅ Sample Output

```
Enter the Special Character
@
@ ASCII is --> 64
```

```
Enter the Special Character
A
Not a Special Character
```

---

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Character_Is_Special_Symbol_Or_Not.git
```
