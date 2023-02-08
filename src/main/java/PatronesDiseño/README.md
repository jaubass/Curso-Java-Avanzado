# Tipos de patrones de diseño
## Patrones creacionales
### Patrón Singleton
- El patrón singleton, singleton pattern en inglés, tiene como propósito evitar que sea creado más de un objeto por clase. Esto se logra creando el objeto deseado en una clase y recuperándolo como una instancia estática.

### Patrón Factory
- El patrón de diseño Factory es un patrón de diseño creacional que usa una interfaz para crear objetos sin especificar la clase exacta del objeto que se está creando. En lugar de especificar la clase exacta del objeto, el código que usa el patrón Factory especifica una clase abstracta, una interfaz o una superclase, y el patrón Factory se encarga de instanciar el objeto adecuado.

### Patrón Builder
- El patrón Builder permite la construcción paso a paso de objetos complejos a partir de sus partes constituyentes. Permite construir objetos complejos a partir de partes simples de una forma controlada sin tener que lidiar con la complejidad de la construcción. El patrón Builder se usa cuando el proceso de construcción de objetos complejos es complejo y se quiere tener un control sobre los pasos de construcción.

### Patrón Prototype
- El patrón Prototype se usa para crear objetos clonando objetos existentes, en lugar de crear objetos desde cero. El patrón Prototype se utiliza cuando el proceso de creación de objetos es complejo o costoso. El patrón Prototype permite que los objetos se creen rápidamente clonando objetos existentes. Esto reduce el tiempo de desarrollo y los costos asociados con la creación de objetos desde cero.

## Patrones estructurales
### Patrón Decorator
- El patrón Decorator se usa para añadir funcionalidad adicional a un objeto existente sin cambiar su estructura. El patrón Decorator se usa para añadir comportamiento adicional a objetos existentes de forma dinámica, sin tener que cambiar su estructura. Esto te permite añadir funcionalidad adicional a un objeto existente sin necesidad de crear una nueva clase. Esto hace que sea fácil añadir comportamiento adicional sin afectar el comportamiento original del objeto.

### Patrón Adapter
- El patrón Adapter se usa para adaptar una interfaz a otra. El patrón Adapter se usa para adaptar una interfaz a otra para que dos objetos incompatibles puedan interactuar entre sí. Esto permite que dos objetos incompatibles interactúen entre sí. Esto permite a los programadores desarrollar aplicaciones que puedan trabajar con objetos de forma más sencilla.

### Patrón Facade
- El patrón Facade se usa para simplificar la interacción entre objetos complejos. El patrón Facade se utiliza para ocultar la complejidad de los objetos existentes en una sola interfaz. Esto permite a los programadores interactuar con los objetos complejos de una forma más sencilla. Esto reduce la complejidad de la interacción entre objetos y hace que el desarrollo de aplicaciones sea más fácil.