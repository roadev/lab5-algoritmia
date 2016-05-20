import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class VotacionPresidencial extends JFrame implements ActionListener{

  int contraseña, VMockus=0, VPardo=0, VFajardo=0, VNoemi=0, VPetro=0, VSantos=0;

  Container contenedor;



  JPanel panelJurados, panelControles, panelCandidatos, panelResultados, panelSuperior;
  JLabel Lpresidente, Lvicepresidente, Lvocal, LpresidenteSuplente, LvicepresidenteSuplente, LvocalSuplente;
  JLabel LtotalVotos, Lporcentaje, LvotosMockus, LvotosPardo, LvotosFajardo, LvotosNoemi, LvotosPetro, LvotosSantos, Lcandidatos;
  JButton BMockus, BPardo, BFajardo, BNoemi, BPetro, BSantos,BinstalarMesa, BmesaVotacion, BactivarSistema, BcerrarSistema;
  JTextField TFpresidente, TFvicepresidente, TFvocal, TFpresidenteSuplente, TFvicepresidenteSuplente, TFvocalSuplente;
  JTextField TFvotosMockus, TFvotosPardo, TFvotosFajardo, TFvotosNoemi, TFvotosPetro, TFvotosSantos;
  JTextField TFporcentajeMockus, TFporcentajePardo, TFporcentajeFajardo, TFporcentajeNoemi, TFporcentajePetro, TFporcentajeSantos;


  //METODO CONSTRUCTOR !
  
  public void votacion (){


    contenedor = getContentPane();
    contenedor.setLayout(new BorderLayout());

    //PANEL (CREACION)

    panelJurados = new JPanel(new GridLayout(3,2));
    panelJurados.setBorder(BorderFactory.createTitledBorder("Jurados de Mesa de Votacion"));
    panelJurados.setVisible(true);

    panelControles = new JPanel(new GridLayout(1,3));
    panelControles.setBorder(BorderFactory.createTitledBorder("Controles"));
    panelControles.setVisible(true);

    panelCandidatos = new JPanel(new GridLayout(2,3));
    panelCandidatos.setBorder(BorderFactory.createTitledBorder("Candidatos"));
    panelCandidatos.setVisible(true);

    panelResultados = new JPanel(new GridLayout(7,2));
    panelResultados.setBorder(BorderFactory.createTitledBorder("Escrutinio Final"));
    panelResultados.setVisible(false);

    panelSuperior = new JPanel(new BorderLayout());
    panelSuperior.setBorder(BorderFactory.createTitledBorder(""));
    panelSuperior.setVisible(true);

    //...




    // BUTTONS (Creacion)



    BinstalarMesa = new JButton("Instalar Mesa");
    BinstalarMesa.addActionListener(this);
    BinstalarMesa.setToolTipText("Instalar Mesa de Votacion");


    BactivarSistema = new JButton("Activar Sistema");
    BactivarSistema.addActionListener(this);
    BactivarSistema.setEnabled(false);
    BactivarSistema.setToolTipText("Activa el Sistema de Votacion");


    BcerrarSistema = new JButton("Cerrar Sistema");
    BcerrarSistema.addActionListener(this);
    BcerrarSistema.setEnabled(false);
    BcerrarSistema.setToolTipText("Cierra el Sistema de Votacion");


    BMockus = new JButton();
    BMockus.addActionListener(this);
    BMockus.setIcon(new ImageIcon("mockus.jpg"));
    BMockus.setToolTipText("Voto Por Antanas Mockus");
    BMockus.setEnabled(false);

    BPardo = new JButton();
    BPardo.addActionListener(this);
    BPardo.setIcon(new ImageIcon("pardo.jpg"));
    BPardo.setToolTipText("Voto Por Rafael Pardo");
    BPardo.setEnabled(false);

    BFajardo = new JButton();
    BFajardo.addActionListener(this);
    BFajardo.setIcon(new ImageIcon("fajardo2.jpg"));
    BFajardo.setToolTipText("Voto Sergio Fajardo");
    BFajardo.setEnabled(false);

    BNoemi = new JButton();
    BNoemi.addActionListener(this);
    BNoemi.setIcon(new ImageIcon("noemi.jpg"));
    BNoemi.setToolTipText("Voto Noemi Sanin");
    BNoemi.setEnabled(false);

    BPetro = new JButton();
    BPetro.addActionListener(this);
    BPetro.setIcon(new ImageIcon("petro.jpeg"));
    BPetro.setToolTipText("Voto Por Gustavo Petro");
    BPetro.setEnabled(false);

    BSantos = new JButton();
    BSantos.addActionListener(this);
    BSantos.setIcon(new ImageIcon("santos2.jpg"));
    BSantos.setToolTipText("Voto Por Juan Manuel Santos");
    BSantos.setEnabled(false);


    //Labels (Creacion)

    Lpresidente = new JLabel("Presidente");
    Lvicepresidente = new JLabel("Vicepresidente");
    Lvocal = new JLabel("Vocal");
    LpresidenteSuplente = new JLabel("Presidente Suplente");
    LvicepresidenteSuplente = new JLabel("Vicepresidente Suplente");
    LvocalSuplente = new JLabel("Vocal Suplente");

    LtotalVotos = new JLabel("Total Votos");
    Lporcentaje = new JLabel("Porcentaje");
    LvotosMockus = new JLabel("Votos Mockus");
    LvotosPardo = new JLabel("Votos Pardo");
    LvotosFajardo = new JLabel("Votos Fajardo");
    LvotosNoemi = new JLabel("Votos Noemi");
    LvotosPetro = new JLabel("Votos Petro");
    LvotosSantos = new JLabel("Votos Santos");

    Lcandidatos = new JLabel("Candidatos:");
    // Text Fields (Creacion)

    TFpresidente = new JTextField(10);
    TFpresidenteSuplente = new JTextField(10);
    TFvicepresidente = new JTextField(10);
    TFvicepresidenteSuplente = new JTextField(10);
    TFvocal = new JTextField(10);
    TFvocalSuplente = new JTextField(10);

    TFvotosMockus = new JTextField(25);
    TFvotosMockus.setEnabled(false);
    TFvotosPardo = new JTextField(25);
    TFvotosPardo.setEnabled(false);
    TFvotosFajardo = new JTextField(25);
    TFvotosFajardo.setEnabled(false);
    TFvotosNoemi = new JTextField(25);
    TFvotosNoemi.setEnabled(false);
    TFvotosPetro = new JTextField(25);
    TFvotosPetro.setEnabled(false);
    TFvotosSantos = new JTextField(25);
    TFvotosSantos.setEnabled(false);

    TFporcentajeMockus = new JTextField(25);
    TFporcentajeMockus.setEnabled(false);
    TFporcentajePardo = new JTextField(25);
    TFporcentajePardo.setEnabled(false);
    TFporcentajeFajardo = new JTextField(25);
    TFporcentajeFajardo.setEnabled(false);
    TFporcentajeNoemi = new JTextField(25);
    TFporcentajeNoemi.setEnabled(false);
    TFporcentajePetro = new JTextField(25);
    TFporcentajePetro.setEnabled(false);
    TFporcentajeSantos = new JTextField(25);
    TFporcentajeSantos.setEnabled(false);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);

  }


  public void organizar (){


    panelJurados.add(Lpresidente);
    panelJurados.add(TFpresidente);
    panelJurados.add(LpresidenteSuplente);
    panelJurados.add(TFpresidenteSuplente);
    panelJurados.add(Lvicepresidente);
    panelJurados.add(TFvicepresidente);
    panelJurados.add(LvicepresidenteSuplente);
    panelJurados.add(TFvicepresidenteSuplente);
    panelJurados.add(Lvocal);
    panelJurados.add(TFvocal);
    panelJurados.add(LvocalSuplente);
    panelJurados.add(TFvocalSuplente);

    panelControles.add(BinstalarMesa);
    panelControles.add(BactivarSistema);
    panelControles.add(BcerrarSistema);

    panelCandidatos.add(BMockus);
    panelCandidatos.add(BPardo);
    panelCandidatos.add(BFajardo);
    panelCandidatos.add(BNoemi);
    panelCandidatos.add(BPetro);
    panelCandidatos.add(BSantos);

    panelResultados.add(Lcandidatos);
    panelResultados.add(LtotalVotos);
    panelResultados.add(Lporcentaje);
    panelResultados.add(LvotosMockus);
    panelResultados.add(TFvotosMockus);
    panelResultados.add(TFporcentajeMockus);
    panelResultados.add(LvotosPardo);
    panelResultados.add(TFvotosPardo);
    panelResultados.add(TFporcentajePardo);
    panelResultados.add(LvotosFajardo);
    panelResultados.add(TFvotosFajardo);
    panelResultados.add(TFporcentajeFajardo);
    panelResultados.add(LvotosNoemi);
    panelResultados.add(TFvotosNoemi);
    panelResultados.add(TFporcentajeNoemi);
    panelResultados.add(LvotosPetro);
    panelResultados.add(TFvotosPetro);
    panelResultados.add(TFporcentajePetro);
    panelResultados.add(LvotosSantos);
    panelResultados.add(TFvotosSantos);
    panelResultados.add(TFporcentajeSantos);

    panelSuperior.add(panelJurados,BorderLayout.NORTH);
    panelSuperior.add(panelControles,BorderLayout.SOUTH);




    //Contenedor (Agregar)

    contenedor.add(panelSuperior,BorderLayout.NORTH);
    contenedor.add(panelCandidatos,BorderLayout.CENTER);
    contenedor.add(panelResultados,BorderLayout.SOUTH);

    this.pack();


  }





  public void actionPerformed(ActionEvent e) {
    if(e.getSource()==BinstalarMesa){
      if(TFpresidente.getText().equals("") || TFpresidenteSuplente.getText().equals("") || TFvicepresidente.getText().equals("") || TFvicepresidenteSuplente.getText().equals("") || TFvocal.getText().equals("") || TFvocalSuplente.getText().equals("")){

        JOptionPane.showMessageDialog(this, "Debe Diligenciar los nombres de todos los Jurados");

      }else{

        int confirmacion1 =  JOptionPane.showConfirmDialog(this,"Esta Seguro de Instalar la Mesa de Votacion?", "Confirmacion", JOptionPane.YES_NO_OPTION);

        if (confirmacion1==JOptionPane.YES_OPTION){
          TFpresidente.setEnabled(false);
          TFpresidenteSuplente.setEnabled(false);
          TFvicepresidente.setEnabled(false);
          TFvicepresidenteSuplente.setEnabled(false);
          TFvocal.setEnabled(false);
          TFvocalSuplente.setEnabled(false);

          BinstalarMesa.setEnabled(false);
          BactivarSistema.setEnabled(true);
          BcerrarSistema.setEnabled(true);


          BinstalarMesa.setText("Mesa de Votacion Instalada");
          BinstalarMesa.setToolTipText("Mesa de Votacion Instalada");



        }

      }

    }

    if(e.getSource()==BactivarSistema){

      contraseña = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite la Clave de Activación"));

      if(contraseña==123){

        BactivarSistema.setEnabled(false);
        BcerrarSistema.setEnabled(false);

        BMockus.setEnabled(true);
        BPardo.setEnabled(true);
        BFajardo.setEnabled(true);
        BNoemi.setEnabled(true);
        BPetro.setEnabled(true);
        BSantos.setEnabled(true);


        BMockus.setRolloverIcon(new ImageIcon("mockus2.jpg"));
        BMockus.setPressedIcon(new ImageIcon("mockus2.jpg"));
        BPardo.setRolloverIcon(new ImageIcon("pardo2.jpg"));
        BPardo.setPressedIcon(new ImageIcon("pardo2.jpg"));
        BFajardo.setRolloverIcon(new ImageIcon("fajardo.jpg"));
        BFajardo.setPressedIcon(new ImageIcon("fajardo.jpg"));
        BNoemi.setRolloverIcon(new ImageIcon("noemi2.jpg"));
        BNoemi.setPressedIcon(new ImageIcon("noemi2.jpg"));
        BPetro.setRolloverIcon(new ImageIcon("petro2.jpeg"));
        BPetro.setPressedIcon(new ImageIcon("petro2.jpeg"));
        BSantos.setRolloverIcon(new ImageIcon("santos.jpg"));
        BSantos.setPressedIcon(new ImageIcon("santos.jpg"));

      }else{

        JOptionPane.showMessageDialog(this, "Clave Erronea, Sistema No Activado","ERROR", JOptionPane.ERROR_MESSAGE);

      }


    }

    if(e.getSource()==BMockus){

      int confirmacion2 = JOptionPane.showConfirmDialog(this,"Está Seguro de Votar por el Candidato Antanas Mockus?","QUESTION", JOptionPane.YES_NO_OPTION);

      if(confirmacion2==JOptionPane.YES_OPTION){

        VMockus += 1;

        JOptionPane.showMessageDialog(this, "Gracias por su Voto");

        BactivarSistema.setEnabled(true);
        BcerrarSistema.setEnabled(true);

        BMockus.setEnabled(false);
        BPardo.setEnabled(false);
        BFajardo.setEnabled(false);
        BNoemi.setEnabled(false);
        BPetro.setEnabled(false);
        BSantos.setEnabled(false);

      }
    }

    if(e.getSource()==BPardo){

      int confirmacion3 = JOptionPane.showConfirmDialog(this,"Está Seguro de Votar por el Candidato Rafael Pardo?","Confirmacion", JOptionPane.YES_NO_OPTION);

      if(confirmacion3==JOptionPane.YES_OPTION){

        VPardo += 1;

        JOptionPane.showMessageDialog(this, "Gracias por su Voto");

        BactivarSistema.setEnabled(true);
        BcerrarSistema.setEnabled(true);

        BMockus.setEnabled(false);
        BPardo.setEnabled(false);
        BFajardo.setEnabled(false);
        BNoemi.setEnabled(false);
        BPetro.setEnabled(false);
        BSantos.setEnabled(false);

      }
    }

    if(e.getSource()==BFajardo){

      int confirmacion4 = JOptionPane.showConfirmDialog(this,"Está Seguro de Votar por el Candidato Sergio Fajardo?","Confirmacion", JOptionPane.YES_NO_OPTION);

      if(confirmacion4==JOptionPane.YES_OPTION){

        VFajardo += 1;

        JOptionPane.showMessageDialog(this, "Gracias por su Voto");

        BactivarSistema.setEnabled(true);
        BcerrarSistema.setEnabled(true);

        BMockus.setEnabled(false);
        BPardo.setEnabled(false);
        BFajardo.setEnabled(false);
        BNoemi.setEnabled(false);
        BPetro.setEnabled(false);
        BSantos.setEnabled(false);

      }
    }

    if(e.getSource()==BNoemi){

      int confirmacion5 = JOptionPane.showConfirmDialog(this,"Está Seguro de Votar por la Candidata Noemi Sanin?","Confirmacion", JOptionPane.YES_NO_OPTION);

      if(confirmacion5==JOptionPane.YES_OPTION){

        VNoemi += 1;

        JOptionPane.showMessageDialog(this, "Gracias por su Voto");

        BactivarSistema.setEnabled(true);
        BcerrarSistema.setEnabled(true);

        BMockus.setEnabled(false);
        BPardo.setEnabled(false);
        BFajardo.setEnabled(false);
        BNoemi.setEnabled(false);
        BPetro.setEnabled(false);
        BSantos.setEnabled(false);

      }
    }

    if(e.getSource()==BPetro){

      int confirmacion6 = JOptionPane.showConfirmDialog(this,"Está Seguro de Votar por el Candidato Gustavo Petro?","Confirmacion", JOptionPane.YES_NO_OPTION);

      if(confirmacion6==JOptionPane.YES_OPTION){

        VPetro += 1;

        JOptionPane.showMessageDialog(this, "Gracias por su Voto");

        BactivarSistema.setEnabled(true);
        BcerrarSistema.setEnabled(true);

        BMockus.setEnabled(false);
        BPardo.setEnabled(false);
        BFajardo.setEnabled(false);
        BNoemi.setEnabled(false);
        BPetro.setEnabled(false);
        BSantos.setEnabled(false);

      }
    }

    if(e.getSource()==BSantos){

      int confirmacion7 = JOptionPane.showConfirmDialog(this,"Está Seguro de Votar por el Candidato Juan Manuel Santos?","Confirmacion", JOptionPane.YES_NO_OPTION);

      if(confirmacion7==JOptionPane.YES_OPTION){

        VSantos += 1;

        JOptionPane.showMessageDialog(this, "Gracias por su Voto");

        BactivarSistema.setEnabled(true);
        BcerrarSistema.setEnabled(true);

        BMockus.setEnabled(false);
        BPardo.setEnabled(false);
        BFajardo.setEnabled(false);
        BNoemi.setEnabled(false);
        BPetro.setEnabled(false);
        BSantos.setEnabled(false);

      }
    }

    if(e.getSource()==BcerrarSistema){

      int confirmacionfinal = JOptionPane.showConfirmDialog(this, "Esta Seguro de Cerrar el Sistema de Votacion?", "CONFIRMACION",JOptionPane.YES_NO_OPTION);

      if(confirmacionfinal==JOptionPane.YES_OPTION){

        BactivarSistema.setEnabled(false);
        BcerrarSistema.setEnabled(false);

        double totalVotos = VMockus+VPardo+VFajardo+VNoemi+VPetro+VSantos;

        double	porcentajeMockus = ((double)VMockus / (double) totalVotos) * 100;
        double	porcentajePardo = ((double)VPardo / (double) totalVotos) * 100;
        double	porcentajeFajardo = ((double)VFajardo / (double) totalVotos) * 100;
        double	porcentajeNoemi = ((double)VNoemi / (double) totalVotos) * 100;
        double	porcentajePetro = ((double)VPetro / (double) totalVotos) * 100;
        double	porcentajeSantos = ((double)VSantos / (double) totalVotos) * 100;



        TFvotosMockus.setText(String.valueOf(VMockus));
        TFvotosPardo.setText(String.valueOf(VPardo));
        TFvotosFajardo.setText(String.valueOf(VFajardo));
        TFvotosNoemi.setText(String.valueOf(VNoemi));
        TFvotosPetro.setText(String.valueOf(VPetro));
        TFvotosSantos.setText(String.valueOf(VSantos));

        TFporcentajeMockus.setText(String.valueOf(porcentajeMockus));
        TFporcentajePardo.setText(String.valueOf(porcentajePardo));
        TFporcentajeFajardo.setText(String.valueOf(porcentajeFajardo));
        TFporcentajeNoemi.setText(String.valueOf(porcentajeNoemi));
        TFporcentajePetro.setText(String.valueOf(porcentajePetro));
        TFporcentajeSantos.setText(String.valueOf(porcentajeSantos));

        if(porcentajeMockus>=51){
          JOptionPane.showMessageDialog(this,"Antanas Mockus es el nuevo Presidente de Colombia");
        }
        if(porcentajePardo>=51){
          JOptionPane.showMessageDialog(this,"Rafael Pardo es el nuevo Presidente de Colombia");
        }
        if(porcentajeFajardo>=51){
          JOptionPane.showMessageDialog(this,"Sergio Fajardo es el nuevo Presidente de Colombia");
        }
        if(porcentajeNoemi>=51){
          JOptionPane.showMessageDialog(this,"Noemi Sanin es la nueva Presidenta de Colombia");
        }
        if(porcentajePetro>=51){
          JOptionPane.showMessageDialog(this,"Gustavo Petro es el nuevo Presidente de Colombia");
        }
        if(porcentajeSantos>=51){
          JOptionPane.showMessageDialog(this,"Juan Manuel Santos es el nuevo Presidente de Colombia");
        }

        if(porcentajeMockus<=50 && porcentajePardo<=50 && porcentajeFajardo<=50 && porcentajeNoemi<=50 && porcentajePetro<50 && porcentajeSantos<=50){

          JOptionPane.showMessageDialog(this, "Hay Segunda Vuelta");



        }




      }


      panelResultados.setVisible(true);
      //this.pack();
    }
  }









}
