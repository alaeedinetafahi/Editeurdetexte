package Editeur;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public  class MyTexte extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	String ts;
	ImageIcon img1 = new ImageIcon("Démmarer.jpg");
	ImageIcon img2 = new ImageIcon("apropos.jpg");
	ImageIcon img3 = new ImageIcon("Quitterr.jpg");
	ImageIcon img4 = new ImageIcon("continue.jpg");
	ImageIcon img5 = new ImageIcon("accueil.jpg");
	ImageIcon img6 = new ImageIcon("COPIER.jpg");
	ImageIcon img7 = new ImageIcon("SAVE.jpg");
	ImageIcon img8 = new ImageIcon("bouton_copier.png");
	ImageIcon img9 = new ImageIcon("COUPER.jpg");
	ImageIcon img12= new ImageIcon("chercher.jpg");
	JButton b1= new JButton(img1);
	JButton b2= new JButton(img2);
	JButton b3= new JButton(img3);
	JButton b4= new JButton(img5);
	JButton b5= new JButton(img4);
	JButton b6= new JButton(img3);
	JButton b7= new JButton(img6);
	JButton b8= new JButton(img7);
	JButton b9= new JButton(img8);
	JButton b10= new JButton(img9);
	JButton b13= new JButton(img12);
	JButton b14= new JButton("oui");
	JButton b15= new JButton("non");
	JButton b16= new JButton("annuler");
	JButton b17= new JButton("oui");
	JButton b18= new JButton("non");
	JButton b19= new JButton("oui");
	JButton b20= new JButton("non");
	JButton b131=new JButton("chercher");
	JToolBar TBar= new JToolBar();
	JMenuBar mBar = new JMenuBar();
	JMenu fichier= new JMenu("Fichier");
	 JMenuItem fi = new JMenuItem("Nouveau");
	 JMenuItem fi1 = new JMenuItem("ouvrir");
	 JMenuItem fi2 = new JMenuItem("enregistrer");
	 JMenuItem fi3 = new JMenuItem("enregistrer sous");
     JMenuItem fi6 = new JMenuItem("quitter");
	JMenu edition= new JMenu("edition");
	 JMenuItem e2 = new JMenuItem("couper");
     JMenuItem e3 = new JMenuItem("copier");
     JMenuItem e4 = new JMenuItem("coller");
     JMenuItem é2 = new JMenuItem("couper");
     JMenuItem é3 = new JMenuItem("copier");
     JMenuItem é4 = new JMenuItem("coller");
     JMenuItem e5 = new JMenuItem("supprimer");
     JMenuItem e6 = new JMenuItem("sélectionner tout");
	JMenu affichage= new JMenu("affichage");
	JMenu Coloration_syntaxique;
	JMenu Couleur_du_texte;
	JPopupMenu edit=new JPopupMenu();
	JMenu Police11;
	 private JRadioButtonMenuItem couleurFond[], couleurTexte[];
	   private ButtonGroup groupCouleursFond, groupCouleursTexte;
	   private String[] nomCouleur1 = {"Blanc", "Noir", "Rouge", "Vert", "Bleu", "Jaune", "Orange", "Gris", "Gris pâle"};
	   private String[] nomCouleur2 = {"Blanc", "Noir", "Rouge", "Vert", "Bleu", "Jaune", "Orange",  "Gris", "Gris pâle"};
	   private Color[] couleur1 = {Color.white, Color.black, new Color(150, 0, 0), new Color(0, 150, 0), new Color(0, 0, 150), new Color(225, 225, 0), new Color(175, 100, 0), new Color(100, 100, 100), Color.lightGray};
	   private Color[] couleur2 = {Color.white, Color.black, Color.red, Color.green, Color.blue, Color.yellow, Color.orange,  Color.gray, Color.lightGray};
	    String[] mot = {"a",  "b"};
	   String[] syn = {"alae", "bachir"};
	JMenu Aides= new JMenu("Aides");
	 JMenuItem A1 = new JMenuItem("aides");
	 JMenuItem A2 = new JMenuItem("A propos");
	 JTextField tF=new JTextField(20);
	JTextArea tA1 = new JTextArea(40,100);
	JLabel etq= new JLabel("My Texte");
	private JPanel p= new JPanel();
	Font Fo=new Font("Serif",Font.BOLD,20);
	JPanel p0=new JPanel();
	JPanel p2=new JPanel();
	JPanel p1=new JPanel();
	JFrame f= new JFrame();
	JFrame f1=new JFrame();
	JFrame f2=new JFrame();
	JFrame f3=new JFrame();
	JFrame f4=new JFrame();
	 File fichierCourant = null;
	private BufferedReader in;
	public MyTexte(){
		f.setSize(1200,600);
		f.setTitle("Acceuil");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setLocationRelativeTo(null);
		p.setBackground(Color.red);
		lireFichier( new File("raccourcis.txt") );
		TBar.add(b7);
		TBar.add(b8);
		TBar.add(b9);
		TBar.add(b10);
		TBar.add(b13);
		fichier.add(fi);
		fi.setMnemonic('N');
		fichier.add(fi1);
		fi1.setMnemonic('O');
		fichier.add(fi2);
		fi2.setMnemonic('E');
		fichier.add(fi3);
		fi3.setMnemonic('S');
		fichier.add(fi6);
		fi6.setMnemonic('Q');
		edition.add(e2);
		e2.setMnemonic('X');
		edition.add(e3);
		e3.setMnemonic('C');
		edition.add(e4);
		e4.setMnemonic('V');
		edition.add(e5);
		e5.setMnemonic('D');
		edition.add(e6);
		fi.setMnemonic('A');
		edit.add(é2);
		edit.add(é3);
		edit.add(é4);
		Aides.add(A1);
		Aides.add(A2);
		mBar.add(fichier);
		mBar.add(edition);
		mBar.add(affichage);
		mBar.add(Aides);
		p.setLayout(new BorderLayout());
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);
		fichier.addActionListener(this);
		fi.addActionListener(this);
		fi1.addActionListener(this);
		fi2.addActionListener(this);
		fi3.addActionListener(this);
		fi6.addActionListener(this);
		e2.addActionListener(this);
		e3.addActionListener(this);
		e4.addActionListener(this);
		é2.addActionListener(this);
		é3.addActionListener(this);
		é4.addActionListener(this);
		e5.addActionListener(this);
		e6.addActionListener(this);
		b131.addActionListener(this); 
		A1.addActionListener(this);
		A2.addActionListener(this);
		Coloration_syntaxique = new JMenu("Couleur du fond");
	      groupCouleursFond = new ButtonGroup();
	      couleurFond = new JRadioButtonMenuItem[nomCouleur1.length];
	      for (int i = 0; i < nomCouleur1.length; i++) {
	         couleurFond[i] = new JRadioButtonMenuItem(nomCouleur1[i]);
	         if (couleur1[i] == tA1.getBackground())
	            couleurFond[i].setSelected(true);
	         couleurFond[i].addActionListener(this);
	         groupCouleursFond.add(couleurFond[i]);
	         Coloration_syntaxique.add(couleurFond[i]);
	      }
	      affichage.add(Coloration_syntaxique);
	      Couleur_du_texte = new JMenu("Couleur du texte");
	      groupCouleursTexte = new ButtonGroup();
	      couleurTexte = new JRadioButtonMenuItem[nomCouleur2.length];
	      for (int i = 0; i < nomCouleur2.length; i++) {
	         couleurTexte[i] = new JRadioButtonMenuItem(nomCouleur2[i]);
	         if (couleur2[i] == tA1.getForeground())
	            couleurTexte[i].setSelected(true);
	         couleurTexte[i].addActionListener(this);
	         groupCouleursTexte.add(couleurTexte[i]);
	         Couleur_du_texte.add(couleurTexte[i]);
	      }
	      affichage.add(Couleur_du_texte);
		JPanel pp= new JPanel();
		pp.add(b1);
		pp.add(b2);
		pp.add(b3);
		p.add(pp,BorderLayout.SOUTH);
		Font fetq=new Font("Helvetica",Font.BOLD,200);
		etq.setFont(fetq);
		etq.setForeground(Color.black);
	    etq.setHorizontalAlignment(JLabel.CENTER);
	    p.add(etq,BorderLayout.CENTER);
	    f.setContentPane(p);
	    f.setVisible(true);
	    }
	
	 private void nouveauFichier() {
	      fichierCourant = null;
	      tA1.setText("");
	   }
	 private void ouvrirFichier() {
	      JFileChooser jfc = new JFileChooser();

	      int resultat = jfc.showOpenDialog(this);
	      if (resultat == JFileChooser.APPROVE_OPTION) {
	         fichierCourant = jfc.getSelectedFile();
	         lireFichier(fichierCourant);
	      }
	      else {
	         fichierCourant = null;
	      }
	   }
	 private void enregistrerFichier() {
	      if (fichierCourant == null) {
	         afficheMessage("Aucun emplacement n'a été spécifier, un fichier nommé \"Nouveau Document Text.txt\" \nsera créé dans le répertoire où est le fichier JAR.", "Information");
	         ecrireFichier( new File("Nouveau Document Texte.txt") );
	      }
	      else
	         ecrireFichier(fichierCourant);
	   }
	 private void enregistrerFichierSous() {
	      JFileChooser jfc = new JFileChooser();
	      jfc.setDialogTitle("Enregistrer sous...");
	      jfc.setApproveButtonText("Enregistrer");
	      jfc.setApproveButtonToolTipText("Enregistrer le fichier à cet emplacement");

	      int resultat = jfc.showOpenDialog(this);
	      if (resultat == JFileChooser.APPROVE_OPTION)
	         ecrireFichier(jfc.getSelectedFile());
	   }
	 private void afficheMessage(String message, String titre) {
	      JOptionPane.showMessageDialog(null, message,
	            titre, JOptionPane.INFORMATION_MESSAGE);
	   }
	 private void ecrireFichier(File fichier) {
	      try {
	         BufferedWriter out = new BufferedWriter(
	               new FileWriter(fichier) );
	         out.write(tA1.getText());
	         out.close();
	      }
	      catch(FileNotFoundException e) {}
	      catch(IOException e) {}
	   }
	 private void lireFichier(File fichier) {
	      String ligne;
	      StringBuffer buf = new StringBuffer();
	      try {
	         tA1.setText("");
	         in = new BufferedReader(
	               new FileReader(fichier) );
	         while ((ligne = in.readLine()) != null)
	            buf.append(ligne + (char) '\n');
	         tA1.setText(buf.toString());
	      }
	      
	      catch(FileNotFoundException e) {}
	      catch(IOException e) {}
	   }
	 

	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			JPanel p1=new JPanel();
			ImageIcon img = new ImageIcon("accessories-text-editor-4.jpg");
			f1.setSize(1200,600);
			f1.setTitle("Acceuil");
			f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setLocationRelativeTo(null);
			p1.setBackground(Color.red);
			p1.setLayout(new BorderLayout());
			JPanel P11=new JPanel();
			P11.add(b4);
			P11.add(b5);
			P11.add(b6);
			p1.add(P11,BorderLayout.SOUTH);
		    p1.add(new JLabel(img),BorderLayout.CENTER);
		    f1.setContentPane(p1);
		    f1.setVisible(true);
		    f.setVisible(false);}
		    else if (e.getSource()==b4){
		    	f1.setVisible(false);
		    	f.setVisible(true);
		    }
		    else if(e.getSource()==b5){
		    	f1.setVisible(false);
		    	f.setVisible(false);
		    	f2.setSize(1200,600);
				f2.setTitle("mytexte");
				f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    f2.setLocationRelativeTo(null);
			    p0.setBackground(Color.black);
				p0.setLayout(new BorderLayout());
			    JPanel p6=new JPanel();
			    p6.setBackground(Color.black);
			    p0.add(mBar,BorderLayout.NORTH);
			    p0.add(TBar,BorderLayout.SOUTH);
			    p6.add(tA1);
				p0.add(p6,BorderLayout.CENTER);
				f2.setContentPane(p0);
			    f2.setVisible(true);}
		    
		    
		    
		   
		    else if (e.getSource()==fi6){
		    	 f1.setVisible(false);
			    	f.setVisible(false);
			    	f2.setVisible(true);
		    	f3.setSize(500,200);
		    	f3.setTitle(" texte");
				f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    f3.setLocationRelativeTo(null);
			    p1.setBackground(Color.black);
				p1.setLayout(new BorderLayout());
				JLabel etq66= new JLabel("voulez-vous enregistrer?");
				etq66.setForeground(Color.white);
				JPanel p66= new JPanel();
				p66.add(b19);
				p66.add(b20);
				p66.add(b16);
				etq66.setHorizontalAlignment(JLabel.CENTER);
				p1.add(etq66,BorderLayout.CENTER);
			    p1.add(p66,BorderLayout.SOUTH);
			    f3.setContentPane(p1);
			    f3.setVisible(true);
			 }
		    else if (e.getSource()==b16){
		    	f3.setVisible(false);
		    	f2.setVisible(true);
		    	
		    }
		    else if(e.getSource()==b20){
		    	f3.setVisible(false);
		    	f2.setVisible(false);
		    }
		    else if(e.getSource()==b19){
		    	enregistrerFichier();
		    }
		    else if(e.getSource()==fi){
		    	nouveauFichier();
		    }
		    else if(e.getSource()==fi1){
		    	ouvrirFichier();
		    }
		    else if(e.getSource()==b8){
		    	enregistrerFichier();
		    }
		    else if(e.getSource()==fi2){
		    	enregistrerFichier();
		    }
		    else if(e.getSource()==fi3){
		    	enregistrerFichierSous();
		    }
		    else if(e.getSource()==e2){
		    	tA1.cut();
		    }
		    else if(e.getSource()==b9){
		    	tA1.cut();
		    }
		    else if(e.getSource()==b7){
		    	tA1.copy();
		    }
		    else if(e.getSource()==e3){
		    	tA1.copy();
		    }
		    else if(e.getSource()==b10){
		    	tA1.paste();
		    }
		    else if(e.getSource()==e4){
		    	tA1.paste();
		    }
		    else if (e.getSource()==e5){
		    	tA1.replaceSelection("");
		    }
		    else if(e.getSource()==e6){
		    	tA1.selectAll();
		    }
		 
		     else if(e.getSource()==b6){
		    	f3.setSize(500,200);
		    	f3.setTitle("my texte");
			    p0.setBackground(Color.black);
				p0.setLayout(new BorderLayout());
				JLabel etq66= new JLabel("Etes-vous sûr de vouloir quitter?");
				etq66.setForeground(Color.white);
				JPanel p66= new JPanel();
				p66.add(b14);
				p66.add(b15);
				etq66.setHorizontalAlignment(JLabel.CENTER);
				p0.add(etq66,BorderLayout.CENTER);
			    p0.add(p66,BorderLayout.SOUTH);
			    f3.setContentPane(p0);
			    f1.setVisible(true);
			    f3.setVisible(true);
		    }
		    else if(e.getSource()==b14){
				    f1.setVisible(false);
				    f3.setVisible(false);
		    	
		    }
		    else if(e.getSource()==b15){
				    f1.setVisible(true);
				    f3.setVisible(false);
		    }
		    else if(e.getSource()==b2){
		    	final JPanel panel = new JPanel();
			    JOptionPane.showMessageDialog(panel, "Les auteurs de MyText sont : Tafahi et Toutaoui , encadré par Mme Benomar", "informations",
			    JOptionPane.INFORMATION_MESSAGE);
		    }
		    else if(e.getSource()==A2){
		    	final JPanel panel = new JPanel();
			    JOptionPane.showMessageDialog(panel, "Les auteurs de MyText sont : Tafahi et Toutaoui , encadré par Mme Benomar", "informations",
			    JOptionPane.INFORMATION_MESSAGE);
		    }
		    else if(e.getSource()==A1){
		    	final JPanel panel = new JPanel();
			    JOptionPane.showMessageDialog(panel, "pour plus d'info cantacté : Tafahi et Toutaoui , INPT", "informations",
			    JOptionPane.INFORMATION_MESSAGE);
		    }
		    else if (e.getSource()==b13){
	        	 
		    	f4.setSize(600,400);
				f4.setTitle("dictionaire");
				f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    f4.setLocationRelativeTo(null);
			    p2.setBackground(Color.black);
				p2.setLayout(new BorderLayout());
			    JPanel p6=new JPanel();
			    p6.setBackground(Color.red);
			    p6.add(b131);
			    p6.add(tF);
			    p2.add(p6,BorderLayout.CENTER);
				f4.setContentPane(p2);
			    f4.setVisible(true);            
           }
		
		    else if(e.getSource()==b131){
		    	String t = "inéxistant";
		    	ts=tF.getText();
		    	for(int i=0;i<mot.length;i++){
		    		
		   		    if(ts.equals(mot[i]))
		   		    t=syn[i];
		    	}  	
				JOptionPane.showMessageDialog(null, "syn est"+" " + t, "informations",
	   				    JOptionPane.INFORMATION_MESSAGE);
			 repaint();   
		   }
		
		    else if(e.getSource()==b3){
		    	f3.setSize(500,200);
		    	f3.setTitle("my texte");
				f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    f3.setLocationRelativeTo(null);
			    p0.setBackground(Color.black);
				p0.setLayout(new BorderLayout());
				JLabel etq66= new JLabel("Etes-vous sûr de vouloir quitter?");
				etq66.setForeground(Color.white);
				JPanel p66= new JPanel();
				p66.add(b17);
				p66.add(b18);
				etq66.setHorizontalAlignment(JLabel.CENTER);
				p0.add(etq66,BorderLayout.CENTER);
			    p0.add(p66,BorderLayout.SOUTH);
			    f3.setContentPane(p0);
			    f.setVisible(true);
			    f3.setVisible(true);
		    	
		    }
		    else if(e.getSource()==b17){
		    	 f.setVisible(false);
				    f3.setVisible(false);
		    	
		    }
		    else if(e.getSource()==b18){
		    	 f.setVisible(true);
				 f3.setVisible(false);}
		for (int i = 0; i < nomCouleur1.length; i++) {
		    if (couleurFond[i] == e.getSource())
	               tA1.setBackground(couleur1[i]);
	         }
	         
	         for (int i = 0; i < nomCouleur2.length; i++) {
	         if (couleurTexte[i] == e.getSource())
	               tA1.setForeground(couleur2[i]);
	         }
	        
	         }
			
	public static  void main (String [] args){ new MyTexte();}
}