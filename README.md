# ICMaze — 2D maze adventure game

A 2D top-down adventure game in Java: explore procedurally generated mazes, collect keys and items, avoid traps and enemies, and defeat the final boss.

Built in a team of two for **CS-107 (Introduction to programming), EPFL, fall 2025**, on top of a small game engine provided by the course.

## Features

- **Procedural maze generation** (recursive division) with several area sizes and difficulty levels
- **Enemies with different behaviours**: a path-finding enemy that chases the player through the maze, sleeping log monsters, a boss and its lieutenants firing projectiles
- **Collectables**: keys, pickaxe, hearts, coins, speed power-ups
- **Interactions** handled with the visitor pattern (double dispatch)
- **HUD and pause menu**, dialogs, portals between areas

Controls and game rules: [docs/GAMEPLAY.md](docs/GAMEPLAY.md) · design choices and extensions (in French): [docs/CONCEPTION.md](docs/CONCEPTION.md)

## Project structure

```
icmaze/src/main/java/ch/epfl/cs107/
├── Play.java               entry point
└── icmaze/
    ├── actor/              player, enemies, boss, projectiles, traps
    │   ├── collectable/    keys, items, power-ups
    │   └── ui/             HUD and pause menu
    ├── area/               game areas and maze maps
    ├── handler/            interaction visitor, dialogs
    └── *Generator.java     maze and level generation
icmaze/src/main/resources/  sprites, backgrounds, fonts, dialogs
game-engine/                engine provided by the course
docs/                       gameplay guide and design notes
```

## Run

Requirements: JDK 21 and Maven.

```
make run
```

or open the Maven project in IntelliJ IDEA and run `ch.epfl.cs107.Play`.

## Authors

Danny Levy and [Elie Surman](https://github.com/surmanelie). Game engine, assets and specification by EPFL (CS-107).
