# Challenge-Literalura
Challenge Literalura de Alura Latam

Requisitos

    Java 17 o superior
    Maven
    PostgreSQL

Dependencias

    Spring Boot
    Spring Data JPA
    Jackson
    HTTP Client

# LiterAlura

LiterAlura es una aplicación de consola para gestionar libros y autores, con funcionalidades que permiten buscar libros y listar registros. La aplicación se conecta a una API para obtener datos y utiliza una base de datos PostgreSQL para almacenar y gestionar la información.

## Funcionalidades del Menú

La aplicación presenta un menú interactivo con las siguientes opciones:

### 1. Búsqueda de libro por título

Permite buscar un libro por su título utilizando la API de Gutendex. Si el libro se encuentra en la API, se registra en la base de datos. Si el libro ya existe en la base de datos, se muestra un mensaje indicando que no se puede registrar el mismo libro más de una vez.

### 2. Listar todos los libros registrados

Muestra una lista de todos los libros que están registrados en la base de datos. Si no hay libros registrados, se muestra un mensaje indicando esto.

### 3. Listar todos los autores registrados

Muestra una lista de todos los autores que están registrados en la base de datos. Si no hay autores registrados, se muestra un mensaje indicando esto.

### 4. Listar autores vivos en un determinado año

Permite buscar autores que estaban vivos en un año específico. Solicita al usuario que ingrese un año y luego muestra una lista de los autores que estaban vivos durante ese año.

### 5. Listar libros por idioma

Permite listar libros registrados en la base de datos por su idioma. Solicita al usuario que ingrese un código de idioma (es, en, fr, pt) y luego muestra una lista de los libros que están registrados en ese idioma, junto con el total de libros en dicho idioma.

### 0. Salir

Permite salir de la aplicación.

## Configuración

Para ejecutar la aplicación, asegúrate de tener configurado un entorno con Spring Boot y una base de datos PostgreSQL. En el archivo `application.properties` se deben definir las siguientes propiedades:

```properties
spring.datasource.url=jdbc:postgresql://${DB_HOST}/nombre_de_base_de_datos
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}
spring.datasource.driver-class-name=org.postgresql.Driver
hibernate.dialect=org.hibernate.dialect.HSQLDialect

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true
spring.jpa.format-sql = true

Ejecución

Para ejecutar la aplicación, utiliza el siguiente comando en la raíz del proyecto

./mvnw spring-boot:run

