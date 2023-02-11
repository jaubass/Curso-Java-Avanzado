# Patrón Iterator

## Definición

El patrón de comportamiento Iterator es un patrón de diseño de software que permite a los programadores recorrer una estructura de datos de manera ordenada sin conocer su implementación interna. Esto significa que los programadores pueden acceder a los elementos de una colección uno por uno sin conocer la implementación interna de la colección. Esto reduce la complejidad de los programas y facilita la escritura de código limpio y reutilizable. Además, el patrón Iterator permite a los programadores administrar la cantidad de memoria utilizada al trabajar con grandes conjuntos de datos.

### Mi caso de uso:

He utilizado el patrón para recorrer los objetos guardados en un ArrayList, de manera que desacoplo las funciones para iterar por el mismo de las diferentes clases que interactuan entre ellas.