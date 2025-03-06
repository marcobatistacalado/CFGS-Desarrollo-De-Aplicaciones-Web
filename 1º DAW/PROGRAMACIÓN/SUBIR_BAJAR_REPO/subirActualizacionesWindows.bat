@echo off

rem Agregar todos los cambios
git add .

rem Solicitar al usuario el mensaje del commit
set /p mensaje_commit="Introduce el mensaje del commit: "

rem Confirmar los cambios con el mensaje proporcionado por el usuario
git commit -m "%mensaje_commit%"

rem Enviar los cambios al repositorio remoto
git push origin main
