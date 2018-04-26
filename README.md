# springboot-docker-eureka-zuul-mongo-rabbit-example

Integration between Spring Boot, Eureka, Zuul, Mongo and Rabbit using Docker.

## How To Run.
- Create a Docker image for each service (eureka, receiver, sender, zuul).
- Run docker-compose.

### Creating Docker Image.
- Head to pom.xml in properties tag you will find the property (Optional step needed only if you want to push to docker hub)
   ```xml
    <docker.image.prefix>{{put your Docker login here}}</docker.image.prefix>
    ```
    change it to your Docker login.
    
- run
     ```sh
        $ ./mvnw package
        $ ./mvnw install dockerfile:build
    ```

## Docker compose
-    command to run docker compose
        ```sh
        docker-compose up
        ```
