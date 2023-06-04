# Cycling

Un ciclista nos pide diseñar una app para registrar sus entrenamientos en bicicleta. Los entrenamientos pueden ser indoor o afuera. Los trayectos outdoor tienen un nombre descriptivo, una fecha de inicio y otra de fin, y km recorridos. Los entrenamientos del gimnasio tienen minutos realizados, resistencia empleada y tipo de entrenamiento. 

Del ciclista sabemos el nombre, el peso, la altura y el país de residencia. 

Ambos entrenamientos computan las calorías quemadas. Los indoor son 100 calorías por minuto y los outdoor 150 calorías por kilómetro.

Todos los entrenamientos deben estar en un contenedor genérico con las operaciones básicas de agregar, contar y listar.

El ciclista deberá tener un método que le permita calcular las calorías quemadas totales o de un tipo específico enviado por parámetro. 

Cuando se agrega un entrenamiento outdoor deberá verificar que la fecha de fin no sea anterior a la fecha de inicio, si es así lanzar una excepción creada por el programador. La excepción debe ser del tipo comprobada. 

Realizar un método para exportar todos los trayectos en JSON Array. Modularizar la generación de los objetos individuales.  








A cyclist asks us to design an app to record their bike training sessions. The sessions can be either indoor or outdoor. Outdoor sessions have a descriptive name, a start date and end date, and the distance covered in kilometers. Gym sessions have the duration in minutes, the resistance used, and the type of training.

We know the cyclist's name, weight, height, and country of residence.

Both types of sessions contribute to the burned calories. Indoor sessions burn 100 calories per minute, while outdoor sessions burn 150 calories per kilometer.

All sessions should be stored in a generic container with basic operations such as adding, counting, and listing.

The cyclist should have a method to calculate the total burned calories or the calories of a specific type passed as a parameter.

When adding an outdoor session, it should validate that the end date is not earlier than the start date. If it is, an exception should be thrown. The exception should be a checked exception created by the programmer.

Create a method to export all sessions as a JSON array. Modularize the generation of individual session objects.
