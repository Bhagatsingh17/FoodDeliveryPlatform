### Frameworks and Language used:
 - Spring
 - Spring boot
 - Java
 - Mysql-Database
 - AWS-Deployment
 
## Data Flow
 #### Controller
---Food----
 - addFood
 - deletedFood
 - getAllFood

 ---Order----
 - placeOrder
 - getOrders
 - updateOrder

 ---Role----
 - addRole

 ---Users----
 - signUp
 - signIn

 #### Service
  ---Food----
 - addFood
 - deletedFood
 - getAllFood

 ---Order----
 - placeOrder
 - getOrders
 - updateOrder

 ---Role----
 - addRole

 ---Users----
 - signUp
 - signIn

 #### Repository
 ---Food----

 IFoodRepository

 ---Order----

 IOrderRepository

 ---Role----

 IRoleRepository

 ---Token----

 ITokenRepository

 ---Users----

 IUserRepository

 #### Model
 ---Food----
 - foodId
 - foodName
 - foodDescription
 - foodPrice
 - foodImage
 
 ---Order----
 - orderId
 - quantity
 - status
 - User
 - food

 ---Role----
 - roleId
 - roleType
 - roleDescription

 ---User----
 - userId
 - userName
 - password
 - email
 - role

---AuthenticationToken----
- tokenId
- token
- tokenCreationDate
- user

#### dto
 ---SignInInput----
 - email
 - password
 
 ---SignInOutput----
 - status
 - token

 ---SignUpInput----
 - userId
 - userName
 - password
 - email
 - role

 ---SignUpOutput----
 - status
 - message

### Project Summary
Created a simple Restaurant service model with User access authentication to provide different role and access to different user like:- Admin,Visitor,User. Each user is authenticated and granted access based on their emai land token to perform operations like add new food item, order food etc.


- All the data are stored in the MYSQL database.

- This Application is deployed on the server, you can see by clicking on this link:-
http://13.48.123.205:8080/sankalp.trimade@admin.com/6bf6bdc8-b308-41b4-b69f-a1dd80523867/Pasta
http://13.48.123.205:8080/sankalp.trimade@admin.com/6bf6bdc8-b308-41b4-b69f-a1dd80523867/Rice

- LinkedIn profile Link:-
https://www.linkedin.com/in/bhagat-singh-6b3286188/


- The ip address which I have used is:
13.48.123.205

### How to use in your system?
 - Just simply clone this repository using git on your system.
 - In your system you should have installed any JDK version     greater than 8.
 - Then open any code editor and then click on Run button to start the server
 - To save your data in database you must first create your db in mysql workbench with name as FoodDelivery.
