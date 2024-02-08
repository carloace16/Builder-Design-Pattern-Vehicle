import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderBuilder {
    public OrderedCars orderedCars() throws IOException{
        OrderedCars oc = new OrderedCars();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" Enter your choice of Car ");
        System.out.println("===========================");
        System.out.println("          1. Toyota        ");
        System.out.println("          2. Tesla         ");
        System.out.println("          3. Exit          ");
        System.out.println("===========================");

        int toyotaOrTesla = Integer.parseInt(br.readLine());
        switch(toyotaOrTesla){
            case 1:
            {
                System.out.println("You ordered Toyota");
                System.out.println("\n\n");
                System.out.println(" Enter which type of Toyota  ");
                System.out.println("-----------------------------");
                System.out.println("    1. Toyota Highlander     ");
                System.out.println("    2. Toyota Corolla        ");
                System.out.println("    3. Exit                  ");
                System.out.println("-----------------------------");
                int toyotaBrandChoice = Integer.parseInt(br.readLine());
                switch(toyotaBrandChoice){
                    case 1:
                    {
                        System.out.println("You ordered Toyota Highlander");
                        System.out.println(" Enter which trim of Toyota Highlander  ");
                        System.out.println("-----------------------------");
                        System.out.println("    1. Toyota Highlander SE     ");
                        System.out.println("    2. Toyota Highlander XSE     ");
                        System.out.println("-----------------------------");
                        int toyotaTrimHighlander = Integer.parseInt(br.readLine());
                        switch(toyotaTrimHighlander){
                            case 1:
                                oc.addCar(new ToyotaHighlanderSE());
                                break;
                            case 2:
                                oc.addCar(new ToyotaHighlanderXSE());
                                break;
                        }

                    } break;
                    case 2:
                    {
                        System.out.println("You ordered Toyota Corolla");
                        System.out.println(" Enter which trim of Toyota Corolla  ");
                        System.out.println("-----------------------------");
                        System.out.println("    1. Toyota Corolla SE     ");
                        System.out.println("    2. Toyota Corolla XSE     ");
                        System.out.println("-----------------------------");
                        int toyotaTrimCorolla = Integer.parseInt(br.readLine());
                        switch (toyotaTrimCorolla){
                            case 1:
                                oc.addCar(new ToyotaCorollaSE());
                                break;
                            case 2:
                                oc.addCar(new ToyotaCorollaXSE());
                                break;
                        }
                    }
                    break;
                    case 3:
                    {
                        break;
                    }
                }
            } break;
            case 2:{
                System.out.println("You ordered Tesla");
                System.out.println("\n\n");
                System.out.println(" Enter which type of Tesla  ");
                System.out.println("-----------------------------");
                System.out.println("    1. Tesla Model Y        ");
                System.out.println("    2. Tesla Model 3         ");
                System.out.println("    3. Exit                  ");
                System.out.println("-----------------------------");
                int teslaBrandChoice = Integer.parseInt(br.readLine());
                switch (teslaBrandChoice){
                    case 1:{
                        System.out.println("You ordered Tesla Model Y");
                        System.out.println(" Enter which trim of Tesla Model Y  ");
                        System.out.println("-----------------------------");
                        System.out.println("    1. Tesla Model Y Long Range    ");
                        System.out.println("    2. Tesla Model Y Performance    ");
                        System.out.println("-----------------------------");
                        int teslaTrimModelY = Integer.parseInt(br.readLine());
                        switch (teslaTrimModelY){
                            case 1:
                                oc.addCar(new TeslaModelYLongRange());
                                break;
                            case 2:
                                oc.addCar(new TeslaModelYPerformance());
                                break;
                        }
                    }
                    break;
                    case 2:{
                        System.out.println("You ordered Tesla Model 3");
                        System.out.println(" Enter which trim of Tesla Model 3  ");
                        System.out.println("-----------------------------");
                        System.out.println("    1. Tesla Model 3 Long Range    ");
                        System.out.println("    2. Tesla Model 3 Performance    ");
                        System.out.println("-----------------------------");
                        int teslaTrimModel3 = Integer.parseInt(br.readLine());
                        switch (teslaTrimModel3){
                            case 1:
                                oc.addCar(new TeslaModel3LongRange());
                                break;
                            case 2:
                                oc.addCar(new TeslaModel3Performance());
                                break;
                        }
                    }
                    case 3: {
                        break;
                    }
                    default:{
                        break;
                    }
                }
            }
        }
        return oc;
    }
}
