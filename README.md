# My Coding Journey 🚀

This repository is an archive of code I wrote **before the AI era** — while learning to program on my own, in university labs, and through personal practice. I'm pushing it to GitHub as-is (warts and all) to document how far I've come and to keep a record of the fundamentals I built by hand.

> ⚠️ This is practice/learning code, not production software. Expect inconsistent naming, rough edges, and beginner-level design choices — that's the point. It's a snapshot of the learning process, not a portfolio of polished projects.

## What's inside

The repo is organized by language/technology, roughly in the order I learned them:

```
codes/
├── C codes/           # Intro to programming: loops, conditionals, basic math problems
├── C++ codes/         # PF (Programming Fundamentals) lab work: arrays, functions, recursion, strings
├── Java codes/        # The bulk of my coursework and projects
│   ├── OOP codes/         # Object-Oriented Programming coursework (chapters, assignments, mini-games)
│   ├── DSA Codes/         # Data Structures & Algorithms (linked lists, stacks, queues, trees, BST)
│   ├── Practise Codes/    # General Java practice
│   └── java Projects/     # Larger standalone Java apps (see below)
└── Web Codes/          # Front-end/back-end web development coursework
    ├── HTML/CSS practice and cheat sheets
    ├── Bootstrap & animation examples
    ├── React components and multi-page apps
    ├── Form handling (Vite + React)
    └── A full-stack app (React + Node/Express + MongoDB)
```

### Notable Java projects (`Java codes/java Projects/`)
- **Store** – simple inventory/point-of-sale style console app
- **Library Management System** – library catalog system using custom data structures
- **Car Parking System** – Swing GUI app for managing parked vehicles
- **Rental Car Management System** – car rental console app
- **Stock Management System** – basic stock/inventory tracker
- **ems gui** – Employee Management System with a Swing GUI and DB connectivity
- **PatientTokenGenerator** – token/queue generator for a clinic-style system

### Notable Web project (`Web Codes/ecommerce website project/` & `17. Backend code and database connectivity/`)
- A basic e-commerce site (HTML/CSS/JS)
- **HostalApp** – full-stack app: React front end, Express/Node back end, MongoDB via Mongoose

## Tech stack across the repo

`C` · `C++` · `Java` (Swing, OOP, DSA) · `HTML/CSS` · `JavaScript` · `React` (Vite & CRA) · `Bootstrap` · `Node.js` / `Express` · `MongoDB`

## Why I'm publishing this

I wrote all of this before relying on AI tools, back when I was actively learning the fundamentals — syntax, control flow, OOP principles, data structures, and eventually full-stack web basics. Publishing it here is a way to:
- Show genuine, hands-on learning progress over time
- Keep an honest record of where I started
- Have a reference point to look back on as I keep growing as a developer

## Running the code

Since these are independent practice files/projects rather than one unified application, each folder can generally be run on its own:
- **C/C++ files**: compile individually with `gcc`/`g++`, e.g. `g++ "file.cpp" -o output && ./output`
- **Java files**: most `java Projects/*` folders were created as IntelliJ projects — open the folder in IntelliJ, or compile manually with `javac` and run with `java`
- **Web/React projects**: `cd` into the relevant folder and run `npm install && npm run dev` (Vite projects) or `npm start` (Create React App projects)
- **HostalApp (full stack)**: install dependencies separately in `frontend/` and `backend/`, then run the backend (`npm start`) and frontend (`npm run dev`/`npm start`) in separate terminals

## Notes

- IDE metadata (`.idea/`, `*.iml`), compiled output (`*.class`, `*.exe`, `out/`), and `node_modules/` are excluded via `.gitignore` — only source code is tracked.
- Some folders also contain their own project-specific `README`/notes where applicable.

---
*A running log of my growth as a self-taught programmer, one lab assignment and side project at a time.*
