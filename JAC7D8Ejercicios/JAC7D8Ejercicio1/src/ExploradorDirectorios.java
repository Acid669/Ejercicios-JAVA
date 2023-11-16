
public class ExploradorDirectorios {
        public static void main(String[] args) {

            // Crear directorios
            Directorio principal = new Directorio("Principal");
            Directorio sub1 = new Directorio( "Subdirectorio1");
            Directorio sub2 = new Directorio( "Subdirectorio2");
            Directorio sub3 = new Directorio( "Subdirectorio3");

            // Agregar subdirectorios al directorio principal
            principal.agregarSubdirectorio(sub1);
            principal.agregarSubdirectorio(sub2);
            principal.agregarSubdirectorio(sub3);

            // Agregar archivos a los subdirectorios
            sub1.agregarArchivo("Archivo1.txt");
            sub2.agregarArchivo("Archivo2.txt");
            sub3.agregarArchivo("Archivo3.txt");

            // Imprimir la estructura del directorio
            System.out.println("----EXPLORADOR DE ARCHIVOS----");
            Directorio.explorarDirectorio(principal);
        }
    }

