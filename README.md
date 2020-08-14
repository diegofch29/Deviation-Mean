# Deviation-Mean
En esta mini aplicación se usan listas encadenadas (diseño propio) para calcular el valor del promedio y la desvición en un conjunto de numero reales.

## Prerequisitos

Para usar la aplicación necesitara lo siguiente:

*maven
*jdk

## Descargando y ejecutando
### Descarga
Para descargar la aplicación solo tiene que usar la siguiente linea.

```
git clone https://github.com/diegofch29/Deviation-Mean
```
### Utilizado la aplicación
  Para usar la aplicación debe seguir los siguientes pasos
  *Compilar el codigo debe estar ubicado en la carpeta "/Deviation-Mean/deviation" y el siguiente comando.
  ```
  mvn compile
  ```
  *Para ejecutar el codigo utilice la siguiente linea, puede cambiar los numero como desee siempre y cuando los numeros esten separados por espacios.
  ```
  mvn exec:java -Dexec.mainClass="edu.escuelaing.arem.App"  -Dexec.args="160 591 114 229 230 270 128 1657 624 1503"
  ```
  ![Ejemplo](/imagenes/Ejemplo_Ejecucion.png)
  ##pruebas
  Para correr las pruebas use la siguiente linea y deberia ver como resulta algo parecido a la imagen.
  ```
  mvn test
  ```
  ![Pruebas](/imagenes/Pruebas.png)
  
  
