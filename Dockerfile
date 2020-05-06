# Start with a base image containing Java runtime
FROM openjdk:8
# Add Maintainer Info
LABEL maintainer="github.com/mukeshpilaniya"
# Add a volume pointing to /tmp
EXPOSE 8080
# Add the application's jar to the container
ADD /target/calculator.jar calculator.jar
# Run the jar file
ENTRYPOINT ["java","-cp","calculator.jar","org.iiitb.calculator.App"]