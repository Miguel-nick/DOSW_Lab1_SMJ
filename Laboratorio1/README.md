# Maratón Git 2026-1

## Integrantes
- Miguel Angel Sandoval
- Sebastian Aurela Medina
- Juan Angel Salas

---

## Retos completados

### Reto 1: Configuración y creación de rama

**Evidencia:**

![reto1](https://github.com/user-attachments/assets/e0f5ece3-ce11-4fe2-86aa-7df3444a6456)


**Descripción:**
Se inicializó el repositorio, se configuró el repositorio remoto y se crearon las ramas de cada estudiante en el develop para ya poder arrancar con los retos propuestos para este lab1 

---

### Reto 2: Commit colaborativo

**Evidencia:**

![reto2](https://github.com/user-attachments/assets/6920b5ed-ae6f-405a-8dc5-8a1b8527e288)


**Descripción:**
Se trabajó de manera colaborativa realizando commits desde diferentes ramas, integrando los cambios mediante `git merge` y resolviendo conflictos cuando fue necesario.

---

## Reto 3: Empezamos con los demas retos

**Evidencia:**

![retos](https://github.com/user-attachments/assets/20507aa3-6872-4732-aaa9-d79efd614fb1)

**Descripción:**
Como retos fue la organizacion entre los 3 como grupo para hacer todo con orden y trabajo simultaneo, teniendo en cuenta que en cada cambio realizamos el `git add .`, `git commit` y `git push`.

---
## Reto 4: Solucionar problemas con merge

**Evidencia:**

![retoscommits](https://github.com/user-attachments/assets/2d3862d1-2a4b-44f5-9b1b-7727570e2320)

**Descripción:**
Se trabajo de manera ordenada para cada uno de los demas retos, algunos pedian ver un conflicto de diferentes codigos con otro tipo de funciones los cuales buscaba solucionarse de manera colaborativa. 

---

## Preguntas Teoricas

## 1. ¿Cuál es la diferencia entre git merge y git rebase?
- git merge une dos ramas creando un commit de merge y conserva el historial.
- git rebase reescribe el historial colocando los commits de una rama encima de otra, dejándolo lineal.
## 2. Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge?
- Git genera un conflicto de merge y obliga al usuario a resolverlo manualmente antes de completar el merge.
## 3. ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?
- Con el comando:
- git log --oneline --graph --all
## 4. Explica la diferencia entre un commit y un push.
- Commit: guarda cambios localmente en el repositorio.
- Push: envía esos commits al repositorio remoto (GitHub).
## 5. ¿Para qué sirven git stash y git pop?
- git stash: guarda cambios temporales sin hacer commit.
- git stash pop: recupera esos cambios guardados.
## 6. ¿Qué diferencia hay entre HashMap y HashTable?
- HashMap: no es sincronizado, es más rápido, permite un valor null.
- HashTable: es sincronizado, más lento, no permite null.
## 7. ¿Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?
- Código más corto y legible, uso de programación funcional y menos errores y mejor mantenimiento
## 8. Si usas List con objetos y luego aplicas stream().map(), ¿qué tipo de operación estás haciendo?
- Una operación de transformación, porque conviertes cada elemento del stream en otro.
## 9. ¿Qué hace el método stream().filter() y qué retorna?
- Filtra los elementos según una condición y retorna un nuevo stream con los elementos que la cumplen.
## 10. Describe el paso a paso de cómo crear una rama desde develop si es una funcionalidad nueva.
- git checkout develop
- git pull
- git checkout -b feature/nueva-funcionalidad
## 11. ¿Cuál es la diferencia entre crear una rama con git branch y con git checkout -b?
- git branch: solo crea la rama.
- git checkout -b: crea la rama y cambia a ella inmediatamente.
## 12. ¿Por qué es recomendable crear ramas feature/ para nuevas funcionalidades en lugar de trabajar en main directamente?
- Porque permite evitar errores en main también trabajar de forma aislada facilitando pruebas y revisiones y mantener un historial limpio

---


## Acuerdos: 

## Organizacion

- Disponibilidad para reunirse los sabados y domingos
- Aporte de ideas y trabajo colaborativo entre los 3 integrantes
- No es malo no saber, siempre preguntar lo que no sepamos
- Pausas activas, en el sentido de cuando nos encontremos estancados
- Estar en constante aprendizaje, mandar funtes o libros para ayudar a nuestro conocimiento
- Preguntar dudas a la profe cuando lo veamos necesario


---








 
