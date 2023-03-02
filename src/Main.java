import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Parellelelipiped parallelelipiped  = new Parellelelipiped();
        Cylinder cylinde = new Cylinder();
        while (true) {
            System.out.println("""
                    Salam! choose your next function

                    find parallelepiped square - input square
                    find parallelepiped volume - input volume
                    find cylinde square - input square2
                    find cylinde volume - input volume2""");

            String function = scanner.next();
            switch (function) {
                case "square":
                    try {
                        System.out.println("Input height");
                        parallelelipiped.setHeight(scanner.nextDouble());
                        System.out.println("Input length");
                        parallelelipiped.setLength(scanner.nextDouble());
                        System.out.println("Input width");
                        parallelelipiped.setWidth(scanner.nextDouble());
                        if (parallelelipiped.getHeight() < 0 || parallelelipiped.getLength() < 0 || parallelelipiped.getWidth() < 0) {
                            throw new RuntimeException(" number can't be smallest 0");
                        }
                        System.out.println(parallelelipiped.findSquare(parallelelipiped.getHeight(), parallelelipiped
                                .getLength(), parallelelipiped.getWidth()));
                    } catch (ArithmeticException e) {
                        System.out.println("number can't be deleted to zero");
                    } catch (InputMismatchException e) {
                        System.out.println("number can't be word");
                    }
                    break;
                case "volume":
                    try {
                        System.out.println("Input height");
                        parallelelipiped.setHeight(scanner.nextDouble());
                        System.out.println("Input length");
                        parallelelipiped.setLength(scanner.nextDouble());
                        if (parallelelipiped.getHeight() < 0 || parallelelipiped.getLength() < 0) {
                            throw new RuntimeException(" number can't be smallest 0");
                        }
                        System.out.println(parallelelipiped.findVolume(parallelelipiped.getHeight(), parallelelipiped
                                .getLength()));
                    } catch (ArithmeticException e) {
                        System.out.println("number can't be deleted to zero");
                    } catch (InputMismatchException e) {
                        System.out.println("number can't be word");
                    }
                    break;
                case "square2":
                    try{
                        System.out.println("Input radius");
                        cylinde.setRadios(scanner.nextDouble());
                        System.out.println("Input height");
                        cylinde.setHeight(scanner.nextDouble());
                        if(cylinde.getHeight()<0||cylinde.getRadios()<0){
                            throw  new RuntimeException("nimber can't be smallesy zero");
                        }
                        System.out.println(cylinde.findSquare(cylinde.getHeight(),
                                cylinde.getRadios()));
                    } catch (ArithmeticException e){
                        System.out.println("Number can't be deleted to zero");
                    } catch (InputMismatchException e){
                        System.out.println("Number can't be word");
                    }
                    break;
                case "volume2":
                    try{
                        System.out.println("Input radius");
                        cylinde.setRadios(scanner.nextDouble());
                        System.out.println("Input height");
                        cylinde.setHeight(scanner.nextDouble());
                        if(cylinde.getHeight()<0||cylinde.getRadios()<0){
                            throw  new RuntimeException("nimber can't be smallesy zero");
                        }
                        System.out.println(cylinde.findVolume(cylinde.getHeight(),
                                cylinde.getRadios()));
                    } catch (ArithmeticException e){
                        System.out.println("Number can't be deleted to zero");
                    } catch (InputMismatchException e){
                        System.out.println("Number can't be word");
                    }
            }
        }
    }
}





         
