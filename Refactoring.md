### ** PROVISORIO** 

# Ejercicio 1
## Ejercicio 1.1
Malos olores:
* los nombres de los métodos no describen fácilmente su comportamiento o qué se espera de cada uno
* los parámetrs LocalDate f1, f2 deben ser más descriptivos: ejemplo "desde-hasta" o "fechaInicio-fechaFin"

## Ejercicio 1.2
Diseño inicial (figura 1) -> para qué tiene el ID si lo chequea así
Diseño revisado (figura 2) -> Parecería estar bien (o mejor que el anterior). Ahora bien, una persona podría conocer los proyectos en los que está involucrado (por ejemplo, una lista de Proyecto)
Hay envidia de atributos y la modificación es apropiada, ya que en el diseño inicial estaba delegando a cada persona una verificación realizable desde el Proyecto (pues, el proyecto conoce quién participa)

## Ejercicio 1.3
Code smells:
* Método largo -> si y no, te alarma que algo para pero no es el problema si
* Falta modularización, p.e. agregar método calcularPromedio(), agregar toString(), etc

# Ejercicio 2
## Ejercicio 2.6
### Inciso i
Bad smell = Switch statement

# Consultas
* Cómo levantamos como incorrecto algo que decimos que se puede resolver con streams? o de manera más simple? -> Es el famoso caso de "reinventar la rueda": sugerir que existe una librería en java que ya lo hace.
* En qué caso levanto mal una "clase de datos"? Porque a veces es real el smell pero la necesito para poder identificar correctamente un objeto -> casi siempre este bad smell viene atado a la envidia de atributos
* Es mas facil que patrones? -> No se, pero, al final del día, el objetivo del refactoring es preservar el comportamiento del sistema antes y después de la intervención, dando una mejora a cómo estaba antes
