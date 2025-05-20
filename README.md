# 🍋 Lemonade App

An interactive Android app built with **Jetpack Compose** that guides the user through a fun lemonade-making process — from picking a lemon to squeezing it, enjoying the drink, and starting over!

This project is part of the [Android Basics with Compose](https://developer.android.com/codelabs/basic-android-kotlin-compose-button-click-practice-problem) course from Google.

---

## 🎮 How It Works

1. **Tap the Lemon Tree** 🌳  
   → Selects a lemon from the tree.

2. **Tap the Lemon** 🍋  
   → Squeeze the lemon! The number of required taps is randomly generated (between 2 and 4).

3. **Tap the Lemonade Glass** 🥤  
   → Drink your freshly squeezed lemonade!

4. **Tap the Empty Glass** 🫗  
   → Start over and make more lemonade!

---

## 📱 Features

- Uses `Image` and `Text` composables
- Random tap count for squeezing lemons (adds variety!)
- State-driven UI transitions using `remember` and `mutableStateOf`
- Clean layout and user-friendly interactions

---

## 🛠️ Tech Stack

- **Kotlin**
- **Jetpack Compose**
- **Android Studio Giraffe or newer**

---

## 📸 Screenshots

| Step | UI |
|------|----|
| Lemon Tree | ![Step 1 - Tree](https://github.com/user-attachments/assets/fadd0cc2-236d-4f37-a393-dda7f68eba86) |
| Squeezing Lemon | ![Step 2 - Squeeze](https://github.com/user-attachments/assets/2c510e42-dfeb-49d9-acbd-ce93d7d3ab83) |
| Drinking Lemonade | ![Step 3 - Drink](https://github.com/user-attachments/assets/12937a5b-108c-44a3-8668-475ba6598280) |
| Empty Glass | ![Step 4 - Restart](https://github.com/user-attachments/assets/c036a00e-4a4c-43cb-9c80-7b24d33873eb) |




## 🚀 Getting Started

### Prerequisites

- Android Studio installed
- Android Emulator or physical Android device

### How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/lemonade-app.git
   ```
2. Open the project in Android Studio

3. Connect an emulator or device

4. Click Run ▶️ to build and run the app

### 🧠 What I Learned
How to manage UI state in Jetpack Compose

Using when expressions to control flow

Applying logic to interactive elements (taps, counters)

Using painterResource() to display different images
