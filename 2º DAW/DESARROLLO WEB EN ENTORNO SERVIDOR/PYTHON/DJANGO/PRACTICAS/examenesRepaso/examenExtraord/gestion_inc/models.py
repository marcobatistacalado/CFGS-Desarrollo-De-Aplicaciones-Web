from django.db import models  # Importamos el módulo de modelos de Django

# Modelo que representa un laboratorio
class Laboratorio(models.Model):
    nombre_lab = models.CharField(max_length=10, primary_key=True)  # Nombre único del laboratorio (clave primaria)
    num_ordenadores = models.IntegerField()  # Número de ordenadores en el laboratorio
    email_tecnico = models.EmailField(max_length=50)  # Correo del técnico responsable del laboratorio

# Modelo que representa a un profesor
class Profesor(models.Model):
    nombre_completo = models.CharField(max_length=50)  # Nombre completo del profesor
    email = models.EmailField(max_length=50, primary_key=True)  # Email del profesor (clave primaria)
    password = models.CharField(max_length=50)  # Contraseña del profesor (almacenada como texto, mejor usar hash)

    # Relación con Laboratorio: Un profesor puede estar asignado a un laboratorio
    laboratorio = models.ForeignKey(
        Laboratorio,  # Se relaciona con el modelo Laboratorio
        on_delete=models.SET_NULL,  # Si el laboratorio se borra, el campo laboratorio del profesor se pone en NULL
        null=True,  # Permite que el campo tenga valores NULL en la base de datos
        blank=True  # Permite que el campo se deje en blanco en los formularios de Django
    )

# Modelo que representa una incidencia en un laboratorio
class Incidencia(models.Model):
    numero = models.AutoField(primary_key=True)  # Número de incidencia (autoincremental, clave primaria)
    fecha = models.DateTimeField(auto_now_add=True)  # Fecha y hora en que se crea la incidencia (se genera automáticamente)
    
    # Relación con Laboratorio: Una incidencia ocurre en un laboratorio específico
    laboratorio = models.ForeignKey(
        Laboratorio,
        on_delete=models.CASCADE  # Si el laboratorio se elimina, también se eliminan todas sus incidencias
    )
    
    numero_ordenador = models.CharField(max_length=10)  # Número del ordenador donde ocurrió la incidencia
    descripcion = models.TextField()  # Descripción detallada de la incidencia
    
    # Relación con Profesor: La incidencia es reportada por un profesor
    profesor = models.ForeignKey(
        Profesor,
        on_delete=models.CASCADE  # Si el profesor se elimina, también se eliminan todas sus incidencias
    )
    
    resuelta = models.BooleanField(default=False)  # Indica si la incidencia ha sido resuelta (valor por defecto: False)

# Modelo que representa la resolución de una incidencia
class Resolucion(models.Model):
    # Relación Uno a Uno con Incidencia: Cada incidencia tiene una sola resolución
    incidencia = models.OneToOneField(
        Incidencia,
        on_delete=models.CASCADE  # Si la incidencia se borra, también se borra su resolución
    )
    
    # Relación con Profesor: Profesor que resolvió la incidencia
    profesor = models.ForeignKey(
        Profesor,
        on_delete=models.CASCADE  # Si el profesor se elimina, también se eliminan las resoluciones que hizo
    )
    
    fecha_resolucion = models.DateTimeField(auto_now_add=True)  # Fecha y hora de la resolución (se genera automáticamente)
    descripcion = models.TextField()  # Explicación de cómo se resolvió la incidencia
