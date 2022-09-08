package Vista;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
public class InOut {
    
    public static String crearContraseña(String message) {
        JPanel panel = new JPanel();
        JPasswordField contraseña = new JPasswordField();

        contraseña.setEchoChar('*');
        contraseña.setColumns(20);
        panel.setLayout(new BorderLayout());

        panel.add(BorderLayout.NORTH, new JLabel(message));
        panel.add(BorderLayout.CENTER, contraseña);

        int returnVal=JOptionPane.showConfirmDialog(null, panel,"Contraseña", JOptionPane.OK_CANCEL_OPTION);
        
        if (returnVal == JOptionPane.OK_OPTION) {
            return new String(contraseña.getPassword());
        } else {
            return null;
        }
    }
    
    public String pedirString(String m){
        return JOptionPane.showInputDialog(m);
    }
    
    public int pedirEnteros(String m){
        return Integer.parseInt(JOptionPane.showInputDialog(m));
    }
    
    public long pedirLong(String m){
        return Long.parseLong(JOptionPane.showInputDialog(m));
    }
    
    public void mostrarResultados(String m){
        JOptionPane.showMessageDialog(null, m);
    }
    
    public int Confirmar(String m){
        return JOptionPane.showConfirmDialog(null, m,"confirm" , JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    }
}
