FROM ghcr.io/bell-sw/liberica-openjdk-alpine:21.0.9-cds

WORKDIR /home/cutewhitewolf/app
COPY . /home/cutewhitewolf/app
RUN ./mvnw package

EXPOSE 8080

CMD java -jar /home/cutewhitewolf/app/target/demo-0.0.1-SNAPSHOT.jar com.erzhenika.demo.DemoApplication
