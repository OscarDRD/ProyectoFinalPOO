package Vista;
import Modelo.Empleado;
public class Formulario extends javax.swing.JFrame{
    private String aux_nombres,aux_apellidos, aux_genero, aux_direccion,aux_eMail,aux_depto;
    private String aux_cedula, aux_celular, aux_telFijo,aux_numeroHorasExDiurnas,aux_numeroHorasExNocturna;
    private double aux_salarioBase,aux_valorHora,aux_valorHorasExDiurnas,aux_valorHorasExNocturna,aux_salario;
    private static int aux_subsidioTrnasporte=106454;
    private String auxBase[][];
    boolean resultado2;
    int NumFila=0;
    int Prueba=0;
    //int Contador=-1;
    Empleado em=new Empleado();

    public Empleado getEm() {
        return em;
    }

    public void setEm(Empleado em) {
        this.em = em;
    }
    Completado completado=new Completado();
    InOut mnens=new InOut();
    Error error=new Error();
    PreguntaEliminar pregunta=new PreguntaEliminar();
    
    //Empresa empresa;
    public Formulario() {
        //empresa=new Empresa();
        initComponents();
        this.setVisible(true);
        jPanel1.setEnabled(false);
        this.setLocationRelativeTo(null);
        //this.setLocation(562,155);
        OpcionGenero.add(OpcionFemenino);
        OpcionGenero.add(OpcionMasculino);
        
        txt_cedula.setEnabled(false);
        txt_nombres.setEnabled(false);
        txt_apellidos.setEnabled(false);
        txt_celular.setEnabled(false);
        txt_direccion.setEnabled(false);
        txt_telFijo.setEnabled(false);
        txt_eMail.setEnabled(false);
        txt_salarioBase.setEnabled(false);
        txt_valorHora.setEnabled(false);
        txt_horasExDiurnas.setEnabled(false);
        txt_horasExNocturna.setEnabled(false);
        txt_valorHoraExDiurna.setEnabled(false);
        txt_valorHoraExNocturna.setEnabled(false);
        txt_subsidioTransporte.setEnabled(false);
        txt_salario.setEnabled(false);
        
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OpcionGenero = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_celular = new javax.swing.JTextField();
        OpcionFemenino = new javax.swing.JRadioButton();
        OpcionMasculino = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        opcion_departamento = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_telFijo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_eMail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_salarioBase = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txt_valorHora = new javax.swing.JTextField();
        txt_horasExDiurnas = new javax.swing.JTextField();
        txt_horasExNocturna = new javax.swing.JTextField();
        txt_valorHoraExDiurna = new javax.swing.JTextField();
        txt_valorHoraExNocturna = new javax.swing.JTextField();
        txt_subsidioTransporte = new javax.swing.JTextField();
        txt_salario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));

        Titulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Titulo.setText("INGRESAR EMPLEADO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("NOMBRES:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("CEDULA:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("APELLIDOS:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("CELULAR:");

        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });

        txt_nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombresActionPerformed(evt);
            }
        });

        txt_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidosActionPerformed(evt);
            }
        });

        txt_celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_celularActionPerformed(evt);
            }
        });

        OpcionFemenino.setBackground(new java.awt.Color(0, 153, 153));
        OpcionFemenino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OpcionFemenino.setText("Femenino");
        OpcionFemenino.setBorder(null);
        OpcionFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionFemeninoActionPerformed(evt);
            }
        });

        OpcionMasculino.setBackground(new java.awt.Color(0, 153, 153));
        OpcionMasculino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OpcionMasculino.setText("Masculino");
        OpcionMasculino.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("GENERO:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("DEPARTAMENTO:");

        opcion_departamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        opcion_departamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GERENCIA", "ADMINISTRATIVO", "PRODUCCIÓN" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("DIRECCION:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("TELEFONO FIJO:");

        txt_telFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telFijoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("E-MAIL:");

        txt_eMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_eMailActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("SALARIO BASE:");

        txt_salarioBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salarioBaseActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("VALOR HORA:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("HORAS EXTRAS DIURNA:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("HORAS EXTRAS NOCTURNA:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("SUBSIDIO DE TRANSPORTE:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("SALARIO:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("VALOR HR. EX. DIURNA:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("VALOR HR. EX. NOCTURNA:");

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SAVE.png"))); // NOI18N
        jButton1.setText("GUARDAR");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setDefaultCapable(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calculate.png"))); // NOI18N
        jButton2.setText("CALCULAR");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setDefaultCapable(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CLEAN.png"))); // NOI18N
        jButton3.setText("LIMPIAR");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setDefaultCapable(false);
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RETURN.png"))); // NOI18N
        jButton4.setText("VOLVER AL MENU");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setDefaultCapable(false);
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txt_valorHora.setBackground(new java.awt.Color(0, 153, 153));
        txt_valorHora.setForeground(new java.awt.Color(255, 255, 255));
        txt_valorHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_valorHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_valorHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valorHoraActionPerformed(evt);
            }
        });

        txt_horasExDiurnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_horasExDiurnasActionPerformed(evt);
            }
        });

        txt_horasExNocturna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_horasExNocturnaActionPerformed(evt);
            }
        });

        txt_valorHoraExDiurna.setBackground(new java.awt.Color(0, 153, 153));
        txt_valorHoraExDiurna.setForeground(new java.awt.Color(255, 255, 255));
        txt_valorHoraExDiurna.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_valorHoraExDiurna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_valorHoraExDiurna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valorHoraExDiurnaActionPerformed(evt);
            }
        });

        txt_valorHoraExNocturna.setBackground(new java.awt.Color(0, 153, 153));
        txt_valorHoraExNocturna.setForeground(new java.awt.Color(255, 255, 255));
        txt_valorHoraExNocturna.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_valorHoraExNocturna.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_valorHoraExNocturna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valorHoraExNocturnaActionPerformed(evt);
            }
        });

        txt_subsidioTransporte.setBackground(new java.awt.Color(0, 153, 153));
        txt_subsidioTransporte.setForeground(new java.awt.Color(255, 255, 255));
        txt_subsidioTransporte.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_subsidioTransporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_subsidioTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_subsidioTransporteActionPerformed(evt);
            }
        });

        txt_salario.setBackground(new java.awt.Color(0, 153, 153));
        txt_salario.setForeground(new java.awt.Color(255, 255, 255));
        txt_salario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_salario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(158, 158, 158)
                        .addComponent(txt_salario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_subsidioTransporte)))
                .addGap(159, 159, 159))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_nombres)
                                    .addComponent(txt_apellidos)
                                    .addComponent(txt_celular)
                                    .addComponent(OpcionFemenino, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(OpcionMasculino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_cedula))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(opcion_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(24, 24, 24)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txt_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                                    .addComponent(txt_telFijo)
                                                    .addComponent(txt_eMail)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(txt_horasExDiurnas, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_salarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel17)
                                                    .addComponent(jLabel18))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_valorHoraExDiurna, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_valorHoraExNocturna, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_valorHora, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addComponent(txt_horasExNocturna, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(txt_cedula))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(OpcionFemenino, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OpcionMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcion_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_eMail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_salarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_valorHora, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_valorHoraExDiurna, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_horasExDiurnas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_valorHoraExNocturna, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_horasExNocturna, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_subsidioTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jButton6.setBackground(new java.awt.Color(255, 51, 51));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setDefaultCapable(false);
        jButton6.setFocusPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 51, 51));
        jButton7.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Input 2.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setDefaultCapable(false);
        jButton7.setFocusPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 51, 51));
        jButton8.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search 2.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setDefaultCapable(false);
        jButton8.setFocusPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 51, 51));
        jButton9.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delate2.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setDefaultCapable(false);
        jButton9.setFocusPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 51, 51));
        jButton10.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clipboard.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setDefaultCapable(false);
        jButton10.setFocusPainted(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombresActionPerformed

    private void txt_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidosActionPerformed

    private void txt_celularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_celularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_celularActionPerformed

    private void txt_telFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telFijoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telFijoActionPerformed

    private void txt_eMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_eMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_eMailActionPerformed

    private void txt_salarioBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salarioBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salarioBaseActionPerformed

    private void txt_valorHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valorHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valorHoraActionPerformed

    private void txt_horasExDiurnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_horasExDiurnasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_horasExDiurnasActionPerformed

    private void txt_horasExNocturnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_horasExNocturnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_horasExNocturnaActionPerformed

    private void txt_valorHoraExDiurnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valorHoraExDiurnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valorHoraExDiurnaActionPerformed

    private void txt_valorHoraExNocturnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valorHoraExNocturnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valorHoraExNocturnaActionPerformed

    private void txt_subsidioTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_subsidioTransporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_subsidioTransporteActionPerformed

    private void txt_salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salarioActionPerformed

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaActionPerformed

    private void OpcionFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionFemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpcionFemeninoActionPerformed
    //<<LIMPIAR>>
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(Titulo.getText().equals("INGRESAR EMPLEADO")){    
            txt_cedula.setText("");
            txt_nombres.setText("");
            txt_apellidos.setText("");
            txt_celular.setText("");
            OpcionGenero.clearSelection();
            txt_direccion.setText("");
            txt_telFijo.setText("");
            txt_eMail.setText("");
            txt_salarioBase.setText("");
            txt_valorHora.setText("");
            txt_horasExDiurnas.setText("");
            txt_horasExNocturna.setText("");
            txt_valorHoraExDiurna.setText("");
            txt_valorHoraExNocturna.setText("");
            txt_subsidioTransporte.setText("");
            txt_salario.setText("");
        }else if(Titulo.getText().equals("         EMPLEADO     ")){
            txt_cedula.setEnabled(false);
            txt_nombres.setEnabled(true);
            txt_apellidos.setEnabled(true);
            txt_celular.setEnabled(true);
            txt_direccion.setEnabled(true);
            txt_telFijo.setEnabled(true);
            txt_eMail.setEnabled(true);
            txt_salarioBase.setEnabled(true);
            txt_valorHora.setEnabled(true);
            txt_horasExDiurnas.setEnabled(true);
            txt_horasExNocturna.setEnabled(true);
            txt_valorHoraExDiurna.setEnabled(true);
            txt_valorHoraExNocturna.setEnabled(true);
            txt_subsidioTransporte.setEnabled(true);
            txt_salario.setEnabled(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    //<< VOLVER MENU >>
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Titulo.setText("                 ");
        txt_cedula.setText("");
        txt_nombres.setText("");
        txt_apellidos.setText("");
        txt_celular.setText("");
        OpcionGenero.clearSelection();
        txt_direccion.setText("");
        txt_telFijo.setText("");
        txt_eMail.setText("");
        txt_salarioBase.setText("");
        txt_valorHora.setText("");
        txt_horasExDiurnas.setText("");
        txt_horasExNocturna.setText("");
        txt_valorHoraExDiurna.setText("");
        txt_valorHoraExNocturna.setText("");
        txt_subsidioTransporte.setText("");
        txt_salario.setText("");
        
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CLEAN.png")));
        jButton3.setText("LIMPIAR");
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calculate.png")));
        jButton2.setText("CALCULAR");
        
        
        
        txt_cedula.setEnabled(false);
        txt_nombres.setEnabled(false);
        txt_apellidos.setEnabled(false);
        txt_celular.setEnabled(false);
        txt_direccion.setEnabled(false);
        txt_telFijo.setEnabled(false);
        txt_eMail.setEnabled(false);
        txt_salarioBase.setEnabled(false);
        txt_valorHora.setEnabled(false);
        txt_horasExDiurnas.setEnabled(false);
        txt_horasExNocturna.setEnabled(false);
        txt_valorHoraExDiurna.setEnabled(false);
        txt_valorHoraExNocturna.setEnabled(false);
        txt_subsidioTransporte.setEnabled(false);
        txt_salario.setEnabled(false);
        
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton10.setEnabled(true);

        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        OpcionFemenino.setBackground(new java.awt.Color(0, 153, 153));
        OpcionMasculino.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBackground(new java.awt.Color(207, 255, 255));
        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
    }//GEN-LAST:event_jButton4ActionPerformed
    //<<GUARDAR>>
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean oopc=em.ComprobarGuardar(txt_cedula.getText());
            if(!(txt_cedula.getText().equals(""))&&(!(txt_nombres.getText().equals("")))&&(!(txt_apellidos.getText().equals("")))
                &&(!(txt_celular.getText().equals("")))&&(!(txt_direccion.getText().equals("")))&&(!(txt_telFijo.getText().equals("")))
                &&(!(txt_eMail.getText().equals("")))&&(!(txt_salarioBase.getText().equals("")))&&(!(txt_valorHora.getText().equals("")))
                &&(!(txt_horasExDiurnas.getText().equals("")))&&(!(txt_horasExNocturna.getText().equals("")))
                &&(!(txt_valorHoraExDiurna.getText().equals("")))&&(!(txt_valorHoraExNocturna.getText().equals("")))
                &&(!(txt_salario.getText().equals("")))&&(!(txt_subsidioTransporte.getText().equals("")))){
                if(Titulo.getText().equals("INGRESAR EMPLEADO")){
                    if(oopc==false){
                        em.setCedula(txt_cedula.getText());
                        em.setNombres(txt_nombres.getText());
                        em.setApellidos(txt_apellidos.getText());
                        em.setCelular(txt_celular.getText());
                        if(OpcionFemenino.isSelected()){
                            em.setGenero("Femenino");
                        }else if(OpcionMasculino.isSelected()){
                            em.setGenero("Masculino");
                        }
                        em.setDepto(opcion_departamento.getSelectedItem().toString());
                        em.setDireccion(txt_direccion.getText());
                        em.setTelFijo(txt_telFijo.getText());
                        em.seteMail(txt_eMail.getText());
                        em.setSalarioBase(txt_salarioBase.getText());
                        em.setValorHora(txt_valorHora.getText());
                        em.setNumeroHorasExDiurnas(txt_horasExDiurnas.getText());
                        em.setNumeroHorasExNocturna(txt_horasExNocturna.getText());
                        em.setValorHorasExDiurnas(txt_valorHoraExDiurna.getText());
                        em.setValorHorasExNocturna(txt_valorHoraExNocturna.getText());
                        em.setSubsidioTrnasporte(txt_subsidioTransporte.getText());
                        em.setSalario(txt_salario.getText());

                        em.LlenarMatriz(em.Comprobar());
                        em.Imprimir();
                        completado.setMs("REGISTRO GUARDADO");
                        completado.setVisible(true);
                        //Contador++;

                    }else{
                        error.setError("YA EXISTE");
                        error.setVisible(true);
                    }
                }else if(Titulo.getText().equals("         EMPLEADO     ")){
                    em.setCedula(txt_cedula.getText());
                    em.setNombres(txt_nombres.getText());
                    em.setApellidos(txt_apellidos.getText());
                    em.setCelular(txt_celular.getText());
                    if(OpcionFemenino.isSelected()){
                        em.setGenero("Femenino");
                    }else if(OpcionMasculino.isSelected()){
                        em.setGenero("Masculino");
                    }
                    em.setDepto(opcion_departamento.getSelectedItem().toString());
                    em.setDireccion(txt_direccion.getText());
                    em.setTelFijo(txt_telFijo.getText());
                    em.seteMail(txt_eMail.getText());
                    em.setSalarioBase(txt_salarioBase.getText());
                    em.setValorHora(txt_valorHora.getText());
                    em.setNumeroHorasExDiurnas(txt_horasExDiurnas.getText());
                    em.setNumeroHorasExNocturna(txt_horasExNocturna.getText());
                    em.setValorHorasExDiurnas(txt_valorHoraExDiurna.getText());
                    em.setValorHorasExNocturna(txt_valorHoraExNocturna.getText());
                    em.setSubsidioTrnasporte(txt_subsidioTransporte.getText());
                    em.setSalario(txt_salario.getText());

                    em.LlenarMatriz(em.Buscar(txt_cedula.getText()));
                    em.Imprimir();
                    completado.setMs("REGISTRO MODIFICADO");
                    completado.setVisible(true);
                }
            }else{
                error.setError("Llene todos los datos");
                error.setVisible(true);
            }
    }//GEN-LAST:event_jButton1ActionPerformed
    //<<CALCULAR>>
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(Titulo.getText().equals("INGRESAR EMPLEADO") || Titulo.getText().equals("         EMPLEADO     ")){
            try{
                aux_valorHora=((Double.parseDouble(txt_salarioBase.getText())/30)/8);
                String Aux1=""+aux_valorHora;
                txt_valorHora.setText(Aux1);

                aux_valorHorasExDiurnas=(Integer.parseInt(txt_horasExDiurnas.getText())*aux_valorHora);
                String Aux2=""+aux_valorHorasExDiurnas;
                txt_valorHoraExDiurna.setText(Aux2);

                aux_valorHorasExNocturna=(Integer.parseInt(txt_horasExNocturna.getText())*aux_valorHora);
                String Aux3=""+aux_valorHorasExNocturna;
                txt_valorHoraExNocturna.setText(Aux3);
                String Aux4=""+aux_subsidioTrnasporte;
                txt_subsidioTransporte.setText(Aux4);
                String Aux5=""+(Double.parseDouble(txt_salarioBase.getText())+aux_valorHorasExDiurnas+aux_valorHorasExNocturna+aux_subsidioTrnasporte);
                txt_salario.setText(Aux5);
            }catch(Exception e){
                error.setError("Datos incorrectos");
                error.setVisible(true);
            }
        }else if(Titulo.getText().equals("ELIMINAR EMPLEADO")){
            //pregunta.setVisible(true);
            //resultado2=pregunta.isResultado();
            Prueba=mnens.Confirmar("¿Está seguro de eliminar el registro?");
            System.out.println(Prueba);
            if(Prueba==0){
                int auxiliar=em.Buscar(txt_cedula.getText());
                em.Eliminar(em.Buscar(txt_cedula.getText()));
                em.Intercambiar(em.Ubicar(),auxiliar);
                Titulo.setText("                 ");
                txt_cedula.setText("");
                txt_nombres.setText("");
                txt_apellidos.setText("");
                txt_celular.setText("");
                OpcionGenero.clearSelection();
                txt_direccion.setText("");
                txt_telFijo.setText("");
                txt_eMail.setText("");
                txt_salarioBase.setText("");
                txt_valorHora.setText("");
                txt_horasExDiurnas.setText("");
                txt_horasExNocturna.setText("");
                txt_valorHoraExDiurna.setText("");
                txt_valorHoraExNocturna.setText("");
                txt_subsidioTransporte.setText("");
                txt_salario.setText("");

                jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CLEAN.png")));
                jButton3.setText("LIMPIAR");
                jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calculate.png")));
                jButton2.setText("CALCULAR");



                txt_cedula.setEnabled(false);
                txt_nombres.setEnabled(false);
                txt_apellidos.setEnabled(false);
                txt_celular.setEnabled(false);
                txt_direccion.setEnabled(false);
                txt_telFijo.setEnabled(false);
                txt_eMail.setEnabled(false);
                txt_salarioBase.setEnabled(false);
                txt_valorHora.setEnabled(false);
                txt_horasExDiurnas.setEnabled(false);
                txt_horasExNocturna.setEnabled(false);
                txt_valorHoraExDiurna.setEnabled(false);
                txt_valorHoraExNocturna.setEnabled(false);
                txt_subsidioTransporte.setEnabled(false);
                txt_salario.setEnabled(false);

                jButton7.setEnabled(true);
                jButton8.setEnabled(true);
                jButton9.setEnabled(true);
                jButton10.setEnabled(true);

                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);

                jButton1.setVisible(true);
                jButton2.setVisible(true);
                jButton3.setVisible(true);
                jButton4.setVisible(true);
                OpcionFemenino.setBackground(new java.awt.Color(0, 153, 153));
                OpcionMasculino.setBackground(new java.awt.Color(0, 153, 153));
                jPanel2.setBackground(new java.awt.Color(207, 255, 255));
                jPanel1.setBackground(new java.awt.Color(0, 153, 153));
                completado.setMs("REGISTRO ELIMINADO");
                completado.setVisible(true);
            }else if(Prueba==1){
                Titulo.setText("                 ");
                txt_cedula.setText("");
                txt_nombres.setText("");
                txt_apellidos.setText("");
                txt_celular.setText("");
                OpcionGenero.clearSelection();
                txt_direccion.setText("");
                txt_telFijo.setText("");
                txt_eMail.setText("");
                txt_salarioBase.setText("");
                txt_valorHora.setText("");
                txt_horasExDiurnas.setText("");
                txt_horasExNocturna.setText("");
                txt_valorHoraExDiurna.setText("");
                txt_valorHoraExNocturna.setText("");
                txt_subsidioTransporte.setText("");
                txt_salario.setText("");

                jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CLEAN.png")));
                jButton3.setText("LIMPIAR");
                jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calculate.png")));
                jButton2.setText("CALCULAR");



                txt_cedula.setEnabled(false);
                txt_nombres.setEnabled(false);
                txt_apellidos.setEnabled(false);
                txt_celular.setEnabled(false);
                txt_direccion.setEnabled(false);
                txt_telFijo.setEnabled(false);
                txt_eMail.setEnabled(false);
                txt_salarioBase.setEnabled(false);
                txt_valorHora.setEnabled(false);
                txt_horasExDiurnas.setEnabled(false);
                txt_horasExNocturna.setEnabled(false);
                txt_valorHoraExDiurna.setEnabled(false);
                txt_valorHoraExNocturna.setEnabled(false);
                txt_subsidioTransporte.setEnabled(false);
                txt_salario.setEnabled(false);

                jButton7.setEnabled(true);
                jButton8.setEnabled(true);
                jButton9.setEnabled(true);
                jButton10.setEnabled(true);

                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);

                jButton1.setVisible(true);
                jButton2.setVisible(true);
                jButton3.setVisible(true);
                jButton4.setVisible(true);
                OpcionFemenino.setBackground(new java.awt.Color(0, 153, 153));
                OpcionMasculino.setBackground(new java.awt.Color(0, 153, 153));
                jPanel2.setBackground(new java.awt.Color(207, 255, 255));
                jPanel1.setBackground(new java.awt.Color(0, 153, 153));
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    //<<SALIR>>
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed
    //<<Ingresar>>
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Titulo.setText("INGRESAR EMPLEADO");
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calculate.png")));
        jButton2.setText("CALCULAR");
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        jPanel1.setBackground(new java.awt.Color(207, 255, 255));
        OpcionFemenino.setBackground(new java.awt.Color(207, 255, 255));
        OpcionMasculino.setBackground(new java.awt.Color(207, 255, 255));
        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        
                
        txt_cedula.setEnabled(true);
        txt_nombres.setEnabled(true);
        txt_apellidos.setEnabled(true);
        txt_celular.setEnabled(true);
        txt_direccion.setEnabled(true);
        txt_telFijo.setEnabled(true);
        txt_eMail.setEnabled(true);
        txt_salarioBase.setEnabled(true);
        
        txt_horasExDiurnas.setEnabled(true);
        txt_horasExNocturna.setEnabled(true);
        
    }//GEN-LAST:event_jButton7ActionPerformed
    //<<Buscar>>
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Titulo.setText("         EMPLEADO     ");
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        jPanel1.setBackground(new java.awt.Color(207, 255, 255));
        OpcionFemenino.setBackground(new java.awt.Color(207, 255, 255));
        OpcionMasculino.setBackground(new java.awt.Color(207, 255, 255));
        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modify 2.png")));
        jButton3.setText("MODIFICAR");
        
        //jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delate2.png")));
        //jButton3.setText("ELIMINAR");

        
        int auxId=em.Buscar(mnens.pedirString("Digite la cedula que desea Buscar"));
        auxBase=em.getBaseDatos();
        if(auxId>=0){
            System.out.println("DATOOOOOO AUXILIAR: "+auxId);

            txt_cedula.setText(auxBase[auxId][0]);
            txt_nombres.setText(auxBase[auxId][1]);
            txt_apellidos.setText(auxBase[auxId][2]);
            txt_celular.setText(auxBase[auxId][3]);

            if(auxBase[auxId][4].equals("Femenino")){
                OpcionFemenino.setSelected(true);
            }else if(auxBase[auxId][4].equals("Masculino")){
                OpcionMasculino.setSelected(true);
            }
            txt_direccion.setText(auxBase[auxId][5]);
            txt_telFijo.setText(auxBase[auxId][6]);
            txt_eMail.setText(auxBase[auxId][7]);
            if(auxBase[auxId][8].equals("GERENCIA")){
                opcion_departamento.setSelectedIndex(0);
            }else if(auxBase[auxId][8].equals("ADMINISTRATIVO")){
                opcion_departamento.setSelectedIndex(1);
            }else if(auxBase[auxId][8].equals("PRODUCCIÓN")){
                opcion_departamento.setSelectedIndex(2);
            }
            txt_salarioBase.setText(auxBase[auxId][9]);
            txt_valorHora.setText(auxBase[auxId][10]);
            txt_horasExDiurnas.setText(auxBase[auxId][11]);
            txt_horasExNocturna.setText(auxBase[auxId][12]);
            txt_valorHoraExDiurna.setText(auxBase[auxId][13]);
            txt_valorHoraExNocturna.setText(auxBase[auxId][14]);
            txt_subsidioTransporte.setText(auxBase[auxId][15]);
            txt_salario.setText(auxBase[auxId][16]);
        }else{
            
            Titulo.setText("                 ");
            txt_cedula.setText("");
            txt_nombres.setText("");
            txt_apellidos.setText("");
            txt_celular.setText("");
            OpcionGenero.clearSelection();
            txt_direccion.setText("");
            txt_telFijo.setText("");
            txt_eMail.setText("");
            txt_salarioBase.setText("");
            txt_valorHora.setText("");
            txt_horasExDiurnas.setText("");
            txt_horasExNocturna.setText("");
            txt_valorHoraExDiurna.setText("");
            txt_valorHoraExNocturna.setText("");
            txt_subsidioTransporte.setText("");
            txt_salario.setText("");

            jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calculate.png")));
            jButton3.setText("CALCULAR");
            jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CLEAN.png")));
            jButton3.setText("LIMPIAR");

            txt_cedula.setEnabled(false);
            txt_nombres.setEnabled(false);
            txt_apellidos.setEnabled(false);
            txt_celular.setEnabled(false);
            txt_direccion.setEnabled(false);
            txt_telFijo.setEnabled(false);
            txt_eMail.setEnabled(false);
            txt_salarioBase.setEnabled(false);
            txt_valorHora.setEnabled(false);
            txt_horasExDiurnas.setEnabled(false);
            txt_horasExNocturna.setEnabled(false);
            txt_valorHoraExDiurna.setEnabled(false);
            txt_valorHoraExNocturna.setEnabled(false);
            txt_subsidioTransporte.setEnabled(false);
            txt_salario.setEnabled(false);

            jButton7.setEnabled(true);
            jButton8.setEnabled(true);
            jButton9.setEnabled(true);
            jButton10.setEnabled(true);
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);
            OpcionFemenino.setBackground(new java.awt.Color(0, 153, 153));
            OpcionMasculino.setBackground(new java.awt.Color(0, 153, 153));
            jPanel2.setBackground(new java.awt.Color(207, 255, 255));
            jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        }
    }//GEN-LAST:event_jButton8ActionPerformed
    //<<ELIMINAR>>
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Titulo.setText("ELIMINAR EMPLEADO");
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        
        jButton1.setVisible(false);
        jButton4.setEnabled(true);
        jButton3.setVisible(false);
        jButton2.setEnabled(true);
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delate2.png")));
        jButton2.setText("ELIMINAR");
        jPanel1.setBackground(new java.awt.Color(207, 255, 255));
        OpcionFemenino.setBackground(new java.awt.Color(207, 255, 255));
        OpcionMasculino.setBackground(new java.awt.Color(207, 255, 255));
        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        int auxId=em.Buscar(mnens.pedirString("Digite la cedula que desea Buscar"));
        auxBase=em.getBaseDatos();

        if(auxId>=0){
            System.out.println("DATOOOOOO AUXILIAR: "+auxId);

            txt_cedula.setText(auxBase[auxId][0]);
            txt_nombres.setText(auxBase[auxId][1]);
            txt_apellidos.setText(auxBase[auxId][2]);
            txt_celular.setText(auxBase[auxId][3]);

            if(auxBase[auxId][4].equals("Femenino")){
                OpcionFemenino.setSelected(true);
            }else if(auxBase[auxId][4].equals("Masculino")){
                OpcionMasculino.setSelected(true);
            }
            txt_direccion.setText(auxBase[auxId][5]);
            txt_telFijo.setText(auxBase[auxId][6]);
            txt_eMail.setText(auxBase[auxId][7]);
            if(auxBase[auxId][8].equals("GERENCIA")){
                opcion_departamento.setSelectedIndex(0);
            }else if(auxBase[auxId][8].equals("ADMINISTRATIVO")){
                opcion_departamento.setSelectedIndex(1);
            }else if(auxBase[auxId][8].equals("PRODUCCIÓN")){
                opcion_departamento.setSelectedIndex(2);
            }
            txt_salarioBase.setText(auxBase[auxId][9]);
            txt_valorHora.setText(auxBase[auxId][10]);
            txt_horasExDiurnas.setText(auxBase[auxId][11]);
            txt_horasExNocturna.setText(auxBase[auxId][12]);
            txt_valorHoraExDiurna.setText(auxBase[auxId][13]);
            txt_valorHoraExNocturna.setText(auxBase[auxId][14]);
            txt_subsidioTransporte.setText(auxBase[auxId][15]);
            txt_salario.setText(auxBase[auxId][16]);
            
        }else{
            jButton1.setVisible(true);
            jButton2.setVisible(true);
            jButton3.setVisible(true);
            jButton4.setVisible(true);
            Titulo.setText("                 ");
            txt_cedula.setText("");
            txt_nombres.setText("");
            txt_apellidos.setText("");
            txt_celular.setText("");
            OpcionGenero.clearSelection();
            txt_direccion.setText("");
            txt_telFijo.setText("");
            txt_eMail.setText("");
            txt_salarioBase.setText("");
            txt_valorHora.setText("");
            txt_horasExDiurnas.setText("");
            txt_horasExNocturna.setText("");
            txt_valorHoraExDiurna.setText("");
            txt_valorHoraExNocturna.setText("");
            txt_subsidioTransporte.setText("");
            txt_salario.setText("");

            jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calculate.png")));
            jButton3.setText("CALCULAR");
            jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CLEAN.png")));
            jButton3.setText("LIMPIAR");

            txt_cedula.setEnabled(false);
            txt_nombres.setEnabled(false);
            txt_apellidos.setEnabled(false);
            txt_celular.setEnabled(false);
            txt_direccion.setEnabled(false);
            txt_telFijo.setEnabled(false);
            txt_eMail.setEnabled(false);
            txt_salarioBase.setEnabled(false);
            txt_valorHora.setEnabled(false);
            txt_horasExDiurnas.setEnabled(false);
            txt_horasExNocturna.setEnabled(false);
            txt_valorHoraExDiurna.setEnabled(false);
            txt_valorHoraExNocturna.setEnabled(false);
            txt_subsidioTransporte.setEnabled(false);
            txt_salario.setEnabled(false);

            jButton7.setEnabled(true);
            jButton8.setEnabled(true);
            jButton9.setEnabled(true);
            jButton10.setEnabled(true);
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);
            OpcionFemenino.setBackground(new java.awt.Color(0, 153, 153));
            OpcionMasculino.setBackground(new java.awt.Color(0, 153, 153));
            jPanel2.setBackground(new java.awt.Color(207, 255, 255));
            jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        }
    }//GEN-LAST:event_jButton9ActionPerformed
    //<<LISTAR>>
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Lista list=new Lista();
        auxBase=em.getBaseDatos();
        list.mostrarMatriz(auxBase);
        list.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton OpcionFemenino;
    private javax.swing.ButtonGroup OpcionGenero;
    private javax.swing.JRadioButton OpcionMasculino;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> opcion_departamento;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_eMail;
    private javax.swing.JTextField txt_horasExDiurnas;
    private javax.swing.JTextField txt_horasExNocturna;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_salario;
    private javax.swing.JTextField txt_salarioBase;
    private javax.swing.JTextField txt_subsidioTransporte;
    private javax.swing.JTextField txt_telFijo;
    private javax.swing.JTextField txt_valorHora;
    private javax.swing.JTextField txt_valorHoraExDiurna;
    private javax.swing.JTextField txt_valorHoraExNocturna;
    // End of variables declaration//GEN-END:variables
}
