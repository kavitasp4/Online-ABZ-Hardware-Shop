# Online-ABZ-Hardware-Shop
Online ABZ Hardware Shop in Spring Boot Framework on 'master' branch.

Products and News items are persisted in embedded H2 DB and are accessible on the front end either in the form of URL or as JSON through REST API after user authentication.

Run the main method in HwShopWebappApplication.java and the http server port is configured to 8000. After building and running the application, access the application on the browser with http://localhost:8000/products. The login credentials are customer and password. The two Rest API accessible http://localhost:8000/api/products and http://localhost:8000/api/news
