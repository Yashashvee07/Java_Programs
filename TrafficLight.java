public class TrafficLight {
    public static void main(String[] args) {
        int cycle = 5;  
        int currentState = 1;
        
        for (int i = 1; i <=cycle; i++) {
            for (int j = 1; j <= 3; j++) {
                switch (currentState) {
                    case 1:
                        System.out.println("Red Light");
                        sleep(5);
                        currentState = 2;
                        break;
                    case 2:
                        System.out.println("Yellow Light");
                        sleep(2);
                        currentState = 3;
                        break;
                    case 3:
                        System.out.println("Green Light");
                        sleep(5);
                        currentState = 1;
                        break;
                }
            }
        }
    }

    static void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
