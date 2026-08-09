## Cuestionario Teórico

### 1. ¿Cuál es la diferencia entre `git merge` y `git rebase`?
* **`git merge`:** Une el historial de dos ramas mediante un commit de fusión (*merge commit*). Mantiene la estructura original del árbol de Git intacta y preserva el historial cronológico real.
* **`git rebase`:** Aplica los commits de la rama actual sobre la punta de otra rama, reescribiendo el historial de forma totalmente lineal como si los cambios se hubieran realizado secuencialmente.

### 2. Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge?
* Se genera un **conflicto de fusión (*merge conflict*)**. Git detiene automáticamente el proceso, marca las líneas en conflicto con delimitadores (`<<<<<<< HEAD`, `=======`, `>>>>>>>`) y requiere que el desarrollador resuelva manualmente el código, agregue el archivo (`git add`) y complete el merge con un commit.

### 3. ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?
* Se utiliza el siguiente comando en la terminal:

git log --graph --oneline --all```

### 4. Explica la diferencia entre un commit y un push.
git commit: Guarda los cambios realizados en el repositorio local (crea una captura/snapshot del estado de los archivos en tu máquina).

git push: Sube y sincroniza esos commits guardados localmente hacia el repositorio remoto (servidor en GitHub).

### 5. ¿Para qué sirven git stash y git stash pop?
git stash: Guarda temporalmente en la memoria caché los cambios no confirmados para dejar el directorio de trabajo limpio sin perder el avance.

git stash pop: Recupera los últimos cambios guardados en el stash, los vuelve a aplicar en los archivos locales y los elimina de la memoria caché.

### 6. ¿Qué diferencia hay entre HashMap y Hashtable?
HashMap: No es sincronizado, lo que lo hace más rápido. Permite una clave null y múltiples valores null.

Hashtable: Es una clase legada completamente sincronizada. Es más lenta por la sobrecarga de sincronización y no permite claves ni valores null (lanza NullPointerException).

### 7. ¿Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?
Sintaxis declarativa: Elimina el código repetitivo y mejora la legibilidad.

Manejo nativo de duplicados: Permite definir funciones explícitas para resolver conflictos de claves mediante expresiones lambda (v1, v2) -> v2.

Integración con Streams: Permite encadenar operaciones de filtrado, mapeo y procesamiento en paralelo de forma directa.

### 8. Si usas List con objetos y aplicas stream().map(), ¿qué tipo de operación estás haciendo?
Es una operación intermedia de transformación. Toma cada elemento del stream original, le aplica una función o expresión lambda y devuelve un nuevo Stream con los objetos transformados (pueden cambiar de tipo o modificar sus propiedades).

### 9. ¿Qué hace stream().filter() y qué retorna?
Evalúa un Predicate sobre cada elemento del stream para seleccionar únicamente aquellos que cumplen una condición específica. Retorna un nuevo Stream que contiene solo los elementos filtrados.

### 10. Describe el paso a paso para crear una rama desde develop para una funcionalidad nueva.
Cambiar a la rama base: git checkout develop

Traer la versión más reciente del remoto: git pull origin develop

Crear y posicionarse en la nueva rama: git checkout -b feature/nombre-funcionalidad

### 11. ¿Cuál es la diferencia entre git branch y git checkout -b?
git branch <nombre>: Solamente crea la nueva rama, pero te mantiene posicionado en la rama en la que eras.

git checkout -b <nombre>: Crea la nueva rama y automáticamente te cambia a ella en un solo paso.

### 12. ¿Por qué se recomienda usar ramas feature/ en lugar de trabajar directamente en main?
Aísla el código: Evita introducir errores o código incompleto en la versión estable/producción.

Trabajo en equipo ordenado: Permite que varios desarrolladores trabajen en características independientes al mismo tiempo sin sobrescribirse entre sí.

Control de calidad: Facilita la revisión de código mediante Pull Requests e integración continua antes de fusionar los cambios a develop o main.

#Evidencias
#1
<img width="1363" height="767" alt="image" src="https://github.com/user-attachments/assets/b50e54e8-261f-43cf-abdf-225364915e83" />

#2
<img width="1359" height="764" alt="image" src="https://github.com/user-attachments/assets/9d7f88a6-5d59-4c04-8816-ba3f523f16e2" />

#3
<img width="1364" height="765" alt="image" src="https://github.com/user-attachments/assets/1ca557fe-6290-4d48-8a98-037cf9fa6710" />

#4
<img width="1361" height="762" alt="image" src="https://github.com/user-attachments/assets/afb4976a-48ea-4b7d-a1a3-8bef9bbc6690" />

#5
<img width="1357" height="762" alt="image" src="https://github.com/user-attachments/assets/d50d4455-ef22-4d40-997a-0b61e5030b5f" />

#6
<img width="1361" height="763" alt="image" src="https://github.com/user-attachments/assets/f8f0e676-7867-4b3b-8f55-8bd19fcf8b0a" />

#7
<img width="1361" height="762" alt="image" src="https://github.com/user-attachments/assets/e58c9485-231a-4d9e-a59c-e9edbed57828" />






