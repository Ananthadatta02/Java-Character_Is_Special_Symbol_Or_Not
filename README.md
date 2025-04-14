
# Special Character Identifier in Java

This Java program determines whether the entered character is a **special character** or not.

## 📌 Description

The program prompts the user to input a single character. It then checks whether the character is a **special symbol** — meaning it is **not** an uppercase or lowercase alphabet or a digit. If it is indeed a special character, the program prints the character along with its **ASCII value**. Otherwise, it notifies the user that the character is not a special character.

---

## 💻 Code Explanation

```java

import java.util.Scanner;

public class Char_Is_SpecialSymbolOrNot 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Special Character");
		char ch = s.next().charAt(0);
		if(!(ch>='A' && ch<='Z' || ch>='a' && ch<='z') || ch>='0' && ch<='9')
		{
			System.out.println("Character " + ch + " is Special Character & Ascii is -->" + (int)ch);
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

## ✅ Sample Output

```
Enter the Special Character
@
Character @ is Special Character & Ascii is -->64

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
