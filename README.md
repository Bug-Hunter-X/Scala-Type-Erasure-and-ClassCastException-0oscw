# Scala Type Erasure and ClassCastException

This example demonstrates a common error in Scala related to type erasure.  At compile time, the code appears valid, but a `ClassCastException` occurs at runtime. This is because Scala's type system erases type parameters during compilation, making it difficult to detect such errors at compile-time.

The solution involves using a safer approach to handle generic types, ensuring type safety without relying on potentially unsafe casts.

## How to Reproduce
1. Compile and run the `bug.scala` file.
2. Observe the runtime `ClassCastException`. 

## Solution
The `bugSolution.scala` file presents a safer alternative that avoids unsafe casts and maintains type safety.