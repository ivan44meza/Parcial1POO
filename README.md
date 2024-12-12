
# Parcial 1

## Explicacion de codigo:

En el codigo existen 3 clases aparte del main, estas son Cliente, Menu y Empleado.

### Cliente

El cliente solamente guarda la informacion del usuario

![clase Cliente](https://github.com/user-attachments/assets/8cdaf06f-26ee-4621-b2f4-3328a0fc32d7)

### Menu

La clase menu, genera objetos del menu, en este caso los platos, que consta de 4 variables: 2 guarniciones, 1 carne y 1 jugo

![clase Menu](https://github.com/user-attachments/assets/566a4c6e-ee7f-4c8d-a33c-83b384041301)

Esta cuenta con un metodo que imprime las variables del objeto

![metodo de la clase Menu](https://github.com/user-attachments/assets/e8464e82-956d-4a92-a0f8-60894c844f45)

### Empleado

![clase Empleado](https://github.com/user-attachments/assets/de7ef5d1-40d2-4a1e-bff7-ff6e524f1602)

Esta clase empleado, tiene puede crear un objeto con el nombre e identificacion del empleado

Esta clase contiene un metodo que le permite crear menus nuevos, no tiene la capacidad de guardar la informacion aun

![metodo de la clase Empleado](https://github.com/user-attachments/assets/1727642c-52cf-4dee-a5cc-e33dc6d79e64)


### Main

![primera parte del main](https://github.com/user-attachments/assets/63809a79-6b60-4783-b678-13182d79fb62)

Esta parte del main creo el Scanner para poder leer lo que ingrese el usuario en consola, tambien creo los 3 platos que van en el menu, que son objetos Menu. Inicio la variable "abierto" para mantener el programa abierto mientras lo usa el usuario, y abro el ciclo while, que es donde se contiene el programa

![segunda parte del main](https://github.com/user-attachments/assets/70b76b10-ad63-4912-9df8-70588cc1a0bf)

Primero creo la variable opcion, que va a ser donde se guarda la variable que el usuario escoja la opcion. Debajo de esto esta una verificacion sencilla del usuario, para poder definirlo como Empleado o como Cliente. Tambien esta la verificacion en el if.

![tercera parte del main](https://github.com/user-attachments/assets/1761a395-2aef-4c15-be34-d3ca5b1f48f9)

En esta parte se imprime las opciones que tiene el empleado si se ingresa como empleado, se imprime el menu del programa en consola y pide el dato del usuario, que se parsea a int para que pase a la parte del switch

![cuarta parte del main](https://github.com/user-attachments/assets/be90e715-cd7c-438f-a730-59f1e00b6c85)

Este es el switch que actua segun la opcion del usuario, el primer caso imprime el menu, el segundo le permite entrar a un menu para crear el plato nuevo, el tercero es la opcion de salida y el default es un mensaje en caso que el usuario no ponga una opcion correcta

![quinta parte del main](https://github.com/user-attachments/assets/1aefc6da-e6b6-4a1c-8e6e-952a4e4b01a7)

esta parte tiene las mismas funciones que la tercera parte del main, pero en las opciones de usuario hay una diferencia en la opcion para hacer un pedido

![sexta parte del main](https://github.com/user-attachments/assets/2f05144a-6c56-45b7-9add-2159ce28b9e5)

Este swicth verifica la opcion del usuario, en el caso 1 el usuario puede ver el menu disponible, en el caso dos deberia ir un metodo del cliente para poder hacer un pedido y recibir un recibo, el tercer caso, permite salir de la aplicacion y el caso default envia un mensaje en caso que el clliente ingrese un dato incorrecto.

![Ultima parte del main](https://github.com/user-attachments/assets/cf6359d6-a6c9-4669-815b-17393b129d04)

Esta parte se ejecuta si no se pasan las verificaciones, y tambien da la opcion de volver a intentar verificarse o salir de la aplicacion

## Funcionalidad

### Pantalla de bienvenida

![bienvenida](https://github.com/user-attachments/assets/261d9e43-34a2-469f-a7f7-364238e2fcf2)

### Error de usuario

![error](https://github.com/user-attachments/assets/32bac6be-7b78-4e02-8c2f-ed5a5418a32d)

### Opciones ingresando con el usuario empleado

![opciones empleado](https://github.com/user-attachments/assets/7955fbe9-1751-42ba-b0cb-561edfc005ae)

### Creacion nuevo menu

![nuevo menu](https://github.com/user-attachments/assets/3357ae38-4115-47f7-970b-c40fc4218a9a)

### Opciones ingresando como usuario cliente

![opciones cliente](https://github.com/user-attachments/assets/7acc6b5e-3096-4c08-8897-93c4618e3860)

### Visualizacion del menu

![Visualizacion del menu](https://github.com/user-attachments/assets/6a8dc4a1-0197-4b70-8daf-d2b9a4ef518a)

