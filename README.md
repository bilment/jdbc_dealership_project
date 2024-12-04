# Car Dealership Management System

## Description of the Project

The Car Dealership Management System is a Java application designed to help manage a car dealership's inventory and contracts efficiently. 
Users can add new vehicles, view the list of available vehicles, search for vehicles by various attributes, and manage sales or lease contracts. 
The application connects to a MySQL database for secure and scalable data storage.

## User Stories

- As a user, I want to display the list of all vehicles so that I can see all the cars in the inventory.
- As a user, I want to search vehicles by make/model so that I can find cars that match.
- As a user, I want to search vehicles by year range so that I can find cars that match.
- As a user, I want to search vehicles by color so that I can find cars that match.
- As a user, I want to search vehicles by mileage range so that I can find cars that match.
- As a user, I want to search vehicles by type (car, truck, SUV, van) so that I can find cars that match.
- As a user, I want to add new vehicles to the inventory so that I can manage the inventory.
- As a user, I want to remove vehicles from the inventory so that I can manage the inventory.
- As a user, I want to add sales or lease contracts so that I can track vehicle transactions.
- As a programmer, I want to prompt the user for contract type (sale or lease) so that I can handle the action appropriately.

## Setup

Instructions on how to set up and run the project using IntelliJ IDEA.

### Prerequisites

- **IntelliJ IDEA**: Ensure you have IntelliJ IDEA installed. You can download it [here](https://www.jetbrains.com/idea/download/).
- **Java SDK**: Ensure Java SDK 8 or higher is installed and configured in IntelliJ.
- **MySQL Database**: Set up a MySQL database with the schema provided in the project.

### Database Setup

1. Run the SQL script provided in the project to create and populate the database.
2. Update the database connection details in the `BasicDataSource` configuration in the `Main` class.

### Running the Application in IntelliJ

1. Open IntelliJ IDEA.
2. Select "Open" and navigate to the directory where the project is located.
3. Wait for IntelliJ to index the files and set up the project.
4. Locate the `Main` class with the `public static void main(String[] args)` method.
5. Right-click on the `Main` class and select "Run" to start the application.

## Technologies Used

- **Java**: Version 8 or higher.
- **MySQL**: Database for storing inventory and contract data.
- **Apache Commons DBCP**: For managing database connections.
- **IntelliJ IDEA**: Integrated development environment.


## Future Work

Potential future enhancements include:

- Adding more advanced filtering options for vehicles based on price, mileage, or year.
- Implementing a graphical user interface (GUI) for improved user experience.
- Adding features to track service history and maintenance records of vehicles.
- Enhancing user authentication and authorization.

## Resources

- [Java Documentation](https://docs.oracle.com/javase/8/docs/)
- [MySQL Documentation](https://dev.mysql.com/doc/)
- YearUp Brightspace: https://yearup.brightspace.com/d2l/home
- Tutorials and guides from [W3Schools](https://www.w3schools.com/java/)

## Team Members

- **Taha Bilmen**

## Thanks

Special thanks to:

- **Raymond** for continuous support and guidance.
- All team members and collaborators for their dedication and hard work.

