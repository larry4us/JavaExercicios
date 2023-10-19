import java.util.Scanner;

public class RotaOrtodromica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        double lat1 = scanner.nextDouble();
        
        double lon1 = scanner.nextDouble();

        double lat2 = scanner.nextDouble();
        
        double lon2 = scanner.nextDouble();

        double lat1Rad = Math.toRadians(lat1);
        double lon1Rad = Math.toRadians(lon1);
        double lat2Rad = Math.toRadians(lat2);
        double lon2Rad = Math.toRadians(lon2);

        double raioTerra = 6371.0;

        double distancia = raioTerra * Math.acos(Math.sin(lat1Rad) * Math.sin(lat2Rad)
                + Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.cos(lon2Rad - lon1Rad));

        System.out.printf("A distancia entre os pontos (%.6f, %.6f) e (%.6f, %.6f) e de %.2f km%n",
                lat1, lon1, lat2, lon2, distancia);

        scanner.close();
    }
}
