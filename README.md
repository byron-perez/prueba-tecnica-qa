# INSTRUCCIONES DE EJECUCIÓN - PRUEBA TÉCNICA E2E

## Pre-requisitos
- Java 17 o superior instalado.
- Navegador Firefox.

Se describen los pasos necesarios para ejecutar tanto Ejercicio 1 como Ejercicio 2.

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

Los resultados de este ejercicio se documentan en `conclusiones.txt`
