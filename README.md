# 🎓 Student Management App (Spring Boot)

Proyek ini merupakan implementasi sederhana dari **Student Management Application** menggunakan **Spring Boot**, berdasarkan tugas mini Java Application sebelumnya.  
Aplikasi ini menyediakan dua endpoint utama untuk mengelola data mahasiswa, yaitu menampilkan daftar mahasiswa (`GET`) dan menambah data mahasiswa baru (`POST`).

---

## 🚀 Tech Stack
- **Java 17+**
- **Spring Boot 3**
- **Spring Web**
- **Lombok** (Untuk kode getter/setter)
- **Maven**

> 💡 Database tidak digunakan — data disimpan secara sementara (in-memory list).

---

## 📂 Struktur Proyek

studentapp/
├── src/
│ ├── main/java/com/example/tugas2/
│ │ ├── controller/
│ │ │ └── StudentController.java
│ │ ├── model/
│ │ │ └── Student.java
│ │ └── services/
│ │ └── StudentService.java
│ └── Tugas2Application.java
└── pom.xml


---

## ⚙️ Cara Menjalankan Aplikasi

1. Clone repository ini:
   ```bash
   git clone https://github.com/username/studentapp-springboot.git
   cd studentapp-springboot

2. Jalankan aplikasi menggunakan Maven:

   mvn spring-boot:run

3. Aplikasi akan berjalan di:

   http://localhost:8080


Endpoint API
1️⃣ GET /students

Deskripsi: Menampilkan seluruh daftar mahasiswa.

Contoh Request:

GET http://localhost:8080/students

Contoh Response with dummy:

[
  {
    "nim": "23001",
    "fullName": "Alif Rendy",
    "dob": "2003-05-12",
    "address": "Jakarta"
  },
  {
    "nim": "23002",
    "fullName": "Dina Putri",
    "dob": "2002-11-30",
    "address": "Bandung"
  }
]

2️⃣ POST /students

Deskripsi: Menambahkan mahasiswa baru ke dalam daftar.

Contoh Request:

POST http://localhost:8080/students


Request Body (JSON):

{
  "nim": "23003",
  "fullName": "Rafi Ananda",
  "dob": "2003-09-21",
  "address": "Surabaya"
}


Response:

{
  "nim": "23003",
  "fullName": "Rafi Ananda",
  "dob": "2003-09-21",
  "address": "Surabaya"
}

📦 Contoh Dummy Data (default)

Ketika aplikasi dijalankan, data awal yang tersedia:

[
  {
    "nim": "23001",
    "fullName": "Alif Rendy",
    "dob": "2003-05-12",
    "address": "Jakarta"
  },
  {
    "nim": "23002",
    "fullName": "Dina Putri",
    "dob": "2002-11-30",
    "address": "Bandung"
  }
]

🧰 Catatan

Data hanya tersimpan sementara (tidak menggunakan database).

Setiap kali aplikasi direstart, data akan kembali ke data awal (dummy).

Cocok untuk demonstrasi konsep dasar REST API menggunakan Spring Boot.


Nama: Alif Rendy Pahlevi
Project: Tugas 2 — Student Management App (Spring Boot)
Program Studi: Sistem Informasi