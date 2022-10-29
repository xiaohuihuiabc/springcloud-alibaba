FROM java-os

COPY ./*.jar /usr/local/jar/shop-product.jar

CMD ["--server.port=8081"]

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "/usr/local/jar/shop-product.jar"]