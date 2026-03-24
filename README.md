# 🏋️ Smart Gym Management System (Java + JDBC + QR)

A **Smart Gym Management System** developed using **Java, JDBC, MySQL, and QR Technology**.  
This project simulates a real-world gym membership system with login, health tracking, premium subscriptions, payment processing, QR-based access, and expiry validation.

---

# 🚀 Features

## 🔐 Authentication Module
- User Registration
- Secure Login System
- Credential Validation
- Stores user data in MySQL database

---

## 🧍 Health Details Module
- Stores:
  - Age
  - Gender
  - Height
  - Weight
- Editable health details
- Automatically saved to database

---

## 📊 BMI Calculator
- Calculates BMI using:
  
  **BMI = weight / (height × height)**

- Displays BMI category:
  - Underweight
  - Normal
  - Overweight
  - Obese

---

## 🍽 Diet Plan Module
### Normal Users:
- Basic Veg / Non-Veg diet suggestions

### Premium Users:
- Advanced personalized diet plans
- Calorie-based recommendations

---

## 💪 Workout Module
- Normal workout routines
- Beginner-friendly exercises
- Daily workout suggestions

---

## 🤖 AI Assistance Module
- Interactive chatbot-style assistant
- Provides guidance related to:
  - Fitness
  - Diet
  - Workout
  - BMI

---

## 💳 Payment Module
Supports multiple payment methods:

- UPI
- Debit Card
- Credit Card
- Net Banking

Security features:
- OTP Verification
- PIN Verification
- Fixed Premium Cost (₹999)

After payment:
- Premium activated
- Membership updated in database

---

## 📷 QR Code Membership System (Core Feature)

After successful payment:

✔ QR Code generated  
✔ Stored in `qrs/` folder  
✔ Contains:

- Member ID
- Username
- Amount Paid
- Age
- Weight
- Expiry Date
- Status

Example QR Data:


# 🗄 Database Configuration

This project uses **MySQL** database to store user details, payment status, and membership data.

---

## Step 1 — Install MySQL

Make sure MySQL Server is installed.

You can download from:

https://dev.mysql.com/downloads/mysql/

---

## Step 2 — Create Database

Run the following SQL:

```sql
CREATE DATABASE
