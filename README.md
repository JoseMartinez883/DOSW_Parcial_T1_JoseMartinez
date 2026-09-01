# DOSW_Parcial_T1_JoseMartinez

Jose Alejandro Martinez Arias - DOSW Grupo - 1

link bitacora: https://github.com/JoseMartinez883/DOSW_BITACORA


Evidencias de acceso de Draw y Figma

![DrawEvidence.png](DOSW-ParcialT1/docs/images/DrawEvidence.png)

![FigmaEvidence.png](DOSW-ParcialT1/docs/images/FigmaEvidence.png)

![EvidenciaCompileMaven.png](DOSW-ParcialT1/docs/images/EvidenciaCompileMaven.png)


### Requerimientos

#### Requerimientos funcionales
- Calcular el precio final en tiempo real y mostrar un resumen del pedido
- Un pedido puede contener hasta 5 productos distintois, cada uno con sus propios extras y una preferencia de entrega (buider)
- Un producto base puede tener varios personalizables o extras (decorator)

### Requerimientos no funcionales
- Tipografía: La tipografia de la aplicacion debe ser Poppings ](Google Fonts)
- Colores de la cafetería: Azul (#1B3A5C) y Dorado (#C67A00)

3 requerimientos funcionales
-	Calcular el precio final en tiempo real y mostrar un resumen del pedido
-	Un pedido puede contener hasta 5 productos distintois, cada uno con sus propios extras y una preferencia de entrega (buider)
-	Un producto base puede tener varios personalizables o extras (decorator)
VF
2 requerimientos no funcionales
Tipografía: La tipografia de la aplicacion debe ser Poppings ](Google Fonts)
Colores de la cafetería: Azul (#1B3A5C) y Dorado (#C67A00)

PARTE 3
Los dos requerimientos funcionales mas importantes:
-	Un pedido puede contener hasta 5 productos distintois, cada uno con sus propios extras (builkder)
-	Un producto puede tener varios personalizables (decorator)

PARTE 4
CON FIGMA
PARTE 5
PARTE 6
1.	Identifique los 2 patrones asignados (Iterator y Composite), especificando para cada uno:
a.	Nombre del patrón y tipo (creacional, estructural o de comportamiento)
Creacional – Builder
Decorator - Estructural
b.	Justificación de la decisión en el contexto de ECI Paw Connect
En este caso, se nos dice que los productos pueden tener varios personalizables, teniendo en cuenta un producto base, por lo tanto se podria pensar con el patron decorator, que nos permitiria añadir los distintos tipos de extras de cada producto, sin afectar el producto base.

Por el lado de Builder, para la construccion de dicho producto base o pedido base.



c.	Diagrama de clases UML de la solución con los dos patrones aplicados
FALTAAA

d.	Cuáles principios SOLID está aplicando y porque

-	S – Single responsibility, ya que cada clase se encarga de una responsabilidad en especificia, por lo tanto no sobrecargamos las clases con varias responsabilidades o razones de existir

-	O – Open/Closed al aplicar o depender de clases abstractas y interfaces, si queremos agregar nuevas funcionalidades en un future, no seria un problema o tocaria mover el codigo inicial

-	L – Likvos’s susbsition, ya que Las clases derivadas (subclase) sustitituyen las superclases base (superclase), en este caso, seria que implementen la clases abstracta de manera valida 

-	I – Interface Segregation, al aplicar las interfaces y que todos los que la implementan, la implementen de manera valida 

-	D – Al depender de abstracciones e interfaces estamos hacienda que modulos de bajo snivel y alto nivel dependen de las mismas
