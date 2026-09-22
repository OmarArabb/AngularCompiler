# Angular Compiler — TypeScript/Angular & HTML Parser

A compiler front-end, built with **ANTLR4** in Java, that parses Angular component source files (TypeScript-like syntax with Angular decorators) and standalone HTML templates, builds an **Abstract Syntax Tree (AST)**, and generates a **symbol table** of all declared identifiers.

## Features

### TypeScript / Angular parsing
- **Imports** (`import { X, Y } from '...'`) and **class declarations** (with `export`, `extends`)
- **Angular decorators** — `@Component({...})`, `@Input()`, `@Output()`
- **Variable, function, and array declarations**, including typed parameters and return types
- **Arrow functions**
- **Control flow** — `if` / `else if` / `else`, `for`, `while`, `do...while`
- **Interfaces**
- **Expressions** — arithmetic, logical, comparison and assignment operators, member access, function calls, array access, increment/decrement

### HTML template parsing
- Standard tags, self-closing tags, `<meta>`, `<script>` and `<style>` tags, comments
- **Attributes**, **property bindings** (`[prop]="..."`), **event bindings** `((event)="...")`, and **structural directives** (`*ngIf`, `*ngFor`, etc.)
- Inline `<style>` blocks parsed down to individual CSS declarations
- Text interpolation / bindings (`{{ ... }}`)

### Symbol table
Every declared identifier is recorded with its name, type, additional info, start/end line, and value, and can be printed as a formatted table.

## Architecture

```
src/
├── Gammar/
│   ├── ProgramLexer.g4       # ANTLR lexer grammar
│   ├── ProgramParser.g4      # ANTLR parser grammar (TypeScript/Angular + HTML)
│   └── gen/                  # ANTLR-generated Lexer/Parser/Visitor classes
├── Ast/
│   ├── TypeScripts/          # AST nodes for TS/Angular constructs (classes, statements, expressions, ...)
│   │   ├── Angular/           # @Input / @Output / Angular component AST nodes
│   │   └── Expression/         # Expression AST node hierarchy
│   └── HTML/                 # AST nodes for HTML documents (tags, bindings, directives, CSS, ...)
├── SymbolTable/
│   ├── SymbolTable.java      # Symbol table container + printer
│   └── Row.java               # A single symbol table entry
├── ProgramVisitor.java       # ANTLR visitor that walks the parse tree and builds the AST + symbol table
└── Main.java                 # Entry point — parses a test file and prints the AST + symbol table
```

**Pipeline:** source file → `ProgramLexer` (tokenizing) → `ProgramParser` (parse tree) → `ProgramVisitor` (walks the parse tree, builds the typed AST under `Ast.TypeScripts.*` / `Ast.HTML.*`, and populates the `SymbolTable`) → printed output.

The grammar (`program` rule) accepts either a sequence of TypeScript/Angular `line`s, or a full `htmlDoc`, so the same pipeline handles both `.ts`-style component files and `.html` template files.

## Tech Stack

- **Java**
- **ANTLR4** (runtime 4.13.2) for lexing/parsing

## Getting Started

This is an IntelliJ IDEA project (no Maven/Gradle build file — dependencies are managed as IDE module libraries).

1. Open the project in IntelliJ IDEA.
2. Ensure the ANTLR4 runtime library is attached to the module (see `.idea/libraries/antlr_runtime_4_13_2.xml`).
3. Run `src/Main.java`. It parses whichever file is set in the `path` variable (defaults to `test/test1.txt`) and prints:
   - The parsed `Program` AST
   - The generated symbol table

To try a different input, edit the `path` variable in `Main.java` to point at any of the sample files in `test/` (e.g. `test/test2.txt` for an Angular component, `test/test5.txt` for an HTML document) or supply your own.

## Sample Inputs

The `test/` directory contains sample inputs covering both supported input types, for example:
- Angular component files (imports, `@Component`, `@Output`, class members, methods)
- Standalone HTML documents (doctype, head/meta tags, nested elements, Arabic text content)

## License

This project was developed as a personal software engineering project (compiler construction / AI search coursework). No license has been specified yet.
