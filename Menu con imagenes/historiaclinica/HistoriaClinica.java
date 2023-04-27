public package historiaclinica;

import javax.swing.JOptionPane;

/**
 *
 * @author Tadeo
 */
public class HistoriaClinica {
    private String Paciente;
    private String Medico;
    private String HistorialClinico;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //menu historia clinica
        int opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "Historial Clinico\n\n 1.Gestionar Pacientes\n 2.Gestionar Medicos\n 3.Gestionar Historial Clinico\n 4.Salir"));

        switch (opcion){
            case 1:
                JOptionPane.showInputDialog(null, "Gestionar Pacientes");
                break;
            case 2:
                JOptionPane.showInputDialog(null, "Gestionar Medicos");
                break;
            case 3:
                JOptionPane.showInputDialog(null, "Gestionar Historial Clinico");
                break;
            case 4:
                JOptionPane.showInputDialog(null, "Salir");
                break;
            default:
                JOptionPane.showInputDialog(null, "Opcion Incorrecta");
                break;

        }
int paciente=Integer.parseInt(JOptionPane.showInputDialog(null, "Gestionar Pacientes\n\n 1.Registrar Pacientes\n 2.Mostrar Pacientes\n 3.Modificar Pacientes\n 4.Eliminar Pacientes\n 5.Atras"));
switch (paciente){
            case 1:
                JOptionPane.showInputDialog(null, "Registrar Pacientes");
                break;
            case 2:
                JOptionPane.showInputDialog(null, "Mostrar Pacientes");
                break;
            case 3:
                JOptionPane.showInputDialog(null, "Modificar Pacientes");
                break;
            case 4:
                JOptionPane.showInputDialog(null, "Eliminar Pacientes");
                break;
            case 5:
                JOptionPane.showInputDialog(null, "Atras");
                break;
            default:
                JOptionPane.showInputDialog(null, "Opcion Incorrecta");
    }
    int medico=Integer.parseInt(JOptionPane.showInputDialog(null, "Gestionar Medicos\n\n 1.Registrar Medico\n 2.Mostrar Medico\n 3.Modificar Medico\n 4.Eliminar Medico\n 5.Atras"));
        switch (medico){
            case 1:
                JOptionPane.showInputDialog(null, "Registrar Medico");
                break;
            case 2:
                JOptionPane.showInputDialog(null, "Mostrar Medico");
                break;
            case 3:
                JOptionPane.showInputDialog(null, "Modificar Medico");
                break;
            case 4:
                JOptionPane.showInputDialog(null, "Eliminar Medico");
                break;
            case 5:
                JOptionPane.showInputDialog(null, "Atras");
                break;
            default:
                JOptionPane.showInputDialog(null, "Opcion Incorrecta");
    }
        int historialclinico=Integer.parseInt(JOptionPane.showInputDialog(null, "Gestionar Historial Clinico\n\n 1.Registrar Historial Clinico\n 2.Mostrar Historial Clinico\n 3.Modificar Historial Clinico\n 4.Eliminar Historial Clinico\n 5.Atras"));
        switch (historialclinico){
            case 1:
                JOptionPane.showInputDialog(null, "Registrar Historial Clinico");
                break;
            case 2:
                JOptionPane.showInputDialog(null, "Mostrar Historial Clinico");
                break;
            case 3:
                JOptionPane.showInputDialog(null, "Modificar Historial Clinico");
                break;
            case 4:
                JOptionPane.showInputDialog(null, "Eliminar Historial Clinico");
                break;
            case 5:
                JOptionPane.showInputDialog(null, "Atras");
                break;
            default:
                JOptionPane.showInputDialog(null, "Opcion Incorrecta");
    }

 }       
    {
    
}
}