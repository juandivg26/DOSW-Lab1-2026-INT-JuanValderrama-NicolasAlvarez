# 01 ¿Cuál es la diferencia entre git merge y git rebase?
##Primero vamos hablar de la funcion de cada uno el git merge fusiona cualquier cambio que se haya hecho en la base de código en una rama separada de la rama actual como un nuevo commit mientras que realizar un rebase a una rama en Git es una forma de mover la totalidad de una rama a otro punto del árbol. Ya hablando de diferencia la mas relevante es que cada vez que se ejecuta git merge, se crea un merge commit extra por el otro lado git rebase altera el historial de commits, es decir toca tener cuidado porque sii el rebase se hace en el repositorio remoto, entonces puede crear problemas con otros desarrolladores si ellos intentan sacar los últimos cambios de código del repositorio remoto es decir es recomendable usarlo en un repositorio local.
# 02 Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge?
##Si hay modificaciones dispares en una misma linea de un mismo archivo en las dos ramas distintas que pretendes fusionar, Git no será capaz de fusionarlas directamente. Y lo que sucede es que Git no crea automáticamente una nueva fusión confirmada, sino que hace una pausa en el proceso, esperando a que uno resuelva manualmente el conflicto.
# 03 ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?
##
# 04 Explica la diferencia entre un commit y un push.
##La diferencia entre estos dos es que el commit 
# 05 ¿Para qué sirven git stash y git stash pop?
##
# 06 ¿Qué diferencia hay entre HashMap y HashTable?
#3
# 07 ¿Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?
##
# 08 Si usas List con objetos y aplicas stream().map(), ¿qué tipo de operación estás haciendo?
##
# 09 ¿Qué hace stream().filter() y qué retorna?
##
# 10 Describe el paso a paso para crear una rama desde develop para una funcionalidad nueva.
##
# 11 ¿Cuál es la diferencia entre git branch y git checkout -b?
##
# 12 ¿Por qué se recomienda usar ramas feature/ en lugar de trabajar directamente en main?
