# 🗓️ Final Project - Java OOP Agenda App

This is the final project for my **Object-Oriented Programming** class, recreated using **Java** and **Swing**.  
The objective was to design an agenda system using OOP principles and integrate it into a fully functional **graphical user interface**.

---

## 📌 Project Description

The project consists of several Java classes that simulate the key components of a basic agenda system:

- `Date`: Manages and stores date values.
- `Time`: Manages and stores time values.
- `Person`: Represents contacts with name, phone, and email.
- `Event`: Defines agenda events, including subject, description, date, time, and contact.
- `Agenda`: Holds all the events linked to a specific user.

Using **Swing**, a multi-window GUI was created where users can:

- Create and manage contacts.
- Create events with a form that links to those contacts.
- View the full event list and see event details.
- Delete events or contacts.
- Exit the application cleanly.

---

## 🖥️ Technologies Used

- **Java 17+**
- **Swing** (GUI toolkit)
- **NetBeans** (for GUI design)
- Object-Oriented Programming

---

## 📂 Project Structure

```bash
.
├── src/
│   ├── App.java                 # Main class (entry point)
│   ├── Person.java              # Contact class
│   ├── Date.java                # Date handling class
│   ├── Time.java                # Time handling class
│   ├── Event.java               # Event class
│   ├── Agenda.java              # Agenda with event list
│   ├── AgendaForm.java          # Main window
│   ├── ContactForm.java         # Contact creation/management window
│   └── EventForm.java           # Event creation form
└── README.md
```

## 🚀 How to Run the Project
You can open and run the project in NetBeans:

Open NetBeans.

Go to File > Open Project, then select the folder containing the source code.

Build and run the project (F6).

If you're using a terminal:

```bash
Copy
Edit
javac *.java
java App
```
Make sure all .java files are in the same directory and Java is installed and configured on your system.

## ✍️ Author
Ituriel Liebes Saenz

## GitHub: IturielLSaenz

## 📄 License
This project is for educational purposes. You are free to modify or reuse the code with proper credit.
