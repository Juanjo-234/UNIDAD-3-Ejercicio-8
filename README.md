Este programa está diseñado para modelar y gestionar el odómetro y estado de un vehículo asegurando la integridad de su información mediante la aplicación estricta del principio de encapsulamiento (ocultación de datos) y validaciones defensivas para el registro de trayectos en programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase Vehiculo: Declara atributos privados (patente, modelo y kilometrajeAcumulado) para impedir que código externo modifique el odómetro de manera arbitraria.

Implementa el método avanzar(double kilometros): Valida de forma estricta que la distancia recorrida en cada trayecto sea estrictamente mayor a cero antes de actualizar el acumulador interno, rechazando valores negativos o nulos.

Omitió el método setKilometraje(): Protege el estado del vehículo asegurando que nadie pueda alterar el kilometraje de forma directa sin pasar por el método de control de trayectos. Proporciona únicamente un getter (getKilometraje()) para su lectura segura.

Ejecuta la prueba en el main: Instancia un vehículo con un kilometraje inicial, simula trayectos con valores válidos (como 150.5 km) e inválidos (como -50.0 km), y muestra el kilometraje total acumulado por consola.
