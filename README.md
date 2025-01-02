# 🍷 **Online Wine Store** 🍷

Welcome to the **Online Wine Store** project! This is an e-commerce web application built using **Spring Boot**, providing a platform for users to browse, select, and purchase wines. It includes user authentication, product management, and an easy-to-navigate interface for an online shopping experience.

## 🚀 **Features**
- 🛒 **Product Catalog**: Browse and search through a variety of wines.
- 🔒 **User Authentication**: Secure login and Admin generates user credentials.
- 📈 **Admin Dashboard**: Manage products, view orders, and control inventory.
- 💻 **Responsive Design**: Optimized for both desktop and mobile views.

## 🛠️ **Prerequisites**

Before running the project, make sure you have the following tools installed:
- **JDK 11+**: Ensure that Java Development Kit (JDK) version 11 or above is installed on your system.
- **Maven**: The project uses Maven for dependency management and building the application.
- **MySQL**: A MySQL database to store the application data.

### 1. **Install JDK**
You can download the JDK from [Oracle's website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or use a package manager.

### 2. **Install Maven**
Download and install Maven from the [official Apache Maven site](https://maven.apache.org/download.cgi).

### 3. **Set Up MySQL**
- Install MySQL and create a database for the project, for example, `wine_store`.
- Create a new user and grant them appropriate privileges on the database.

## 🚦 **Getting Started**

### 1. **Clone the Repository**

Clone the repository to your local machine:

```bash
git clone https://github.com/strangecodee/OnlineWineStore.git
```

### 2. **Configure Application Properties**
Edit the `application.properties` or `application.yml` file located in `src/main/resources` to configure the database connection:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/wine_store
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

Make sure to replace `your_mysql_username` and `your_mysql_password` with your actual MySQL credentials.

### 3. **Build and Run the Application**

Navigate to the project folder and run the following Maven command to build the application:

```bash
mvn clean install
```

Once the build is successful, run the application using:

```bash
mvn spring-boot:run
```

The application will start running at `http://localhost:8080`.

### 4. **Access the Application**

- Visit `http://localhost:8080` in your browser.
- If you are an admin, log in using the admin credentials (check the database or create a new user).
- Regular users can log in, and start browsing the wine catalog.
- Admin generate the user credentials for their login.

## 🎨 **Features and Functionality**

### 1. **User & Admin Login**
- Users can sign up and log in to their accounts.
- Authentication is handled securely using **Spring Security**.

### 2. **Product Catalog**
- Browse a variety of wines and filter by categories.
- View detailed product information including name, price, and description.

### 3. **Shopping Cart & Checkout**
- Add wines to your cart and proceed to checkout.
- Users can review their orders before completing the purchase.

### 4. **Admin Dashboard**
- Admins can manage wine products, view orders, and manage user accounts.
- Access admin features after logging in with the appropriate admin credentials.

## 📄 **Database Schema**

The following tables are created in the MySQL database:

- **users**: Stores user details such as name, email, password, etc.
- **products**: Contains information about wines such as name, description, price, and stock quantity.
- **orders**: Stores customer orders, including order status, total price, and associated products.

## 📝 **Notes**
- Ensure the database is running before starting the application.
- You may need to add some initial data (e.g., products) manually or through the application’s admin interface.

## 💬 **Contribute**
Feel free to fork this project, create issues, and submit pull requests. Contributions are always welcome!
