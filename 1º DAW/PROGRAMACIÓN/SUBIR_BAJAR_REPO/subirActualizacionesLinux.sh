#!/bin/bash

# Asegúrate de estar en el directorio de tu repositorio Git
cd /home/inf1/eclipse-workspace/Java_Begona

# Agrega todos los cambios al área de preparación (staging)
git add .

# Realiza un commit con un mensaje proporcionado por el usuario
echo "Introduce el mensaje del commit:"
read commit_message
git commit -m "$commit_message"

# Realiza el push de los cambios al repositorio remoto en GitHub
git push origin main
