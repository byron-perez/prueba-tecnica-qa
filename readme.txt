======================================================
INSTRUCCIONES DE EJECUCIÓN - PRUEBA TÉCNICA E2E
======================================================

Pre-requisitos:
- Java 17 o superior instalado.
- Navegador Firefox.

Se describen los pasos necesarios para ejecutar tanto Ejercicio 1 como Ejercicio 2.
Las pruebas que realicé las hice en Linux. Sin embargo dejo los comandos para Windows en caso
que sea de utilidad.

Ejercicio 1:

Pasos para ejecutar la prueba:

1. Abrir una terminal y navegar al directorio raíz del proyecto.

2. Ejecutar las pruebas utilizando Maven (recomendado debido a la configuración actual del proyecto):
   
   - En Linux:
     ./mvnw clean verify -Dit.test=WhenPurchasingProductsTest
   
   - En Windows:
     mvnw.cmd clean verify -Dit.test=WhenPurchasingProductsTest

3. Generación del reporte detallado:
   - Navegue a la carpeta: target/site/serenity/
   - Abra el archivo "index.html" en cualquier navegador web para visualizar los resultados.
