Proyecto de Gestión de Frutas y Pedidos
Este es un proyecto de ejemplo que muestra cómo gestionar frutas y pedidos en un supermercado a través de un sistema web utilizando Spring Boot y una base de datos. El proyecto incluye operaciones CRUD para las frutas, la creación de pedidos y cálculo del valor total del pedido.

Requisitos
Asegúrate de tener instalados los siguientes componentes antes de ejecutar el proyecto:

Java 11 o superior
Maven
Un sistema de gestión de bases de datos compatible con Spring Boot (por ejemplo, MySQL, PostgreSQL)


Configuración
Clona el repositorio desde GitHub:
git clone https://github.com/tuusuario/tuproyecto.git
cd tuproyecto
Configura la base de datos en application.properties (o application.yml) según tus necesidades:

Configura la base de datos en application.properties (o application.yml) según tus necesidades:
spring.datasource.url=jdbc:mysql://localhost:3306/supermercado
spring.datasource.username=root

Ejecuta la aplicación:
mvn spring-boot:run


USO
Operaciones CRUD de Frutas
GET /frutas: Obtiene la lista de todas las frutas.
GET /frutas/{id}: Obtiene una fruta por su ID.
POST /frutas: Crea una nueva fruta proporcionando los datos en formato JSON.
PUT /frutas/{id}: Actualiza una fruta existente por su ID.
DELETE /frutas/{id}: Elimina una fruta por su ID.
Ejemplo de creación de una fruta:


{
  "tipo": "Manzana",
  "cantidad": 100,
  "precio": 1.25
}
Creación de Pedidos
POST /pedidos: Crea un pedido proporcionando la lista de frutas deseadas y sus cantidades en formato JSON.
Ejemplo de creación de un pedido:


{
  "frutasCantidad": {
    "Manzana": 5,
    "Pera": 10,
    "Fresa": 2
  }
}


NOTAS
Asegúrate de que los precios de las frutas estén configurados en la base de datos para que el cálculo del valor total del pedido funcione correctamente.
Personaliza el proyecto según tus necesidades, incluyendo la seguridad, validaciones y cualquier otro requisito específico.
Contribución
Si deseas contribuir a este proyecto, siéntete libre de hacer un fork y enviar una solicitud de extracción (pull request).
