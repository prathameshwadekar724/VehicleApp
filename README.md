### 🏎️ VehicleApp

**VehicleApp** is an Android Studio project that allows users to sign in, browse cars with images and prices, and add their own vehicles to the list.

---

#### 🚀 Features

* 🔐 **User Authentication** – Secure sign-in and sign-up functionality.
* 🚘 **View Cars** – Browse a list of cars with their names, images, and prices.
* ➕ **Add Cars** – Add new cars with details (name, price, image).
* 📱 **Responsive UI** – Simple and user-friendly Android interface.

---

#### 🛠️ Tech Stack

* **Language:** Java
* **IDE:** Android Studio
* **Database:** Firebase (or specify if you used SQLite / another DB)
* **Storage:** Firebase Storage / Local storage for car images

---

#### 📂 Project Structure

```
VehicleApp/
│
├── CarsNCars/          # Main application source folder
│   ├── activities/     # Login, Signup, and Main Activity files
│   ├── adapters/       # RecyclerView adapters
│   ├── models/         # Data models (Car.java, User.java)
│   ├── res/            # Layouts, drawables, and other resources
│   └── utils/          # Helper classes
│
└── .gitattributes
```

---

#### 📸 Screenshots

<img width="342" height="768" alt="Screenshot 2025-10-08 111018" src="https://github.com/user-attachments/assets/afab8000-0c7c-4d12-88df-387d92d9c7b7" />
<img width="347" height="756" alt="Screenshot 2025-10-08 111047" src="https://github.com/user-attachments/assets/88c4ff42-ea4a-4a7d-ae34-18d3dac0011e" />
<img width="341" height="749" alt="Screenshot 2025-10-08 111100" src="https://github.com/user-attachments/assets/67cad0ac-0072-4446-be00-445b1c223751" />

---

#### ⚙️ Setup Instructions

1. Clone this repository

   ```bash
   git clone https://github.com/prathameshwadekar724/VehicleApp.git
   ```
2. Open the project in **Android Studio**
3. Connect to your **Firebase project** (if used)
4. Build and run on an emulator or physical device

---
