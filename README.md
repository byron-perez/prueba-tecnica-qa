# INSTRUCCIONES DE EJECUCIÓN - PRUEBA TÉCNICA E2E - PRUEBA DE RECOPILACIÓN DE INPUT-OUTPUT APIs REST

## Requisitos y Configuración del Entorno

### Requisitos Generales

- **JDK (Java Development Kit)**: Versión 16, 17 o superior. Debe estar configurado en la variable de entorno `JAVA_HOME`.
- **Navegador Web**: Firefox (requerido para la ejecución de pruebas E2E con WebDriver).

## Instalación y Configuración del Entorno

### 1. Clonar el Repositorio
Clona este repositorio en tu máquina local e ingresa al directorio:
```bash
git clone git@github.com:byron-perez/prueba-tecnica-qa.git
cd prueba-tecnica-qa
```

### 2. Configuración en Linux
No es requerida la instalación global de Maven o Gradle. El proyecto provee sus propios wrappers de ejecución (`mvnw` y `gradlew`).

- **Permisos:** Es imperativo otorgar permisos de ejecución a los scripts wrappers antes de ejecutarlos:
  ```bash
  chmod +x mvnw gradlew
  ```

### 3. Descargar Dependencias
Maven descargará automáticamente las dependencias la primera vez que se ejecuten las pruebas. Sin embargo, puedes forzar la descarga e instalación inicial de todas las dependencias (Serenity BDD, JUnit, etc.) ejecutando:
```bash
./mvnw clean install -DskipTests
```

---

Se describen a continuación los pasos necesarios para ejecutar tanto el Ejercicio 1 como el Ejercicio 2.

## Ejercicio 1

### Pasos para ejecutar la prueba:

1. Abrir una terminal y navegar al directorio raíz del proyecto.

2. Ejecutar las pruebas utilizando Maven (recomendado debido a la configuración actual del proyecto):

   ```
   ./mvnw clean verify -Dit.test=WhenPurchasingProductsTest
   ```

3. Generación del reporte detallado:
   - El reporte se encuentra en la carpeta: `target/site/serenity/`
   - Abra el archivo `index.html` en cualquier navegador web para visualizar los resultados.

## Ejercicio 2

1. Abrir una terminal y navegar al directorio raíz del proyecto.

2. Ejecutar las pruebas utilizando Maven (recomendado debido a la configuración actual del proyecto):

   ```
   ./mvnw clean verify -Dit.test=WhenTestingAuthApiTest
   ```

3. Generación del reporte detallado:
   - El reporte se encuentra en la carpeta: `target/site/serenity/`
   - Abra el archivo `index.html` en cualquier navegador web para visualizar los resultados.

## Resultados

Los resultados de este ejercicio se documentan en los siguientes archivos:
- [conclusiones.md](./conclusiones.md) (Formato enriquecido)
- [conclusiones.txt](./conclusiones.txt) (Texto plano)
