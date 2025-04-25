# Respuestas

## 1. Herencia y Polimorfismo
- El proyecto utiliza **herencia** y **polimorfismo** en la relación entre las clases `Producto` (abstracta) y `ProductoConcreto`.  
- La clase `Producto` define un contrato común para todos los productos mediante el método abstracto `mostrarDetalles`, que es implementado de manera específica en `ProductoConcreto`.  
- Además, el uso de la interfaz `ProductoImplementacion` permite aplicar polimorfismo al desacoplar la implementación de los detalles específicos de cada producto.

## 2. Composición y Agregación
- **Composición**:
  - Conceptualmente, un pedido sin productos no tiene sentido, por lo que la relación entre `Pedido` y `Producto` es de composición.
  - De manera similar, una impresión está compuesta por varias fotos, por lo que La relación entre `ImpresionImplementacion` y `Foto` es de composición.

- **Agregación**:
  - La relación entre `Pedido` y `Cliente` es de agregación, ya que un cliente puede existir sin realizar un pedido.

## 3. ¿Cuál clase podría convertirse en una interfaz o clase abstracta para generar un modelo mucho más estructurado?
- La clase `Producto` ya es abstracta, lo cual es adecuado para estructurar el modelo.
- La clase `Foto` podría convertirse en una interfaz o clase abstracta si se desea tratar como un tipo de producto.

## 4. ¿Qué es más conveniente para el modelo, utilizar arreglos o utilizar la estructura de datos ArrayList?
- Es más conveniente utilizar **ArrayList** porque permite manejar dinámicamente la cantidad de elementos (productos, fotos, etc.) sin necesidad de definir un tamaño fijo.  
- Esto es especialmente útil en aplicaciones donde la cantidad de elementos puede variar.

## 5. ¿Qué patrones eligió y por qué?
- **Patrón Bridge**:
  - Se utiliza en la relación entre `Producto` y `ProductoImplementacion`.  
  - Este patrón permite desacoplar la abstracción (`Producto`) de su implementación (`ProductoImplementacion`), facilitando la extensión y el mantenimiento del código.
- **Patrón Builder**:
  - Se aplica en la clase `Pedido` mediante la clase interna `PedidoBuilder`.  
  - Este patrón simplifica la creación de objetos complejos como `Pedido`, proporcionando un enfoque más legible y flexible para configurar sus propiedades.
