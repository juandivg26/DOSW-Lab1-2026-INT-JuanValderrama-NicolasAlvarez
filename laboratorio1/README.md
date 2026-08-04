# CUESTIONARIO TEÓRICO

## 01. ¿Cuál es la diferencia entre git merge y git rebase?

git merge fusiona los cambios de una rama con otra creando un nuevo commit de fusión (merge commit). Esto conserva el historial completo de ambas ramas.

Por otro lado, git rebase mueve los commits de una rama y los reaplica sobre otra, creando un historial más lineal. La principal diferencia es que git rebase modifica el historial de commits, mientras que git merge lo conserva.

Se recomienda usar git rebase únicamente en ramas locales, ya que hacerlo sobre ramas compartidas en un repositorio remoto puede generar conflictos con otros desarrolladores.


## 02. Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge?

Si dos ramas modifican la misma línea de un archivo, Git no puede decidir automáticamente cuál cambio conservar. En ese caso, se produce un conflicto de fusión (merge conflict).

El proceso de merge se detiene y es necesario resolver el conflicto manualmente. Una vez resuelto, se guardan los cambios y se realiza el commit para finalizar la fusión.


## 03. ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?

Puedes visualizar el historial de ramas y merges utilizando el siguiente comando:

git log --graph --oneline --all

Este comando muestra el historial de commits en forma de gráfico, permitiendo visualizar las ramas, las fusiones y la relación entre los distintos commits.


## 04. Explica la diferencia entre un commit y un push.

- git commit guarda los cambios realizados en el repositorio local, creando un nuevo punto en el historial del proyecto.
- git push envía esos commits al repositorio remoto, permitiendo que otros desarrolladores puedan acceder a ellos.


## 05. ¿Para qué sirven git stash y git stash pop?

- git stash guarda temporalmente los cambios que aún no han sido confirmados (commit), dejando el árbol de trabajo limpio para realizar otra tarea.
- git stash pop recupera esos cambios guardados y los aplica nuevamente sobre el proyecto, eliminándolos de la lista de stashes.


## 06. ¿Qué diferencia hay entre HashMap y Hashtable?

Aunque ambas estructuras almacenan pares clave–valor, presentan diferencias importantes:

### HashMap

- No es sincronizado, por lo que ofrece un mejor rendimiento en aplicaciones de un solo hilo.
- Permite una clave null y múltiples valores null.
- Es la implementación más utilizada en aplicaciones modernas.

### Hashtable

- Es sincronizado, por lo que es seguro para aplicaciones multihilo, aunque resulta más lento.
- No permite claves null ni valores null.
- Es una implementación más antigua que actualmente ha sido reemplazada en la mayoría de los casos por otras alternativas.


## 07. ¿Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?

Collectors.toMap() permite convertir una colección en un Map de forma más sencilla y con menos código. Además, se integra con la API de Streams, hace el código más legible y facilita combinar operaciones como filter() y map() antes de crear el mapa.


## 08. Si usas una List con objetos y aplicas stream().map(), ¿qué tipo de operación estás haciendo?

Se está realizando una operación de transformación, ya que map() toma cada elemento de la lista, aplica una función y devuelve un nuevo Stream con los elementos transformados.


## 09. ¿Qué hace stream().filter() y qué retorna?

filter() se utiliza para seleccionar únicamente los elementos que cumplen una condición determinada.

Retorna un nuevo Stream que contiene únicamente los elementos que cumplen con el criterio establecido.


## 10. Describe el paso a paso para crear una rama desde develop para una funcionalidad nueva.

1. Cambiar a la rama develop.
2. Actualizar la rama con los últimos cambios mediante git pull.
3. Crear una nueva rama utilizando:
   git checkout -b feature/nombre-funcionalidad
4. Desarrollar la nueva funcionalidad.
5. Agregar los cambios con git add.
6. Crear un commit con git commit.
7. Subir la rama al repositorio remoto mediante git push.
8. Crear un Pull Request para integrar la funcionalidad en la rama develop.


## 11. ¿Cuál es la diferencia entre git branch y git checkout -b?

- git branch nombre-rama crea una nueva rama, pero permanece en la rama actual.
- git checkout -b nombre-rama crea la nueva rama y cambia automáticamente a ella.


## 12. ¿Por qué se recomienda usar ramas feature/ en lugar de trabajar directamente en main?

Trabajar con ramas feature/ permite desarrollar nuevas funcionalidades de forma aislada sin afectar la estabilidad de la rama principal (main).
Además, facilita el trabajo en equipo, permite realizar revisiones de código mediante Pull Requests, reduce el riesgo de introducir errores en producción y mantiene un flujo de desarrollo más organizado.
