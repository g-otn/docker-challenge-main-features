FROM bellsoft/liberica-runtime-container:jre-17-slim-musl

# Create and change to non-root user
ENV APP_USER=backend
# BusyBox syntax
RUN addgroup -S $APP_USER && adduser -D -g "" -G $APP_USER $APP_USER
USER backend

# Copy app
ARG JAR_FILE=target/dockerchallenge-0.0.1.jar
ENV APP_FOLDER=/opt/app
WORKDIR $APP_FOLDER
COPY $JAR_FILE app.jar

# Run app
ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 8080