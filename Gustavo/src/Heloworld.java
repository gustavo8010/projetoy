import javax.swing.JOptionPane;

public class Heloworld{
    
    public static void main( String[] args){
        
        String FistNumber =
            JOptionPane.showInputDialog(null,"Enter first integer",JOptionPane.INFORMATION_MESSAGE);
        
        String secondNumber =
            JOptionPane.showInputDialog(null,"Enter second integer",JOptionPane.INFORMATION_MESSAGE);
        
        int number1 = Integer.parseInt(FistNumber);
        int number2 = Integer.parseInt(secondNumber);
        
        int sum = number1 + number2;
        
        JOptionPane.showMessageDialog(null,"The sum is "+sum,"sum of teo Integers",JOptionPane.INFORMATION_MESSAGE);
    }
}

        
