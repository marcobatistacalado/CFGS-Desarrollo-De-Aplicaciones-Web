# models.py
from django.db import models  # Importamos el módulo de modelos de Django

# Modelo que representa un equipo en la base de datos
class Equipo(models.Model):
    nombre_completo = models.CharField(max_length=100)  # Nombre completo del equipo (Ej: "FC Barcelona")
    identificador = models.CharField(max_length=20, unique=True)  # Código único para identificar al equipo (Ej: "BAR123")
    puntos = models.IntegerField(default=0)  # Puntos del equipo en la competición (valor por defecto: 0)

    def __str__(self):
        return self.nombre_completo  # Devuelve el nombre del equipo cuando se imprime el objeto

# Modelo que representa un partido entre dos equipos
class Partido(models.Model):
    # Clave foránea que referencia al equipo que juega como local
    equipo_casa = models.ForeignKey(
        Equipo,  # Se relaciona con el modelo Equipo
        related_name='partidos_casa',  # Nombre para acceder a los partidos donde el equipo es local
        on_delete=models.CASCADE  # Si se elimina el equipo, también se eliminarán sus partidos
    )
    goles_casa = models.IntegerField()  # Goles anotados por el equipo local

    # Clave foránea que referencia al equipo que juega como visitante
    equipo_visita = models.ForeignKey(
        Equipo,  # Se relaciona con el modelo Equipo
        related_name='partidos_visita',  # Nombre para acceder a los partidos donde el equipo es visitante
        on_delete=models.CASCADE  # Si se elimina el equipo, también se eliminarán sus partidos
    )
    goles_visita = models.IntegerField()  # Goles anotados por el equipo visitante

    def __str__(self):
        # Devuelve una representación en string del partido (Ej: "FC Barcelona vs Real Madrid")
        return f"{self.equipo_casa.nombre_completo} vs {self.equipo_visita.nombre_completo}"
