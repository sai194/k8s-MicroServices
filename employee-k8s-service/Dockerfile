FROM sai194/ubuntuwithjdkandmaven
LABEL maintainer="Sai Yeluri <sai194@gmail.com>"
LABEL description="Employee k8 service"
RUN apt-get update && \
    apt-get install -yq --no-install-recommends wget pwgen ca-certificates git && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

RUN mkdir -p /app && mkdir -p /app/jars
WORKDIR /app
RUN git clone https://github.com/sai194/k8s-MicroServices.git
WORKDIR k8s-MicroServices/employee-k8s-service
RUN mvn clean install
COPY ./target/employee-k8s-service-1.0.jar /app/jars/
WORKDIR /app/jars/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "employee-k8s-service-1.0.jar"]
