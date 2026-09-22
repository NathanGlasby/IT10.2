![CodeRabbit Pull Request Reviews](https://img.shields.io/coderabbit/prs/github/NathanGlasby/IT10.2?utm_source=oss&utm_medium=github&utm_campaign=NathanGlasby%2FIT10.2&labelColor=171717&color=FF570A&link=https%3A%2F%2Fcoderabbit.ai&label=CodeRabbit+Reviews)

# IT10.2

My Grade 10 IT coursework for Term 2, covering loops, strings, and a Swing Snake game. Each project has its own folder.

## Projects

The class exercises are `Loops`, `ForLoopsAgain`, `ForLoopsYetAgain`, `ForTheLoveOfLoops`, `WordControl`, `BespokeRectangle`, `VeryInteresting`, and `VeryInteresting_v2`. `Encyrption` contains a character-shifting exercise; its original folder spelling is kept.

`Practice` contains BlankTemplate and SpareTimeChallenge. `Tests` includes the loop tests, June exam revision, the final practical study project, and Term 2 Exam Corrections. The written practice paper is in `Tests/Practice/28-04-26/PracticeTest_Term2.md`.

`SnakeGame` is a Swing game. There is also a browser exercise in `fibonacci-game.html`.

## Running a project

Open an individual project folder in NetBeans and run its main class. The projects target Java 25 and were checked with JDK 26. With Apache Ant installed, run this from a project folder:

```bash
ant run
```

For a build without running the program, use `ant jar`. SnakeGame has a custom build file and uses `ant compile` instead.

## Work still in progress

Some exercises are unfinished. Encyrption's incomplete decryption fragment is commented out, and SpareTimeChallenge still has unanswered sections. `Tests/ForLoopsSurpriseTest3` has project files but no source in its expected source folder. A similarly named source file is preserved inside ForLoopsSurpriseTest2.

During recovery, 18 projects containing source compiled successfully. The remaining project entry has metadata only. Original versions of repaired files are kept in local recovery backups. Those backups, generated files, and machine-specific IDE settings are excluded from Git.

## License

See [LICENSE](./LICENSE).
