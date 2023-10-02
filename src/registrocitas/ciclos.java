package registrocitas;

public class ciclos {//debe coincidir la clase con el nombre del documento

	public static void main(String[] args) {//todo dentro del metodo main

		//Recuerda que para que algo se ejecute, siempre debe ir dentro del metodo principal

		
		// Primero defino una variable del tipo String donde se almacena el dato
        String citaProgramada = null; //variar este dato, dejarlo en null y despues poner una fecha "23-09-2023"
      //Variable este declarada e inicializada, se inicializa de forma null a proposito, para tener un "espacio" de memoria ya asignado, y solo reemplazarlo con un nuevo dato
		

        //Para validar si puedo hacer una cita, verifico que la variable este vacia.
        if (citaProgramada != null) { //que la variable no este vacia
            System.out.println("Ya hay una cita programada, una disculpa."); //porque la variable ya esta ocupada o llena
        } else {
            System.out.println("Puede registrar su cita."); //podemos registrar otra cita
        }
        
		//////////////////////////////////////////////////////////////////
 //Ciclo para verificar si el paciente es menor de edad
        
        //1. Primero pedimos los datos (Mariana 17 anios)
        //2. Almacenar el dato en una variable
        int edadPaciente = 17;
        
        //SI el paciente es menor de edad, no se le puede dar un trataimiento, se le dara una valoracion inicial acompaniado de un adulto, 
        //DE OTRO MODO, el paciente recibe un tratamiento normal
        
        if (edadPaciente < 18){
            System.out.println("Este paciente no puede recibir un tratamiento, se le dara una valoracion inicial acompaniado de un adulto");
        } else {
            System.out.println("El paciente es mayor de edad, se le brinda un tratamiento normal");
        }
        
        
   //////////////////////////////////////////////////////////////////////////////     
        //Validar que la hora de la cita este dentro del horario
        int horaRegistrada = 15;
        
        if (horaRegistrada >=9 && horaRegistrada <=15 || horaRegistrada>16 && horaRegistrada<=18){
            System.out.println("Estas dentro del horario, puedes registrar tu cita");
        } else {
            System.out.println("Fuera del horario, registra la cita de 09 a 18 hrs");
        }
        
        ////////////////////////////////////////////////////////////////////////////////////
        
     // Seleccionamos una opcion y la almacenamos en la variable opcion
     		int opcion = 1;

     		// Creamos nuestro menu
     		System.out.println("Menu del Consultorio Dental");
     		System.out.println("1. Programar una cita");
     		System.out.println("2. Verificar cita programada");
     		System.out.println("3. Registrar tratamiento");
     		System.out.println("4. Salir");
     		System.out.print("Seleccione una opción (1-4): ");

     		switch (opcion) {
     		case 1:
     			System.out.println("Ha seleccionado programar una cita.");
     			// Agrega aquí la lógica para programar una cita
     			break;
     		case 2:
     			System.out.println("Ha seleccionado verificar cita programada.");
     			// Agrega aquí la lógica para verificar una cita programada
     			break;
     		case 3:
     			System.out.println("Ha seleccionado registrar tratamiento.");
     			// Agrega aquí la lógica para registrar un tratamiento
     			break;
     		case 4:
     			System.out.println("Saliendo del programa.");
     			break;
     		default:
     			System.out.println("Opción no válida. Por favor, seleccione una opción válida (1-4).");
     			break;
     		}
        
	}//clase

}//metodo

 