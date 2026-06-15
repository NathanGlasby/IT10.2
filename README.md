![CodeRabbit Pull Request Reviews](https://img.shields.io/coderabbit/prs/github/NathanGlasby/IT10.2?utm_source=oss&utm_medium=github&utm_campaign=NathanGlasby%2FIT10.2&labelColor=171717&color=FF570A&link=https%3A%2F%2Fcoderabbit.ai&label=CodeRabbit+Reviews)

# IT10.2

Java coursework for Term 2 — a progression from basic loops through string manipulation to a fully functional Swing GUI game.

## Prerequisites

- **JDK 17+** (JDK 25 configured in `.vscode/settings.json`)
- **Apache Ant** (optional — each project includes a `build.xml`)
- NetBeans or IntelliJ IDEA work out of the box; VS Code needs the [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

## Projects

Projects are listed in the order they were introduced. Each one lives in its own directory with its own Ant build file.

| Project | What it covers |
|---|---|
| `Loops/` | Basic `for` loops — counting up, counting down, stepping |
| `ForLoopsAgain/` | More loop patterns and variations |
| `ForLoopsYetAgain/` | Nested loops introduced |
| `ForTheLoveOfLoops/` | Extended loop challenges |
| `WordControl/` | Iterating over a `String` character by character |
| `BespokeRectangle/` | Nested loops + `JOptionPane` to draw a user-defined rectangle |
| `VeryInteresting/` | Compound-interest calculator using loops and `NumberFormat` |
| `VeryInteresting_v2/` | Refactored version of the above |
| `SnakeGame/` | Full Swing GUI game — keyboard input, game loop, collision detection |

### Running any project with Ant

```bash
cd <ProjectFolder>
ant run
```

### Running without Ant

```bash
cd <ProjectFolder>
javac -d build/classes src/*/*.java
java -cp build/classes <packagename>.<ClassName>
```

## Practice & Tests

```
Practice/
  BlankTemplate/          — empty starter for new exercises
  SpareTimeChallenge/     — 5 stretch problems:
                            1. Powers of 2 (doubling streak)
                            2. String staircase builder
                            3. Hollow box pattern
                            4. Vowel census
                            5. Caesar cipher decoder

Tests/
  ForLoopsSurpriseTest/   — graded loop exercises (x4 variants)
  Practice/28-04-26/
    PracticeTest_Term2.md — full 50-mark, 60-min practice exam with answer key
    Code/                 — submission folder
```

## License

MIT © 2026 Nathan Glasby
