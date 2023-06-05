# soat-docker-challenge
Docker image packaging of a simple Spring Boot web app to list values from PostgreSQL DB. 
Created for an optional Docker course project.

## Running
1. Clone the project and navigate to it:
```bash
git clone https://github.com/g-otn/soat-docker-challenge.git
cd soat-docker-challenge
```
2. Make sure port `80` is not in use.
3. Run Docker Compose:
```bash
docker compose up
# or
docker-compose up
```
4. Wait for the Spring Boot app to startup.
5. Access [`http://localhost/programming-languages`](http://localhost/programming-languages) and you should 
see a JSON array listing some programming languages,
retrieved from the db container.

## Building
To build the backend image:
1. Open and configure the `backend/` project with your Java IDE.
2. Compile and package it using Maven.
3. Build the `Dockerfile`.
   - e.g: `docker buildx build -t g0tn/soat-docker-challenge-backend backend`
   - Build arguments:
     | arg | description | default |
     | - | - | - | 
     | `JAR_FILE` | Path to packaged .jar file | `target/dockerchallenge-0.0.1.jar` |
   - Environment variables:
     | env var | description | default |
     | - | - | - | 
     | `APP_USER` | Internal user for running the app | `backend` |
     | `APP_FOLDER` | Working directory where the jar will be copied to | `/opt/app` |
     
## Acknowledgments
- Prof. Luiz Zenha and Prof. Matheus Pavani: Course teachers.
- [marcelovbcfilho](https://github.com/marcelovbcfilho): Help with Docker Compose.
