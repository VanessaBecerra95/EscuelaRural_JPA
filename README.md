# EscuelaRural_JPA

Este proyecto fue desarrollado como parte de un desafío para crear un sistema de gestión escolar utilizando Spring Boot, JPA, y PostgreSQL. El objetivo principal es registrar y gestionar información sobre los alumnos y los cursos en los que están inscritos en una escuela rural.

## Características Principales

- **Gestión de Alumnos y Cursos**: Implementación de un sistema CRM que permite el ingreso, edición, selección, y eliminación de alumnos y cursos. Toda la información se gestiona de manera transaccional, garantizando la consistencia de los datos.

- **Relaciones entre Entidades**: Se han modelado relaciones JPA entre las entidades `Alumno` y `Curso`, reflejando las asociaciones reales en una estructura de base de datos relacional.

- **Transaccionalidad en Operaciones CRUD**: Todas las operaciones CRUD (Crear, Leer, Actualizar, Eliminar) están envueltas en transacciones para asegurar la integridad de los datos.

- **Interfaz de Usuario con Thymeleaf**: La visualización y manipulación de datos se realiza a través de vistas desarrolladas en Thymeleaf, proporcionando una interfaz amigable y responsive.

## Tecnologías Utilizadas

- **Spring Boot**: Framework principal para la construcción de la aplicación, facilitando la configuración y el desarrollo rápido.
- **Spring Data JPA**: Utilizado para la gestión de datos y la implementación de las operaciones CRUD, aprovechando la simplicidad de las anotaciones JPA.
- **PostgreSQL**: Base de datos utilizada para almacenar la información de alumnos y cursos.
- **Thymeleaf**: Motor de plantillas para la generación dinámica de contenido en las vistas.
- **Lombok**: Biblioteca que reduce la verbosidad del código, generando automáticamente métodos como getters, setters, y constructores.
- **Maven**: Sistema de gestión de dependencias y construcción del proyecto.

## Requerimientos del Proyecto

1. **Configuración Inicial**: Creación del proyecto Spring Boot con las dependencias necesarias para conectar con una base de datos PostgreSQL.
2. **Modelado de Entidades y Relaciones**: Definición de las clases `Students` y `Course`, junto con sus relaciones.
3. **Implementación de CRUD Transaccional**: Desarrollo de las operaciones CRUD con soporte transaccional para asegurar la integridad de los datos.
4. **Despliegue de Información**: Implementación de vistas con Thymeleaf para mostrar y gestionar la información en una interfaz web.

## Cómo Ejecutar el Proyecto

1. **Clona el repositorio**:
   ```bash
   git clone https://github.com/tu_usuario/EscuelaRural_JPA.git
2. Configura la base de datos:
   - Asegúrate de tener PostgreSQL instalado y añadir los datos del script llamado "script sql para la base da datos escuela_rural".
   - Configura las credenciales en el archivo application.properties.
4. Ejecuta la aplicación:
   ```bash
   mvn spring-boot:run
5. Accede a la interfaz web: Una vez que la aplicación esté en ejecución, accede a http://localhost:8080 para interactuar con el sistema.

## Consideraciones

- Se utilizaron las mejores prácticas de desarrollo en Spring Framework, incluyendo la inyección de dependencias y el uso de anotaciones.
- El proyecto fue diseñado para ser escalable y fácil de mantener, aprovechando la modularidad que proporciona Spring Boot.
