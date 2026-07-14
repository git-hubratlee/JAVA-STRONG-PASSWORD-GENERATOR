# Java Password Generator

A simple, console-based utility built in Java that generates random, secure passwords based on a length specified by the user.

## How It Works
* **Input Parsing:** Uses java.util.Scanner to accept a custom password length from the user.
* **Character Selection:** Pulls from a defined pool of uppercase letters, lowercase letters, numbers, and special symbols to ensure complexity.
* **Randomized Iteration:** Uses java.util.Random to select unique index positions from the pool and prints out the characters sequentially.

## Tech Stack and Concepts
* **Language:** Java
* **Core APIs:** Scanner (for user input tracking) and Random (for index selection).
* **String Manipulation:** Utilizes charAt() to isolate and print targeted indexes from a comprehensive character array.
