import javax.swing.*;

public class Autenticador {
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Nome do usuário: ");
        String password = JOptionPane.showInputDialog("Senha: ");
        if (username != null && password != null
                && ((username.equals("jesus") &&
                password.equals("cristo") ||
                (username.equals("chico") &&
                        password.equals("xavier"))
        )
        )
        ) {
            JOptionPane.showMessageDialog(null, "Você está conectado!");
        } else {
            JOptionPane.showMessageDialog(null, "Você não está conectado!");
        }
    }
}
