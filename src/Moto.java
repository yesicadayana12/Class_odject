import javax.swing.*;

public class Moto {

    String color;


    String marca;
    int velocidad_mx;


    public static  void main(String []  args) {
      Moto moto1 =  new Moto();

      moto1.color = "Rojo";
      moto1.marca = "Suzuki";
      moto1.velocidad_mx = 154;

        JOptionPane.showMessageDialog(null,"El color de la moto es:) "+ moto1.color);
        JOptionPane.showMessageDialog(null, "La marca de la moto es:)"+ moto1.marca);
        JOptionPane.showMessageDialog(null, " La velocidad maxima de la moto es:)"+ moto1.velocidad_mx);

        Moto moto2 = new Moto();

        moto2.color = "Gris con blanco";
        moto2.marca = " Honda";
        moto2.velocidad_mx = 120;

        JOptionPane.showMessageDialog(null,"El color de la moto es:)"+moto2.color);
        JOptionPane.showMessageDialog(null,"La marca de la moto es:)"+moto2.marca);
        JOptionPane.showMessageDialog(null,"La velocidad maxima de la moto es:)"+moto2.velocidad_mx);

        Moto moto3 = new Moto();

        moto3.color = "Verde";
        moto3.marca = "Kawasaki";
        moto3.velocidad_mx = 350;

        JOptionPane.showMessageDialog(null,"El color de la moto es:)"+moto3.color);
        JOptionPane.showMessageDialog(null,"La marca de la moto es:)"+moto3.marca);
        JOptionPane.showMessageDialog(null,"La velocidad maxima de la moto es:)"+moto3.velocidad_mx);

    }

}
